package gedbm.diagram.providers;

import gedbm.diagram.edit.parts.DataBaseEditPart;
import gedbm.diagram.edit.parts.GedbmEditPartFactory;
import gedbm.diagram.part.GedbmVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class GedbmEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public GedbmEditPartProvider() {
		super(new GedbmEditPartFactory(), GedbmVisualIDRegistry.TYPED_INSTANCE,
				DataBaseEditPart.MODEL_ID);
	}

}
