package gedbm.diagram.part;

import gedbm.Cardinality;
import gedbm.DataBase;
import gedbm.Entity;
import gedbm.Field;
import gedbm.GedbmPackage;
import gedbm.Relationship;
import gedbm.diagram.edit.parts.CardinalityEditPart;
import gedbm.diagram.edit.parts.DataBaseEditPart;
import gedbm.diagram.edit.parts.EntityEditPart;
import gedbm.diagram.edit.parts.EntityIsComposedEditPart;
import gedbm.diagram.edit.parts.EntitySubgroupOfEditPart;
import gedbm.diagram.edit.parts.FieldEditPart;
import gedbm.diagram.edit.parts.RelationshipEditPart;
import gedbm.diagram.edit.parts.RelationshipIsMappingEditPart;
import gedbm.diagram.providers.GedbmElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class GedbmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GedbmNodeDescriptor> getSemanticChildren(View view) {
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmNodeDescriptor> getDataBase_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DataBase modelElement = (DataBase) view.getElement();
		LinkedList<GedbmNodeDescriptor> result = new LinkedList<GedbmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasInteraction().iterator(); it
				.hasNext();) {
			Relationship childElement = (Relationship) it.next();
			int visualID = GedbmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RelationshipEditPart.VISUAL_ID) {
				result.add(new GedbmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIsComposed().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = GedbmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new GedbmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (GedbmVisualIDRegistry.getNodeVisualID(view, childElement) == FieldEditPart.VISUAL_ID) {
				result.add(new GedbmNodeDescriptor(childElement,
						FieldEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getContainedLinks(View view) {
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_1000ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2001ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002ContainedLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_2003ContainedLinks(view);
		case CardinalityEditPart.VISUAL_ID:
			return getCardinality_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getIncomingLinks(View view) {
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2001IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002IncomingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_2003IncomingLinks(view);
		case CardinalityEditPart.VISUAL_ID:
			return getCardinality_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getOutgoingLinks(View view) {
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2001OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002OutgoingLinks(view);
		case FieldEditPart.VISUAL_ID:
			return getField_2003OutgoingLinks(view);
		case CardinalityEditPart.VISUAL_ID:
			return getCardinality_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getDataBase_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getRelationship_2001ContainedLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Cardinality_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_IsMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getEntity_2002ContainedLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_IsComposed_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_SubgroupOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getField_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getCardinality_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getRelationship_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getEntity_2002IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Cardinality_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_SubgroupOf_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getField_2003IncomingLinks(View view) {
		Field modelElement = (Field) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_IsComposed_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Relationship_IsMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getCardinality_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getRelationship_2001OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Cardinality_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Relationship_IsMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getEntity_2002OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_IsComposed_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_SubgroupOf_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getField_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GedbmLinkDescriptor> getCardinality_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getContainedTypeModelFacetLinks_Cardinality_4001(
			Relationship container) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		for (Iterator<?> links = container.getIsConstraint().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Cardinality) {
				continue;
			}
			Cardinality link = (Cardinality) linkObject;
			if (CardinalityEditPart.VISUAL_ID != GedbmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getReferent();
			result.add(new GedbmLinkDescriptor(container, dst, link,
					GedbmElementTypes.Cardinality_4001,
					CardinalityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getIncomingTypeModelFacetLinks_Cardinality_4001(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GedbmPackage.eINSTANCE
					.getCardinality_Referent()
					|| false == setting.getEObject() instanceof Cardinality) {
				continue;
			}
			Cardinality link = (Cardinality) setting.getEObject();
			if (CardinalityEditPart.VISUAL_ID != GedbmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Relationship) {
				continue;
			}
			Relationship container = (Relationship) link.eContainer();
			result.add(new GedbmLinkDescriptor(container, target, link,
					GedbmElementTypes.Cardinality_4001,
					CardinalityEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_IsComposed_4002(
			Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GedbmPackage.eINSTANCE
					.getEntity_IsComposed()) {
				result.add(new GedbmLinkDescriptor(setting.getEObject(),
						target, GedbmElementTypes.EntityIsComposed_4002,
						EntityIsComposedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getIncomingFeatureModelFacetLinks_Relationship_IsMapping_4003(
			Field target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GedbmPackage.eINSTANCE
					.getRelationship_IsMapping()) {
				result.add(new GedbmLinkDescriptor(setting.getEObject(),
						target, GedbmElementTypes.RelationshipIsMapping_4003,
						RelationshipIsMappingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_SubgroupOf_4004(
			Entity target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GedbmPackage.eINSTANCE
					.getEntity_SubgroupOf()) {
				result.add(new GedbmLinkDescriptor(setting.getEObject(),
						target, GedbmElementTypes.EntitySubgroupOf_4004,
						EntitySubgroupOfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_IsComposed_4002(
			Entity source) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		for (Iterator<?> destinations = source.getIsComposed().iterator(); destinations
				.hasNext();) {
			Field destination = (Field) destinations.next();
			result.add(new GedbmLinkDescriptor(source, destination,
					GedbmElementTypes.EntityIsComposed_4002,
					EntityIsComposedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Relationship_IsMapping_4003(
			Relationship source) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		for (Iterator<?> destinations = source.getIsMapping().iterator(); destinations
				.hasNext();) {
			Field destination = (Field) destinations.next();
			result.add(new GedbmLinkDescriptor(source, destination,
					GedbmElementTypes.RelationshipIsMapping_4003,
					RelationshipIsMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GedbmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_SubgroupOf_4004(
			Entity source) {
		LinkedList<GedbmLinkDescriptor> result = new LinkedList<GedbmLinkDescriptor>();
		Entity destination = source.getSubgroupOf();
		if (destination == null) {
			return result;
		}
		result.add(new GedbmLinkDescriptor(source, destination,
				GedbmElementTypes.EntitySubgroupOf_4004,
				EntitySubgroupOfEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<GedbmNodeDescriptor> getSemanticChildren(View view) {
			return GedbmDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GedbmLinkDescriptor> getContainedLinks(View view) {
			return GedbmDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GedbmLinkDescriptor> getIncomingLinks(View view) {
			return GedbmDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<GedbmLinkDescriptor> getOutgoingLinks(View view) {
			return GedbmDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
