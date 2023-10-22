/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.impl;

import gedbm.GedbmPackage;
import gedbm.NumericLimit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gedbm.impl.NumericLimitImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.impl.NumericLimitImpl#getLimit_value <em>Limit value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericLimitImpl extends EObjectImpl implements NumericLimit {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit_value() <em>Limit value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit_value()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit_value() <em>Limit value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit_value()
	 * @generated
	 * @ordered
	 */
	protected int limit_value = LIMIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GedbmPackage.Literals.NUMERIC_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.NUMERIC_LIMIT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimit_value() {
		return limit_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit_value(int newLimit_value) {
		int oldLimit_value = limit_value;
		limit_value = newLimit_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.NUMERIC_LIMIT__LIMIT_VALUE, oldLimit_value, limit_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GedbmPackage.NUMERIC_LIMIT__CODE:
				return getCode();
			case GedbmPackage.NUMERIC_LIMIT__LIMIT_VALUE:
				return getLimit_value();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GedbmPackage.NUMERIC_LIMIT__CODE:
				setCode((Integer)newValue);
				return;
			case GedbmPackage.NUMERIC_LIMIT__LIMIT_VALUE:
				setLimit_value((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GedbmPackage.NUMERIC_LIMIT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GedbmPackage.NUMERIC_LIMIT__LIMIT_VALUE:
				setLimit_value(LIMIT_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GedbmPackage.NUMERIC_LIMIT__CODE:
				return code != CODE_EDEFAULT;
			case GedbmPackage.NUMERIC_LIMIT__LIMIT_VALUE:
				return limit_value != LIMIT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", limit_value: ");
		result.append(limit_value);
		result.append(')');
		return result.toString();
	}

} //NumericLimitImpl
