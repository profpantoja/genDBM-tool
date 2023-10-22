package gedbm.diagram.edit.policies;

import gedbm.diagram.providers.GedbmElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class EntitySubgroupOfItemSemanticEditPolicy extends
		GedbmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EntitySubgroupOfItemSemanticEditPolicy() {
		super(GedbmElementTypes.EntitySubgroupOf_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
