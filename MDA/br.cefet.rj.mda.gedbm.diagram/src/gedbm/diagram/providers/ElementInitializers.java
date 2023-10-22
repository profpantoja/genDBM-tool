package gedbm.diagram.providers;

import gedbm.diagram.part.GedbmDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GedbmDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GedbmDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
