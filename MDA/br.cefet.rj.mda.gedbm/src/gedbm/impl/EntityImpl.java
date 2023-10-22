/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.impl;

import gedbm.Check;
import gedbm.Entity;
import gedbm.Field;
import gedbm.ForeignKey;
import gedbm.GedbmPackage;
import gedbm.PrimaryKey;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gedbm.impl.EntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getIsComposed <em>Is Composed</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getSubgroupOf <em>Subgroup Of</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getHasPrimaryKey <em>Has Primary Key</em>}</li>
 *   <li>{@link gedbm.impl.EntityImpl#getHasCheck <em>Has Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
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
	 * The cached value of the '{@link #getIsComposed() <em>Is Composed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> isComposed;

	/**
	 * The cached value of the '{@link #getSubgroupOf() <em>Subgroup Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroupOf()
	 * @generated
	 * @ordered
	 */
	protected Entity subgroupOf;

	/**
	 * The cached value of the '{@link #getHasForeignKey() <em>Has Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> hasForeignKey;

	/**
	 * The cached value of the '{@link #getHasPrimaryKey() <em>Has Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> hasPrimaryKey;

	/**
	 * The cached value of the '{@link #getHasCheck() <em>Has Check</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> hasCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GedbmPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.ENTITY__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIsComposed() {
		if (isComposed == null) {
			isComposed = new EObjectContainmentEList<Field>(Field.class, this, GedbmPackage.ENTITY__IS_COMPOSED);
		}
		return isComposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSubgroupOf() {
		if (subgroupOf != null && subgroupOf.eIsProxy()) {
			InternalEObject oldSubgroupOf = (InternalEObject)subgroupOf;
			subgroupOf = (Entity)eResolveProxy(oldSubgroupOf);
			if (subgroupOf != oldSubgroupOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedbmPackage.ENTITY__SUBGROUP_OF, oldSubgroupOf, subgroupOf));
			}
		}
		return subgroupOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSubgroupOf() {
		return subgroupOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubgroupOf(Entity newSubgroupOf) {
		Entity oldSubgroupOf = subgroupOf;
		subgroupOf = newSubgroupOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.ENTITY__SUBGROUP_OF, oldSubgroupOf, subgroupOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, GedbmPackage.ENTITY__HAS_FOREIGN_KEY);
		}
		return hasForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getHasPrimaryKey() {
		if (hasPrimaryKey == null) {
			hasPrimaryKey = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, GedbmPackage.ENTITY__HAS_PRIMARY_KEY);
		}
		return hasPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getHasCheck() {
		if (hasCheck == null) {
			hasCheck = new EObjectContainmentEList<Check>(Check.class, this, GedbmPackage.ENTITY__HAS_CHECK);
		}
		return hasCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GedbmPackage.ENTITY__IS_COMPOSED:
				return ((InternalEList<?>)getIsComposed()).basicRemove(otherEnd, msgs);
			case GedbmPackage.ENTITY__HAS_FOREIGN_KEY:
				return ((InternalEList<?>)getHasForeignKey()).basicRemove(otherEnd, msgs);
			case GedbmPackage.ENTITY__HAS_PRIMARY_KEY:
				return ((InternalEList<?>)getHasPrimaryKey()).basicRemove(otherEnd, msgs);
			case GedbmPackage.ENTITY__HAS_CHECK:
				return ((InternalEList<?>)getHasCheck()).basicRemove(otherEnd, msgs);
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
			case GedbmPackage.ENTITY__CODE:
				return getCode();
			case GedbmPackage.ENTITY__NAME:
				return getName();
			case GedbmPackage.ENTITY__IS_COMPOSED:
				return getIsComposed();
			case GedbmPackage.ENTITY__SUBGROUP_OF:
				if (resolve) return getSubgroupOf();
				return basicGetSubgroupOf();
			case GedbmPackage.ENTITY__HAS_FOREIGN_KEY:
				return getHasForeignKey();
			case GedbmPackage.ENTITY__HAS_PRIMARY_KEY:
				return getHasPrimaryKey();
			case GedbmPackage.ENTITY__HAS_CHECK:
				return getHasCheck();
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
			case GedbmPackage.ENTITY__CODE:
				setCode((Integer)newValue);
				return;
			case GedbmPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case GedbmPackage.ENTITY__IS_COMPOSED:
				getIsComposed().clear();
				getIsComposed().addAll((Collection<? extends Field>)newValue);
				return;
			case GedbmPackage.ENTITY__SUBGROUP_OF:
				setSubgroupOf((Entity)newValue);
				return;
			case GedbmPackage.ENTITY__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				getHasForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case GedbmPackage.ENTITY__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				getHasPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case GedbmPackage.ENTITY__HAS_CHECK:
				getHasCheck().clear();
				getHasCheck().addAll((Collection<? extends Check>)newValue);
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
			case GedbmPackage.ENTITY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GedbmPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GedbmPackage.ENTITY__IS_COMPOSED:
				getIsComposed().clear();
				return;
			case GedbmPackage.ENTITY__SUBGROUP_OF:
				setSubgroupOf((Entity)null);
				return;
			case GedbmPackage.ENTITY__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				return;
			case GedbmPackage.ENTITY__HAS_PRIMARY_KEY:
				getHasPrimaryKey().clear();
				return;
			case GedbmPackage.ENTITY__HAS_CHECK:
				getHasCheck().clear();
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
			case GedbmPackage.ENTITY__CODE:
				return code != CODE_EDEFAULT;
			case GedbmPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GedbmPackage.ENTITY__IS_COMPOSED:
				return isComposed != null && !isComposed.isEmpty();
			case GedbmPackage.ENTITY__SUBGROUP_OF:
				return subgroupOf != null;
			case GedbmPackage.ENTITY__HAS_FOREIGN_KEY:
				return hasForeignKey != null && !hasForeignKey.isEmpty();
			case GedbmPackage.ENTITY__HAS_PRIMARY_KEY:
				return hasPrimaryKey != null && !hasPrimaryKey.isEmpty();
			case GedbmPackage.ENTITY__HAS_CHECK:
				return hasCheck != null && !hasCheck.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EntityImpl
