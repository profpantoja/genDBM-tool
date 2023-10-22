package gedbm.diagram.edit.policies;

import gedbm.diagram.edit.commands.EntityCreateCommand;
import gedbm.diagram.edit.commands.FieldCreateCommand;
import gedbm.diagram.edit.commands.RelationshipCreateCommand;
import gedbm.diagram.providers.GedbmElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DataBaseItemSemanticEditPolicy extends
		GedbmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DataBaseItemSemanticEditPolicy() {
		super(GedbmElementTypes.DataBase_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GedbmElementTypes.Relationship_2001 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		if (GedbmElementTypes.Entity_2002 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (GedbmElementTypes.Field_2003 == req.getElementType()) {
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
