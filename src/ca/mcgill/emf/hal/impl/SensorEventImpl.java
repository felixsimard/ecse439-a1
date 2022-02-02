/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.SensorEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.SensorEventImpl#getMeasuredValue <em>Measured Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorEventImpl extends DeviceEventImpl implements SensorEvent {
	/**
	 * The default value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasuredValue() <em>Measured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredValue()
	 * @generated
	 * @ordered
	 */
	protected String measuredValue = MEASURED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SENSOR_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasuredValue() {
		return measuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredValue(String newMeasuredValue) {
		String oldMeasuredValue = measuredValue;
		measuredValue = newMeasuredValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SENSOR_EVENT__MEASURED_VALUE,
					oldMeasuredValue, measuredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.SENSOR_EVENT__MEASURED_VALUE:
			return getMeasuredValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HalPackage.SENSOR_EVENT__MEASURED_VALUE:
			setMeasuredValue((String) newValue);
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
		case HalPackage.SENSOR_EVENT__MEASURED_VALUE:
			setMeasuredValue(MEASURED_VALUE_EDEFAULT);
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
		case HalPackage.SENSOR_EVENT__MEASURED_VALUE:
			return MEASURED_VALUE_EDEFAULT == null ? measuredValue != null
					: !MEASURED_VALUE_EDEFAULT.equals(measuredValue);
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
		result.append(" (measuredValue: ");
		result.append(measuredValue);
		result.append(')');
		return result.toString();
	}

} //SensorEventImpl
