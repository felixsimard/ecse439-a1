/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.Action;
import ca.mcgill.emf.hal.ConditionItem;
import ca.mcgill.emf.hal.Device;
import ca.mcgill.emf.hal.DeviceEvent;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.Room;
import ca.mcgill.emf.hal.SpecificDevice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getDeviceevent <em>Deviceevent</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getConditionitem <em>Conditionitem</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificDeviceImpl extends MinimalEObjectImpl.Container implements SpecificDevice {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getDeviceevent() <em>Deviceevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceevent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceEvent> deviceevent;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getConditionitem() <em>Conditionitem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionitem()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionItem> conditionitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SPECIFIC_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SPECIFIC_DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject) device;
			device = (Device) eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.SPECIFIC_DEVICE__DEVICE,
							oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.SPECIFIC_DEVICE__DEVICE, oldDevice, newDevice);
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
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject) device).eInverseRemove(this, HalPackage.DEVICE__SPECIFICDEVICE, Device.class,
						msgs);
			if (newDevice != null)
				msgs = ((InternalEObject) newDevice).eInverseAdd(this, HalPackage.DEVICE__SPECIFICDEVICE, Device.class,
						msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SPECIFIC_DEVICE__DEVICE, newDevice,
					newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceEvent> getDeviceevent() {
		if (deviceevent == null) {
			deviceevent = new EObjectContainmentEList<DeviceEvent>(DeviceEvent.class, this,
					HalPackage.SPECIFIC_DEVICE__DEVICEEVENT);
		}
		return deviceevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectWithInverseResolvingEList<Action>(Action.class, this,
					HalPackage.SPECIFIC_DEVICE__ACTION, HalPackage.ACTION__SPECIFICDEVICE);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionItem> getConditionitem() {
		if (conditionitem == null) {
			conditionitem = new EObjectWithInverseResolvingEList<ConditionItem>(ConditionItem.class, this,
					HalPackage.SPECIFIC_DEVICE__CONDITIONITEM, HalPackage.CONDITION_ITEM__SPECIFICDEVICE);
		}
		return conditionitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != HalPackage.SPECIFIC_DEVICE__ROOM)
			return null;
		return (Room) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRoom, HalPackage.SPECIFIC_DEVICE__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer()
				|| (eContainerFeatureID() != HalPackage.SPECIFIC_DEVICE__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject) newRoom).eInverseAdd(this, HalPackage.ROOM__SPECIFICDEVICE, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SPECIFIC_DEVICE__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			if (device != null)
				msgs = ((InternalEObject) device).eInverseRemove(this, HalPackage.DEVICE__SPECIFICDEVICE, Device.class,
						msgs);
			return basicSetDevice((Device) otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConditionitem()).basicAdd(otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRoom((Room) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			return basicSetDevice(null, msgs);
		case HalPackage.SPECIFIC_DEVICE__DEVICEEVENT:
			return ((InternalEList<?>) getDeviceevent()).basicRemove(otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			return ((InternalEList<?>) getConditionitem()).basicRemove(otherEnd, msgs);
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			return basicSetRoom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			return eInternalContainer().eInverseRemove(this, HalPackage.ROOM__SPECIFICDEVICE, Room.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.SPECIFIC_DEVICE__NAME:
			return getName();
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			if (resolve)
				return getDevice();
			return basicGetDevice();
		case HalPackage.SPECIFIC_DEVICE__DEVICEEVENT:
			return getDeviceevent();
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			return getAction();
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			return getConditionitem();
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			return getRoom();
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
		case HalPackage.SPECIFIC_DEVICE__NAME:
			setName((String) newValue);
			return;
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			setDevice((Device) newValue);
			return;
		case HalPackage.SPECIFIC_DEVICE__DEVICEEVENT:
			getDeviceevent().clear();
			getDeviceevent().addAll((Collection<? extends DeviceEvent>) newValue);
			return;
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			getConditionitem().clear();
			getConditionitem().addAll((Collection<? extends ConditionItem>) newValue);
			return;
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			setRoom((Room) newValue);
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
		case HalPackage.SPECIFIC_DEVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			setDevice((Device) null);
			return;
		case HalPackage.SPECIFIC_DEVICE__DEVICEEVENT:
			getDeviceevent().clear();
			return;
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			getAction().clear();
			return;
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			getConditionitem().clear();
			return;
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			setRoom((Room) null);
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
		case HalPackage.SPECIFIC_DEVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HalPackage.SPECIFIC_DEVICE__DEVICE:
			return device != null;
		case HalPackage.SPECIFIC_DEVICE__DEVICEEVENT:
			return deviceevent != null && !deviceevent.isEmpty();
		case HalPackage.SPECIFIC_DEVICE__ACTION:
			return action != null && !action.isEmpty();
		case HalPackage.SPECIFIC_DEVICE__CONDITIONITEM:
			return conditionitem != null && !conditionitem.isEmpty();
		case HalPackage.SPECIFIC_DEVICE__ROOM:
			return getRoom() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecificDeviceImpl
