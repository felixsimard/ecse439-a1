/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.Device#getType <em>Type</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.Device#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getDevice()
 * @model abstract="true"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getDevice_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Specificdevice</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.SpecificDevice}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.SpecificDevice#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificdevice</em>' reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getDevice_Specificdevice()
	 * @see ca.mcgill.emf.hal.SpecificDevice#getDevice
	 * @model opposite="device"
	 * @generated
	 */
	EList<SpecificDevice> getSpecificdevice();

} // Device
