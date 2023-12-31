package gedbm.diagram.edit.parts;

import gedbm.diagram.edit.policies.RelationshipIsMappingItemSemanticEditPolicy;
import gedbm.diagram.figures.CircleDecoration;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelationshipIsMappingEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public RelationshipIsMappingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RelationshipIsMappingItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RelationshipIsMappingFigure();
	}

	/**
	 * @generated
	 */
	public RelationshipIsMappingFigure getPrimaryShape() {
		return (RelationshipIsMappingFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelationshipIsMappingFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RelationshipIsMappingFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			CircleDecoration df = new CircleDecoration();

			return df;
		}

	}

}
