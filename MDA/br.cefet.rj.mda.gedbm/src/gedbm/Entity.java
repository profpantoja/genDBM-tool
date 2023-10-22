/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.Entity#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.Entity#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.Entity#getIsComposed <em>Is Composed</em>}</li>
 *   <li>{@link gedbm.Entity#getSubgroupOf <em>Subgroup Of</em>}</li>
 *   <li>{@link gedbm.Entity#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link gedbm.Entity#getHasPrimaryKey <em>Has Primary Key</em>}</li>
 *   <li>{@link gedbm.Entity#getHasCheck <em>Has Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see gedbm.GedbmPackage#getEntity_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link gedbm.Entity#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

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
	 * @see gedbm.GedbmPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gedbm.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Composed</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composed</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getEntity_IsComposed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getIsComposed();

	/**
	 * Returns the value of the '<em><b>Subgroup Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup Of</em>' reference.
	 * @see #setSubgroupOf(Entity)
	 * @see gedbm.GedbmPackage#getEntity_SubgroupOf()
	 * @model
	 * @generated
	 */
	Entity getSubgroupOf();

	/**
	 * Sets the value of the '{@link gedbm.Entity#getSubgroupOf <em>Subgroup Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subgroup Of</em>' reference.
	 * @see #getSubgroupOf()
	 * @generated
	 */
	void setSubgroupOf(Entity value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getEntity_HasForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getHasForeignKey();

	/**
	 * Returns the value of the '<em><b>Has Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primary Key</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getEntity_HasPrimaryKey()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrimaryKey> getHasPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Has Check</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Check</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getEntity_HasCheck()
	 * @model containment="true"
	 * @generated
	 */
	EList<Check> getHasCheck();

} // Entity
