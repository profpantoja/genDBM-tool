package gedbm.diagram.edit.parts;

import gedbm.diagram.part.GedbmVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GedbmEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GedbmVisualIDRegistry.getVisualID(view)) {

			case DataBaseEditPart.VISUAL_ID:
				return new DataBaseEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameEditPart.VISUAL_ID:
				return new RelationshipNameEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case FieldEditPart.VISUAL_ID:
				return new FieldEditPart(view);

			case FieldNameEditPart.VISUAL_ID:
				return new FieldNameEditPart(view);

			case CardinalityEditPart.VISUAL_ID:
				return new CardinalityEditPart(view);

			case CardinalityLimitEditPart.VISUAL_ID:
				return new CardinalityLimitEditPart(view);

			case EntityIsComposedEditPart.VISUAL_ID:
				return new EntityIsComposedEditPart(view);

			case RelationshipIsMappingEditPart.VISUAL_ID:
				return new RelationshipIsMappingEditPart(view);

			case EntitySubgroupOfEditPart.VISUAL_ID:
				return new EntitySubgroupOfEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
