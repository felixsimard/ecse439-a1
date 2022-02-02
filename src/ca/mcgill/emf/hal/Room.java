/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.Room#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.Room#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specificdevice</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.SpecificDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificdevice</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getRoom_Specificdevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecificDevice> getSpecificdevice();

} // Room
