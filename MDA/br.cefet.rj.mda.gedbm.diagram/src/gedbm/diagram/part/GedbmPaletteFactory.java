package gedbm.diagram.part;

import gedbm.diagram.providers.GedbmElementTypes;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GedbmPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGedbm1Group());
	}

	/**
	 * Creates "gedbm" palette tool group
	 * @generated
	 */
	private PaletteContainer createGedbm1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Gedbm1Group_title);
		paletteContainer.setId("createGedbm1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createRelationship2CreationTool());
		paletteContainer.add(createFieldsofEntity3CreationTool());
		paletteContainer.add(createFieldsofRelationship4CreationTool());
		paletteContainer.add(createRelationshipEntity5CreationTool());
		paletteContainer.add(createEspecialization6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity1CreationTool_title,
				Messages.Entity1CreationTool_desc,
				Collections.singletonList(GedbmElementTypes.Entity_2002));
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Entity.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Entity.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Relationship2CreationTool_title,
				Messages.Relationship2CreationTool_desc,
				Collections.singletonList(GedbmElementTypes.Relationship_2001));
		entry.setId("createRelationship2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Relationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Relationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFieldsofEntity3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FieldsofEntity3CreationTool_title,
				Messages.FieldsofEntity3CreationTool_desc,
				Collections
						.singletonList(GedbmElementTypes.EntityIsComposed_4002));
		entry.setId("createFieldsofEntity3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Field.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Field.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFieldsofRelationship4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FieldsofRelationship4CreationTool_title,
				Messages.FieldsofRelationship4CreationTool_desc,
				Collections
						.singletonList(GedbmElementTypes.RelationshipIsMapping_4003));
		entry.setId("createFieldsofRelationship4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Field.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Field.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationshipEntity5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RelationshipEntity5CreationTool_title,
				Messages.RelationshipEntity5CreationTool_desc,
				Collections.singletonList(GedbmElementTypes.Cardinality_4001));
		entry.setId("createRelationshipEntity5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/RelationshipEntity.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/RelationshipEntity.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEspecialization6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Especialization6CreationTool_title,
				Messages.Especialization6CreationTool_desc,
				Collections
						.singletonList(GedbmElementTypes.EntitySubgroupOf_4004));
		entry.setId("createEspecialization6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Entity.subgroup.Of.Entity.gif")); //$NON-NLS-1$
		entry.setLargeIcon(GedbmDiagramEditorPlugin
				.findImageDescriptor("/br.cefet.rj.mda.gedbm.edit/icons/full/obj16/Entity.subgroup.Of.Entity.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
