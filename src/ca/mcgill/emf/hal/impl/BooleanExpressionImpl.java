/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.BooleanExpression;
import ca.mcgill.emf.hal.BooleanOperator;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.PreCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.BooleanExpressionImpl#getBooleanOperator <em>Boolean Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.BooleanExpressionImpl#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExpressionImpl extends PreConditionImpl implements BooleanExpression {
	/**
	 * The default value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator BOOLEAN_OPERATOR_EDEFAULT = BooleanOperator.AND;

	/**
	 * The cached value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator booleanOperator = BOOLEAN_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<PreCondition> precondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getBooleanOperator() {
		return booleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanOperator(BooleanOperator newBooleanOperator) {
		BooleanOperator oldBooleanOperator = booleanOperator;
		booleanOperator = newBooleanOperator == null ? BOOLEAN_OPERATOR_EDEFAULT : newBooleanOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR,
					oldBooleanOperator, booleanOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreCondition> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<PreCondition>(PreCondition.class, this,
					HalPackage.BOOLEAN_EXPRESSION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.BOOLEAN_EXPRESSION__PRECONDITION:
			return ((InternalEList<?>) getPrecondition()).basicRemove(otherEnd, msgs);
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
		case HalPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR:
			return getBooleanOperator();
		case HalPackage.BOOLEAN_EXPRESSION__PRECONDITION:
			return getPrecondition();
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
		case HalPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR:
			setBooleanOperator((BooleanOperator) newValue);
			return;
		case HalPackage.BOOLEAN_EXPRESSION__PRECONDITION:
			getPrecondition().clear();
			getPrecondition().addAll((Collection<? extends PreCondition>) newValue);
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
		case HalPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR:
			setBooleanOperator(BOOLEAN_OPERATOR_EDEFAULT);
			return;
		case HalPackage.BOOLEAN_EXPRESSION__PRECONDITION:
			getPrecondition().clear();
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
		case HalPackage.BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR:
			return booleanOperator != BOOLEAN_OPERATOR_EDEFAULT;
		case HalPackage.BOOLEAN_EXPRESSION__PRECONDITION:
			return precondition != null && !precondition.isEmpty();
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
		result.append(" (booleanOperator: ");
		result.append(booleanOperator);
		result.append(')');
		return result.toString();
	}

} //BooleanExpressionImpl
