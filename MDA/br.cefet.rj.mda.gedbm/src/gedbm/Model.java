/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.Model#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.Model#getIsFormedOf <em>Is Formed Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see gedbm.GedbmPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gedbm.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Formed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Formed Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Formed Of</em>' containment reference.
	 * @see #setIsFormedOf(DataBase)
	 * @see gedbm.GedbmPackage#getModel_IsFormedOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataBase getIsFormedOf();

	/**
	 * Sets the value of the '{@link gedbm.Model#getIsFormedOf <em>Is Formed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Formed Of</em>' containment reference.
	 * @see #getIsFormedOf()
	 * @generated
	 */
	void setIsFormedOf(DataBase value);

} // Model
