/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.PreCondition#isIsNegated <em>Is Negated</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getPreCondition()
 * @model abstract="true"
 * @generated
 */
public interface PreCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #setIsNegated(boolean)
	 * @see ca.mcgill.emf.hal.HalPackage#getPreCondition_IsNegated()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.PreCondition#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isIsNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);

} // PreCondition
