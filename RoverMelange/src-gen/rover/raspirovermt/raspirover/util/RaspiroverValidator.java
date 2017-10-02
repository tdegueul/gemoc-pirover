/**
 */
package rover.raspirovermt.raspirover.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rover.raspirovermt.raspirover.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rover.raspirovermt.raspirover.RaspiroverPackage
 * @generated
 */
public class RaspiroverValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RaspiroverValidator INSTANCE = new RaspiroverValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rover.raspirovermt.raspirover";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaspiroverValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RaspiroverPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RaspiroverPackage.RAS_PI_BOARD:
				return validateRasPiBoard((RasPiBoard)value, diagnostics, context);
			case RaspiroverPackage.BOARD:
				return validateBoard((Board)value, diagnostics, context);
			case RaspiroverPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case RaspiroverPackage.PROJECT:
				return validateProject((Project)value, diagnostics, context);
			case RaspiroverPackage.SKETCH:
				return validateSketch((Sketch)value, diagnostics, context);
			case RaspiroverPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case RaspiroverPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case RaspiroverPackage.DIGITAL_PIN:
				return validateDigitalPin((DigitalPin)value, diagnostics, context);
			case RaspiroverPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case RaspiroverPackage.ARDUINO_DIGITAL_MODULE:
				return validateArduinoDigitalModule((ArduinoDigitalModule)value, diagnostics, context);
			case RaspiroverPackage.ARDUINO_MODULE:
				return validateArduinoModule((ArduinoModule)value, diagnostics, context);
			case RaspiroverPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case RaspiroverPackage.ANALOG_PIN:
				return validateAnalogPin((AnalogPin)value, diagnostics, context);
			case RaspiroverPackage.ARDUINO_ANALOG_MODULE:
				return validateArduinoAnalogModule((ArduinoAnalogModule)value, diagnostics, context);
			case RaspiroverPackage.ROVER_PROGRAM:
				return validateRoverProgram((RoverProgram)value, diagnostics, context);
			case RaspiroverPackage.PARAM:
				return validateParam((Param)value, diagnostics, context);
			case RaspiroverPackage.STATEMENT:
				return validateStatement((Statement)value, diagnostics, context);
			case RaspiroverPackage.VAR_ASSIGNMENT:
				return validateVarAssignment((VarAssignment)value, diagnostics, context);
			case RaspiroverPackage.CONDITIONAL:
				return validateConditional((Conditional)value, diagnostics, context);
			case RaspiroverPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case RaspiroverPackage.RCL_BLOCK:
				return validateRclBlock((RclBlock)value, diagnostics, context);
			case RaspiroverPackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case RaspiroverPackage.TEMPERATURE_QUERY:
				return validateTemperatureQuery((TemperatureQuery)value, diagnostics, context);
			case RaspiroverPackage.HUMIDITY_QUERY:
				return validateHumidityQuery((HumidityQuery)value, diagnostics, context);
			case RaspiroverPackage.MESSAGE_QUERY:
				return validateMessageQuery((MessageQuery)value, diagnostics, context);
			case RaspiroverPackage.OBSTACLE_QUERY:
				return validateObstacleQuery((ObstacleQuery)value, diagnostics, context);
			case RaspiroverPackage.ROVER_EXPRESSION:
				return validateRoverExpression((RoverExpression)value, diagnostics, context);
			case RaspiroverPackage.NUMERIC_EXPRESSION:
				return validateNumericExpression((NumericExpression)value, diagnostics, context);
			case RaspiroverPackage.STRING_EXPRESSION:
				return validateStringExpression((StringExpression)value, diagnostics, context);
			case RaspiroverPackage.BOOLEAN_EXPRESSION:
				return validateBooleanExpression((BooleanExpression)value, diagnostics, context);
			case RaspiroverPackage.ROVER_VALUE:
				return validateRoverValue((RoverValue)value, diagnostics, context);
			case RaspiroverPackage.NUMBER_VALUE:
				return validateNumberValue((NumberValue)value, diagnostics, context);
			case RaspiroverPackage.STRING_VALUE:
				return validateStringValue((StringValue)value, diagnostics, context);
			case RaspiroverPackage.BOOLEAN_VALUE:
				return validateBooleanValue((BooleanValue)value, diagnostics, context);
			case RaspiroverPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case RaspiroverPackage.FORWARD_ACTION:
				return validateForwardAction((ForwardAction)value, diagnostics, context);
			case RaspiroverPackage.FORWARD_MIN_ACTION:
				return validateForwardMinAction((ForwardMinAction)value, diagnostics, context);
			case RaspiroverPackage.BACKWARD_ACTION:
				return validateBackwardAction((BackwardAction)value, diagnostics, context);
			case RaspiroverPackage.BACKWARD_MIN_ACTION:
				return validateBackwardMinAction((BackwardMinAction)value, diagnostics, context);
			case RaspiroverPackage.TURN_ACTION:
				return validateTurnAction((TurnAction)value, diagnostics, context);
			case RaspiroverPackage.TURN_DEG_ACTION:
				return validateTurnDegAction((TurnDegAction)value, diagnostics, context);
			case RaspiroverPackage.STOP_ACTION:
				return validateStopAction((StopAction)value, diagnostics, context);
			case RaspiroverPackage.LOG_ACTION:
				return validateLogAction((LogAction)value, diagnostics, context);
			case RaspiroverPackage.SEND_ACTION:
				return validateSendAction((SendAction)value, diagnostics, context);
			case RaspiroverPackage.VAR_REF:
				return validateVarRef((VarRef)value, diagnostics, context);
			case RaspiroverPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_UNIT:
				return validateLengthUnit((LengthUnit)value, diagnostics, context);
			case RaspiroverPackage.CENTIMETER:
				return validateCentimeter((Centimeter)value, diagnostics, context);
			case RaspiroverPackage.MILLIMETER:
				return validateMillimeter((Millimeter)value, diagnostics, context);
			case RaspiroverPackage.METER:
				return validateMeter((Meter)value, diagnostics, context);
			case RaspiroverPackage.FOOT:
				return validateFoot((Foot)value, diagnostics, context);
			case RaspiroverPackage.INCH:
				return validateInch((Inch)value, diagnostics, context);
			case RaspiroverPackage.YARD:
				return validateYard((Yard)value, diagnostics, context);
			case RaspiroverPackage.METRIC_SYSTEM_UNIT:
				return validateMetricSystemUnit((MetricSystemUnit)value, diagnostics, context);
			case RaspiroverPackage.IMPERIAL_SYSTEM_UNIT:
				return validateImperialSystemUnit((ImperialSystemUnit)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_UNIT:
				return validateAngleUnit((AngleUnit)value, diagnostics, context);
			case RaspiroverPackage.RADIAN:
				return validateRadian((Radian)value, diagnostics, context);
			case RaspiroverPackage.DEGREE:
				return validateDegree((Degree)value, diagnostics, context);
			case RaspiroverPackage.TURN:
				return validateTurn((Turn)value, diagnostics, context);
			case RaspiroverPackage.GRADIAN:
				return validateGradian((Gradian)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case RaspiroverPackage.LENGTH:
				return validateLength((Length)value, diagnostics, context);
			case RaspiroverPackage.ANGLE:
				return validateAngle((Angle)value, diagnostics, context);
			case RaspiroverPackage.NUMERIC_VALUE:
				return validateNumericValue((NumericValue)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY_OPERATION:
				return validateQuantityOperation((QuantityOperation)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_OPERATION:
				return validateLengthOperation((LengthOperation)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_ADD:
				return validateLengthAdd((LengthAdd)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_SUBTRACT:
				return validateLengthSubtract((LengthSubtract)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY:
				return validateLengthScalarMultiply((LengthScalarMultiply)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_SCALAR_DIVIDE:
				return validateLengthScalarDivide((LengthScalarDivide)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_EQUALS:
				return validateLengthEquals((LengthEquals)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_DISTINCT:
				return validateLengthDistinct((LengthDistinct)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_SMALLER:
				return validateLengthSmaller((LengthSmaller)value, diagnostics, context);
			case RaspiroverPackage.LENGTH_GREATER:
				return validateLengthGreater((LengthGreater)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_OPERATION:
				return validateAngleOperation((AngleOperation)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_ADD:
				return validateAngleAdd((AngleAdd)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_SUBTRACT:
				return validateAngleSubtract((AngleSubtract)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY:
				return validateAngleScalarMultiply((AngleScalarMultiply)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_SCALAR_DIVIDE:
				return validateAngleScalarDivide((AngleScalarDivide)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_EQUALS:
				return validateAngleEquals((AngleEquals)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_DISTINCT:
				return validateAngleDistinct((AngleDistinct)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_SMALLER:
				return validateAngleSmaller((AngleSmaller)value, diagnostics, context);
			case RaspiroverPackage.ANGLE_GREATER:
				return validateAngleGreater((AngleGreater)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY_ARITHMETIC_OPERATION:
				return validateQuantityArithmeticOperation((QuantityArithmeticOperation)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY_COMPARISON_OPERATION:
				return validateQuantityComparisonOperation((QuantityComparisonOperation)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION:
				return validateQuantityHomogenousOperation((QuantityHomogenousOperation)value, diagnostics, context);
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION:
				return validateQuantityScalarOperation((QuantityScalarOperation)value, diagnostics, context);
			case RaspiroverPackage.NUMERIC_OPERATOR:
				return validateNumericOperator((NumericOperator)value, diagnostics, context);
			case RaspiroverPackage.STRING_OPERATOR:
				return validateStringOperator((StringOperator)value, diagnostics, context);
			case RaspiroverPackage.BOOLEAN_OPERATOR:
				return validateBooleanOperator((BooleanOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRasPiBoard(RasPiBoard rasPiBoard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rasPiBoard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(board, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSketch(Sketch sketch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sketch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalPin(DigitalPin digitalPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArduinoDigitalModule(ArduinoDigitalModule arduinoDigitalModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arduinoDigitalModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArduinoModule(ArduinoModule arduinoModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arduinoModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(module, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogPin(AnalogPin analogPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analogPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArduinoAnalogModule(ArduinoAnalogModule arduinoAnalogModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arduinoAnalogModule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoverProgram(RoverProgram roverProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roverProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParam(Param param, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(param, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatement(Statement statement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarAssignment(VarAssignment varAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditional(Conditional conditional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRclBlock(RclBlock rclBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rclBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemperatureQuery(TemperatureQuery temperatureQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temperatureQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumidityQuery(HumidityQuery humidityQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humidityQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageQuery(MessageQuery messageQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstacleQuery(ObstacleQuery obstacleQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obstacleQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoverExpression(RoverExpression roverExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roverExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericExpression(NumericExpression numericExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpression(BooleanExpression booleanExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoverValue(RoverValue roverValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roverValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberValue(NumberValue numberValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringValue(StringValue stringValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanValue(BooleanValue booleanValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForwardAction(ForwardAction forwardAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forwardAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForwardMinAction(ForwardMinAction forwardMinAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forwardMinAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackwardAction(BackwardAction backwardAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backwardAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackwardMinAction(BackwardMinAction backwardMinAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backwardMinAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnAction(TurnAction turnAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnDegAction(TurnDegAction turnDegAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnDegAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopAction(StopAction stopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogAction(LogAction logAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendAction(SendAction sendAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarRef(VarRef varRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthUnit(LengthUnit lengthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentimeter(Centimeter centimeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centimeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMillimeter(Millimeter millimeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(millimeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeter(Meter meter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFoot(Foot foot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInch(Inch inch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYard(Yard yard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricSystemUnit(MetricSystemUnit metricSystemUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metricSystemUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImperialSystemUnit(ImperialSystemUnit imperialSystemUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imperialSystemUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleUnit(AngleUnit angleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadian(Radian radian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree(Degree degree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurn(Turn turn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradian(Gradian gradian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gradian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(length, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validateLength_LengthRequiresLengthUnit(length, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LengthRequiresLengthUnit constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_LengthRequiresLengthUnit(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "LengthRequiresLengthUnit", getObjectLabel(length, context) },
						 new Object[] { length },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(angle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle_AngleRequiresAngleUnit(angle, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AngleRequiresAngleUnit constraint of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle_AngleRequiresAngleUnit(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AngleRequiresAngleUnit", getObjectLabel(angle, context) },
						 new Object[] { angle },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericValue(NumericValue numericValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityOperation(QuantityOperation quantityOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthOperation(LengthOperation lengthOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthAdd(LengthAdd lengthAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lengthAdd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validateLengthAdd_QuantityHomogenousOperationRequiresHomogenousQuantities(lengthAdd, diagnostics, context);
		return result;
	}

	/**
	 * Validates the QuantityHomogenousOperationRequiresHomogenousQuantities constraint of '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthAdd_QuantityHomogenousOperationRequiresHomogenousQuantities(LengthAdd lengthAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "QuantityHomogenousOperationRequiresHomogenousQuantities", getObjectLabel(lengthAdd, context) },
						 new Object[] { lengthAdd },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthSubtract(LengthSubtract lengthSubtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthSubtract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthScalarMultiply(LengthScalarMultiply lengthScalarMultiply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthScalarMultiply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthScalarDivide(LengthScalarDivide lengthScalarDivide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthScalarDivide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthEquals(LengthEquals lengthEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthEquals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthDistinct(LengthDistinct lengthDistinct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthDistinct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthSmaller(LengthSmaller lengthSmaller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthSmaller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthGreater(LengthGreater lengthGreater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthGreater, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleOperation(AngleOperation angleOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleAdd(AngleAdd angleAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleSubtract(AngleSubtract angleSubtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleSubtract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleScalarMultiply(AngleScalarMultiply angleScalarMultiply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleScalarMultiply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleScalarDivide(AngleScalarDivide angleScalarDivide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleScalarDivide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleEquals(AngleEquals angleEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleEquals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleDistinct(AngleDistinct angleDistinct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleDistinct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleSmaller(AngleSmaller angleSmaller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleSmaller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleGreater(AngleGreater angleGreater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleGreater, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityArithmeticOperation(QuantityArithmeticOperation quantityArithmeticOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityArithmeticOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparisonOperation(QuantityComparisonOperation quantityComparisonOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparisonOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityHomogenousOperation(QuantityHomogenousOperation quantityHomogenousOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityHomogenousOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityScalarOperation(QuantityScalarOperation quantityScalarOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityScalarOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericOperator(NumericOperator numericOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringOperator(StringOperator stringOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperator(BooleanOperator booleanOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RaspiroverValidator
