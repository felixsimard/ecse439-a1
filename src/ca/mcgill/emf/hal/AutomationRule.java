/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.AutomationRule#getPassword <em>Password</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.AutomationRule#getAction <em>Action</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.AutomationRule#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.AutomationRule#isIsActivated <em>Is Activated</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.AutomationRule#getAutomationruleevent <em>Automationruleevent</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule()
 * @model
 * @generated
 */
public interface AutomationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.AutomationRule#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(PreCondition)
	 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule_Precondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreCondition getPrecondition();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.AutomationRule#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(PreCondition value);

	/**
	 * Returns the value of the '<em><b>Is Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Activated</em>' attribute.
	 * @see #setIsActivated(boolean)
	 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule_IsActivated()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsActivated();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.AutomationRule#isIsActivated <em>Is Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Activated</em>' attribute.
	 * @see #isIsActivated()
	 * @generated
	 */
	void setIsActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Automationruleevent</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.AutomationRuleEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationruleevent</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getAutomationRule_Automationruleevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRuleEvent> getAutomationruleevent();

} // AutomationRule
