/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.HAL#getSmarthome <em>Smarthome</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getHAL()
 * @model
 * @generated
 */
public interface HAL extends EObject {
	/**
	 * Returns the value of the '<em><b>Smarthome</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.SmartHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smarthome</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getHAL_Smarthome()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartHome> getSmarthome();

} // HAL
