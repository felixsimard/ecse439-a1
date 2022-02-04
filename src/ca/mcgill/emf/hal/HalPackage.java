/**
 */
package ca.mcgill.emf.hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.mcgill.emf.hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = ca.mcgill.emf.hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.SmartHomeImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSmartHome()
	 * @generated
	 */
	int SMART_HOME = 0;

	/**
	 * The feature id for the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__IS_OPERATIONAL = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__ROOM = 2;

	/**
	 * The feature id for the '<em><b>Automationrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__AUTOMATIONRULE = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__OWNER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME__NAME = 5;

	/**
	 * The number of structural features of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Smart Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.RoomImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SPECIFICDEVICE = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.AutomationRuleImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PASSWORD = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__PRECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Is Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__IS_ACTIVATED = 3;

	/**
	 * The feature id for the '<em><b>Automationruleevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__AUTOMATIONRULEEVENT = 4;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.DeviceImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SPECIFICDEVICE = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.ActionImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SPECIFICDEVICE = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl <em>Specific Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.SpecificDeviceImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSpecificDevice()
	 * @generated
	 */
	int SPECIFIC_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE__DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Deviceevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE__DEVICEEVENT = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Conditionitem</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE__CONDITIONITEM = 4;

	/**
	 * The number of structural features of the '<em>Specific Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Specific Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.SensorImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SPECIFICDEVICE = DEVICE__SPECIFICDEVICE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.ActuatorImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SPECIFICDEVICE = DEVICE__SPECIFICDEVICE;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMMAND = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.DeviceEventImpl <em>Device Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.DeviceEventImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getDeviceEvent()
	 * @generated
	 */
	int DEVICE_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVENT__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.CommandImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.PreConditionImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__IS_NEGATED = 0;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.ConditionItemImpl <em>Condition Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.ConditionItemImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getConditionItem()
	 * @generated
	 */
	int CONDITION_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM__IS_NEGATED = PRE_CONDITION__IS_NEGATED;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM__COMPARISON_OPERATOR = PRE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compared Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM__COMPARED_VALUE = PRE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specificdevice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM__SPECIFICDEVICE = PRE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM_FEATURE_COUNT = PRE_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ITEM_OPERATION_COUNT = PRE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.BooleanExpressionImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__IS_NEGATED = PRE_CONDITION__IS_NEGATED;

	/**
	 * The feature id for the '<em><b>Boolean Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR = PRE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__PRECONDITION = PRE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = PRE_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = PRE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.SensorEventImpl <em>Sensor Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.SensorEventImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSensorEvent()
	 * @generated
	 */
	int SENSOR_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EVENT__TIMESTAMP = DEVICE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Measured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EVENT__MEASURED_VALUE = DEVICE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EVENT_FEATURE_COUNT = DEVICE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_EVENT_OPERATION_COUNT = DEVICE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.CommandEventImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__TIMESTAMP = DEVICE_EVENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__COMMAND = DEVICE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_FEATURE_COUNT = DEVICE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_OPERATION_COUNT = DEVICE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.impl.AutomationRuleEventImpl <em>Automation Rule Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.impl.AutomationRuleEventImpl
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAutomationRuleEvent()
	 * @generated
	 */
	int AUTOMATION_RULE_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_EVENT__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Automation Rule Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Automation Rule Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.BooleanOperator
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link ca.mcgill.emf.hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.mcgill.emf.hal.ComparisonOperator
	 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 17;

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.SmartHome <em>Smart Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Home</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome
	 * @generated
	 */
	EClass getSmartHome();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SmartHome#isIsOperational <em>Is Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Operational</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#isIsOperational()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_IsOperational();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SmartHome#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#getAddress()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.SmartHome#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#getRoom()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Room();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.SmartHome#getAutomationrule <em>Automationrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automationrule</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#getAutomationrule()
	 * @see #getSmartHome()
	 * @generated
	 */
	EReference getSmartHome_Automationrule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SmartHome#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#getOwner()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_Owner();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SmartHome#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.hal.SmartHome#getName()
	 * @see #getSmartHome()
	 * @generated
	 */
	EAttribute getSmartHome_Name();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see ca.mcgill.emf.hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.hal.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.Room#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specificdevice</em>'.
	 * @see ca.mcgill.emf.hal.Room#getSpecificdevice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Specificdevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.AutomationRule#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule#getPassword()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.AutomationRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule#getAction()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Action();

	/**
	 * Returns the meta object for the containment reference '{@link ca.mcgill.emf.hal.AutomationRule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule#getPrecondition()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.AutomationRule#isIsActivated <em>Is Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Activated</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule#isIsActivated()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EAttribute getAutomationRule_IsActivated();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.AutomationRule#getAutomationruleevent <em>Automationruleevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automationruleevent</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRule#getAutomationruleevent()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Automationruleevent();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see ca.mcgill.emf.hal.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.mcgill.emf.hal.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.hal.Device#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specificdevice</em>'.
	 * @see ca.mcgill.emf.hal.Device#getSpecificdevice()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Specificdevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ca.mcgill.emf.hal.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.hal.Action#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specificdevice</em>'.
	 * @see ca.mcgill.emf.hal.Action#getSpecificdevice()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Specificdevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.SpecificDevice <em>Specific Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Device</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice
	 * @generated
	 */
	EClass getSpecificDevice();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SpecificDevice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice#getName()
	 * @see #getSpecificDevice()
	 * @generated
	 */
	EAttribute getSpecificDevice_Name();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.hal.SpecificDevice#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice#getDevice()
	 * @see #getSpecificDevice()
	 * @generated
	 */
	EReference getSpecificDevice_Device();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.SpecificDevice#getDeviceevent <em>Deviceevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deviceevent</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice#getDeviceevent()
	 * @see #getSpecificDevice()
	 * @generated
	 */
	EReference getSpecificDevice_Deviceevent();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.hal.SpecificDevice#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice#getAction()
	 * @see #getSpecificDevice()
	 * @generated
	 */
	EReference getSpecificDevice_Action();

	/**
	 * Returns the meta object for the reference list '{@link ca.mcgill.emf.hal.SpecificDevice#getConditionitem <em>Conditionitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditionitem</em>'.
	 * @see ca.mcgill.emf.hal.SpecificDevice#getConditionitem()
	 * @see #getSpecificDevice()
	 * @generated
	 */
	EReference getSpecificDevice_Conditionitem();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ca.mcgill.emf.hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ca.mcgill.emf.hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.Actuator#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see ca.mcgill.emf.hal.Actuator#getCommand()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Command();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.DeviceEvent <em>Device Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Event</em>'.
	 * @see ca.mcgill.emf.hal.DeviceEvent
	 * @generated
	 */
	EClass getDeviceEvent();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.DeviceEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.hal.DeviceEvent#getTimestamp()
	 * @see #getDeviceEvent()
	 * @generated
	 */
	EAttribute getDeviceEvent_Timestamp();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see ca.mcgill.emf.hal.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.mcgill.emf.hal.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.ConditionItem <em>Condition Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Item</em>'.
	 * @see ca.mcgill.emf.hal.ConditionItem
	 * @generated
	 */
	EClass getConditionItem();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.ConditionItem#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see ca.mcgill.emf.hal.ConditionItem#getComparisonOperator()
	 * @see #getConditionItem()
	 * @generated
	 */
	EAttribute getConditionItem_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.ConditionItem#getComparedValue <em>Compared Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compared Value</em>'.
	 * @see ca.mcgill.emf.hal.ConditionItem#getComparedValue()
	 * @see #getConditionItem()
	 * @generated
	 */
	EAttribute getConditionItem_ComparedValue();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.hal.ConditionItem#getSpecificdevice <em>Specificdevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specificdevice</em>'.
	 * @see ca.mcgill.emf.hal.ConditionItem#getSpecificdevice()
	 * @see #getConditionItem()
	 * @generated
	 */
	EReference getConditionItem_Specificdevice();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see ca.mcgill.emf.hal.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.BooleanExpression#getBooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Operator</em>'.
	 * @see ca.mcgill.emf.hal.BooleanExpression#getBooleanOperator()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_BooleanOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.mcgill.emf.hal.BooleanExpression#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see ca.mcgill.emf.hal.BooleanExpression#getPrecondition()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Precondition();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see ca.mcgill.emf.hal.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.PreCondition#isIsNegated <em>Is Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Negated</em>'.
	 * @see ca.mcgill.emf.hal.PreCondition#isIsNegated()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_IsNegated();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.SensorEvent <em>Sensor Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Event</em>'.
	 * @see ca.mcgill.emf.hal.SensorEvent
	 * @generated
	 */
	EClass getSensorEvent();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.SensorEvent#getMeasuredValue <em>Measured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measured Value</em>'.
	 * @see ca.mcgill.emf.hal.SensorEvent#getMeasuredValue()
	 * @see #getSensorEvent()
	 * @generated
	 */
	EAttribute getSensorEvent_MeasuredValue();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see ca.mcgill.emf.hal.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for the reference '{@link ca.mcgill.emf.hal.CommandEvent#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see ca.mcgill.emf.hal.CommandEvent#getCommand()
	 * @see #getCommandEvent()
	 * @generated
	 */
	EReference getCommandEvent_Command();

	/**
	 * Returns the meta object for class '{@link ca.mcgill.emf.hal.AutomationRuleEvent <em>Automation Rule Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule Event</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRuleEvent
	 * @generated
	 */
	EClass getAutomationRuleEvent();

	/**
	 * Returns the meta object for the attribute '{@link ca.mcgill.emf.hal.AutomationRuleEvent#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see ca.mcgill.emf.hal.AutomationRuleEvent#getTimestamp()
	 * @see #getAutomationRuleEvent()
	 * @generated
	 */
	EAttribute getAutomationRuleEvent_Timestamp();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.hal.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see ca.mcgill.emf.hal.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link ca.mcgill.emf.hal.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see ca.mcgill.emf.hal.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.SmartHomeImpl <em>Smart Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.SmartHomeImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSmartHome()
		 * @generated
		 */
		EClass SMART_HOME = eINSTANCE.getSmartHome();

		/**
		 * The meta object literal for the '<em><b>Is Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__IS_OPERATIONAL = eINSTANCE.getSmartHome_IsOperational();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__ADDRESS = eINSTANCE.getSmartHome_Address();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__ROOM = eINSTANCE.getSmartHome_Room();

		/**
		 * The meta object literal for the '<em><b>Automationrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_HOME__AUTOMATIONRULE = eINSTANCE.getSmartHome_Automationrule();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__OWNER = eINSTANCE.getSmartHome_Owner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_HOME__NAME = eINSTANCE.getSmartHome_Name();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.RoomImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Specificdevice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SPECIFICDEVICE = eINSTANCE.getRoom_Specificdevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.AutomationRuleImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__PASSWORD = eINSTANCE.getAutomationRule_Password();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTION = eINSTANCE.getAutomationRule_Action();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__PRECONDITION = eINSTANCE.getAutomationRule_Precondition();

		/**
		 * The meta object literal for the '<em><b>Is Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE__IS_ACTIVATED = eINSTANCE.getAutomationRule_IsActivated();

		/**
		 * The meta object literal for the '<em><b>Automationruleevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__AUTOMATIONRULEEVENT = eINSTANCE.getAutomationRule_Automationruleevent();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.DeviceImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Specificdevice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SPECIFICDEVICE = eINSTANCE.getDevice_Specificdevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.ActionImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Specificdevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SPECIFICDEVICE = eINSTANCE.getAction_Specificdevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.SpecificDeviceImpl <em>Specific Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.SpecificDeviceImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSpecificDevice()
		 * @generated
		 */
		EClass SPECIFIC_DEVICE = eINSTANCE.getSpecificDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_DEVICE__NAME = eINSTANCE.getSpecificDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DEVICE__DEVICE = eINSTANCE.getSpecificDevice_Device();

		/**
		 * The meta object literal for the '<em><b>Deviceevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DEVICE__DEVICEEVENT = eINSTANCE.getSpecificDevice_Deviceevent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DEVICE__ACTION = eINSTANCE.getSpecificDevice_Action();

		/**
		 * The meta object literal for the '<em><b>Conditionitem</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_DEVICE__CONDITIONITEM = eINSTANCE.getSpecificDevice_Conditionitem();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.SensorImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.ActuatorImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__COMMAND = eINSTANCE.getActuator_Command();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.DeviceEventImpl <em>Device Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.DeviceEventImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getDeviceEvent()
		 * @generated
		 */
		EClass DEVICE_EVENT = eINSTANCE.getDeviceEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_EVENT__TIMESTAMP = eINSTANCE.getDeviceEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.CommandImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.ConditionItemImpl <em>Condition Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.ConditionItemImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getConditionItem()
		 * @generated
		 */
		EClass CONDITION_ITEM = eINSTANCE.getConditionItem();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ITEM__COMPARISON_OPERATOR = eINSTANCE.getConditionItem_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Compared Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ITEM__COMPARED_VALUE = eINSTANCE.getConditionItem_ComparedValue();

		/**
		 * The meta object literal for the '<em><b>Specificdevice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ITEM__SPECIFICDEVICE = eINSTANCE.getConditionItem_Specificdevice();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.BooleanExpressionImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Boolean Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR = eINSTANCE.getBooleanExpression_BooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__PRECONDITION = eINSTANCE.getBooleanExpression_Precondition();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.PreConditionImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Is Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__IS_NEGATED = eINSTANCE.getPreCondition_IsNegated();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.SensorEventImpl <em>Sensor Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.SensorEventImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getSensorEvent()
		 * @generated
		 */
		EClass SENSOR_EVENT = eINSTANCE.getSensorEvent();

		/**
		 * The meta object literal for the '<em><b>Measured Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_EVENT__MEASURED_VALUE = eINSTANCE.getSensorEvent_MeasuredValue();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.CommandEventImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_EVENT__COMMAND = eINSTANCE.getCommandEvent_Command();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.impl.AutomationRuleEventImpl <em>Automation Rule Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.impl.AutomationRuleEventImpl
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getAutomationRuleEvent()
		 * @generated
		 */
		EClass AUTOMATION_RULE_EVENT = eINSTANCE.getAutomationRuleEvent();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATION_RULE_EVENT__TIMESTAMP = eINSTANCE.getAutomationRuleEvent_Timestamp();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.BooleanOperator
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link ca.mcgill.emf.hal.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.mcgill.emf.hal.ComparisonOperator
		 * @see ca.mcgill.emf.hal.impl.HalPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

	}

} //HalPackage
