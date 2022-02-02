/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.Actuator#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Device {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getActuator_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

} // Actuator
