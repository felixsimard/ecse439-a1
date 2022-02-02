/**
 */
package ca.mcgill.emf.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.SensorEvent#getMeasuredValue <em>Measured Value</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getSensorEvent()
 * @model
 * @generated
 */
public interface SensorEvent extends DeviceEvent {
	/**
	 * Returns the value of the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Value</em>' attribute.
	 * @see #setMeasuredValue(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getSensorEvent_MeasuredValue()
	 * @model
	 * @generated
	 */
	String getMeasuredValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.SensorEvent#getMeasuredValue <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Value</em>' attribute.
	 * @see #getMeasuredValue()
	 * @generated
	 */
	void setMeasuredValue(String value);

} // SensorEvent
