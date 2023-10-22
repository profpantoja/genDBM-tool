package gedbm.diagram.navigator;

import gedbm.diagram.part.GedbmVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GedbmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GedbmNavigatorItem) {
			GedbmNavigatorItem item = (GedbmNavigatorItem) element;
			return GedbmVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
