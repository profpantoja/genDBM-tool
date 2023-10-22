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
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.Field#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.Field#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.Field#getType <em>Type</em>}</li>
 *   <li>{@link gedbm.Field#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link gedbm.Field#getHasTextLimit <em>Has Text Limit</em>}</li>
 *   <li>{@link gedbm.Field#getHasNumericLimit <em>Has Numeric Limit</em>}</li>
 *   <li>{@link gedbm.Field#getHasIntegrity <em>Has Integrity</em>}</li>
 *   <li>{@link gedbm.Field#getHasDefaultValue <em>Has Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
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
	 * @see gedbm.GedbmPackage#getField_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link gedbm.Field#getCode <em>Code</em>}' attribute.
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
	 * @see gedbm.GedbmPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gedbm.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gedbm.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gedbm.Type
	 * @see #setType(Type)
	 * @see gedbm.GedbmPackage#getField_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link gedbm.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gedbm.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link gedbm.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key</em>' reference list.
	 * @see gedbm.GedbmPackage#getField_HasForeignKey()
	 * @model
	 * @generated
	 */
	EList<ForeignKey> getHasForeignKey();

	/**
	 * Returns the value of the '<em><b>Has Text Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Text Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Text Limit</em>' containment reference.
	 * @see #setHasTextLimit(TextLimit)
	 * @see gedbm.GedbmPackage#getField_HasTextLimit()
	 * @model containment="true"
	 * @generated
	 */
	TextLimit getHasTextLimit();

	/**
	 * Sets the value of the '{@link gedbm.Field#getHasTextLimit <em>Has Text Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Text Limit</em>' containment reference.
	 * @see #getHasTextLimit()
	 * @generated
	 */
	void setHasTextLimit(TextLimit value);

	/**
	 * Returns the value of the '<em><b>Has Numeric Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Numeric Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Numeric Limit</em>' containment reference.
	 * @see #setHasNumericLimit(NumericLimit)
	 * @see gedbm.GedbmPackage#getField_HasNumericLimit()
	 * @model containment="true"
	 * @generated
	 */
	NumericLimit getHasNumericLimit();

	/**
	 * Sets the value of the '{@link gedbm.Field#getHasNumericLimit <em>Has Numeric Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Numeric Limit</em>' containment reference.
	 * @see #getHasNumericLimit()
	 * @generated
	 */
	void setHasNumericLimit(NumericLimit value);

	/**
	 * Returns the value of the '<em><b>Has Integrity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Integrity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Integrity</em>' containment reference.
	 * @see #setHasIntegrity(Integrity)
	 * @see gedbm.GedbmPackage#getField_HasIntegrity()
	 * @model containment="true"
	 * @generated
	 */
	Integrity getHasIntegrity();

	/**
	 * Sets the value of the '{@link gedbm.Field#getHasIntegrity <em>Has Integrity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Integrity</em>' containment reference.
	 * @see #getHasIntegrity()
	 * @generated
	 */
	void setHasIntegrity(Integrity value);

	/**
	 * Returns the value of the '<em><b>Has Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Default Value</em>' containment reference.
	 * @see #setHasDefaultValue(DefaultValue)
	 * @see gedbm.GedbmPackage#getField_HasDefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	DefaultValue getHasDefaultValue();

	/**
	 * Sets the value of the '{@link gedbm.Field#getHasDefaultValue <em>Has Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Default Value</em>' containment reference.
	 * @see #getHasDefaultValue()
	 * @generated
	 */
	void setHasDefaultValue(DefaultValue value);

} // Field
