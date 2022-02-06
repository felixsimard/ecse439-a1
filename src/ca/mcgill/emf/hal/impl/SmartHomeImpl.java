/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.AutomationRule;
import ca.mcgill.emf.hal.Device;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.Room;
import ca.mcgill.emf.hal.SmartHome;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#isIsOperational <em>Is Operational</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getAutomationrule <em>Automationrule</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.impl.SmartHomeImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartHomeImpl extends MinimalEObjectImpl.Container implements SmartHome {
	/**
	 * The default value of the '{@link #isIsOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOperational() <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean isOperational = IS_OPERATIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getAutomationrule() <em>Automationrule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomationrule()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> automationrule;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.SMART_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOperational() {
		return isOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOperational(boolean newIsOperational) {
		boolean oldIsOperational = isOperational;
		isOperational = newIsOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__IS_OPERATIONAL,
					oldIsOperational, isOperational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentEList<Room>(Room.class, this, HalPackage.SMART_HOME__ROOM);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getAutomationrule() {
		if (automationrule == null) {
			automationrule = new EObjectContainmentEList<AutomationRule>(AutomationRule.class, this,
					HalPackage.SMART_HOME__AUTOMATIONRULE);
		}
		return automationrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.SMART_HOME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this, HalPackage.SMART_HOME__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.SMART_HOME__ROOM:
			return ((InternalEList<?>) getRoom()).basicRemove(otherEnd, msgs);
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			return ((InternalEList<?>) getAutomationrule()).basicRemove(otherEnd, msgs);
		case HalPackage.SMART_HOME__DEVICE:
			return ((InternalEList<?>) getDevice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			return isIsOperational();
		case HalPackage.SMART_HOME__ADDRESS:
			return getAddress();
		case HalPackage.SMART_HOME__ROOM:
			return getRoom();
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			return getAutomationrule();
		case HalPackage.SMART_HOME__OWNER:
			return getOwner();
		case HalPackage.SMART_HOME__NAME:
			return getName();
		case HalPackage.SMART_HOME__DEVICE:
			return getDevice();
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
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			setIsOperational((Boolean) newValue);
			return;
		case HalPackage.SMART_HOME__ADDRESS:
			setAddress((String) newValue);
			return;
		case HalPackage.SMART_HOME__ROOM:
			getRoom().clear();
			getRoom().addAll((Collection<? extends Room>) newValue);
			return;
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			getAutomationrule().clear();
			getAutomationrule().addAll((Collection<? extends AutomationRule>) newValue);
			return;
		case HalPackage.SMART_HOME__OWNER:
			setOwner((String) newValue);
			return;
		case HalPackage.SMART_HOME__NAME:
			setName((String) newValue);
			return;
		case HalPackage.SMART_HOME__DEVICE:
			getDevice().clear();
			getDevice().addAll((Collection<? extends Device>) newValue);
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
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			setIsOperational(IS_OPERATIONAL_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__ROOM:
			getRoom().clear();
			return;
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			getAutomationrule().clear();
			return;
		case HalPackage.SMART_HOME__OWNER:
			setOwner(OWNER_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HalPackage.SMART_HOME__DEVICE:
			getDevice().clear();
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
		case HalPackage.SMART_HOME__IS_OPERATIONAL:
			return isOperational != IS_OPERATIONAL_EDEFAULT;
		case HalPackage.SMART_HOME__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case HalPackage.SMART_HOME__ROOM:
			return room != null && !room.isEmpty();
		case HalPackage.SMART_HOME__AUTOMATIONRULE:
			return automationrule != null && !automationrule.isEmpty();
		case HalPackage.SMART_HOME__OWNER:
			return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
		case HalPackage.SMART_HOME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HalPackage.SMART_HOME__DEVICE:
			return device != null && !device.isEmpty();
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
		result.append(" (isOperational: ");
		result.append(isOperational);
		result.append(", address: ");
		result.append(address);
		result.append(", owner: ");
		result.append(owner);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SmartHomeImpl
