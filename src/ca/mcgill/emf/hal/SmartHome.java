/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#isIsOperational <em>Is Operational</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getAutomationrule <em>Automationrule</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getOwner <em>Owner</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SmartHome#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome()
 * @model
 * @generated
 */
public interface SmartHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Operational</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Operational</em>' attribute.
	 * @see #setIsOperational(boolean)
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_IsOperational()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsOperational();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SmartHome#isIsOperational <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Operational</em>' attribute.
	 * @see #isIsOperational()
	 * @generated
	 */
	void setIsOperational(boolean value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SmartHome#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Automationrule</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automationrule</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Automationrule()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getAutomationrule();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SmartHome#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SmartHome#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSmartHome_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

} // SmartHome
