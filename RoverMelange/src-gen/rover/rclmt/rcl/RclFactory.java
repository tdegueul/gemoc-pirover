/**
 */
package rover.rclmt.rcl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rover.rclmt.rcl.RclPackage
 * @generated
 */
public interface RclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RclFactory eINSTANCE = rover.rclmt.rcl.impl.RclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rover Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Program</em>'.
	 * @generated
	 */
	RoverProgram createRoverProgram();

	/**
	 * Returns a new object of class '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param</em>'.
	 * @generated
	 */
	Param createParam();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional</em>'.
	 * @generated
	 */
	Conditional createConditional();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Temperature Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Query</em>'.
	 * @generated
	 */
	TemperatureQuery createTemperatureQuery();

	/**
	 * Returns a new object of class '<em>Humidity Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humidity Query</em>'.
	 * @generated
	 */
	HumidityQuery createHumidityQuery();

	/**
	 * Returns a new object of class '<em>Message Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Query</em>'.
	 * @generated
	 */
	MessageQuery createMessageQuery();

	/**
	 * Returns a new object of class '<em>Obstacle Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle Query</em>'.
	 * @generated
	 */
	ObstacleQuery createObstacleQuery();

	/**
	 * Returns a new object of class '<em>Numeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Expression</em>'.
	 * @generated
	 */
	NumericExpression createNumericExpression();

	/**
	 * Returns a new object of class '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Expression</em>'.
	 * @generated
	 */
	StringExpression createStringExpression();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Rover Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rover Value</em>'.
	 * @generated
	 */
	RoverValue createRoverValue();

	/**
	 * Returns a new object of class '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value</em>'.
	 * @generated
	 */
	NumberValue createNumberValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Action</em>'.
	 * @generated
	 */
	ForwardAction createForwardAction();

	/**
	 * Returns a new object of class '<em>Forward Min Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Min Action</em>'.
	 * @generated
	 */
	ForwardMinAction createForwardMinAction();

	/**
	 * Returns a new object of class '<em>Backward Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backward Action</em>'.
	 * @generated
	 */
	BackwardAction createBackwardAction();

	/**
	 * Returns a new object of class '<em>Backward Min Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backward Min Action</em>'.
	 * @generated
	 */
	BackwardMinAction createBackwardMinAction();

	/**
	 * Returns a new object of class '<em>Turn Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Action</em>'.
	 * @generated
	 */
	TurnAction createTurnAction();

	/**
	 * Returns a new object of class '<em>Turn Deg Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Deg Action</em>'.
	 * @generated
	 */
	TurnDegAction createTurnDegAction();

	/**
	 * Returns a new object of class '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Action</em>'.
	 * @generated
	 */
	StopAction createStopAction();

	/**
	 * Returns a new object of class '<em>Log Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Action</em>'.
	 * @generated
	 */
	LogAction createLogAction();

	/**
	 * Returns a new object of class '<em>Send Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Action</em>'.
	 * @generated
	 */
	SendAction createSendAction();

	/**
	 * Returns a new object of class '<em>Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Ref</em>'.
	 * @generated
	 */
	VarRef createVarRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RclPackage getRclPackage();

} //RclFactory
