/**
 */
package ca.mcgill.emf.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.CommandEvent#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getCommandEvent()
 * @model
 * @generated
 */
public interface CommandEvent extends DeviceEvent {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see ca.mcgill.emf.hal.HalPackage#getCommandEvent_Command()
	 * @model required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.CommandEvent#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // CommandEvent
