/**
 */
package ca.mcgill.emf.hal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.hal.ConditionItem#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.ConditionItem#getComparedValue <em>Compared Value</em>}</li>
 *   <li>{@link ca.mcgill.emf.hal.ConditionItem#getSpecificdevice <em>Specificdevice</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.hal.HalPackage#getConditionItem()
 * @model
 * @generated
 */
public interface ConditionItem extends PreCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.emf.hal.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see ca.mcgill.emf.hal.ComparisonOperator
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see ca.mcgill.emf.hal.HalPackage#getConditionItem_ComparisonOperator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.ConditionItem#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see ca.mcgill.emf.hal.ComparisonOperator
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Compared Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Value</em>' attribute.
	 * @see #setComparedValue(String)
	 * @see ca.mcgill.emf.hal.HalPackage#getConditionItem_ComparedValue()
	 * @model
	 * @generated
	 */
	String getComparedValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.ConditionItem#getComparedValue <em>Compared Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compared Value</em>' attribute.
	 * @see #getComparedValue()
	 * @generated
	 */
	void setComparedValue(String value);

	/**
	 * Returns the value of the '<em><b>Specificdevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.hal.SpecificDevice#getConditionitem <em>Conditionitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificdevice</em>' reference.
	 * @see #setSpecificdevice(SpecificDevice)
	 * @see ca.mcgill.emf.hal.HalPackage#getConditionItem_Specificdevice()
	 * @see ca.mcgill.emf.hal.SpecificDevice#getConditionitem
	 * @model opposite="conditionitem" required="true"
	 * @generated
	 */
	SpecificDevice getSpecificdevice();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.hal.ConditionItem#getSpecificdevice <em>Specificdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificdevice</em>' reference.
	 * @see #getSpecificdevice()
	 * @generated
	 */
	void setSpecificdevice(SpecificDevice value);

} // ConditionItem
