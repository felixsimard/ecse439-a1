/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.SpecificDevice#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SpecificDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SpecificDevice#getDeviceevent <em>Deviceevent</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SpecificDevice#getAction <em>Action</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.SpecificDevice#getConditionitem <em>Conditionitem</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice()
 * @model
 * @generated
 */
public interface SpecificDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SpecificDevice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.Device#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice_Device()
	 * @see ca.mcgill.emf.hal.Device#getSpecificdevice
	 * @model opposite="specificdevice" required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SpecificDevice#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Deviceevent</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.DeviceEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceevent</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice_Deviceevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceEvent> getDeviceevent();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.Action}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.Action#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice_Action()
	 * @see ca.mcgill.emf.hal.Action#getSpecificdevice
	 * @model opposite="specificdevice"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Conditionitem</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.ConditionItem}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.ConditionItem#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionitem</em>' reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getSpecificDevice_Conditionitem()
	 * @see ca.mcgill.emf.hal.ConditionItem#getSpecificdevice
	 * @model opposite="specificdevice"
	 * @generated
	 */
	EList<ConditionItem> getConditionitem();

} // SpecificDevice
