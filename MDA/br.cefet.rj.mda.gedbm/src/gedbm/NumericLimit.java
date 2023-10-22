/**
 */
package gedbm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gedbm.NumericLimit#getLimit_value <em>Limit value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gedbm.GedbmPackage#getNumericLimit()
 * @model
 * @generated
 */
public interface NumericLimit extends EObject {
	/**
	 * Returns the value of the '<em><b>Limit value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit value</em>' attribute.
	 * @see #setLimit_value(int)
	 * @see gedbm.GedbmPackage#getNumericLimit_Limit_value()
	 * @model
	 * @generated
	 */
	int getLimit_value();

	/**
	 * Sets the value of the '{@link gedbm.NumericLimit#getLimit_value <em>Limit value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit value</em>' attribute.
	 * @see #getLimit_value()
	 * @generated
	 */
	void setLimit_value(int value);

} // NumericLimit
