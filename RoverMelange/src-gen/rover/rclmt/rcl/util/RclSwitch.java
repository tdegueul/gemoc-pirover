/**
 */
package rover.rclmt.rcl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rover.rclmt.rcl.*;

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
 * @see rover.rclmt.rcl.RclPackage
 * @generated
 */
public class RclSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RclPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclSwitch() {
		if (modelPackage == null) {
			modelPackage = RclPackage.eINSTANCE;
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
			case RclPackage.ROVER_PROGRAM: {
				RoverProgram roverProgram = (RoverProgram)theEObject;
				T result = caseRoverProgram(roverProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseStatement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseStatement(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseStatement(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.TEMPERATURE_QUERY: {
				TemperatureQuery temperatureQuery = (TemperatureQuery)theEObject;
				T result = caseTemperatureQuery(temperatureQuery);
				if (result == null) result = caseQuery(temperatureQuery);
				if (result == null) result = caseNumberValue(temperatureQuery);
				if (result == null) result = caseRoverValue(temperatureQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.HUMIDITY_QUERY: {
				HumidityQuery humidityQuery = (HumidityQuery)theEObject;
				T result = caseHumidityQuery(humidityQuery);
				if (result == null) result = caseQuery(humidityQuery);
				if (result == null) result = caseNumberValue(humidityQuery);
				if (result == null) result = caseRoverValue(humidityQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.MESSAGE_QUERY: {
				MessageQuery messageQuery = (MessageQuery)theEObject;
				T result = caseMessageQuery(messageQuery);
				if (result == null) result = caseQuery(messageQuery);
				if (result == null) result = caseStringValue(messageQuery);
				if (result == null) result = caseRoverValue(messageQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.OBSTACLE_QUERY: {
				ObstacleQuery obstacleQuery = (ObstacleQuery)theEObject;
				T result = caseObstacleQuery(obstacleQuery);
				if (result == null) result = caseQuery(obstacleQuery);
				if (result == null) result = caseBooleanValue(obstacleQuery);
				if (result == null) result = caseRoverValue(obstacleQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.ROVER_EXPRESSION: {
				RoverExpression roverExpression = (RoverExpression)theEObject;
				T result = caseRoverExpression(roverExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.NUMERIC_EXPRESSION: {
				NumericExpression numericExpression = (NumericExpression)theEObject;
				T result = caseNumericExpression(numericExpression);
				if (result == null) result = caseRoverExpression(numericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseRoverExpression(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseRoverExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.ROVER_VALUE: {
				RoverValue roverValue = (RoverValue)theEObject;
				T result = caseRoverValue(roverValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T result = caseNumberValue(numberValue);
				if (result == null) result = caseRoverValue(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseRoverValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseRoverValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseStatement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.FORWARD_ACTION: {
				ForwardAction forwardAction = (ForwardAction)theEObject;
				T result = caseForwardAction(forwardAction);
				if (result == null) result = caseAction(forwardAction);
				if (result == null) result = caseStatement(forwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.FORWARD_MIN_ACTION: {
				ForwardMinAction forwardMinAction = (ForwardMinAction)theEObject;
				T result = caseForwardMinAction(forwardMinAction);
				if (result == null) result = caseAction(forwardMinAction);
				if (result == null) result = caseStatement(forwardMinAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.BACKWARD_ACTION: {
				BackwardAction backwardAction = (BackwardAction)theEObject;
				T result = caseBackwardAction(backwardAction);
				if (result == null) result = caseAction(backwardAction);
				if (result == null) result = caseStatement(backwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.BACKWARD_MIN_ACTION: {
				BackwardMinAction backwardMinAction = (BackwardMinAction)theEObject;
				T result = caseBackwardMinAction(backwardMinAction);
				if (result == null) result = caseAction(backwardMinAction);
				if (result == null) result = caseStatement(backwardMinAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.TURN_ACTION: {
				TurnAction turnAction = (TurnAction)theEObject;
				T result = caseTurnAction(turnAction);
				if (result == null) result = caseAction(turnAction);
				if (result == null) result = caseStatement(turnAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.TURN_DEG_ACTION: {
				TurnDegAction turnDegAction = (TurnDegAction)theEObject;
				T result = caseTurnDegAction(turnDegAction);
				if (result == null) result = caseAction(turnDegAction);
				if (result == null) result = caseStatement(turnDegAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.STOP_ACTION: {
				StopAction stopAction = (StopAction)theEObject;
				T result = caseStopAction(stopAction);
				if (result == null) result = caseAction(stopAction);
				if (result == null) result = caseStatement(stopAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.LOG_ACTION: {
				LogAction logAction = (LogAction)theEObject;
				T result = caseLogAction(logAction);
				if (result == null) result = caseAction(logAction);
				if (result == null) result = caseStatement(logAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.SEND_ACTION: {
				SendAction sendAction = (SendAction)theEObject;
				T result = caseSendAction(sendAction);
				if (result == null) result = caseAction(sendAction);
				if (result == null) result = caseStatement(sendAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RclPackage.VAR_REF: {
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
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
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

} //RclSwitch
