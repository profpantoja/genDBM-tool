package gedbm.diagram.providers;

import gedbm.GedbmPackage;
import gedbm.diagram.edit.parts.CardinalityLimitEditPart;
import gedbm.diagram.edit.parts.EntityNameEditPart;
import gedbm.diagram.edit.parts.FieldNameEditPart;
import gedbm.diagram.edit.parts.RelationshipNameEditPart;
import gedbm.diagram.parsers.MessageFormatParser;
import gedbm.diagram.part.GedbmVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GedbmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser relationshipName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_5001Parser() {
		if (relationshipName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GedbmPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_5001Parser = parser;
		}
		return relationshipName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEntityName_5002Parser() {
		if (entityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GedbmPackage.eINSTANCE
					.getEntity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5002Parser = parser;
		}
		return entityName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser fieldName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getFieldName_5003Parser() {
		if (fieldName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GedbmPackage.eINSTANCE
					.getField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fieldName_5003Parser = parser;
		}
		return fieldName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser cardinalityLimit_6001Parser;

	/**
	 * @generated
	 */
	private IParser getCardinalityLimit_6001Parser() {
		if (cardinalityLimit_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { GedbmPackage.eINSTANCE
					.getCardinality_Limit() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cardinalityLimit_6001Parser = parser;
		}
		return cardinalityLimit_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_5001Parser();
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5002Parser();
		case FieldNameEditPart.VISUAL_ID:
			return getFieldName_5003Parser();
		case CardinalityLimitEditPart.VISUAL_ID:
			return getCardinalityLimit_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GedbmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GedbmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GedbmElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
