/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.Action#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Specificdevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.SpecificDevice#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificdevice</em>' reference.
	 * @see #setSpecificdevice(SpecificDevice)
	 * @see ca.mcgill.emf.hal.HalPackage#getAction_Specificdevice()
	 * @see ca.mcgill.emf.hal.SpecificDevice#getAction
	 * @model opposite="action" required="true"
	 * @generated
	 */
	SpecificDevice getSpecificdevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.Action#getSpecificdevice <em>Specificdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificdevice</em>' reference.
	 * @see #getSpecificdevice()
	 * @generated
	 */
	void setSpecificdevice(SpecificDevice value);

} // Action
