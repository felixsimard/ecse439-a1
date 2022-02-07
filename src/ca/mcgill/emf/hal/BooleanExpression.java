/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.BooleanExpression#getBooleanOperator <em>Boolean Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.BooleanExpression#getPrecondition <em>Precondition</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends PreCondition {
	/**
	 * Returns the value of the '<em><b>Boolean Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.hal.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Operator</em>' attribute.
	 * @see ca.mcgill.emf.hal.BooleanOperator
	 * @see #setBooleanOperator(BooleanOperator)
	 * @see ca.mcgill.emf.hal.HalPackage#getBooleanExpression_BooleanOperator()
	 * @model
	 * @generated
	 */
	BooleanOperator getBooleanOperator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.BooleanExpression#getBooleanOperator <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Operator</em>' attribute.
	 * @see ca.mcgill.emf.hal.BooleanOperator
	 * @see #getBooleanOperator()
	 * @generated
	 */
	void setBooleanOperator(BooleanOperator value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.emf.hal.PreCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see ca.mcgill.emf.hal.HalPackage#getBooleanExpression_Precondition()
	 * @model containment="true" lower="2" upper="2" transient="true"
	 * @generated
	 */
	EList<PreCondition> getPrecondition();

} // BooleanExpression
