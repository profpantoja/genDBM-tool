/**
 */
package gedbm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.DataBase#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.DataBase#getIsComposed <em>Is Composed</em>}</li>
 *   <li>{@link gedbm.DataBase#getHasInteraction <em>Has Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends EObject {
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
	 * @see gedbm.GedbmPackage#getDataBase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gedbm.DataBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Composed</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composed</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getDataBase_IsComposed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getIsComposed();

	/**
	 * Returns the value of the '<em><b>Has Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link gedbm.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interaction</em>' containment reference list.
	 * @see gedbm.GedbmPackage#getDataBase_HasInteraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getHasInteraction();

} // DataBase
