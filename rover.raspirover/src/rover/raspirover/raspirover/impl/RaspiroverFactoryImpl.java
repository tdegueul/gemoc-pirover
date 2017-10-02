/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rover.raspirover.raspirover.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaspiroverFactoryImpl extends EFactoryImpl implements RaspiroverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RaspiroverFactory init() {
		try {
			RaspiroverFactory theRaspiroverFactory = (RaspiroverFactory)EPackage.Registry.INSTANCE.getEFactory(RaspiroverPackage.eNS_URI);
			if (theRaspiroverFactory != null) {
				return theRaspiroverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RaspiroverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaspiroverFactoryImpl() {
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
			case RaspiroverPackage.RAS_PI_BOARD: return createRasPiBoard();
			case RaspiroverPackage.PROJECT: return createProject();
			case RaspiroverPackage.SKETCH: return createSketch();
			case RaspiroverPackage.BLOCK: return createBlock();
			case RaspiroverPackage.DIGITAL_PIN: return createDigitalPin();
			case RaspiroverPackage.PIN: return createPin();
			case RaspiroverPackage.ANALOG_PIN: return createAnalogPin();
			case RaspiroverPackage.ROVER_PROGRAM: return createRoverProgram();
			case RaspiroverPackage.PARAM: return createParam();
			case RaspiroverPackage.VAR_ASSIGNMENT: return createVarAssignment();
			case RaspiroverPackage.CONDITIONAL: return createConditional();
			case RaspiroverPackage.LOOP: return createLoop();
			case RaspiroverPackage.RCL_BLOCK: return createRclBlock();
			case RaspiroverPackage.TEMPERATURE_QUERY: return createTemperatureQuery();
			case RaspiroverPackage.HUMIDITY_QUERY: return createHumidityQuery();
			case RaspiroverPackage.MESSAGE_QUERY: return createMessageQuery();
			case RaspiroverPackage.OBSTACLE_QUERY: return createObstacleQuery();
			case RaspiroverPackage.NUMERIC_EXPRESSION: return createNumericExpression();
			case RaspiroverPackage.STRING_EXPRESSION: return createStringExpression();
			case RaspiroverPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case RaspiroverPackage.ROVER_VALUE: return createRoverValue();
			case RaspiroverPackage.NUMBER_VALUE: return createNumberValue();
			case RaspiroverPackage.STRING_VALUE: return createStringValue();
			case RaspiroverPackage.BOOLEAN_VALUE: return createBooleanValue();
			case RaspiroverPackage.FORWARD_ACTION: return createForwardAction();
			case RaspiroverPackage.FORWARD_MIN_ACTION: return createForwardMinAction();
			case RaspiroverPackage.BACKWARD_ACTION: return createBackwardAction();
			case RaspiroverPackage.BACKWARD_MIN_ACTION: return createBackwardMinAction();
			case RaspiroverPackage.TURN_ACTION: return createTurnAction();
			case RaspiroverPackage.TURN_DEG_ACTION: return createTurnDegAction();
			case RaspiroverPackage.STOP_ACTION: return createStopAction();
			case RaspiroverPackage.LOG_ACTION: return createLogAction();
			case RaspiroverPackage.SEND_ACTION: return createSendAction();
			case RaspiroverPackage.VAR_REF: return createVarRef();
			case RaspiroverPackage.UNIT: return createUnit();
			case RaspiroverPackage.CENTIMETER: return createCentimeter();
			case RaspiroverPackage.MILLIMETER: return createMillimeter();
			case RaspiroverPackage.METER: return createMeter();
			case RaspiroverPackage.FOOT: return createFoot();
			case RaspiroverPackage.INCH: return createInch();
			case RaspiroverPackage.YARD: return createYard();
			case RaspiroverPackage.RADIAN: return createRadian();
			case RaspiroverPackage.DEGREE: return createDegree();
			case RaspiroverPackage.TURN: return createTurn();
			case RaspiroverPackage.GRADIAN: return createGradian();
			case RaspiroverPackage.LENGTH: return createLength();
			case RaspiroverPackage.ANGLE: return createAngle();
			case RaspiroverPackage.LENGTH_ADD: return createLengthAdd();
			case RaspiroverPackage.LENGTH_SUBTRACT: return createLengthSubtract();
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY: return createLengthScalarMultiply();
			case RaspiroverPackage.LENGTH_SCALAR_DIVIDE: return createLengthScalarDivide();
			case RaspiroverPackage.LENGTH_EQUALS: return createLengthEquals();
			case RaspiroverPackage.LENGTH_DISTINCT: return createLengthDistinct();
			case RaspiroverPackage.LENGTH_SMALLER: return createLengthSmaller();
			case RaspiroverPackage.LENGTH_GREATER: return createLengthGreater();
			case RaspiroverPackage.ANGLE_ADD: return createAngleAdd();
			case RaspiroverPackage.ANGLE_SUBTRACT: return createAngleSubtract();
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY: return createAngleScalarMultiply();
			case RaspiroverPackage.ANGLE_SCALAR_DIVIDE: return createAngleScalarDivide();
			case RaspiroverPackage.ANGLE_EQUALS: return createAngleEquals();
			case RaspiroverPackage.ANGLE_DISTINCT: return createAngleDistinct();
			case RaspiroverPackage.ANGLE_SMALLER: return createAngleSmaller();
			case RaspiroverPackage.ANGLE_GREATER: return createAngleGreater();
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
			case RaspiroverPackage.NUMERIC_OPERATOR:
				return createNumericOperatorFromString(eDataType, initialValue);
			case RaspiroverPackage.STRING_OPERATOR:
				return createStringOperatorFromString(eDataType, initialValue);
			case RaspiroverPackage.BOOLEAN_OPERATOR:
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
			case RaspiroverPackage.NUMERIC_OPERATOR:
				return convertNumericOperatorToString(eDataType, instanceValue);
			case RaspiroverPackage.STRING_OPERATOR:
				return convertStringOperatorToString(eDataType, instanceValue);
			case RaspiroverPackage.BOOLEAN_OPERATOR:
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
	public RasPiBoard createRasPiBoard() {
		RasPiBoardImpl rasPiBoard = new RasPiBoardImpl();
		return rasPiBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		SketchImpl sketch = new SketchImpl();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalPin createDigitalPin() {
		DigitalPinImpl digitalPin = new DigitalPinImpl();
		return digitalPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogPin createAnalogPin() {
		AnalogPinImpl analogPin = new AnalogPinImpl();
		return analogPin;
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
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Centimeter createCentimeter() {
		CentimeterImpl centimeter = new CentimeterImpl();
		return centimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Millimeter createMillimeter() {
		MillimeterImpl millimeter = new MillimeterImpl();
		return millimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foot createFoot() {
		FootImpl foot = new FootImpl();
		return foot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inch createInch() {
		InchImpl inch = new InchImpl();
		return inch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yard createYard() {
		YardImpl yard = new YardImpl();
		return yard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radian createRadian() {
		RadianImpl radian = new RadianImpl();
		return radian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree createDegree() {
		DegreeImpl degree = new DegreeImpl();
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradian createGradian() {
		GradianImpl gradian = new GradianImpl();
		return gradian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle createAngle() {
		AngleImpl angle = new AngleImpl();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthAdd createLengthAdd() {
		LengthAddImpl lengthAdd = new LengthAddImpl();
		return lengthAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthSubtract createLengthSubtract() {
		LengthSubtractImpl lengthSubtract = new LengthSubtractImpl();
		return lengthSubtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthScalarMultiply createLengthScalarMultiply() {
		LengthScalarMultiplyImpl lengthScalarMultiply = new LengthScalarMultiplyImpl();
		return lengthScalarMultiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthScalarDivide createLengthScalarDivide() {
		LengthScalarDivideImpl lengthScalarDivide = new LengthScalarDivideImpl();
		return lengthScalarDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthEquals createLengthEquals() {
		LengthEqualsImpl lengthEquals = new LengthEqualsImpl();
		return lengthEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthDistinct createLengthDistinct() {
		LengthDistinctImpl lengthDistinct = new LengthDistinctImpl();
		return lengthDistinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthSmaller createLengthSmaller() {
		LengthSmallerImpl lengthSmaller = new LengthSmallerImpl();
		return lengthSmaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthGreater createLengthGreater() {
		LengthGreaterImpl lengthGreater = new LengthGreaterImpl();
		return lengthGreater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleAdd createAngleAdd() {
		AngleAddImpl angleAdd = new AngleAddImpl();
		return angleAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleSubtract createAngleSubtract() {
		AngleSubtractImpl angleSubtract = new AngleSubtractImpl();
		return angleSubtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleScalarMultiply createAngleScalarMultiply() {
		AngleScalarMultiplyImpl angleScalarMultiply = new AngleScalarMultiplyImpl();
		return angleScalarMultiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleScalarDivide createAngleScalarDivide() {
		AngleScalarDivideImpl angleScalarDivide = new AngleScalarDivideImpl();
		return angleScalarDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleEquals createAngleEquals() {
		AngleEqualsImpl angleEquals = new AngleEqualsImpl();
		return angleEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleDistinct createAngleDistinct() {
		AngleDistinctImpl angleDistinct = new AngleDistinctImpl();
		return angleDistinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleSmaller createAngleSmaller() {
		AngleSmallerImpl angleSmaller = new AngleSmallerImpl();
		return angleSmaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleGreater createAngleGreater() {
		AngleGreaterImpl angleGreater = new AngleGreaterImpl();
		return angleGreater;
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
	public RaspiroverPackage getRaspiroverPackage() {
		return (RaspiroverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RaspiroverPackage getPackage() {
		return RaspiroverPackage.eINSTANCE;
	}

} //RaspiroverFactoryImpl
