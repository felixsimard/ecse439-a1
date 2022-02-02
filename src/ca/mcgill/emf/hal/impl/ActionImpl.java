/**
 */
package ca.mcgill.emf.hal.impl;

import ca.mcgill.emf.hal.Action;
import ca.mcgill.emf.hal.HalPackage;
import ca.mcgill.emf.hal.SpecificDevice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.impl.ActionImpl#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getSpecificdevice() <em>Specificdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificdevice()
	 * @generated
	 * @ordered
	 */
	protected SpecificDevice specificdevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDevice getSpecificdevice() {
		if (specificdevice != null && specificdevice.eIsProxy()) {
			InternalEObject oldSpecificdevice = (InternalEObject) specificdevice;
			specificdevice = (SpecificDevice) eResolveProxy(oldSpecificdevice);
			if (specificdevice != oldSpecificdevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTION__SPECIFICDEVICE,
							oldSpecificdevice, specificdevice));
			}
		}
		return specificdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDevice basicGetSpecificdevice() {
		return specificdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificdevice(SpecificDevice newSpecificdevice, NotificationChain msgs) {
		SpecificDevice oldSpecificdevice = specificdevice;
		specificdevice = newSpecificdevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HalPackage.ACTION__SPECIFICDEVICE, oldSpecificdevice, newSpecificdevice);
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
	public void setSpecificdevice(SpecificDevice newSpecificdevice) {
		if (newSpecificdevice != specificdevice) {
			NotificationChain msgs = null;
			if (specificdevice != null)
				msgs = ((InternalEObject) specificdevice).eInverseRemove(this, HalPackage.SPECIFIC_DEVICE__ACTION,
						SpecificDevice.class, msgs);
			if (newSpecificdevice != null)
				msgs = ((InternalEObject) newSpecificdevice).eInverseAdd(this, HalPackage.SPECIFIC_DEVICE__ACTION,
						SpecificDevice.class, msgs);
			msgs = basicSetSpecificdevice(newSpecificdevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__SPECIFICDEVICE, newSpecificdevice,
					newSpecificdevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HalPackage.ACTION__SPECIFICDEVICE:
			if (specificdevice != null)
				msgs = ((InternalEObject) specificdevice).eInverseRemove(this, HalPackage.SPECIFIC_DEVICE__ACTION,
						SpecificDevice.class, msgs);
			return basicSetSpecificdevice((SpecificDevice) otherEnd, msgs);
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
		case HalPackage.ACTION__SPECIFICDEVICE:
			return basicSetSpecificdevice(null, msgs);
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
		case HalPackage.ACTION__SPECIFICDEVICE:
			if (resolve)
				return getSpecificdevice();
			return basicGetSpecificdevice();
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
		case HalPackage.ACTION__SPECIFICDEVICE:
			setSpecificdevice((SpecificDevice) newValue);
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
		case HalPackage.ACTION__SPECIFICDEVICE:
			setSpecificdevice((SpecificDevice) null);
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
		case HalPackage.ACTION__SPECIFICDEVICE:
			return specificdevice != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
