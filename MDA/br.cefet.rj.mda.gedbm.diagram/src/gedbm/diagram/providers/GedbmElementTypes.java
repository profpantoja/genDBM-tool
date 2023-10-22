package gedbm.diagram.providers;

import gedbm.GedbmPackage;
import gedbm.diagram.edit.parts.CardinalityEditPart;
import gedbm.diagram.edit.parts.DataBaseEditPart;
import gedbm.diagram.edit.parts.EntityEditPart;
import gedbm.diagram.edit.parts.EntityIsComposedEditPart;
import gedbm.diagram.edit.parts.EntitySubgroupOfEditPart;
import gedbm.diagram.edit.parts.FieldEditPart;
import gedbm.diagram.edit.parts.RelationshipEditPart;
import gedbm.diagram.edit.parts.RelationshipIsMappingEditPart;
import gedbm.diagram.part.GedbmDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GedbmElementTypes {

	/**
	 * @generated
	 */
	private GedbmElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GedbmDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DataBase_1000 = getElementType("br.cefet.rj.mda.gedbm.diagram.DataBase_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_2001 = getElementType("br.cefet.rj.mda.gedbm.diagram.Relationship_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2002 = getElementType("br.cefet.rj.mda.gedbm.diagram.Entity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Field_2003 = getElementType("br.cefet.rj.mda.gedbm.diagram.Field_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cardinality_4001 = getElementType("br.cefet.rj.mda.gedbm.diagram.Cardinality_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntityIsComposed_4002 = getElementType("br.cefet.rj.mda.gedbm.diagram.EntityIsComposed_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelationshipIsMapping_4003 = getElementType("br.cefet.rj.mda.gedbm.diagram.RelationshipIsMapping_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EntitySubgroupOf_4004 = getElementType("br.cefet.rj.mda.gedbm.diagram.EntitySubgroupOf_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DataBase_1000, GedbmPackage.eINSTANCE.getDataBase());

			elements.put(Relationship_2001,
					GedbmPackage.eINSTANCE.getRelationship());

			elements.put(Entity_2002, GedbmPackage.eINSTANCE.getEntity());

			elements.put(Field_2003, GedbmPackage.eINSTANCE.getField());

			elements.put(Cardinality_4001,
					GedbmPackage.eINSTANCE.getCardinality());

			elements.put(EntityIsComposed_4002,
					GedbmPackage.eINSTANCE.getEntity_IsComposed());

			elements.put(RelationshipIsMapping_4003,
					GedbmPackage.eINSTANCE.getRelationship_IsMapping());

			elements.put(EntitySubgroupOf_4004,
					GedbmPackage.eINSTANCE.getEntity_SubgroupOf());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DataBase_1000);
			KNOWN_ELEMENT_TYPES.add(Relationship_2001);
			KNOWN_ELEMENT_TYPES.add(Entity_2002);
			KNOWN_ELEMENT_TYPES.add(Field_2003);
			KNOWN_ELEMENT_TYPES.add(Cardinality_4001);
			KNOWN_ELEMENT_TYPES.add(EntityIsComposed_4002);
			KNOWN_ELEMENT_TYPES.add(RelationshipIsMapping_4003);
			KNOWN_ELEMENT_TYPES.add(EntitySubgroupOf_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DataBaseEditPart.VISUAL_ID:
			return DataBase_1000;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2001;
		case EntityEditPart.VISUAL_ID:
			return Entity_2002;
		case FieldEditPart.VISUAL_ID:
			return Field_2003;
		case CardinalityEditPart.VISUAL_ID:
			return Cardinality_4001;
		case EntityIsComposedEditPart.VISUAL_ID:
			return EntityIsComposed_4002;
		case RelationshipIsMappingEditPart.VISUAL_ID:
			return RelationshipIsMapping_4003;
		case EntitySubgroupOfEditPart.VISUAL_ID:
			return EntitySubgroupOf_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return gedbm.diagram.providers.GedbmElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return gedbm.diagram.providers.GedbmElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return gedbm.diagram.providers.GedbmElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
