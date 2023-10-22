/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.impl;

import gedbm.Cardinality;
import gedbm.Entity;
import gedbm.Field;
import gedbm.ForeignKey;
import gedbm.GedbmPackage;
import gedbm.PrimaryKey;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gedbm.impl.RelationshipImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getRelated <em>Related</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getIsConstraint <em>Is Constraint</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getIsMapping <em>Is Mapping</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getWouldHasPrimary <em>Would Has Primary</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getWouldHasForeign <em>Would Has Foreign</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#isIsAssociative <em>Is Associative</em>}</li>
 *   <li>{@link gedbm.impl.RelationshipImpl#getEntity_relation_name <em>Entity relation name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends EObjectImpl implements Relationship {
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
	 * The cached value of the '{@link #getRelated() <em>Related</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> related;

	/**
	 * The cached value of the '{@link #getIsConstraint() <em>Is Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Cardinality> isConstraint;

	/**
	 * The cached value of the '{@link #getIsMapping() <em>Is Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> isMapping;

	/**
	 * The cached value of the '{@link #getWouldHasPrimary() <em>Would Has Primary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWouldHasPrimary()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> wouldHasPrimary;

	/**
	 * The cached value of the '{@link #getWouldHasForeign() <em>Would Has Foreign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWouldHasForeign()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> wouldHasForeign;

	/**
	 * The default value of the '{@link #isIsAssociative() <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSOCIATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssociative() <em>Is Associative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociative()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssociative = IS_ASSOCIATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntity_relation_name() <em>Entity relation name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_relation_name()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_RELATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity_relation_name() <em>Entity relation name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_relation_name()
	 * @generated
	 * @ordered
	 */
	protected String entity_relation_name = ENTITY_RELATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GedbmPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.RELATIONSHIP__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getRelated() {
		if (related == null) {
			related = new EObjectResolvingEList<Entity>(Entity.class, this, GedbmPackage.RELATIONSHIP__RELATED);
		}
		return related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cardinality> getIsConstraint() {
		if (isConstraint == null) {
			isConstraint = new EObjectContainmentEList<Cardinality>(Cardinality.class, this, GedbmPackage.RELATIONSHIP__IS_CONSTRAINT);
		}
		return isConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIsMapping() {
		if (isMapping == null) {
			isMapping = new EObjectContainmentEList<Field>(Field.class, this, GedbmPackage.RELATIONSHIP__IS_MAPPING);
		}
		return isMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getWouldHasPrimary() {
		if (wouldHasPrimary == null) {
			wouldHasPrimary = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY);
		}
		return wouldHasPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getWouldHasForeign() {
		if (wouldHasForeign == null) {
			wouldHasForeign = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN);
		}
		return wouldHasForeign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssociative() {
		return isAssociative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssociative(boolean newIsAssociative) {
		boolean oldIsAssociative = isAssociative;
		isAssociative = newIsAssociative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.RELATIONSHIP__IS_ASSOCIATIVE, oldIsAssociative, isAssociative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntity_relation_name() {
		return entity_relation_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity_relation_name(String newEntity_relation_name) {
		String oldEntity_relation_name = entity_relation_name;
		entity_relation_name = newEntity_relation_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GedbmPackage.RELATIONSHIP__ENTITY_RELATION_NAME, oldEntity_relation_name, entity_relation_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GedbmPackage.RELATIONSHIP__IS_CONSTRAINT:
				return ((InternalEList<?>)getIsConstraint()).basicRemove(otherEnd, msgs);
			case GedbmPackage.RELATIONSHIP__IS_MAPPING:
				return ((InternalEList<?>)getIsMapping()).basicRemove(otherEnd, msgs);
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY:
				return ((InternalEList<?>)getWouldHasPrimary()).basicRemove(otherEnd, msgs);
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN:
				return ((InternalEList<?>)getWouldHasForeign()).basicRemove(otherEnd, msgs);
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
			case GedbmPackage.RELATIONSHIP__CODE:
				return getCode();
			case GedbmPackage.RELATIONSHIP__NAME:
				return getName();
			case GedbmPackage.RELATIONSHIP__RELATED:
				return getRelated();
			case GedbmPackage.RELATIONSHIP__IS_CONSTRAINT:
				return getIsConstraint();
			case GedbmPackage.RELATIONSHIP__IS_MAPPING:
				return getIsMapping();
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY:
				return getWouldHasPrimary();
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN:
				return getWouldHasForeign();
			case GedbmPackage.RELATIONSHIP__IS_ASSOCIATIVE:
				return isIsAssociative();
			case GedbmPackage.RELATIONSHIP__ENTITY_RELATION_NAME:
				return getEntity_relation_name();
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
			case GedbmPackage.RELATIONSHIP__CODE:
				setCode((Integer)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__RELATED:
				getRelated().clear();
				getRelated().addAll((Collection<? extends Entity>)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__IS_CONSTRAINT:
				getIsConstraint().clear();
				getIsConstraint().addAll((Collection<? extends Cardinality>)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__IS_MAPPING:
				getIsMapping().clear();
				getIsMapping().addAll((Collection<? extends Field>)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY:
				getWouldHasPrimary().clear();
				getWouldHasPrimary().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN:
				getWouldHasForeign().clear();
				getWouldHasForeign().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__IS_ASSOCIATIVE:
				setIsAssociative((Boolean)newValue);
				return;
			case GedbmPackage.RELATIONSHIP__ENTITY_RELATION_NAME:
				setEntity_relation_name((String)newValue);
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
			case GedbmPackage.RELATIONSHIP__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case GedbmPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GedbmPackage.RELATIONSHIP__RELATED:
				getRelated().clear();
				return;
			case GedbmPackage.RELATIONSHIP__IS_CONSTRAINT:
				getIsConstraint().clear();
				return;
			case GedbmPackage.RELATIONSHIP__IS_MAPPING:
				getIsMapping().clear();
				return;
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY:
				getWouldHasPrimary().clear();
				return;
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN:
				getWouldHasForeign().clear();
				return;
			case GedbmPackage.RELATIONSHIP__IS_ASSOCIATIVE:
				setIsAssociative(IS_ASSOCIATIVE_EDEFAULT);
				return;
			case GedbmPackage.RELATIONSHIP__ENTITY_RELATION_NAME:
				setEntity_relation_name(ENTITY_RELATION_NAME_EDEFAULT);
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
			case GedbmPackage.RELATIONSHIP__CODE:
				return code != CODE_EDEFAULT;
			case GedbmPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GedbmPackage.RELATIONSHIP__RELATED:
				return related != null && !related.isEmpty();
			case GedbmPackage.RELATIONSHIP__IS_CONSTRAINT:
				return isConstraint != null && !isConstraint.isEmpty();
			case GedbmPackage.RELATIONSHIP__IS_MAPPING:
				return isMapping != null && !isMapping.isEmpty();
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_PRIMARY:
				return wouldHasPrimary != null && !wouldHasPrimary.isEmpty();
			case GedbmPackage.RELATIONSHIP__WOULD_HAS_FOREIGN:
				return wouldHasForeign != null && !wouldHasForeign.isEmpty();
			case GedbmPackage.RELATIONSHIP__IS_ASSOCIATIVE:
				return isAssociative != IS_ASSOCIATIVE_EDEFAULT;
			case GedbmPackage.RELATIONSHIP__ENTITY_RELATION_NAME:
				return ENTITY_RELATION_NAME_EDEFAULT == null ? entity_relation_name != null : !ENTITY_RELATION_NAME_EDEFAULT.equals(entity_relation_name);
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
		result.append(", isAssociative: ");
		result.append(isAssociative);
		result.append(", entity_relation_name: ");
		result.append(entity_relation_name);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
