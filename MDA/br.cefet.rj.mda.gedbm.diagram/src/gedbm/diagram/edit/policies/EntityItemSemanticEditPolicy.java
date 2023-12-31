package gedbm.diagram.edit.policies;

import gedbm.diagram.edit.commands.CardinalityCreateCommand;
import gedbm.diagram.edit.commands.CardinalityReorientCommand;
import gedbm.diagram.edit.commands.EntityIsComposedCreateCommand;
import gedbm.diagram.edit.commands.EntityIsComposedReorientCommand;
import gedbm.diagram.edit.commands.EntitySubgroupOfCreateCommand;
import gedbm.diagram.edit.commands.EntitySubgroupOfReorientCommand;
import gedbm.diagram.edit.parts.CardinalityEditPart;
import gedbm.diagram.edit.parts.EntityIsComposedEditPart;
import gedbm.diagram.edit.parts.EntitySubgroupOfEditPart;
import gedbm.diagram.part.GedbmVisualIDRegistry;
import gedbm.diagram.providers.GedbmElementTypes;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityItemSemanticEditPolicy extends
		GedbmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntityItemSemanticEditPolicy() {
		super(GedbmElementTypes.Entity_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GedbmVisualIDRegistry.getVisualID(incomingLink) == CardinalityEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GedbmVisualIDRegistry.getVisualID(incomingLink) == EntitySubgroupOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GedbmVisualIDRegistry.getVisualID(outgoingLink) == EntityIsComposedEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor progressMonitor, IAdaptable info)
							throws ExecutionException {
						EObject referencedObject = getReferencedObject();
						Resource resource = referencedObject.eResource();
						CommandResult result = super.doExecuteWithResult(
								progressMonitor, info);
						if (resource != null) {
							resource.getContents().add(referencedObject);
						}
						return result;
					}
				});
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GedbmVisualIDRegistry.getVisualID(outgoingLink) == EntitySubgroupOfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GedbmElementTypes.Cardinality_4001 == req.getElementType()) {
			return null;
		}
		if (GedbmElementTypes.EntityIsComposed_4002 == req.getElementType()) {
			return getGEFWrapper(new EntityIsComposedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GedbmElementTypes.EntitySubgroupOf_4004 == req.getElementType()) {
			return getGEFWrapper(new EntitySubgroupOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GedbmElementTypes.Cardinality_4001 == req.getElementType()) {
			return getGEFWrapper(new CardinalityCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (GedbmElementTypes.EntityIsComposed_4002 == req.getElementType()) {
			return null;
		}
		if (GedbmElementTypes.EntitySubgroupOf_4004 == req.getElementType()) {
			return getGEFWrapper(new EntitySubgroupOfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CardinalityEditPart.VISUAL_ID:
			return getGEFWrapper(new CardinalityReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case EntityIsComposedEditPart.VISUAL_ID:
			return getGEFWrapper(new EntityIsComposedReorientCommand(req));
		case EntitySubgroupOfEditPart.VISUAL_ID:
			return getGEFWrapper(new EntitySubgroupOfReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
