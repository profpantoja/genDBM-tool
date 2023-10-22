package gedbm.diagram.edit.policies;

import gedbm.diagram.providers.GedbmElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class CardinalityItemSemanticEditPolicy extends
		GedbmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CardinalityItemSemanticEditPolicy() {
		super(GedbmElementTypes.Cardinality_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
