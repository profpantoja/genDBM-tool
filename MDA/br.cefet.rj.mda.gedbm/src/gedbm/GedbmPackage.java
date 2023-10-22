/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gedbm.GedbmFactory
 * @model kind="package"
 * @generated
 */
public interface GedbmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gedbm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://br.cefet.rj.mda.gedbm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gedbm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GedbmPackage eINSTANCE = gedbm.impl.GedbmPackageImpl.init();

	/**
	 * The meta object id for the '{@link gedbm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.ModelImpl
	 * @see gedbm.impl.GedbmPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Formed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_FORMED_OF = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gedbm.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.DataBaseImpl
	 * @see gedbm.impl.GedbmPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__HAS = 1;

	/**
	 * The feature id for the '<em><b>Is Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__IS_COMPOSED = 2;

	/**
	 * The feature id for the '<em><b>Has Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__HAS_INTERACTION = 3;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gedbm.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.ComponentsImpl
	 * @see gedbm.impl.GedbmPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gedbm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.EntityImpl
	 * @see gedbm.impl.GedbmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Composed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_COMPOSED = 2;

	/**
	 * The feature id for the '<em><b>Subgroup Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUBGROUP_OF = 3;

	/**
	 * The feature id for the '<em><b>Has Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_FOREIGN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Has Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Has Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_CHECK = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link gedbm.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.RelationshipImpl
	 * @see gedbm.impl.GedbmPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED = 2;

	/**
	 * The feature id for the '<em><b>Is Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Is Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Would Has Primary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__WOULD_HAS_PRIMARY = 5;

	/**
	 * The feature id for the '<em><b>Would Has Foreign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__WOULD_HAS_FOREIGN = 6;

	/**
	 * The feature id for the '<em><b>Is Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_ASSOCIATIVE = 7;

	/**
	 * The feature id for the '<em><b>Entity relation name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ENTITY_RELATION_NAME = 8;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link gedbm.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.CardinalityImpl
	 * @see gedbm.impl.GedbmPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LIMIT = 1;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__REFERENT = 2;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gedbm.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.FieldImpl
	 * @see gedbm.impl.GedbmPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Has Foreign Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Has Text Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_TEXT_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Has Numeric Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_NUMERIC_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Has Integrity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_INTEGRITY = 6;

	/**
	 * The feature id for the '<em><b>Has Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_DEFAULT_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link gedbm.impl.IntegrityImpl <em>Integrity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.IntegrityImpl
	 * @see gedbm.impl.GedbmPackageImpl#getIntegrity()
	 * @generated
	 */
	int INTEGRITY = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Not null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__NOT_NULL = 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY__UNIQUE = 2;

	/**
	 * The number of structural features of the '<em>Integrity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gedbm.impl.NumericLimitImpl <em>Numeric Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.NumericLimitImpl
	 * @see gedbm.impl.GedbmPackageImpl#getNumericLimit()
	 * @generated
	 */
	int NUMERIC_LIMIT = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LIMIT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Limit value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LIMIT__LIMIT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Numeric Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LIMIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gedbm.impl.TextLimitImpl <em>Text Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.TextLimitImpl
	 * @see gedbm.impl.GedbmPackageImpl#getTextLimit()
	 * @generated
	 */
	int TEXT_LIMIT = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIMIT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIMIT__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Text Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_LIMIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gedbm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.PrimaryKeyImpl
	 * @see gedbm.impl.GedbmPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__IS_PRIMARY = 2;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gedbm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.ForeignKeyImpl
	 * @see gedbm.impl.GedbmPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERS_TO = 2;

	/**
	 * The feature id for the '<em><b>Is Foreign</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__IS_FOREIGN = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCES = 4;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link gedbm.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.CheckImpl
	 * @see gedbm.impl.GedbmPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gedbm.impl.DefaultValueImpl <em>Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.impl.DefaultValueImpl
	 * @see gedbm.impl.GedbmPackageImpl#getDefaultValue()
	 * @generated
	 */
	int DEFAULT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gedbm.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gedbm.Type
	 * @see gedbm.impl.GedbmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 14;


	/**
	 * Returns the meta object for class '{@link gedbm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see gedbm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gedbm.Model#getIsFormedOf <em>Is Formed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Formed Of</em>'.
	 * @see gedbm.Model#getIsFormedOf()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_IsFormedOf();

	/**
	 * Returns the meta object for class '{@link gedbm.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see gedbm.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.DataBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.DataBase#getName()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.DataBase#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see gedbm.DataBase#getHas()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.DataBase#getIsComposed <em>Is Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Composed</em>'.
	 * @see gedbm.DataBase#getIsComposed()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_IsComposed();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.DataBase#getHasInteraction <em>Has Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Interaction</em>'.
	 * @see gedbm.DataBase#getHasInteraction()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_HasInteraction();

	/**
	 * Returns the meta object for class '{@link gedbm.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see gedbm.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Components#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Components#getName()
	 * @see #getComponents()
	 * @generated
	 */
	EAttribute getComponents_Name();

	/**
	 * Returns the meta object for class '{@link gedbm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see gedbm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Entity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Entity#getCode()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Entity#getIsComposed <em>Is Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Composed</em>'.
	 * @see gedbm.Entity#getIsComposed()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IsComposed();

	/**
	 * Returns the meta object for the reference '{@link gedbm.Entity#getSubgroupOf <em>Subgroup Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subgroup Of</em>'.
	 * @see gedbm.Entity#getSubgroupOf()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SubgroupOf();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Entity#getHasForeignKey <em>Has Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Foreign Key</em>'.
	 * @see gedbm.Entity#getHasForeignKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_HasForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Entity#getHasPrimaryKey <em>Has Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Primary Key</em>'.
	 * @see gedbm.Entity#getHasPrimaryKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_HasPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Entity#getHasCheck <em>Has Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Check</em>'.
	 * @see gedbm.Entity#getHasCheck()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_HasCheck();

	/**
	 * Returns the meta object for class '{@link gedbm.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see gedbm.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Relationship#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Relationship#getCode()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the reference list '{@link gedbm.Relationship#getRelated <em>Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related</em>'.
	 * @see gedbm.Relationship#getRelated()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Related();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Relationship#getIsConstraint <em>Is Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Constraint</em>'.
	 * @see gedbm.Relationship#getIsConstraint()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_IsConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Relationship#getIsMapping <em>Is Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Mapping</em>'.
	 * @see gedbm.Relationship#getIsMapping()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_IsMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Relationship#getWouldHasPrimary <em>Would Has Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Would Has Primary</em>'.
	 * @see gedbm.Relationship#getWouldHasPrimary()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_WouldHasPrimary();

	/**
	 * Returns the meta object for the containment reference list '{@link gedbm.Relationship#getWouldHasForeign <em>Would Has Foreign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Would Has Foreign</em>'.
	 * @see gedbm.Relationship#getWouldHasForeign()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_WouldHasForeign();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Relationship#isIsAssociative <em>Is Associative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Associative</em>'.
	 * @see gedbm.Relationship#isIsAssociative()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_IsAssociative();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Relationship#getEntity_relation_name <em>Entity relation name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity relation name</em>'.
	 * @see gedbm.Relationship#getEntity_relation_name()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Entity_relation_name();

	/**
	 * Returns the meta object for class '{@link gedbm.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see gedbm.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Cardinality#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Cardinality#getCode()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Cardinality#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see gedbm.Cardinality#getLimit()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Limit();

	/**
	 * Returns the meta object for the reference '{@link gedbm.Cardinality#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see gedbm.Cardinality#getReferent()
	 * @see #getCardinality()
	 * @generated
	 */
	EReference getCardinality_Referent();

	/**
	 * Returns the meta object for class '{@link gedbm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see gedbm.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Field#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Field#getCode()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gedbm.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for the reference list '{@link gedbm.Field#getHasForeignKey <em>Has Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Foreign Key</em>'.
	 * @see gedbm.Field#getHasForeignKey()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_HasForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link gedbm.Field#getHasTextLimit <em>Has Text Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Text Limit</em>'.
	 * @see gedbm.Field#getHasTextLimit()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_HasTextLimit();

	/**
	 * Returns the meta object for the containment reference '{@link gedbm.Field#getHasNumericLimit <em>Has Numeric Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Numeric Limit</em>'.
	 * @see gedbm.Field#getHasNumericLimit()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_HasNumericLimit();

	/**
	 * Returns the meta object for the containment reference '{@link gedbm.Field#getHasIntegrity <em>Has Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Integrity</em>'.
	 * @see gedbm.Field#getHasIntegrity()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_HasIntegrity();

	/**
	 * Returns the meta object for the containment reference '{@link gedbm.Field#getHasDefaultValue <em>Has Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Default Value</em>'.
	 * @see gedbm.Field#getHasDefaultValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_HasDefaultValue();

	/**
	 * Returns the meta object for class '{@link gedbm.Integrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrity</em>'.
	 * @see gedbm.Integrity
	 * @generated
	 */
	EClass getIntegrity();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Integrity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Integrity#getCode()
	 * @see #getIntegrity()
	 * @generated
	 */
	EAttribute getIntegrity_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Integrity#isNot_null <em>Not null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not null</em>'.
	 * @see gedbm.Integrity#isNot_null()
	 * @see #getIntegrity()
	 * @generated
	 */
	EAttribute getIntegrity_Not_null();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Integrity#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see gedbm.Integrity#isUnique()
	 * @see #getIntegrity()
	 * @generated
	 */
	EAttribute getIntegrity_Unique();

	/**
	 * Returns the meta object for class '{@link gedbm.NumericLimit <em>Numeric Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Limit</em>'.
	 * @see gedbm.NumericLimit
	 * @generated
	 */
	EClass getNumericLimit();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.NumericLimit#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.NumericLimit#getCode()
	 * @see #getNumericLimit()
	 * @generated
	 */
	EAttribute getNumericLimit_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.NumericLimit#getLimit_value <em>Limit value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit value</em>'.
	 * @see gedbm.NumericLimit#getLimit_value()
	 * @see #getNumericLimit()
	 * @generated
	 */
	EAttribute getNumericLimit_Limit_value();

	/**
	 * Returns the meta object for class '{@link gedbm.TextLimit <em>Text Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Limit</em>'.
	 * @see gedbm.TextLimit
	 * @generated
	 */
	EClass getTextLimit();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.TextLimit#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.TextLimit#getCode()
	 * @see #getTextLimit()
	 * @generated
	 */
	EAttribute getTextLimit_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.TextLimit#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see gedbm.TextLimit#getSize()
	 * @see #getTextLimit()
	 * @generated
	 */
	EAttribute getTextLimit_Size();

	/**
	 * Returns the meta object for class '{@link gedbm.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see gedbm.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.PrimaryKey#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.PrimaryKey#getCode()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.PrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.PrimaryKey#getName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_Name();

	/**
	 * Returns the meta object for the reference list '{@link gedbm.PrimaryKey#getIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Primary</em>'.
	 * @see gedbm.PrimaryKey#getIsPrimary()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_IsPrimary();

	/**
	 * Returns the meta object for class '{@link gedbm.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see gedbm.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.ForeignKey#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.ForeignKey#getCode()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for the reference '{@link gedbm.ForeignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see gedbm.ForeignKey#getRefersTo()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_RefersTo();

	/**
	 * Returns the meta object for the reference list '{@link gedbm.ForeignKey#getIsForeign <em>Is Foreign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Foreign</em>'.
	 * @see gedbm.ForeignKey#getIsForeign()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_IsForeign();

	/**
	 * Returns the meta object for the reference '{@link gedbm.ForeignKey#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see gedbm.ForeignKey#getReferences()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_References();

	/**
	 * Returns the meta object for class '{@link gedbm.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see gedbm.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Check#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.Check#getCode()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Check#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gedbm.Check#getName()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Name();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.Check#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see gedbm.Check#getCondition()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Condition();

	/**
	 * Returns the meta object for class '{@link gedbm.DefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value</em>'.
	 * @see gedbm.DefaultValue
	 * @generated
	 */
	EClass getDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.DefaultValue#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see gedbm.DefaultValue#getCode()
	 * @see #getDefaultValue()
	 * @generated
	 */
	EAttribute getDefaultValue_Code();

	/**
	 * Returns the meta object for the attribute '{@link gedbm.DefaultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gedbm.DefaultValue#getValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	EAttribute getDefaultValue_Value();

	/**
	 * Returns the meta object for enum '{@link gedbm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see gedbm.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GedbmFactory getGedbmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gedbm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.ModelImpl
		 * @see gedbm.impl.GedbmPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Is Formed Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IS_FORMED_OF = eINSTANCE.getModel_IsFormedOf();

		/**
		 * The meta object literal for the '{@link gedbm.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.DataBaseImpl
		 * @see gedbm.impl.GedbmPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__NAME = eINSTANCE.getDataBase_Name();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__HAS = eINSTANCE.getDataBase_Has();

		/**
		 * The meta object literal for the '<em><b>Is Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__IS_COMPOSED = eINSTANCE.getDataBase_IsComposed();

		/**
		 * The meta object literal for the '<em><b>Has Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__HAS_INTERACTION = eINSTANCE.getDataBase_HasInteraction();

		/**
		 * The meta object literal for the '{@link gedbm.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.ComponentsImpl
		 * @see gedbm.impl.GedbmPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS__NAME = eINSTANCE.getComponents_Name();

		/**
		 * The meta object literal for the '{@link gedbm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.EntityImpl
		 * @see gedbm.impl.GedbmPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CODE = eINSTANCE.getEntity_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Is Composed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IS_COMPOSED = eINSTANCE.getEntity_IsComposed();

		/**
		 * The meta object literal for the '<em><b>Subgroup Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUBGROUP_OF = eINSTANCE.getEntity_SubgroupOf();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__HAS_FOREIGN_KEY = eINSTANCE.getEntity_HasForeignKey();

		/**
		 * The meta object literal for the '<em><b>Has Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__HAS_PRIMARY_KEY = eINSTANCE.getEntity_HasPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Has Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__HAS_CHECK = eINSTANCE.getEntity_HasCheck();

		/**
		 * The meta object literal for the '{@link gedbm.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.RelationshipImpl
		 * @see gedbm.impl.GedbmPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CODE = eINSTANCE.getRelationship_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Related</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED = eINSTANCE.getRelationship_Related();

		/**
		 * The meta object literal for the '<em><b>Is Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__IS_CONSTRAINT = eINSTANCE.getRelationship_IsConstraint();

		/**
		 * The meta object literal for the '<em><b>Is Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__IS_MAPPING = eINSTANCE.getRelationship_IsMapping();

		/**
		 * The meta object literal for the '<em><b>Would Has Primary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__WOULD_HAS_PRIMARY = eINSTANCE.getRelationship_WouldHasPrimary();

		/**
		 * The meta object literal for the '<em><b>Would Has Foreign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__WOULD_HAS_FOREIGN = eINSTANCE.getRelationship_WouldHasForeign();

		/**
		 * The meta object literal for the '<em><b>Is Associative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__IS_ASSOCIATIVE = eINSTANCE.getRelationship_IsAssociative();

		/**
		 * The meta object literal for the '<em><b>Entity relation name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__ENTITY_RELATION_NAME = eINSTANCE.getRelationship_Entity_relation_name();

		/**
		 * The meta object literal for the '{@link gedbm.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.CardinalityImpl
		 * @see gedbm.impl.GedbmPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CODE = eINSTANCE.getCardinality_Code();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LIMIT = eINSTANCE.getCardinality_Limit();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY__REFERENT = eINSTANCE.getCardinality_Referent();

		/**
		 * The meta object literal for the '{@link gedbm.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.FieldImpl
		 * @see gedbm.impl.GedbmPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__CODE = eINSTANCE.getField_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__HAS_FOREIGN_KEY = eINSTANCE.getField_HasForeignKey();

		/**
		 * The meta object literal for the '<em><b>Has Text Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__HAS_TEXT_LIMIT = eINSTANCE.getField_HasTextLimit();

		/**
		 * The meta object literal for the '<em><b>Has Numeric Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__HAS_NUMERIC_LIMIT = eINSTANCE.getField_HasNumericLimit();

		/**
		 * The meta object literal for the '<em><b>Has Integrity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__HAS_INTEGRITY = eINSTANCE.getField_HasIntegrity();

		/**
		 * The meta object literal for the '<em><b>Has Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__HAS_DEFAULT_VALUE = eINSTANCE.getField_HasDefaultValue();

		/**
		 * The meta object literal for the '{@link gedbm.impl.IntegrityImpl <em>Integrity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.IntegrityImpl
		 * @see gedbm.impl.GedbmPackageImpl#getIntegrity()
		 * @generated
		 */
		EClass INTEGRITY = eINSTANCE.getIntegrity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY__CODE = eINSTANCE.getIntegrity_Code();

		/**
		 * The meta object literal for the '<em><b>Not null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY__NOT_NULL = eINSTANCE.getIntegrity_Not_null();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRITY__UNIQUE = eINSTANCE.getIntegrity_Unique();

		/**
		 * The meta object literal for the '{@link gedbm.impl.NumericLimitImpl <em>Numeric Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.NumericLimitImpl
		 * @see gedbm.impl.GedbmPackageImpl#getNumericLimit()
		 * @generated
		 */
		EClass NUMERIC_LIMIT = eINSTANCE.getNumericLimit();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_LIMIT__CODE = eINSTANCE.getNumericLimit_Code();

		/**
		 * The meta object literal for the '<em><b>Limit value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_LIMIT__LIMIT_VALUE = eINSTANCE.getNumericLimit_Limit_value();

		/**
		 * The meta object literal for the '{@link gedbm.impl.TextLimitImpl <em>Text Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.TextLimitImpl
		 * @see gedbm.impl.GedbmPackageImpl#getTextLimit()
		 * @generated
		 */
		EClass TEXT_LIMIT = eINSTANCE.getTextLimit();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LIMIT__CODE = eINSTANCE.getTextLimit_Code();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_LIMIT__SIZE = eINSTANCE.getTextLimit_Size();

		/**
		 * The meta object literal for the '{@link gedbm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.PrimaryKeyImpl
		 * @see gedbm.impl.GedbmPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__CODE = eINSTANCE.getPrimaryKey_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__NAME = eINSTANCE.getPrimaryKey_Name();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__IS_PRIMARY = eINSTANCE.getPrimaryKey_IsPrimary();

		/**
		 * The meta object literal for the '{@link gedbm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.ForeignKeyImpl
		 * @see gedbm.impl.GedbmPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__CODE = eINSTANCE.getForeignKey_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERS_TO = eINSTANCE.getForeignKey_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Is Foreign</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__IS_FOREIGN = eINSTANCE.getForeignKey_IsForeign();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCES = eINSTANCE.getForeignKey_References();

		/**
		 * The meta object literal for the '{@link gedbm.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.CheckImpl
		 * @see gedbm.impl.GedbmPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CODE = eINSTANCE.getCheck_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__NAME = eINSTANCE.getCheck_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CONDITION = eINSTANCE.getCheck_Condition();

		/**
		 * The meta object literal for the '{@link gedbm.impl.DefaultValueImpl <em>Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.impl.DefaultValueImpl
		 * @see gedbm.impl.GedbmPackageImpl#getDefaultValue()
		 * @generated
		 */
		EClass DEFAULT_VALUE = eINSTANCE.getDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE__CODE = eINSTANCE.getDefaultValue_Code();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE__VALUE = eINSTANCE.getDefaultValue_Value();

		/**
		 * The meta object literal for the '{@link gedbm.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gedbm.Type
		 * @see gedbm.impl.GedbmPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //GedbmPackage
