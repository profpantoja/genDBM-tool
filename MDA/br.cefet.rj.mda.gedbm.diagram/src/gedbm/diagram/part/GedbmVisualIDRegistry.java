package gedbm.diagram.part;

import gedbm.DataBase;
import gedbm.GedbmPackage;
import gedbm.diagram.edit.parts.CardinalityEditPart;
import gedbm.diagram.edit.parts.CardinalityLimitEditPart;
import gedbm.diagram.edit.parts.DataBaseEditPart;
import gedbm.diagram.edit.parts.EntityEditPart;
import gedbm.diagram.edit.parts.EntityNameEditPart;
import gedbm.diagram.edit.parts.FieldEditPart;
import gedbm.diagram.edit.parts.FieldNameEditPart;
import gedbm.diagram.edit.parts.RelationshipEditPart;
import gedbm.diagram.edit.parts.RelationshipNameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GedbmVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "br.cefet.rj.mda.gedbm.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DataBaseEditPart.MODEL_ID.equals(view.getType())) {
				return DataBaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gedbm.diagram.part.GedbmVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GedbmDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GedbmPackage.eINSTANCE.getDataBase().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DataBase) domainElement)) {
			return DataBaseEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gedbm.diagram.part.GedbmVisualIDRegistry
				.getModelID(containerView);
		if (!DataBaseEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DataBaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gedbm.diagram.part.GedbmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataBaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DataBaseEditPart.VISUAL_ID:
			if (GedbmPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return RelationshipEditPart.VISUAL_ID;
			}
			if (GedbmPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (GedbmPackage.eINSTANCE.getField().isSuperTypeOf(
					domainElement.eClass())) {
				return FieldEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gedbm.diagram.part.GedbmVisualIDRegistry
				.getModelID(containerView);
		if (!DataBaseEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DataBaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gedbm.diagram.part.GedbmVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DataBaseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DataBaseEditPart.VISUAL_ID:
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FieldEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FieldEditPart.VISUAL_ID:
			if (FieldNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CardinalityEditPart.VISUAL_ID:
			if (CardinalityLimitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GedbmPackage.eINSTANCE.getCardinality().isSuperTypeOf(
				domainElement.eClass())) {
			return CardinalityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DataBase element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DataBaseEditPart.VISUAL_ID:
			return false;
		case RelationshipEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case FieldEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return gedbm.diagram.part.GedbmVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return gedbm.diagram.part.GedbmVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gedbm.diagram.part.GedbmVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return gedbm.diagram.part.GedbmVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return gedbm.diagram.part.GedbmVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return gedbm.diagram.part.GedbmVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
