/**
 */
package rover.raspirover.raspirover.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rover.raspirover.raspirover.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rover.raspirover.raspirover.RaspiroverPackage
 * @generated
 */
public class RaspiroverSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RaspiroverPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaspiroverSwitch() {
		if (modelPackage == null) {
			modelPackage = RaspiroverPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RaspiroverPackage.RAS_PI_BOARD: {
				RasPiBoard rasPiBoard = (RasPiBoard)theEObject;
				T result = caseRasPiBoard(rasPiBoard);
				if (result == null) result = caseBoard(rasPiBoard);
				if (result == null) result = caseNamedElement(rasPiBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BOARD: {
				Board board = (Board)theEObject;
				T result = caseBoard(board);
				if (result == null) result = caseNamedElement(board);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.SKETCH: {
				Sketch sketch = (Sketch)theEObject;
				T result = caseSketch(sketch);
				if (result == null) result = caseNamedElement(sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.DIGITAL_PIN: {
				DigitalPin digitalPin = (DigitalPin)theEObject;
				T result = caseDigitalPin(digitalPin);
				if (result == null) result = casePin(digitalPin);
				if (result == null) result = caseNamedElement(digitalPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ARDUINO_DIGITAL_MODULE: {
				ArduinoDigitalModule arduinoDigitalModule = (ArduinoDigitalModule)theEObject;
				T result = caseArduinoDigitalModule(arduinoDigitalModule);
				if (result == null) result = caseArduinoModule(arduinoDigitalModule);
				if (result == null) result = caseModule(arduinoDigitalModule);
				if (result == null) result = caseNamedElement(arduinoDigitalModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ARDUINO_MODULE: {
				ArduinoModule arduinoModule = (ArduinoModule)theEObject;
				T result = caseArduinoModule(arduinoModule);
				if (result == null) result = caseModule(arduinoModule);
				if (result == null) result = caseNamedElement(arduinoModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANALOG_PIN: {
				AnalogPin analogPin = (AnalogPin)theEObject;
				T result = caseAnalogPin(analogPin);
				if (result == null) result = casePin(analogPin);
				if (result == null) result = caseNamedElement(analogPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ARDUINO_ANALOG_MODULE: {
				ArduinoAnalogModule arduinoAnalogModule = (ArduinoAnalogModule)theEObject;
				T result = caseArduinoAnalogModule(arduinoAnalogModule);
				if (result == null) result = caseArduinoModule(arduinoAnalogModule);
				if (result == null) result = caseModule(arduinoAnalogModule);
				if (result == null) result = caseNamedElement(arduinoAnalogModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ROVER_PROGRAM: {
				RoverProgram roverProgram = (RoverProgram)theEObject;
				T result = caseRoverProgram(roverProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.VAR_ASSIGNMENT: {
				VarAssignment varAssignment = (VarAssignment)theEObject;
				T result = caseVarAssignment(varAssignment);
				if (result == null) result = caseStatement(varAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseStatement(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseStatement(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.RCL_BLOCK: {
				RclBlock rclBlock = (RclBlock)theEObject;
				T result = caseRclBlock(rclBlock);
				if (result == null) result = caseStatement(rclBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.TEMPERATURE_QUERY: {
				TemperatureQuery temperatureQuery = (TemperatureQuery)theEObject;
				T result = caseTemperatureQuery(temperatureQuery);
				if (result == null) result = caseQuery(temperatureQuery);
				if (result == null) result = caseNumberValue(temperatureQuery);
				if (result == null) result = caseRoverValue(temperatureQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.HUMIDITY_QUERY: {
				HumidityQuery humidityQuery = (HumidityQuery)theEObject;
				T result = caseHumidityQuery(humidityQuery);
				if (result == null) result = caseQuery(humidityQuery);
				if (result == null) result = caseNumberValue(humidityQuery);
				if (result == null) result = caseRoverValue(humidityQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.MESSAGE_QUERY: {
				MessageQuery messageQuery = (MessageQuery)theEObject;
				T result = caseMessageQuery(messageQuery);
				if (result == null) result = caseQuery(messageQuery);
				if (result == null) result = caseStringValue(messageQuery);
				if (result == null) result = caseRoverValue(messageQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.OBSTACLE_QUERY: {
				ObstacleQuery obstacleQuery = (ObstacleQuery)theEObject;
				T result = caseObstacleQuery(obstacleQuery);
				if (result == null) result = caseQuery(obstacleQuery);
				if (result == null) result = caseBooleanValue(obstacleQuery);
				if (result == null) result = caseRoverValue(obstacleQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ROVER_EXPRESSION: {
				RoverExpression roverExpression = (RoverExpression)theEObject;
				T result = caseRoverExpression(roverExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.NUMERIC_EXPRESSION: {
				NumericExpression numericExpression = (NumericExpression)theEObject;
				T result = caseNumericExpression(numericExpression);
				if (result == null) result = caseRoverExpression(numericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseRoverExpression(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseRoverExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ROVER_VALUE: {
				RoverValue roverValue = (RoverValue)theEObject;
				T result = caseRoverValue(roverValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T result = caseNumberValue(numberValue);
				if (result == null) result = caseRoverValue(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseRoverValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseRoverValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseStatement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.FORWARD_ACTION: {
				ForwardAction forwardAction = (ForwardAction)theEObject;
				T result = caseForwardAction(forwardAction);
				if (result == null) result = caseAction(forwardAction);
				if (result == null) result = caseStatement(forwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.FORWARD_MIN_ACTION: {
				ForwardMinAction forwardMinAction = (ForwardMinAction)theEObject;
				T result = caseForwardMinAction(forwardMinAction);
				if (result == null) result = caseAction(forwardMinAction);
				if (result == null) result = caseStatement(forwardMinAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BACKWARD_ACTION: {
				BackwardAction backwardAction = (BackwardAction)theEObject;
				T result = caseBackwardAction(backwardAction);
				if (result == null) result = caseAction(backwardAction);
				if (result == null) result = caseStatement(backwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.BACKWARD_MIN_ACTION: {
				BackwardMinAction backwardMinAction = (BackwardMinAction)theEObject;
				T result = caseBackwardMinAction(backwardMinAction);
				if (result == null) result = caseAction(backwardMinAction);
				if (result == null) result = caseStatement(backwardMinAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.TURN_ACTION: {
				TurnAction turnAction = (TurnAction)theEObject;
				T result = caseTurnAction(turnAction);
				if (result == null) result = caseAction(turnAction);
				if (result == null) result = caseStatement(turnAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.TURN_DEG_ACTION: {
				TurnDegAction turnDegAction = (TurnDegAction)theEObject;
				T result = caseTurnDegAction(turnDegAction);
				if (result == null) result = caseAction(turnDegAction);
				if (result == null) result = caseStatement(turnDegAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAction(stopAction);
				if (result == null) result = caseStatement(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LOG_ACTION: {
				LogAction logAction = (LogAction)theEObject;
				T result = caseLogAction(logAction);
				if (result == null) result = caseAction(logAction);
				if (result == null) result = caseStatement(logAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.SEND_ACTION: {
				SendAction sendAction = (SendAction)theEObject;
				T result = caseSendAction(sendAction);
				if (result == null) result = caseAction(sendAction);
				if (result == null) result = caseStatement(sendAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.VAR_REF: {
				VarRef varRef = (VarRef)theEObject;
				T result = caseVarRef(varRef);
				if (result == null) result = caseBooleanValue(varRef);
				if (result == null) result = caseNumberValue(varRef);
				if (result == null) result = caseStringValue(varRef);
				if (result == null) result = caseStatement(varRef);
				if (result == null) result = caseRoverValue(varRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_UNIT: {
				LengthUnit lengthUnit = (LengthUnit)theEObject;
				T result = caseLengthUnit(lengthUnit);
				if (result == null) result = caseUnit(lengthUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.CENTIMETER: {
				Centimeter centimeter = (Centimeter)theEObject;
				T result = caseCentimeter(centimeter);
				if (result == null) result = caseMetricSystemUnit(centimeter);
				if (result == null) result = caseLengthUnit(centimeter);
				if (result == null) result = caseUnit(centimeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.MILLIMETER: {
				Millimeter millimeter = (Millimeter)theEObject;
				T result = caseMillimeter(millimeter);
				if (result == null) result = caseMetricSystemUnit(millimeter);
				if (result == null) result = caseLengthUnit(millimeter);
				if (result == null) result = caseUnit(millimeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseMetricSystemUnit(meter);
				if (result == null) result = caseLengthUnit(meter);
				if (result == null) result = caseUnit(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.FOOT: {
				Foot foot = (Foot)theEObject;
				T result = caseFoot(foot);
				if (result == null) result = caseImperialSystemUnit(foot);
				if (result == null) result = caseLengthUnit(foot);
				if (result == null) result = caseUnit(foot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.INCH: {
				Inch inch = (Inch)theEObject;
				T result = caseInch(inch);
				if (result == null) result = caseImperialSystemUnit(inch);
				if (result == null) result = caseLengthUnit(inch);
				if (result == null) result = caseUnit(inch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.YARD: {
				Yard yard = (Yard)theEObject;
				T result = caseYard(yard);
				if (result == null) result = caseImperialSystemUnit(yard);
				if (result == null) result = caseLengthUnit(yard);
				if (result == null) result = caseUnit(yard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.METRIC_SYSTEM_UNIT: {
				MetricSystemUnit metricSystemUnit = (MetricSystemUnit)theEObject;
				T result = caseMetricSystemUnit(metricSystemUnit);
				if (result == null) result = caseUnit(metricSystemUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.IMPERIAL_SYSTEM_UNIT: {
				ImperialSystemUnit imperialSystemUnit = (ImperialSystemUnit)theEObject;
				T result = caseImperialSystemUnit(imperialSystemUnit);
				if (result == null) result = caseUnit(imperialSystemUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_UNIT: {
				AngleUnit angleUnit = (AngleUnit)theEObject;
				T result = caseAngleUnit(angleUnit);
				if (result == null) result = caseUnit(angleUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.RADIAN: {
				Radian radian = (Radian)theEObject;
				T result = caseRadian(radian);
				if (result == null) result = caseAngleUnit(radian);
				if (result == null) result = caseUnit(radian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.DEGREE: {
				Degree degree = (Degree)theEObject;
				T result = caseDegree(degree);
				if (result == null) result = caseAngleUnit(degree);
				if (result == null) result = caseUnit(degree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.TURN: {
				Turn turn = (Turn)theEObject;
				T result = caseTurn(turn);
				if (result == null) result = caseAngleUnit(turn);
				if (result == null) result = caseUnit(turn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.GRADIAN: {
				Gradian gradian = (Gradian)theEObject;
				T result = caseGradian(gradian);
				if (result == null) result = caseAngleUnit(gradian);
				if (result == null) result = caseUnit(gradian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseQuantity(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE: {
				Angle angle = (Angle)theEObject;
				T result = caseAngle(angle);
				if (result == null) result = caseQuantity(angle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T result = caseNumericValue(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY_OPERATION: {
				QuantityOperation quantityOperation = (QuantityOperation)theEObject;
				T result = caseQuantityOperation(quantityOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_OPERATION: {
				LengthOperation lengthOperation = (LengthOperation)theEObject;
				T result = caseLengthOperation(lengthOperation);
				if (result == null) result = caseQuantityOperation(lengthOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_ADD: {
				LengthAdd lengthAdd = (LengthAdd)theEObject;
				T result = caseLengthAdd(lengthAdd);
				if (result == null) result = caseLengthOperation(lengthAdd);
				if (result == null) result = caseQuantityHomogenousOperation(lengthAdd);
				if (result == null) result = caseQuantityOperation(lengthAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_SUBTRACT: {
				LengthSubtract lengthSubtract = (LengthSubtract)theEObject;
				T result = caseLengthSubtract(lengthSubtract);
				if (result == null) result = caseLengthOperation(lengthSubtract);
				if (result == null) result = caseQuantityHomogenousOperation(lengthSubtract);
				if (result == null) result = caseQuantityOperation(lengthSubtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY: {
				LengthScalarMultiply lengthScalarMultiply = (LengthScalarMultiply)theEObject;
				T result = caseLengthScalarMultiply(lengthScalarMultiply);
				if (result == null) result = caseLengthOperation(lengthScalarMultiply);
				if (result == null) result = caseQuantityScalarOperation(lengthScalarMultiply);
				if (result == null) result = caseQuantityOperation(lengthScalarMultiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_SCALAR_DIVIDE: {
				LengthScalarDivide lengthScalarDivide = (LengthScalarDivide)theEObject;
				T result = caseLengthScalarDivide(lengthScalarDivide);
				if (result == null) result = caseLengthOperation(lengthScalarDivide);
				if (result == null) result = caseQuantityScalarOperation(lengthScalarDivide);
				if (result == null) result = caseQuantityOperation(lengthScalarDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_EQUALS: {
				LengthEquals lengthEquals = (LengthEquals)theEObject;
				T result = caseLengthEquals(lengthEquals);
				if (result == null) result = caseLengthOperation(lengthEquals);
				if (result == null) result = caseQuantityHomogenousOperation(lengthEquals);
				if (result == null) result = caseQuantityOperation(lengthEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_DISTINCT: {
				LengthDistinct lengthDistinct = (LengthDistinct)theEObject;
				T result = caseLengthDistinct(lengthDistinct);
				if (result == null) result = caseLengthOperation(lengthDistinct);
				if (result == null) result = caseQuantityHomogenousOperation(lengthDistinct);
				if (result == null) result = caseQuantityOperation(lengthDistinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_SMALLER: {
				LengthSmaller lengthSmaller = (LengthSmaller)theEObject;
				T result = caseLengthSmaller(lengthSmaller);
				if (result == null) result = caseLengthOperation(lengthSmaller);
				if (result == null) result = caseQuantityHomogenousOperation(lengthSmaller);
				if (result == null) result = caseQuantityOperation(lengthSmaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.LENGTH_GREATER: {
				LengthGreater lengthGreater = (LengthGreater)theEObject;
				T result = caseLengthGreater(lengthGreater);
				if (result == null) result = caseLengthOperation(lengthGreater);
				if (result == null) result = caseQuantityHomogenousOperation(lengthGreater);
				if (result == null) result = caseQuantityOperation(lengthGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_OPERATION: {
				AngleOperation angleOperation = (AngleOperation)theEObject;
				T result = caseAngleOperation(angleOperation);
				if (result == null) result = caseQuantityOperation(angleOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_ADD: {
				AngleAdd angleAdd = (AngleAdd)theEObject;
				T result = caseAngleAdd(angleAdd);
				if (result == null) result = caseAngleOperation(angleAdd);
				if (result == null) result = caseQuantityHomogenousOperation(angleAdd);
				if (result == null) result = caseQuantityOperation(angleAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_SUBTRACT: {
				AngleSubtract angleSubtract = (AngleSubtract)theEObject;
				T result = caseAngleSubtract(angleSubtract);
				if (result == null) result = caseAngleOperation(angleSubtract);
				if (result == null) result = caseQuantityHomogenousOperation(angleSubtract);
				if (result == null) result = caseQuantityOperation(angleSubtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY: {
				AngleScalarMultiply angleScalarMultiply = (AngleScalarMultiply)theEObject;
				T result = caseAngleScalarMultiply(angleScalarMultiply);
				if (result == null) result = caseAngleOperation(angleScalarMultiply);
				if (result == null) result = caseQuantityScalarOperation(angleScalarMultiply);
				if (result == null) result = caseQuantityOperation(angleScalarMultiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_SCALAR_DIVIDE: {
				AngleScalarDivide angleScalarDivide = (AngleScalarDivide)theEObject;
				T result = caseAngleScalarDivide(angleScalarDivide);
				if (result == null) result = caseAngleOperation(angleScalarDivide);
				if (result == null) result = caseQuantityScalarOperation(angleScalarDivide);
				if (result == null) result = caseQuantityOperation(angleScalarDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_EQUALS: {
				AngleEquals angleEquals = (AngleEquals)theEObject;
				T result = caseAngleEquals(angleEquals);
				if (result == null) result = caseAngleOperation(angleEquals);
				if (result == null) result = caseQuantityHomogenousOperation(angleEquals);
				if (result == null) result = caseQuantityOperation(angleEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_DISTINCT: {
				AngleDistinct angleDistinct = (AngleDistinct)theEObject;
				T result = caseAngleDistinct(angleDistinct);
				if (result == null) result = caseAngleOperation(angleDistinct);
				if (result == null) result = caseQuantityHomogenousOperation(angleDistinct);
				if (result == null) result = caseQuantityOperation(angleDistinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_SMALLER: {
				AngleSmaller angleSmaller = (AngleSmaller)theEObject;
				T result = caseAngleSmaller(angleSmaller);
				if (result == null) result = caseAngleOperation(angleSmaller);
				if (result == null) result = caseQuantityHomogenousOperation(angleSmaller);
				if (result == null) result = caseQuantityOperation(angleSmaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.ANGLE_GREATER: {
				AngleGreater angleGreater = (AngleGreater)theEObject;
				T result = caseAngleGreater(angleGreater);
				if (result == null) result = caseAngleOperation(angleGreater);
				if (result == null) result = caseQuantityHomogenousOperation(angleGreater);
				if (result == null) result = caseQuantityOperation(angleGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY_ARITHMETIC_OPERATION: {
				QuantityArithmeticOperation quantityArithmeticOperation = (QuantityArithmeticOperation)theEObject;
				T result = caseQuantityArithmeticOperation(quantityArithmeticOperation);
				if (result == null) result = caseQuantityOperation(quantityArithmeticOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY_COMPARISON_OPERATION: {
				QuantityComparisonOperation quantityComparisonOperation = (QuantityComparisonOperation)theEObject;
				T result = caseQuantityComparisonOperation(quantityComparisonOperation);
				if (result == null) result = caseQuantityOperation(quantityComparisonOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION: {
				QuantityHomogenousOperation quantityHomogenousOperation = (QuantityHomogenousOperation)theEObject;
				T result = caseQuantityHomogenousOperation(quantityHomogenousOperation);
				if (result == null) result = caseQuantityOperation(quantityHomogenousOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION: {
				QuantityScalarOperation quantityScalarOperation = (QuantityScalarOperation)theEObject;
				T result = caseQuantityScalarOperation(quantityScalarOperation);
				if (result == null) result = caseQuantityOperation(quantityScalarOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ras Pi Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ras Pi Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasPiBoard(RasPiBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoard(Board object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalPin(DigitalPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Digital Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Digital Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoDigitalModule(ArduinoDigitalModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoModule(ArduinoModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogPin(AnalogPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Analog Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Analog Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoAnalogModule(ArduinoAnalogModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rover Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoverProgram(RoverProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarAssignment(VarAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rcl Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rcl Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRclBlock(RclBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureQuery(TemperatureQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidity Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidity Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumidityQuery(HumidityQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageQuery(MessageQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacleQuery(ObstacleQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rover Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoverExpression(RoverExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericExpression(NumericExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rover Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rover Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoverValue(RoverValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValue(NumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardAction(ForwardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward Min Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward Min Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardMinAction(ForwardMinAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackwardAction(BackwardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward Min Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward Min Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackwardMinAction(BackwardMinAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnAction(TurnAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Deg Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Deg Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnDegAction(TurnDegAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopAction(StopAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogAction(LogAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendAction(SendAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarRef(VarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthUnit(LengthUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centimeter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centimeter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentimeter(Centimeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Millimeter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Millimeter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMillimeter(Millimeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoot(Foot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInch(Inch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYard(Yard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric System Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric System Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricSystemUnit(MetricSystemUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperial System Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperial System Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperialSystemUnit(ImperialSystemUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleUnit(AngleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadian(Radian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree(Degree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradian(Gradian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngle(Angle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericValue(NumericValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityOperation(QuantityOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthOperation(LengthOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthAdd(LengthAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthSubtract(LengthSubtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Scalar Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthScalarMultiply(LengthScalarMultiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Scalar Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthScalarDivide(LengthScalarDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthEquals(LengthEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthDistinct(LengthDistinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Smaller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthSmaller(LengthSmaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthGreater(LengthGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleOperation(AngleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleAdd(AngleAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleSubtract(AngleSubtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Scalar Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleScalarMultiply(AngleScalarMultiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Scalar Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleScalarDivide(AngleScalarDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleEquals(AngleEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleDistinct(AngleDistinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Smaller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleSmaller(AngleSmaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleGreater(AngleGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Arithmetic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityArithmeticOperation(QuantityArithmeticOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Comparison Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Comparison Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityComparisonOperation(QuantityComparisonOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Homogenous Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Homogenous Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityHomogenousOperation(QuantityHomogenousOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Scalar Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Scalar Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityScalarOperation(QuantityScalarOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RaspiroverSwitch
