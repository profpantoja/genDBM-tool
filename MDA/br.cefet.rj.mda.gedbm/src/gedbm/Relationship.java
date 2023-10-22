/**
 */
package gedbm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.Relationship#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.Relationship#getIsConstraint <em>Is Constraint</em>}</li>
 *   <li>{@link gedbm.Relationship#getIsMapping <em>Is Mapping</em>}</li>
 *   <li>{@link gedbm.Relationship#getWouldHasPrimary <em>Would Has Primary</em>}</li>
 *   <li>{@link gedbm.Relationship#getWouldHasForeign <em>Would Has Foreign</em>}</li>
 *   <li>{@link gedbm.Relationship#isIsAssociative <em>Is Associative</em>}</li>
 *   <li>{@link gedbm.Relationship#getEntity_relation_name <em>Entity relation name</em>}</li>
 *   <li>{@link gedbm.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link gedbm.Relationship#getRelated <em>Related</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gedbm.GedbmPackage#getRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gedbm.Relationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constraint</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getRelationship_IsConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cardinality> getIsConstraint();

	/**
	 * Returns the value of the '<em><b>Is Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapping</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getRelationship_IsMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getIsMapping();

	/**
	 * Returns the value of the '<em><b>Would Has Primary</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Would Has Primary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Would Has Primary</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getRelationship_WouldHasPrimary()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getWouldHasPrimary();

	/**
	 * Returns the value of the '<em><b>Would Has Foreign</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Would Has Foreign</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Would Has Foreign</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getRelationship_WouldHasForeign()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getWouldHasForeign();

	/**
	 * Returns the value of the '<em><b>Is Associative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Associative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Associative</em>' attribute.
	 * @see #setIsAssociative(boolean)
	 * @see gedbm.GedbmPackage#getRelationship_IsAssociative()
	 * @model
	 * @generated
	 */
	boolean isIsAssociative();

	/**
	 * Sets the value of the '{@link gedbm.Relationship#isIsAssociative <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Associative</em>' attribute.
	 * @see #isIsAssociative()
	 * @generated
	 */
	void setIsAssociative(boolean value);

	/**
	 * Returns the value of the '<em><b>Entity relation name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity relation name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity relation name</em>' attribute.
	 * @see #setEntity_relation_name(String)
	 * @see gedbm.GedbmPackage#getRelationship_Entity_relation_name()
	 * @model
	 * @generated
	 */
	String getEntity_relation_name();

	/**
	 * Sets the value of the '{@link gedbm.Relationship#getEntity_relation_name <em>Entity relation name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity relation name</em>' attribute.
	 * @see #getEntity_relation_name()
	 * @generated
	 */
	void setEntity_relation_name(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gedbm.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gedbm.RelationshipType
	 * @see #setType(RelationshipType)
	 * @see gedbm.GedbmPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link gedbm.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gedbm.RelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' reference list.
	 * The list contents are of type {@link gedbm.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' reference list.
	 * @see gedbm.GedbmPackage#getRelationship_Related()
	 * @model lower="2"
	 * @generated
	 */
	EList<Entity> getRelated();

} // Relationship
