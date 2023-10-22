/**
 */
package gedbm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.Integrity#isNot_null <em>Not null</em>}</li>
 *   <li>{@link gedbm.Integrity#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getIntegrity()
 * @model
 * @generated
 */
public interface Integrity extends EObject {
	/**
	 * Returns the value of the '<em><b>Not null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not null</em>' attribute.
	 * @see #setNot_null(boolean)
	 * @see gedbm.GedbmPackage#getIntegrity_Not_null()
	 * @model
	 * @generated
	 */
	boolean isNot_null();

	/**
	 * Sets the value of the '{@link gedbm.Integrity#isNot_null <em>Not null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not null</em>' attribute.
	 * @see #isNot_null()
	 * @generated
	 */
	void setNot_null(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see gedbm.GedbmPackage#getIntegrity_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link gedbm.Integrity#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // Integrity
