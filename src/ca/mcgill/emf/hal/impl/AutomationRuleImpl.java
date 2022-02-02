/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.Action;
import ca.mcgill.emf.hal.AutomationRule;
import ca.mcgill.emf.hal.AutomationRuleEvent;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.PreCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl#getAutomationruleevent <em>Automationruleevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomationRuleImpl extends MinimalEObjectImpl.Container implements AutomationRule {
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected PreCondition precondition;

	/**
	 * The default value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActivated() <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean isActivated = IS_ACTIVATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutomationruleevent() <em>Automationruleevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationruleevent()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRuleEvent> automationruleevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.AUTOMATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, HalPackage.AUTOMATION_RULE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(PreCondition newPrecondition, NotificationChain msgs) {
		PreCondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.AUTOMATION_RULE__PRECONDITION, oldPrecondition, newPrecondition);
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
	public void setPrecondition(PreCondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject) precondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.AUTOMATION_RULE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject) newPrecondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HalPackage.AUTOMATION_RULE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__PRECONDITION,
					newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActivated() {
		return isActivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActivated(boolean newIsActivated) {
		boolean oldIsActivated = isActivated;
		isActivated = newIsActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__IS_ACTIVATED,
					oldIsActivated, isActivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRuleEvent> getAutomationruleevent() {
		if (automationruleevent == null) {
			automationruleevent = new EObjectContainmentEList<AutomationRuleEvent>(AutomationRuleEvent.class, this,
					HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT);
		}
		return automationruleevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.AUTOMATION_RULE__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case HalPackage.AUTOMATION_RULE__PRECONDITION:
			return basicSetPrecondition(null, msgs);
		case HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT:
			return ((InternalEList<?>) getAutomationruleevent()).basicRemove(otherEnd, msgs);
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
		case HalPackage.AUTOMATION_RULE__PASSWORD:
			return getPassword();
		case HalPackage.AUTOMATION_RULE__ACTION:
			return getAction();
		case HalPackage.AUTOMATION_RULE__PRECONDITION:
			return getPrecondition();
		case HalPackage.AUTOMATION_RULE__IS_ACTIVATED:
			return isIsActivated();
		case HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT:
			return getAutomationruleevent();
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
		case HalPackage.AUTOMATION_RULE__PASSWORD:
			setPassword((String) newValue);
			return;
		case HalPackage.AUTOMATION_RULE__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case HalPackage.AUTOMATION_RULE__PRECONDITION:
			setPrecondition((PreCondition) newValue);
			return;
		case HalPackage.AUTOMATION_RULE__IS_ACTIVATED:
			setIsActivated((Boolean) newValue);
			return;
		case HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT:
			getAutomationruleevent().clear();
			getAutomationruleevent().addAll((Collection<? extends AutomationRuleEvent>) newValue);
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
		case HalPackage.AUTOMATION_RULE__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case HalPackage.AUTOMATION_RULE__ACTION:
			getAction().clear();
			return;
		case HalPackage.AUTOMATION_RULE__PRECONDITION:
			setPrecondition((PreCondition) null);
			return;
		case HalPackage.AUTOMATION_RULE__IS_ACTIVATED:
			setIsActivated(IS_ACTIVATED_EDEFAULT);
			return;
		case HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT:
			getAutomationruleevent().clear();
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
		case HalPackage.AUTOMATION_RULE__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case HalPackage.AUTOMATION_RULE__ACTION:
			return action != null && !action.isEmpty();
		case HalPackage.AUTOMATION_RULE__PRECONDITION:
			return precondition != null;
		case HalPackage.AUTOMATION_RULE__IS_ACTIVATED:
			return isActivated != IS_ACTIVATED_EDEFAULT;
		case HalPackage.AUTOMATION_RULE__AUTOMATIONRULEEVENT:
			return automationruleevent != null && !automationruleevent.isEmpty();
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
		result.append(" (password: ");
		result.append(password);
		result.append(", isActivated: ");
		result.append(isActivated);
		result.append(')');
		return result.toString();
	}

} //AutomationRuleImpl
