/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.impl;

import gedbm.DefaultValue;
import gedbm.Field;
import gedbm.ForeignKey;
import gedbm.GedbmPackage;
import gedbm.Integrity;
import gedbm.NumericLimit;
import gedbm.TextLimit;
import gedbm.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gedbm.impl.FieldImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getHasTextLimit <em>Has Text Limit</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getHasNumericLimit <em>Has Numeric Limit</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getHasIntegrity <em>Has Integrity</em>}</li>
 *   <li>{@link gedbm.impl.FieldImpl#getHasDefaultValue <em>Has Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends EObjectImpl implements Field {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasForeignKey() <em>Has Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> hasForeignKey;

	/**
	 * The cached value of the '{@link #getHasTextLimit() <em>Has Text Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTextLimit()
	 * @generated
	 * @ordered
	 */
	protected TextLimit hasTextLimit;

	/**
	 * The cached value of the '{@link #getHasNumericLimit() <em>Has Numeric Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNumericLimit()
	 * @generated
	 * @ordered
	 */
	protected NumericLimit hasNumericLimit;

	/**
	 * The cached value of the '{@link #getHasIntegrity() <em>Has Integrity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIntegrity()
	 * @generated
	 * @ordered
	 */
	protected Integrity hasIntegrity;

	/**
	 * The cached value of the '{@link #getHasDefaultValue() <em>Has Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected DefaultValue hasDefaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GedbmPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectResolvingEList<ForeignKey>(ForeignKey.class, this, GedbmPackage.FIELD__HAS_FOREIGN_KEY);
		}
		return hasForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLimit getHasTextLimit() {
		return hasTextLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasTextLimit(TextLimit newHasTextLimit, NotificationChain msgs) {
		TextLimit oldHasTextLimit = hasTextLimit;
		hasTextLimit = newHasTextLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_TEXT_LIMIT, oldHasTextLimit, newHasTextLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTextLimit(TextLimit newHasTextLimit) {
		if (newHasTextLimit != hasTextLimit) {
			NotificationChain msgs = null;
			if (hasTextLimit != null)
				msgs = ((InternalEObject)hasTextLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_TEXT_LIMIT, null, msgs);
			if (newHasTextLimit != null)
				msgs = ((InternalEObject)newHasTextLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_TEXT_LIMIT, null, msgs);
			msgs = basicSetHasTextLimit(newHasTextLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_TEXT_LIMIT, newHasTextLimit, newHasTextLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericLimit getHasNumericLimit() {
		return hasNumericLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasNumericLimit(NumericLimit newHasNumericLimit, NotificationChain msgs) {
		NumericLimit oldHasNumericLimit = hasNumericLimit;
		hasNumericLimit = newHasNumericLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_NUMERIC_LIMIT, oldHasNumericLimit, newHasNumericLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasNumericLimit(NumericLimit newHasNumericLimit) {
		if (newHasNumericLimit != hasNumericLimit) {
			NotificationChain msgs = null;
			if (hasNumericLimit != null)
				msgs = ((InternalEObject)hasNumericLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_NUMERIC_LIMIT, null, msgs);
			if (newHasNumericLimit != null)
				msgs = ((InternalEObject)newHasNumericLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_NUMERIC_LIMIT, null, msgs);
			msgs = basicSetHasNumericLimit(newHasNumericLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_NUMERIC_LIMIT, newHasNumericLimit, newHasNumericLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integrity getHasIntegrity() {
		return hasIntegrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasIntegrity(Integrity newHasIntegrity, NotificationChain msgs) {
		Integrity oldHasIntegrity = hasIntegrity;
		hasIntegrity = newHasIntegrity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_INTEGRITY, oldHasIntegrity, newHasIntegrity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasIntegrity(Integrity newHasIntegrity) {
		if (newHasIntegrity != hasIntegrity) {
			NotificationChain msgs = null;
			if (hasIntegrity != null)
				msgs = ((InternalEObject)hasIntegrity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_INTEGRITY, null, msgs);
			if (newHasIntegrity != null)
				msgs = ((InternalEObject)newHasIntegrity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_INTEGRITY, null, msgs);
			msgs = basicSetHasIntegrity(newHasIntegrity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_INTEGRITY, newHasIntegrity, newHasIntegrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValue getHasDefaultValue() {
		return hasDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasDefaultValue(DefaultValue newHasDefaultValue, NotificationChain msgs) {
		DefaultValue oldHasDefaultValue = hasDefaultValue;
		hasDefaultValue = newHasDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_DEFAULT_VALUE, oldHasDefaultValue, newHasDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasDefaultValue(DefaultValue newHasDefaultValue) {
		if (newHasDefaultValue != hasDefaultValue) {
			NotificationChain msgs = null;
			if (hasDefaultValue != null)
				msgs = ((InternalEObject)hasDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_DEFAULT_VALUE, null, msgs);
			if (newHasDefaultValue != null)
				msgs = ((InternalEObject)newHasDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GedbmPackage.FIELD__HAS_DEFAULT_VALUE, null, msgs);
			msgs = basicSetHasDefaultValue(newHasDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.FIELD__HAS_DEFAULT_VALUE, newHasDefaultValue, newHasDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GedbmPackage.FIELD__HAS_TEXT_LIMIT:
				return basicSetHasTextLimit(null, msgs);
			case GedbmPackage.FIELD__HAS_NUMERIC_LIMIT:
				return basicSetHasNumericLimit(null, msgs);
			case GedbmPackage.FIELD__HAS_INTEGRITY:
				return basicSetHasIntegrity(null, msgs);
			case GedbmPackage.FIELD__HAS_DEFAULT_VALUE:
				return basicSetHasDefaultValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GedbmPackage.FIELD__CODE:
				return getCode();
			case GedbmPackage.FIELD__NAME:
				return getName();
			case GedbmPackage.FIELD__TYPE:
				return getType();
			case GedbmPackage.FIELD__HAS_FOREIGN_KEY:
				return getHasForeignKey();
			case GedbmPackage.FIELD__HAS_TEXT_LIMIT:
				return getHasTextLimit();
			case GedbmPackage.FIELD__HAS_NUMERIC_LIMIT:
				return getHasNumericLimit();
			case GedbmPackage.FIELD__HAS_INTEGRITY:
				return getHasIntegrity();
			case GedbmPackage.FIELD__HAS_DEFAULT_VALUE:
				return getHasDefaultValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GedbmPackage.FIELD__CODE:
				setCode((Integer)newValue);
				return;
			case GedbmPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case GedbmPackage.FIELD__TYPE:
				setType((Type)newValue);
				return;
			case GedbmPackage.FIELD__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				getHasForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case GedbmPackage.FIELD__HAS_TEXT_LIMIT:
				setHasTextLimit((TextLimit)newValue);
				return;
			case GedbmPackage.FIELD__HAS_NUMERIC_LIMIT:
				setHasNumericLimit((NumericLimit)newValue);
				return;
			case GedbmPackage.FIELD__HAS_INTEGRITY:
				setHasIntegrity((Integrity)newValue);
				return;
			case GedbmPackage.FIELD__HAS_DEFAULT_VALUE:
				setHasDefaultValue((DefaultValue)newValue);
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
			case GedbmPackage.FIELD__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GedbmPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GedbmPackage.FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GedbmPackage.FIELD__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				return;
			case GedbmPackage.FIELD__HAS_TEXT_LIMIT:
				setHasTextLimit((TextLimit)null);
				return;
			case GedbmPackage.FIELD__HAS_NUMERIC_LIMIT:
				setHasNumericLimit((NumericLimit)null);
				return;
			case GedbmPackage.FIELD__HAS_INTEGRITY:
				setHasIntegrity((Integrity)null);
				return;
			case GedbmPackage.FIELD__HAS_DEFAULT_VALUE:
				setHasDefaultValue((DefaultValue)null);
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
			case GedbmPackage.FIELD__CODE:
				return code != CODE_EDEFAULT;
			case GedbmPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GedbmPackage.FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case GedbmPackage.FIELD__HAS_FOREIGN_KEY:
				return hasForeignKey != null && !hasForeignKey.isEmpty();
			case GedbmPackage.FIELD__HAS_TEXT_LIMIT:
				return hasTextLimit != null;
			case GedbmPackage.FIELD__HAS_NUMERIC_LIMIT:
				return hasNumericLimit != null;
			case GedbmPackage.FIELD__HAS_INTEGRITY:
				return hasIntegrity != null;
			case GedbmPackage.FIELD__HAS_DEFAULT_VALUE:
				return hasDefaultValue != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
