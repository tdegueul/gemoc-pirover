/**
 */
package rover.rclmt.rcl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rover.rclmt.rcl.Action;
import rover.rclmt.rcl.Assignment;
import rover.rclmt.rcl.BackwardAction;
import rover.rclmt.rcl.BackwardMinAction;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.BooleanExpression;
import rover.rclmt.rcl.BooleanOperator;
import rover.rclmt.rcl.BooleanValue;
import rover.rclmt.rcl.Conditional;
import rover.rclmt.rcl.ForwardAction;
import rover.rclmt.rcl.ForwardMinAction;
import rover.rclmt.rcl.HumidityQuery;
import rover.rclmt.rcl.LogAction;
import rover.rclmt.rcl.Loop;
import rover.rclmt.rcl.MessageQuery;
import rover.rclmt.rcl.NumberValue;
import rover.rclmt.rcl.NumericExpression;
import rover.rclmt.rcl.NumericOperator;
import rover.rclmt.rcl.ObstacleQuery;
import rover.rclmt.rcl.Param;
import rover.rclmt.rcl.Query;
import rover.rclmt.rcl.RclFactory;
import rover.rclmt.rcl.RclPackage;
import rover.rclmt.rcl.RoverExpression;
import rover.rclmt.rcl.RoverProgram;
import rover.rclmt.rcl.RoverValue;
import rover.rclmt.rcl.SendAction;
import rover.rclmt.rcl.Statement;
import rover.rclmt.rcl.StopAction;
import rover.rclmt.rcl.StringExpression;
import rover.rclmt.rcl.StringOperator;
import rover.rclmt.rcl.StringValue;
import rover.rclmt.rcl.TemperatureQuery;
import rover.rclmt.rcl.TurnAction;
import rover.rclmt.rcl.TurnDegAction;
import rover.rclmt.rcl.VarRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RclPackageImpl extends EPackageImpl implements RclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humidityQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardMinActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backwardActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backwardMinActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnDegActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rover.rclmt.rcl.RclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RclPackageImpl() {
		super(eNS_URI, RclFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RclPackage init() {
		if (isInited) return (RclPackage)EPackage.Registry.INSTANCE.getEPackage(RclPackage.eNS_URI);

		// Obtain or create and register package
		RclPackageImpl theRclPackage = (RclPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RclPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RclPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRclPackage.createPackageContents();

		// Initialize created meta-data
		theRclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRclPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RclPackage.eNS_URI, theRclPackage);
		return theRclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverProgram() {
		return roverProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoverProgram_Name() {
		return (EAttribute)roverProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverProgram_Params() {
		return (EReference)roverProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoverProgram_Block() {
		return (EReference)roverProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Enclosing() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Name() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Expr() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_CondTrue() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_CondFalse() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Expr() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Block() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Stmts() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureQuery() {
		return temperatureQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumidityQuery() {
		return humidityQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageQuery() {
		return messageQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacleQuery() {
		return obstacleQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObstacleQuery_Front() {
		return (EAttribute)obstacleQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverExpression() {
		return roverExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericExpression() {
		return numericExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericExpression_Lhs() {
		return (EReference)numericExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericExpression_Rhs() {
		return (EReference)numericExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericExpression_Op() {
		return (EAttribute)numericExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_Lhs() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_Rhs() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringExpression_Op() {
		return (EAttribute)stringExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Lhs() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Rhs() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Op() {
		return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverValue() {
		return roverValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_NValue() {
		return (EAttribute)numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_SValue() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_BValue() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardAction() {
		return forwardActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardMinAction() {
		return forwardMinActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForwardMinAction_Duration() {
		return (EAttribute)forwardMinActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackwardAction() {
		return backwardActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackwardMinAction() {
		return backwardMinActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackwardMinAction_Duration() {
		return (EAttribute)backwardMinActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnAction() {
		return turnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnDegAction() {
		return turnDegActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnDegAction_Degrees() {
		return (EAttribute)turnDegActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopAction() {
		return stopActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogAction() {
		return logActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogAction_Message() {
		return (EAttribute)logActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendAction() {
		return sendActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendAction_Message() {
		return (EAttribute)sendActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarRef() {
		return varRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarRef_Name() {
		return (EAttribute)varRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericOperator() {
		return numericOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringOperator() {
		return stringOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclFactory getRclFactory() {
		return (RclFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roverProgramEClass = createEClass(ROVER_PROGRAM);
		createEAttribute(roverProgramEClass, ROVER_PROGRAM__NAME);
		createEReference(roverProgramEClass, ROVER_PROGRAM__PARAMS);
		createEReference(roverProgramEClass, ROVER_PROGRAM__BLOCK);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__ENCLOSING);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__NAME);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__EXPR);
		createEReference(conditionalEClass, CONDITIONAL__COND_TRUE);
		createEReference(conditionalEClass, CONDITIONAL__COND_FALSE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__EXPR);
		createEReference(loopEClass, LOOP__BLOCK);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STMTS);

		queryEClass = createEClass(QUERY);

		temperatureQueryEClass = createEClass(TEMPERATURE_QUERY);

		humidityQueryEClass = createEClass(HUMIDITY_QUERY);

		messageQueryEClass = createEClass(MESSAGE_QUERY);

		obstacleQueryEClass = createEClass(OBSTACLE_QUERY);
		createEAttribute(obstacleQueryEClass, OBSTACLE_QUERY__FRONT);

		roverExpressionEClass = createEClass(ROVER_EXPRESSION);

		numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);
		createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__LHS);
		createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__RHS);
		createEAttribute(numericExpressionEClass, NUMERIC_EXPRESSION__OP);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__LHS);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__RHS);
		createEAttribute(stringExpressionEClass, STRING_EXPRESSION__OP);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__LHS);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__RHS);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__OP);

		roverValueEClass = createEClass(ROVER_VALUE);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__NVALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__SVALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__BVALUE);

		actionEClass = createEClass(ACTION);

		forwardActionEClass = createEClass(FORWARD_ACTION);

		forwardMinActionEClass = createEClass(FORWARD_MIN_ACTION);
		createEAttribute(forwardMinActionEClass, FORWARD_MIN_ACTION__DURATION);

		backwardActionEClass = createEClass(BACKWARD_ACTION);

		backwardMinActionEClass = createEClass(BACKWARD_MIN_ACTION);
		createEAttribute(backwardMinActionEClass, BACKWARD_MIN_ACTION__DURATION);

		turnActionEClass = createEClass(TURN_ACTION);

		turnDegActionEClass = createEClass(TURN_DEG_ACTION);
		createEAttribute(turnDegActionEClass, TURN_DEG_ACTION__DEGREES);

		stopActionEClass = createEClass(STOP_ACTION);

		logActionEClass = createEClass(LOG_ACTION);
		createEAttribute(logActionEClass, LOG_ACTION__MESSAGE);

		sendActionEClass = createEClass(SEND_ACTION);
		createEAttribute(sendActionEClass, SEND_ACTION__MESSAGE);

		varRefEClass = createEClass(VAR_REF);
		createEAttribute(varRefEClass, VAR_REF__NAME);

		// Create enums
		numericOperatorEEnum = createEEnum(NUMERIC_OPERATOR);
		stringOperatorEEnum = createEEnum(STRING_OPERATOR);
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assignmentEClass.getESuperTypes().add(this.getStatement());
		conditionalEClass.getESuperTypes().add(this.getStatement());
		loopEClass.getESuperTypes().add(this.getStatement());
		blockEClass.getESuperTypes().add(this.getStatement());
		temperatureQueryEClass.getESuperTypes().add(this.getQuery());
		temperatureQueryEClass.getESuperTypes().add(this.getNumberValue());
		humidityQueryEClass.getESuperTypes().add(this.getQuery());
		humidityQueryEClass.getESuperTypes().add(this.getNumberValue());
		messageQueryEClass.getESuperTypes().add(this.getQuery());
		messageQueryEClass.getESuperTypes().add(this.getStringValue());
		obstacleQueryEClass.getESuperTypes().add(this.getQuery());
		obstacleQueryEClass.getESuperTypes().add(this.getBooleanValue());
		numericExpressionEClass.getESuperTypes().add(this.getRoverExpression());
		stringExpressionEClass.getESuperTypes().add(this.getRoverExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getRoverExpression());
		numberValueEClass.getESuperTypes().add(this.getRoverValue());
		stringValueEClass.getESuperTypes().add(this.getRoverValue());
		booleanValueEClass.getESuperTypes().add(this.getRoverValue());
		actionEClass.getESuperTypes().add(this.getStatement());
		forwardActionEClass.getESuperTypes().add(this.getAction());
		forwardMinActionEClass.getESuperTypes().add(this.getAction());
		backwardActionEClass.getESuperTypes().add(this.getAction());
		backwardMinActionEClass.getESuperTypes().add(this.getAction());
		turnActionEClass.getESuperTypes().add(this.getAction());
		turnDegActionEClass.getESuperTypes().add(this.getAction());
		stopActionEClass.getESuperTypes().add(this.getAction());
		logActionEClass.getESuperTypes().add(this.getAction());
		sendActionEClass.getESuperTypes().add(this.getAction());
		varRefEClass.getESuperTypes().add(this.getBooleanValue());
		varRefEClass.getESuperTypes().add(this.getNumberValue());
		varRefEClass.getESuperTypes().add(this.getStringValue());
		varRefEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes and features; add operations and parameters
		initEClass(roverProgramEClass, RoverProgram.class, "RoverProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoverProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverProgram_Params(), this.getParam(), null, "params", null, 0, -1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverProgram_Block(), this.getBlock(), null, "block", null, 0, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(roverProgramEClass, this.getRoverValue(), "getVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(roverProgramEClass, null, "bindVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoverValue(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roverProgramEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Enclosing(), this.getBlock(), this.getBlock_Stmts(), "enclosing", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(statementEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(statementEClass, this.getRoverProgram(), "getProgram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getRoverValue(), null, "value", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assignmentEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_Expr(), this.getRoverExpression(), null, "expr", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_CondTrue(), this.getBlock(), null, "condTrue", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_CondFalse(), this.getBlock(), null, "condFalse", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(conditionalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Expr(), this.getRoverExpression(), null, "expr", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Block(), this.getBlock(), null, "block", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(loopEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Stmts(), this.getStatement(), this.getStatement_Enclosing(), "stmts", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(blockEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureQueryEClass, TemperatureQuery.class, "TemperatureQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(temperatureQueryEClass, ecorePackage.getEInt(), "getIntValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(humidityQueryEClass, HumidityQuery.class, "HumidityQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(humidityQueryEClass, ecorePackage.getEInt(), "getIntValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageQueryEClass, MessageQuery.class, "MessageQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(messageQueryEClass, ecorePackage.getEString(), "getStringValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(obstacleQueryEClass, ObstacleQuery.class, "ObstacleQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObstacleQuery_Front(), ecorePackage.getEBoolean(), "front", null, 0, 1, ObstacleQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(obstacleQueryEClass, ecorePackage.getEBoolean(), "getBooleanValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roverExpressionEClass, RoverExpression.class, "RoverExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(roverExpressionEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericExpression_Lhs(), this.getNumberValue(), null, "lhs", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericExpression_Rhs(), this.getNumberValue(), null, "rhs", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericExpression_Op(), this.getNumericOperator(), "op", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(numericExpressionEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringExpression_Lhs(), this.getStringValue(), null, "lhs", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringExpression_Rhs(), this.getStringValue(), null, "rhs", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringExpression_Op(), this.getStringOperator(), "op", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stringExpressionEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Lhs(), this.getBooleanValue(), null, "lhs", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpression_Rhs(), this.getBooleanValue(), null, "rhs", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanExpression_Op(), this.getBooleanOperator(), "op", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanExpressionEClass, ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(roverValueEClass, RoverValue.class, "RoverValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_NValue(), ecorePackage.getEInt(), "nValue", null, 0, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(numberValueEClass, ecorePackage.getEInt(), "getIntValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_SValue(), ecorePackage.getEString(), "sValue", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stringValueEClass, ecorePackage.getEString(), "getStringValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_BValue(), ecorePackage.getEBoolean(), "bValue", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(booleanValueEClass, ecorePackage.getEBoolean(), "getBooleanValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forwardActionEClass, ForwardAction.class, "ForwardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(forwardActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(forwardMinActionEClass, ForwardMinAction.class, "ForwardMinAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForwardMinAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, ForwardMinAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(forwardMinActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(backwardActionEClass, BackwardAction.class, "BackwardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(backwardActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(backwardMinActionEClass, BackwardMinAction.class, "BackwardMinAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackwardMinAction_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, BackwardMinAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(backwardMinActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(turnActionEClass, TurnAction.class, "TurnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(turnActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(turnDegActionEClass, TurnDegAction.class, "TurnDegAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnDegAction_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, TurnDegAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(turnDegActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stopActionEClass, StopAction.class, "StopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(stopActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(logActionEClass, LogAction.class, "LogAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogAction_Message(), ecorePackage.getEString(), "message", null, 0, 1, LogAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(logActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sendActionEClass, SendAction.class, "SendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendAction_Message(), ecorePackage.getEString(), "message", null, 0, 1, SendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sendActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(varRefEClass, VarRef.class, "VarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(varRefEClass, ecorePackage.getEInt(), "getIntValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(varRefEClass, ecorePackage.getEBoolean(), "getBooleanValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(varRefEClass, ecorePackage.getEString(), "getStringValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(varRefEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(numericOperatorEEnum, NumericOperator.class, "NumericOperator");
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.LT);
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.EQ);
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.NEQ);
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.GT);
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.LEQ);
		addEEnumLiteral(numericOperatorEEnum, NumericOperator.GEQ);

		initEEnum(stringOperatorEEnum, StringOperator.class, "StringOperator");
		addEEnumLiteral(stringOperatorEEnum, StringOperator.EQ);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.NEQ);

		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.EQ);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.NEQ);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (roverProgramEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (roverProgramEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (roverProgramEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (statementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (statementEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (assignmentEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (conditionalEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (loopEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (temperatureQueryEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (humidityQueryEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (messageQueryEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (obstacleQueryEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (roverExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numericExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numberValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanValueEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forwardActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forwardMinActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (backwardActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (backwardMinActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (turnActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (turnDegActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stopActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (logActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (sendActionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (varRefEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (varRefEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (varRefEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (varRefEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });
	}

} //RclPackageImpl
