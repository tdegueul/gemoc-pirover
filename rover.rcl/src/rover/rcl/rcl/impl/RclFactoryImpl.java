/**
 */
package rover.rcl.rcl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rover.rcl.rcl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RclFactoryImpl extends EFactoryImpl implements RclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RclFactory init() {
		try {
			RclFactory theRclFactory = (RclFactory)EPackage.Registry.INSTANCE.getEFactory(RclPackage.eNS_URI);
			if (theRclFactory != null) {
				return theRclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RclPackage.ROVER_PROGRAM: return createRoverProgram();
			case RclPackage.PARAM: return createParam();
			case RclPackage.VAR_ASSIGNMENT: return createVarAssignment();
			case RclPackage.CONDITIONAL: return createConditional();
			case RclPackage.LOOP: return createLoop();
			case RclPackage.RCL_BLOCK: return createRclBlock();
			case RclPackage.TEMPERATURE_QUERY: return createTemperatureQuery();
			case RclPackage.HUMIDITY_QUERY: return createHumidityQuery();
			case RclPackage.MESSAGE_QUERY: return createMessageQuery();
			case RclPackage.OBSTACLE_QUERY: return createObstacleQuery();
			case RclPackage.NUMERIC_EXPRESSION: return createNumericExpression();
			case RclPackage.STRING_EXPRESSION: return createStringExpression();
			case RclPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case RclPackage.ROVER_VALUE: return createRoverValue();
			case RclPackage.NUMBER_VALUE: return createNumberValue();
			case RclPackage.STRING_VALUE: return createStringValue();
			case RclPackage.BOOLEAN_VALUE: return createBooleanValue();
			case RclPackage.FORWARD_ACTION: return createForwardAction();
			case RclPackage.FORWARD_MIN_ACTION: return createForwardMinAction();
			case RclPackage.BACKWARD_ACTION: return createBackwardAction();
			case RclPackage.BACKWARD_MIN_ACTION: return createBackwardMinAction();
			case RclPackage.TURN_ACTION: return createTurnAction();
			case RclPackage.TURN_DEG_ACTION: return createTurnDegAction();
			case RclPackage.STOP_ACTION: return createStopAction();
			case RclPackage.LOG_ACTION: return createLogAction();
			case RclPackage.SEND_ACTION: return createSendAction();
			case RclPackage.VAR_REF: return createVarRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RclPackage.NUMERIC_OPERATOR:
				return createNumericOperatorFromString(eDataType, initialValue);
			case RclPackage.STRING_OPERATOR:
				return createStringOperatorFromString(eDataType, initialValue);
			case RclPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RclPackage.NUMERIC_OPERATOR:
				return convertNumericOperatorToString(eDataType, instanceValue);
			case RclPackage.STRING_OPERATOR:
				return convertStringOperatorToString(eDataType, instanceValue);
			case RclPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverProgram createRoverProgram() {
		RoverProgramImpl roverProgram = new RoverProgramImpl();
		return roverProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarAssignment createVarAssignment() {
		VarAssignmentImpl varAssignment = new VarAssignmentImpl();
		return varAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclBlock createRclBlock() {
		RclBlockImpl rclBlock = new RclBlockImpl();
		return rclBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureQuery createTemperatureQuery() {
		TemperatureQueryImpl temperatureQuery = new TemperatureQueryImpl();
		return temperatureQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumidityQuery createHumidityQuery() {
		HumidityQueryImpl humidityQuery = new HumidityQueryImpl();
		return humidityQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQuery createMessageQuery() {
		MessageQueryImpl messageQuery = new MessageQueryImpl();
		return messageQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstacleQuery createObstacleQuery() {
		ObstacleQueryImpl obstacleQuery = new ObstacleQueryImpl();
		return obstacleQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericExpression createNumericExpression() {
		NumericExpressionImpl numericExpression = new NumericExpressionImpl();
		return numericExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverValue createRoverValue() {
		RoverValueImpl roverValue = new RoverValueImpl();
		return roverValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardAction createForwardAction() {
		ForwardActionImpl forwardAction = new ForwardActionImpl();
		return forwardAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardMinAction createForwardMinAction() {
		ForwardMinActionImpl forwardMinAction = new ForwardMinActionImpl();
		return forwardMinAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackwardAction createBackwardAction() {
		BackwardActionImpl backwardAction = new BackwardActionImpl();
		return backwardAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackwardMinAction createBackwardMinAction() {
		BackwardMinActionImpl backwardMinAction = new BackwardMinActionImpl();
		return backwardMinAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnAction createTurnAction() {
		TurnActionImpl turnAction = new TurnActionImpl();
		return turnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnDegAction createTurnDegAction() {
		TurnDegActionImpl turnDegAction = new TurnDegActionImpl();
		return turnDegAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopAction createStopAction() {
		StopActionImpl stopAction = new StopActionImpl();
		return stopAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogAction createLogAction() {
		LogActionImpl logAction = new LogActionImpl();
		return logAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendAction createSendAction() {
		SendActionImpl sendAction = new SendActionImpl();
		return sendAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarRef createVarRef() {
		VarRefImpl varRef = new VarRefImpl();
		return varRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericOperator createNumericOperatorFromString(EDataType eDataType, String initialValue) {
		NumericOperator result = NumericOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperator createStringOperatorFromString(EDataType eDataType, String initialValue) {
		StringOperator result = StringOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclPackage getRclPackage() {
		return (RclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RclPackage getPackage() {
		return RclPackage.eINSTANCE;
	}

} //RclFactoryImpl
