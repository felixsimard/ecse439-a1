/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.ComparisonOperator;
import ca.mcgill.emf.hal.ConditionItem;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.SpecificDevice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.ConditionItemImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.ConditionItemImpl#getComparedValue <em>Compared Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.ConditionItemImpl#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionItemImpl extends PreConditionImpl implements ConditionItem {
	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator COMPARISON_OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparedValue() <em>Compared Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparedValue() <em>Compared Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedValue()
	 * @generated
	 * @ordered
	 */
	protected String comparedValue = COMPARED_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecificdevice() <em>Specificdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificdevice()
	 * @generated
	 * @ordered
	 */
	protected SpecificDevice specificdevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.CONDITION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperator newComparisonOperator) {
		ComparisonOperator oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONDITION_ITEM__COMPARISON_OPERATOR,
					oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparedValue() {
		return comparedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparedValue(String newComparedValue) {
		String oldComparedValue = comparedValue;
		comparedValue = newComparedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONDITION_ITEM__COMPARED_VALUE,
					oldComparedValue, comparedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDevice getSpecificdevice() {
		if (specificdevice != null && specificdevice.eIsProxy()) {
			InternalEObject oldSpecificdevice = (InternalEObject) specificdevice;
			specificdevice = (SpecificDevice) eResolveProxy(oldSpecificdevice);
			if (specificdevice != oldSpecificdevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.CONDITION_ITEM__SPECIFICDEVICE,
							oldSpecificdevice, specificdevice));
			}
		}
		return specificdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDevice basicGetSpecificdevice() {
		return specificdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificdevice(SpecificDevice newSpecificdevice, NotificationChain msgs) {
		SpecificDevice oldSpecificdevice = specificdevice;
		specificdevice = newSpecificdevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.CONDITION_ITEM__SPECIFICDEVICE, oldSpecificdevice, newSpecificdevice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificdevice(SpecificDevice newSpecificdevice) {
		if (newSpecificdevice != specificdevice) {
			NotificationChain msgs = null;
			if (specificdevice != null)
				msgs = ((InternalEObject) specificdevice).eInverseRemove(this,
						HalPackage.SPECIFIC_DEVICE__CONDITIONITEM, SpecificDevice.class, msgs);
			if (newSpecificdevice != null)
				msgs = ((InternalEObject) newSpecificdevice).eInverseAdd(this,
						HalPackage.SPECIFIC_DEVICE__CONDITIONITEM, SpecificDevice.class, msgs);
			msgs = basicSetSpecificdevice(newSpecificdevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.CONDITION_ITEM__SPECIFICDEVICE,
					newSpecificdevice, newSpecificdevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			if (specificdevice != null)
				msgs = ((InternalEObject) specificdevice).eInverseRemove(this,
						HalPackage.SPECIFIC_DEVICE__CONDITIONITEM, SpecificDevice.class, msgs);
			return basicSetSpecificdevice((SpecificDevice) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			return basicSetSpecificdevice(null, msgs);
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
		case HalPackage.CONDITION_ITEM__COMPARISON_OPERATOR:
			return getComparisonOperator();
		case HalPackage.CONDITION_ITEM__COMPARED_VALUE:
			return getComparedValue();
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			if (resolve)
				return getSpecificdevice();
			return basicGetSpecificdevice();
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
		case HalPackage.CONDITION_ITEM__COMPARISON_OPERATOR:
			setComparisonOperator((ComparisonOperator) newValue);
			return;
		case HalPackage.CONDITION_ITEM__COMPARED_VALUE:
			setComparedValue((String) newValue);
			return;
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			setSpecificdevice((SpecificDevice) newValue);
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
		case HalPackage.CONDITION_ITEM__COMPARISON_OPERATOR:
			setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
			return;
		case HalPackage.CONDITION_ITEM__COMPARED_VALUE:
			setComparedValue(COMPARED_VALUE_EDEFAULT);
			return;
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			setSpecificdevice((SpecificDevice) null);
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
		case HalPackage.CONDITION_ITEM__COMPARISON_OPERATOR:
			return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
		case HalPackage.CONDITION_ITEM__COMPARED_VALUE:
			return COMPARED_VALUE_EDEFAULT == null ? comparedValue != null
					: !COMPARED_VALUE_EDEFAULT.equals(comparedValue);
		case HalPackage.CONDITION_ITEM__SPECIFICDEVICE:
			return specificdevice != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", comparedValue: ");
		result.append(comparedValue);
		result.append(')');
		return result.toString();
	}

} //ConditionItemImpl
