/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.impl;

import gedbm.Components;
import gedbm.DataBase;
import gedbm.Entity;
import gedbm.GedbmPackage;
import gedbm.Relationship;

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
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gedbm.impl.DataBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.impl.DataBaseImpl#getHas <em>Has</em>}</li>
 *   <li>{@link gedbm.impl.DataBaseImpl#getIsComposed <em>Is Composed</em>}</li>
 *   <li>{@link gedbm.impl.DataBaseImpl#getHasInteraction <em>Has Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBaseImpl extends EObjectImpl implements DataBase {
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
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Components> has;

	/**
	 * The cached value of the '{@link #getIsComposed() <em>Is Composed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposed()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> isComposed;

	/**
	 * The cached value of the '{@link #getHasInteraction() <em>Has Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> hasInteraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GedbmPackage.Literals.DATA_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.DATA_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Components> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Components>(Components.class, this, GedbmPackage.DATA_BASE__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getIsComposed() {
		if (isComposed == null) {
			isComposed = new EObjectContainmentEList<Entity>(Entity.class, this, GedbmPackage.DATA_BASE__IS_COMPOSED);
		}
		return isComposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getHasInteraction() {
		if (hasInteraction == null) {
			hasInteraction = new EObjectContainmentEList<Relationship>(Relationship.class, this, GedbmPackage.DATA_BASE__HAS_INTERACTION);
		}
		return hasInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GedbmPackage.DATA_BASE__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case GedbmPackage.DATA_BASE__IS_COMPOSED:
				return ((InternalEList<?>)getIsComposed()).basicRemove(otherEnd, msgs);
			case GedbmPackage.DATA_BASE__HAS_INTERACTION:
				return ((InternalEList<?>)getHasInteraction()).basicRemove(otherEnd, msgs);
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
			case GedbmPackage.DATA_BASE__NAME:
				return getName();
			case GedbmPackage.DATA_BASE__HAS:
				return getHas();
			case GedbmPackage.DATA_BASE__IS_COMPOSED:
				return getIsComposed();
			case GedbmPackage.DATA_BASE__HAS_INTERACTION:
				return getHasInteraction();
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
			case GedbmPackage.DATA_BASE__NAME:
				setName((String)newValue);
				return;
			case GedbmPackage.DATA_BASE__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Components>)newValue);
				return;
			case GedbmPackage.DATA_BASE__IS_COMPOSED:
				getIsComposed().clear();
				getIsComposed().addAll((Collection<? extends Entity>)newValue);
				return;
			case GedbmPackage.DATA_BASE__HAS_INTERACTION:
				getHasInteraction().clear();
				getHasInteraction().addAll((Collection<? extends Relationship>)newValue);
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
			case GedbmPackage.DATA_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GedbmPackage.DATA_BASE__HAS:
				getHas().clear();
				return;
			case GedbmPackage.DATA_BASE__IS_COMPOSED:
				getIsComposed().clear();
				return;
			case GedbmPackage.DATA_BASE__HAS_INTERACTION:
				getHasInteraction().clear();
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
			case GedbmPackage.DATA_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GedbmPackage.DATA_BASE__HAS:
				return has != null && !has.isEmpty();
			case GedbmPackage.DATA_BASE__IS_COMPOSED:
				return isComposed != null && !isComposed.isEmpty();
			case GedbmPackage.DATA_BASE__HAS_INTERACTION:
				return hasInteraction != null && !hasInteraction.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataBaseImpl
