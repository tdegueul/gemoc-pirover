/**
 */
package rcl;

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
 * @see rcl.RclFactory
 * @model kind="package"
 * @generated
 */
public interface RclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rcl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gemoc.org/rover/rcl/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rcl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RclPackage eINSTANCE = rcl.impl.RclPackageImpl.init();

	/**
	 * The meta object id for the '{@link rcl.impl.RoverProgramImpl <em>Rover Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.RoverProgramImpl
	 * @see rcl.impl.RclPackageImpl#getRoverProgram()
	 * @generated
	 */
	int ROVER_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Rover Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rover Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ParamImpl
	 * @see rcl.impl.RclPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.StatementImpl
	 * @see rcl.impl.RclPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ENCLOSING = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.VarAssignmentImpl
	 * @see rcl.impl.RclPackageImpl#getVarAssignment()
	 * @generated
	 */
	int VAR_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ConditionalImpl
	 * @see rcl.impl.RclPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 4;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__COND_TRUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cond False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__COND_FALSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.LoopImpl
	 * @see rcl.impl.RclPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.RclBlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.RclBlockImpl
	 * @see rcl.impl.RclPackageImpl#getRclBlock()
	 * @generated
	 */
	int RCL_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK__STMTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.QueryImpl
	 * @see rcl.impl.RclPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 7;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.TemperatureQueryImpl <em>Temperature Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.TemperatureQueryImpl
	 * @see rcl.impl.RclPackageImpl#getTemperatureQuery()
	 * @generated
	 */
	int TEMPERATURE_QUERY = 8;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY__NVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temperature Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temperature Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.HumidityQueryImpl <em>Humidity Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.HumidityQueryImpl
	 * @see rcl.impl.RclPackageImpl#getHumidityQuery()
	 * @generated
	 */
	int HUMIDITY_QUERY = 9;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY__NVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Humidity Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Humidity Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.MessageQueryImpl <em>Message Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.MessageQueryImpl
	 * @see rcl.impl.RclPackageImpl#getMessageQuery()
	 * @generated
	 */
	int MESSAGE_QUERY = 10;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUERY__SVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ObstacleQueryImpl <em>Obstacle Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ObstacleQueryImpl
	 * @see rcl.impl.RclPackageImpl#getObstacleQuery()
	 * @generated
	 */
	int OBSTACLE_QUERY = 11;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY__BVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY__FRONT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstacle Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Obstacle Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.RoverExpressionImpl <em>Rover Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.RoverExpressionImpl
	 * @see rcl.impl.RclPackageImpl#getRoverExpression()
	 * @generated
	 */
	int ROVER_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Rover Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rover Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.NumericExpressionImpl
	 * @see rcl.impl.RclPackageImpl#getNumericExpression()
	 * @generated
	 */
	int NUMERIC_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_OPERATION_COUNT = ROVER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.StringExpressionImpl
	 * @see rcl.impl.RclPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = ROVER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.BooleanExpressionImpl
	 * @see rcl.impl.RclPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = ROVER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.RoverValueImpl <em>Rover Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.RoverValueImpl
	 * @see rcl.impl.RclPackageImpl#getRoverValue()
	 * @generated
	 */
	int ROVER_VALUE = 16;

	/**
	 * The number of structural features of the '<em>Rover Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rover Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rcl.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.NumberValueImpl
	 * @see rcl.impl.RclPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 17;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__NVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = ROVER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.StringValueImpl
	 * @see rcl.impl.RclPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 18;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__SVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = ROVER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.BooleanValueImpl
	 * @see rcl.impl.RclPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 19;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__BVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = ROVER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ActionImpl
	 * @see rcl.impl.RclPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 20;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ForwardActionImpl <em>Forward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ForwardActionImpl
	 * @see rcl.impl.RclPackageImpl#getForwardAction()
	 * @generated
	 */
	int FORWARD_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.ForwardMinActionImpl <em>Forward Min Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.ForwardMinActionImpl
	 * @see rcl.impl.RclPackageImpl#getForwardMinAction()
	 * @generated
	 */
	int FORWARD_MIN_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.BackwardActionImpl <em>Backward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.BackwardActionImpl
	 * @see rcl.impl.RclPackageImpl#getBackwardAction()
	 * @generated
	 */
	int BACKWARD_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Backward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Backward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.BackwardMinActionImpl <em>Backward Min Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.BackwardMinActionImpl
	 * @see rcl.impl.RclPackageImpl#getBackwardMinAction()
	 * @generated
	 */
	int BACKWARD_MIN_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.TurnActionImpl <em>Turn Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.TurnActionImpl
	 * @see rcl.impl.RclPackageImpl#getTurnAction()
	 * @generated
	 */
	int TURN_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Turn Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.TurnDegActionImpl <em>Turn Deg Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.TurnDegActionImpl
	 * @see rcl.impl.RclPackageImpl#getTurnDegAction()
	 * @generated
	 */
	int TURN_DEG_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION__DEGREES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Deg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Deg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.StopActionImpl <em>Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.StopActionImpl
	 * @see rcl.impl.RclPackageImpl#getStopAction()
	 * @generated
	 */
	int STOP_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.LogActionImpl <em>Log Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.LogActionImpl
	 * @see rcl.impl.RclPackageImpl#getLogAction()
	 * @generated
	 */
	int LOG_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Log Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.SendActionImpl <em>Send Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.SendActionImpl
	 * @see rcl.impl.RclPackageImpl#getSendAction()
	 * @generated
	 */
	int SEND_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.impl.VarRefImpl
	 * @see rcl.impl.RclPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 30;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__BVALUE = BOOLEAN_VALUE__BVALUE;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NVALUE = BOOLEAN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__SVALUE = BOOLEAN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__ENCLOSING = BOOLEAN_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NAME = BOOLEAN_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = BOOLEAN_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_OPERATION_COUNT = BOOLEAN_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rcl.NumericOperator <em>Numeric Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.NumericOperator
	 * @see rcl.impl.RclPackageImpl#getNumericOperator()
	 * @generated
	 */
	int NUMERIC_OPERATOR = 31;

	/**
	 * The meta object id for the '{@link rcl.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.StringOperator
	 * @see rcl.impl.RclPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 32;

	/**
	 * The meta object id for the '{@link rcl.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rcl.BooleanOperator
	 * @see rcl.impl.RclPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 33;


	/**
	 * Returns the meta object for class '{@link rcl.RoverProgram <em>Rover Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Program</em>'.
	 * @see rcl.RoverProgram
	 * @generated
	 */
	EClass getRoverProgram();

	/**
	 * Returns the meta object for the attribute '{@link rcl.RoverProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rcl.RoverProgram#getName()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EAttribute getRoverProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rcl.RoverProgram#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see rcl.RoverProgram#getParams()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Params();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.RoverProgram#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rcl.RoverProgram#getBlock()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Block();

	/**
	 * Returns the meta object for class '{@link rcl.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see rcl.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link rcl.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rcl.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for class '{@link rcl.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see rcl.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link rcl.Statement#getEnclosing <em>Enclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing</em>'.
	 * @see rcl.Statement#getEnclosing()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Enclosing();

	/**
	 * Returns the meta object for class '{@link rcl.VarAssignment <em>Var Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Assignment</em>'.
	 * @see rcl.VarAssignment
	 * @generated
	 */
	EClass getVarAssignment();

	/**
	 * Returns the meta object for the attribute '{@link rcl.VarAssignment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rcl.VarAssignment#getName()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EAttribute getVarAssignment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.VarAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rcl.VarAssignment#getValue()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EReference getVarAssignment_Value();

	/**
	 * Returns the meta object for class '{@link rcl.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see rcl.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.Conditional#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rcl.Conditional#getExpr()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.Conditional#getCondTrue <em>Cond True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond True</em>'.
	 * @see rcl.Conditional#getCondTrue()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_CondTrue();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.Conditional#getCondFalse <em>Cond False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond False</em>'.
	 * @see rcl.Conditional#getCondFalse()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_CondFalse();

	/**
	 * Returns the meta object for class '{@link rcl.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see rcl.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.Loop#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rcl.Loop#getExpr()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.Loop#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rcl.Loop#getBlock()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Block();

	/**
	 * Returns the meta object for class '{@link rcl.RclBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see rcl.RclBlock
	 * @generated
	 */
	EClass getRclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link rcl.RclBlock#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see rcl.RclBlock#getStmts()
	 * @see #getRclBlock()
	 * @generated
	 */
	EReference getRclBlock_Stmts();

	/**
	 * Returns the meta object for class '{@link rcl.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see rcl.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link rcl.TemperatureQuery <em>Temperature Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Query</em>'.
	 * @see rcl.TemperatureQuery
	 * @generated
	 */
	EClass getTemperatureQuery();

	/**
	 * Returns the meta object for class '{@link rcl.HumidityQuery <em>Humidity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Query</em>'.
	 * @see rcl.HumidityQuery
	 * @generated
	 */
	EClass getHumidityQuery();

	/**
	 * Returns the meta object for class '{@link rcl.MessageQuery <em>Message Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Query</em>'.
	 * @see rcl.MessageQuery
	 * @generated
	 */
	EClass getMessageQuery();

	/**
	 * Returns the meta object for class '{@link rcl.ObstacleQuery <em>Obstacle Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle Query</em>'.
	 * @see rcl.ObstacleQuery
	 * @generated
	 */
	EClass getObstacleQuery();

	/**
	 * Returns the meta object for the attribute '{@link rcl.ObstacleQuery#isFront <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front</em>'.
	 * @see rcl.ObstacleQuery#isFront()
	 * @see #getObstacleQuery()
	 * @generated
	 */
	EAttribute getObstacleQuery_Front();

	/**
	 * Returns the meta object for class '{@link rcl.RoverExpression <em>Rover Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Expression</em>'.
	 * @see rcl.RoverExpression
	 * @generated
	 */
	EClass getRoverExpression();

	/**
	 * Returns the meta object for class '{@link rcl.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Expression</em>'.
	 * @see rcl.NumericExpression
	 * @generated
	 */
	EClass getNumericExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.NumericExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rcl.NumericExpression#getLhs()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EReference getNumericExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.NumericExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rcl.NumericExpression#getRhs()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EReference getNumericExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rcl.NumericExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rcl.NumericExpression#getOp()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EAttribute getNumericExpression_Op();

	/**
	 * Returns the meta object for class '{@link rcl.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see rcl.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.StringExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rcl.StringExpression#getLhs()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.StringExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rcl.StringExpression#getRhs()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rcl.StringExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rcl.StringExpression#getOp()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_Op();

	/**
	 * Returns the meta object for class '{@link rcl.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see rcl.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.BooleanExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rcl.BooleanExpression#getLhs()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.BooleanExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rcl.BooleanExpression#getRhs()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rcl.BooleanExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rcl.BooleanExpression#getOp()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Op();

	/**
	 * Returns the meta object for class '{@link rcl.RoverValue <em>Rover Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Value</em>'.
	 * @see rcl.RoverValue
	 * @generated
	 */
	EClass getRoverValue();

	/**
	 * Returns the meta object for class '{@link rcl.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see rcl.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link rcl.NumberValue#getNValue <em>NValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NValue</em>'.
	 * @see rcl.NumberValue#getNValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_NValue();

	/**
	 * Returns the meta object for class '{@link rcl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see rcl.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link rcl.StringValue#getSValue <em>SValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SValue</em>'.
	 * @see rcl.StringValue#getSValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_SValue();

	/**
	 * Returns the meta object for class '{@link rcl.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see rcl.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link rcl.BooleanValue#isBValue <em>BValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BValue</em>'.
	 * @see rcl.BooleanValue#isBValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_BValue();

	/**
	 * Returns the meta object for class '{@link rcl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see rcl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link rcl.ForwardAction <em>Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Action</em>'.
	 * @see rcl.ForwardAction
	 * @generated
	 */
	EClass getForwardAction();

	/**
	 * Returns the meta object for class '{@link rcl.ForwardMinAction <em>Forward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Min Action</em>'.
	 * @see rcl.ForwardMinAction
	 * @generated
	 */
	EClass getForwardMinAction();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.ForwardMinAction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see rcl.ForwardMinAction#getDistance()
	 * @see #getForwardMinAction()
	 * @generated
	 */
	EReference getForwardMinAction_Distance();

	/**
	 * Returns the meta object for class '{@link rcl.BackwardAction <em>Backward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward Action</em>'.
	 * @see rcl.BackwardAction
	 * @generated
	 */
	EClass getBackwardAction();

	/**
	 * Returns the meta object for class '{@link rcl.BackwardMinAction <em>Backward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward Min Action</em>'.
	 * @see rcl.BackwardMinAction
	 * @generated
	 */
	EClass getBackwardMinAction();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.BackwardMinAction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see rcl.BackwardMinAction#getDistance()
	 * @see #getBackwardMinAction()
	 * @generated
	 */
	EReference getBackwardMinAction_Distance();

	/**
	 * Returns the meta object for class '{@link rcl.TurnAction <em>Turn Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Action</em>'.
	 * @see rcl.TurnAction
	 * @generated
	 */
	EClass getTurnAction();

	/**
	 * Returns the meta object for class '{@link rcl.TurnDegAction <em>Turn Deg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Deg Action</em>'.
	 * @see rcl.TurnDegAction
	 * @generated
	 */
	EClass getTurnDegAction();

	/**
	 * Returns the meta object for the containment reference '{@link rcl.TurnDegAction#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degrees</em>'.
	 * @see rcl.TurnDegAction#getDegrees()
	 * @see #getTurnDegAction()
	 * @generated
	 */
	EReference getTurnDegAction_Degrees();

	/**
	 * Returns the meta object for class '{@link rcl.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Action</em>'.
	 * @see rcl.StopAction
	 * @generated
	 */
	EClass getStopAction();

	/**
	 * Returns the meta object for class '{@link rcl.LogAction <em>Log Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Action</em>'.
	 * @see rcl.LogAction
	 * @generated
	 */
	EClass getLogAction();

	/**
	 * Returns the meta object for the attribute '{@link rcl.LogAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see rcl.LogAction#getMessage()
	 * @see #getLogAction()
	 * @generated
	 */
	EAttribute getLogAction_Message();

	/**
	 * Returns the meta object for class '{@link rcl.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Action</em>'.
	 * @see rcl.SendAction
	 * @generated
	 */
	EClass getSendAction();

	/**
	 * Returns the meta object for the attribute '{@link rcl.SendAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see rcl.SendAction#getMessage()
	 * @see #getSendAction()
	 * @generated
	 */
	EAttribute getSendAction_Message();

	/**
	 * Returns the meta object for class '{@link rcl.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see rcl.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link rcl.VarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rcl.VarRef#getName()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Name();

	/**
	 * Returns the meta object for enum '{@link rcl.NumericOperator <em>Numeric Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Operator</em>'.
	 * @see rcl.NumericOperator
	 * @generated
	 */
	EEnum getNumericOperator();

	/**
	 * Returns the meta object for enum '{@link rcl.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see rcl.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link rcl.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see rcl.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RclFactory getRclFactory();

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
		 * The meta object literal for the '{@link rcl.impl.RoverProgramImpl <em>Rover Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.RoverProgramImpl
		 * @see rcl.impl.RclPackageImpl#getRoverProgram()
		 * @generated
		 */
		EClass ROVER_PROGRAM = eINSTANCE.getRoverProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER_PROGRAM__NAME = eINSTANCE.getRoverProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__PARAMS = eINSTANCE.getRoverProgram_Params();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__BLOCK = eINSTANCE.getRoverProgram_Block();

		/**
		 * The meta object literal for the '{@link rcl.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ParamImpl
		 * @see rcl.impl.RclPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '{@link rcl.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.StatementImpl
		 * @see rcl.impl.RclPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Enclosing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__ENCLOSING = eINSTANCE.getStatement_Enclosing();

		/**
		 * The meta object literal for the '{@link rcl.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.VarAssignmentImpl
		 * @see rcl.impl.RclPackageImpl#getVarAssignment()
		 * @generated
		 */
		EClass VAR_ASSIGNMENT = eINSTANCE.getVarAssignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_ASSIGNMENT__NAME = eINSTANCE.getVarAssignment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_ASSIGNMENT__VALUE = eINSTANCE.getVarAssignment_Value();

		/**
		 * The meta object literal for the '{@link rcl.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ConditionalImpl
		 * @see rcl.impl.RclPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__EXPR = eINSTANCE.getConditional_Expr();

		/**
		 * The meta object literal for the '<em><b>Cond True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__COND_TRUE = eINSTANCE.getConditional_CondTrue();

		/**
		 * The meta object literal for the '<em><b>Cond False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__COND_FALSE = eINSTANCE.getConditional_CondFalse();

		/**
		 * The meta object literal for the '{@link rcl.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.LoopImpl
		 * @see rcl.impl.RclPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__EXPR = eINSTANCE.getLoop_Expr();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BLOCK = eINSTANCE.getLoop_Block();

		/**
		 * The meta object literal for the '{@link rcl.impl.RclBlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.RclBlockImpl
		 * @see rcl.impl.RclPackageImpl#getRclBlock()
		 * @generated
		 */
		EClass RCL_BLOCK = eINSTANCE.getRclBlock();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCL_BLOCK__STMTS = eINSTANCE.getRclBlock_Stmts();

		/**
		 * The meta object literal for the '{@link rcl.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.QueryImpl
		 * @see rcl.impl.RclPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link rcl.impl.TemperatureQueryImpl <em>Temperature Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.TemperatureQueryImpl
		 * @see rcl.impl.RclPackageImpl#getTemperatureQuery()
		 * @generated
		 */
		EClass TEMPERATURE_QUERY = eINSTANCE.getTemperatureQuery();

		/**
		 * The meta object literal for the '{@link rcl.impl.HumidityQueryImpl <em>Humidity Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.HumidityQueryImpl
		 * @see rcl.impl.RclPackageImpl#getHumidityQuery()
		 * @generated
		 */
		EClass HUMIDITY_QUERY = eINSTANCE.getHumidityQuery();

		/**
		 * The meta object literal for the '{@link rcl.impl.MessageQueryImpl <em>Message Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.MessageQueryImpl
		 * @see rcl.impl.RclPackageImpl#getMessageQuery()
		 * @generated
		 */
		EClass MESSAGE_QUERY = eINSTANCE.getMessageQuery();

		/**
		 * The meta object literal for the '{@link rcl.impl.ObstacleQueryImpl <em>Obstacle Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ObstacleQueryImpl
		 * @see rcl.impl.RclPackageImpl#getObstacleQuery()
		 * @generated
		 */
		EClass OBSTACLE_QUERY = eINSTANCE.getObstacleQuery();

		/**
		 * The meta object literal for the '<em><b>Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE_QUERY__FRONT = eINSTANCE.getObstacleQuery_Front();

		/**
		 * The meta object literal for the '{@link rcl.impl.RoverExpressionImpl <em>Rover Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.RoverExpressionImpl
		 * @see rcl.impl.RclPackageImpl#getRoverExpression()
		 * @generated
		 */
		EClass ROVER_EXPRESSION = eINSTANCE.getRoverExpression();

		/**
		 * The meta object literal for the '{@link rcl.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.NumericExpressionImpl
		 * @see rcl.impl.RclPackageImpl#getNumericExpression()
		 * @generated
		 */
		EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_EXPRESSION__LHS = eINSTANCE.getNumericExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_EXPRESSION__RHS = eINSTANCE.getNumericExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_EXPRESSION__OP = eINSTANCE.getNumericExpression_Op();

		/**
		 * The meta object literal for the '{@link rcl.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.StringExpressionImpl
		 * @see rcl.impl.RclPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__LHS = eINSTANCE.getStringExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__RHS = eINSTANCE.getStringExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__OP = eINSTANCE.getStringExpression_Op();

		/**
		 * The meta object literal for the '{@link rcl.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.BooleanExpressionImpl
		 * @see rcl.impl.RclPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__LHS = eINSTANCE.getBooleanExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__RHS = eINSTANCE.getBooleanExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__OP = eINSTANCE.getBooleanExpression_Op();

		/**
		 * The meta object literal for the '{@link rcl.impl.RoverValueImpl <em>Rover Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.RoverValueImpl
		 * @see rcl.impl.RclPackageImpl#getRoverValue()
		 * @generated
		 */
		EClass ROVER_VALUE = eINSTANCE.getRoverValue();

		/**
		 * The meta object literal for the '{@link rcl.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.NumberValueImpl
		 * @see rcl.impl.RclPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>NValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__NVALUE = eINSTANCE.getNumberValue_NValue();

		/**
		 * The meta object literal for the '{@link rcl.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.StringValueImpl
		 * @see rcl.impl.RclPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>SValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__SVALUE = eINSTANCE.getStringValue_SValue();

		/**
		 * The meta object literal for the '{@link rcl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.BooleanValueImpl
		 * @see rcl.impl.RclPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>BValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__BVALUE = eINSTANCE.getBooleanValue_BValue();

		/**
		 * The meta object literal for the '{@link rcl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ActionImpl
		 * @see rcl.impl.RclPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link rcl.impl.ForwardActionImpl <em>Forward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ForwardActionImpl
		 * @see rcl.impl.RclPackageImpl#getForwardAction()
		 * @generated
		 */
		EClass FORWARD_ACTION = eINSTANCE.getForwardAction();

		/**
		 * The meta object literal for the '{@link rcl.impl.ForwardMinActionImpl <em>Forward Min Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.ForwardMinActionImpl
		 * @see rcl.impl.RclPackageImpl#getForwardMinAction()
		 * @generated
		 */
		EClass FORWARD_MIN_ACTION = eINSTANCE.getForwardMinAction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD_MIN_ACTION__DISTANCE = eINSTANCE.getForwardMinAction_Distance();

		/**
		 * The meta object literal for the '{@link rcl.impl.BackwardActionImpl <em>Backward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.BackwardActionImpl
		 * @see rcl.impl.RclPackageImpl#getBackwardAction()
		 * @generated
		 */
		EClass BACKWARD_ACTION = eINSTANCE.getBackwardAction();

		/**
		 * The meta object literal for the '{@link rcl.impl.BackwardMinActionImpl <em>Backward Min Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.BackwardMinActionImpl
		 * @see rcl.impl.RclPackageImpl#getBackwardMinAction()
		 * @generated
		 */
		EClass BACKWARD_MIN_ACTION = eINSTANCE.getBackwardMinAction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKWARD_MIN_ACTION__DISTANCE = eINSTANCE.getBackwardMinAction_Distance();

		/**
		 * The meta object literal for the '{@link rcl.impl.TurnActionImpl <em>Turn Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.TurnActionImpl
		 * @see rcl.impl.RclPackageImpl#getTurnAction()
		 * @generated
		 */
		EClass TURN_ACTION = eINSTANCE.getTurnAction();

		/**
		 * The meta object literal for the '{@link rcl.impl.TurnDegActionImpl <em>Turn Deg Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.TurnDegActionImpl
		 * @see rcl.impl.RclPackageImpl#getTurnDegAction()
		 * @generated
		 */
		EClass TURN_DEG_ACTION = eINSTANCE.getTurnDegAction();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN_DEG_ACTION__DEGREES = eINSTANCE.getTurnDegAction_Degrees();

		/**
		 * The meta object literal for the '{@link rcl.impl.StopActionImpl <em>Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.StopActionImpl
		 * @see rcl.impl.RclPackageImpl#getStopAction()
		 * @generated
		 */
		EClass STOP_ACTION = eINSTANCE.getStopAction();

		/**
		 * The meta object literal for the '{@link rcl.impl.LogActionImpl <em>Log Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.LogActionImpl
		 * @see rcl.impl.RclPackageImpl#getLogAction()
		 * @generated
		 */
		EClass LOG_ACTION = eINSTANCE.getLogAction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ACTION__MESSAGE = eINSTANCE.getLogAction_Message();

		/**
		 * The meta object literal for the '{@link rcl.impl.SendActionImpl <em>Send Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.SendActionImpl
		 * @see rcl.impl.RclPackageImpl#getSendAction()
		 * @generated
		 */
		EClass SEND_ACTION = eINSTANCE.getSendAction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_ACTION__MESSAGE = eINSTANCE.getSendAction_Message();

		/**
		 * The meta object literal for the '{@link rcl.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.impl.VarRefImpl
		 * @see rcl.impl.RclPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

		/**
		 * The meta object literal for the '{@link rcl.NumericOperator <em>Numeric Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.NumericOperator
		 * @see rcl.impl.RclPackageImpl#getNumericOperator()
		 * @generated
		 */
		EEnum NUMERIC_OPERATOR = eINSTANCE.getNumericOperator();

		/**
		 * The meta object literal for the '{@link rcl.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.StringOperator
		 * @see rcl.impl.RclPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link rcl.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rcl.BooleanOperator
		 * @see rcl.impl.RclPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //RclPackage
