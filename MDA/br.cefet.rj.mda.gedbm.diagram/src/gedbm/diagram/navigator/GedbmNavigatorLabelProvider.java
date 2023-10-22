package gedbm.diagram.navigator;

import gedbm.DataBase;
import gedbm.diagram.edit.parts.CardinalityEditPart;
import gedbm.diagram.edit.parts.CardinalityLimitEditPart;
import gedbm.diagram.edit.parts.DataBaseEditPart;
import gedbm.diagram.edit.parts.EntityEditPart;
import gedbm.diagram.edit.parts.EntityIsComposedEditPart;
import gedbm.diagram.edit.parts.EntityNameEditPart;
import gedbm.diagram.edit.parts.EntitySubgroupOfEditPart;
import gedbm.diagram.edit.parts.FieldEditPart;
import gedbm.diagram.edit.parts.FieldNameEditPart;
import gedbm.diagram.edit.parts.RelationshipEditPart;
import gedbm.diagram.edit.parts.RelationshipIsMappingEditPart;
import gedbm.diagram.edit.parts.RelationshipNameEditPart;
import gedbm.diagram.part.GedbmDiagramEditorPlugin;
import gedbm.diagram.part.GedbmVisualIDRegistry;
import gedbm.diagram.providers.GedbmElementTypes;
import gedbm.diagram.providers.GedbmParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class GedbmNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GedbmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GedbmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GedbmNavigatorItem
				&& !isOwnView(((GedbmNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GedbmNavigatorGroup) {
			GedbmNavigatorGroup group = (GedbmNavigatorGroup) element;
			return GedbmDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GedbmNavigatorItem) {
			GedbmNavigatorItem navigatorItem = (GedbmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case DataBaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://br.cefet.rj.mda.gedbm?DataBase", GedbmElementTypes.DataBase_1000); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://br.cefet.rj.mda.gedbm?Relationship", GedbmElementTypes.Relationship_2001); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://br.cefet.rj.mda.gedbm?Entity", GedbmElementTypes.Entity_2002); //$NON-NLS-1$
		case FieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://br.cefet.rj.mda.gedbm?Field", GedbmElementTypes.Field_2003); //$NON-NLS-1$
		case CardinalityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://br.cefet.rj.mda.gedbm?Cardinality", GedbmElementTypes.Cardinality_4001); //$NON-NLS-1$
		case EntityIsComposedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://br.cefet.rj.mda.gedbm?Entity?isComposed", GedbmElementTypes.EntityIsComposed_4002); //$NON-NLS-1$
		case RelationshipIsMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://br.cefet.rj.mda.gedbm?Relationship?isMapping", GedbmElementTypes.RelationshipIsMapping_4003); //$NON-NLS-1$
		case EntitySubgroupOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://br.cefet.rj.mda.gedbm?Entity?subgroupOf", GedbmElementTypes.EntitySubgroupOf_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GedbmDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GedbmElementTypes.isKnownElementType(elementType)) {
			image = GedbmElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GedbmNavigatorGroup) {
			GedbmNavigatorGroup group = (GedbmNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GedbmNavigatorItem) {
			GedbmNavigatorItem navigatorItem = (GedbmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GedbmVisualIDRegistry.getVisualID(view)) {
		case DataBaseEditPart.VISUAL_ID:
			return getDataBase_1000Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2001Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2002Text(view);
		case FieldEditPart.VISUAL_ID:
			return getField_2003Text(view);
		case CardinalityEditPart.VISUAL_ID:
			return getCardinality_4001Text(view);
		case EntityIsComposedEditPart.VISUAL_ID:
			return getEntityIsComposed_4002Text(view);
		case RelationshipIsMappingEditPart.VISUAL_ID:
			return getRelationshipIsMapping_4003Text(view);
		case EntitySubgroupOfEditPart.VISUAL_ID:
			return getEntitySubgroupOf_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDataBase_1000Text(View view) {
		DataBase domainModelElement = (DataBase) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			GedbmDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2001Text(View view) {
		IParser parser = GedbmParserProvider.getParser(
				GedbmElementTypes.Relationship_2001,
				view.getElement() != null ? view.getElement() : view,
				GedbmVisualIDRegistry
						.getType(RelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GedbmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2002Text(View view) {
		IParser parser = GedbmParserProvider.getParser(
				GedbmElementTypes.Entity_2002,
				view.getElement() != null ? view.getElement() : view,
				GedbmVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GedbmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getField_2003Text(View view) {
		IParser parser = GedbmParserProvider.getParser(
				GedbmElementTypes.Field_2003,
				view.getElement() != null ? view.getElement() : view,
				GedbmVisualIDRegistry.getType(FieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GedbmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCardinality_4001Text(View view) {
		IParser parser = GedbmParserProvider.getParser(
				GedbmElementTypes.Cardinality_4001,
				view.getElement() != null ? view.getElement() : view,
				GedbmVisualIDRegistry
						.getType(CardinalityLimitEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GedbmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntityIsComposed_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelationshipIsMapping_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEntitySubgroupOf_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DataBaseEditPart.MODEL_ID.equals(GedbmVisualIDRegistry
				.getModelID(view));
	}

}
