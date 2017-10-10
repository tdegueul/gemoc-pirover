/**
 */
package rover.raspirovermt.raspirover;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rover.raspirovermt.raspirover.RaspiroverPackage
 * @generated
 */
public interface RaspiroverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaspiroverFactory eINSTANCE = rover.raspirovermt.raspirover.impl.RaspiroverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ras Pi Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ras Pi Board</em>'.
	 * @generated
	 */
	RasPiBoard createRasPiBoard();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch</em>'.
	 * @generated
	 */
	Sketch createSketch();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Digital Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Pin</em>'.
	 * @generated
	 */
	DigitalPin createDigitalPin();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Analog Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Pin</em>'.
	 * @generated
	 */
	AnalogPin createAnalogPin();

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
	 * Returns a new object of class '<em>Var Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Assignment</em>'.
	 * @generated
	 */
	VarAssignment createVarAssignment();

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
	 * Returns a new object of class '<em>Rcl Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rcl Block</em>'.
	 * @generated
	 */
	RclBlock createRclBlock();

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
	 * Returns a new object of class '<em>Centimeter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centimeter</em>'.
	 * @generated
	 */
	Centimeter createCentimeter();

	/**
	 * Returns a new object of class '<em>Millimeter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Millimeter</em>'.
	 * @generated
	 */
	Millimeter createMillimeter();

	/**
	 * Returns a new object of class '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter</em>'.
	 * @generated
	 */
	Meter createMeter();

	/**
	 * Returns a new object of class '<em>Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foot</em>'.
	 * @generated
	 */
	Foot createFoot();

	/**
	 * Returns a new object of class '<em>Inch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inch</em>'.
	 * @generated
	 */
	Inch createInch();

	/**
	 * Returns a new object of class '<em>Yard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yard</em>'.
	 * @generated
	 */
	Yard createYard();

	/**
	 * Returns a new object of class '<em>Radian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radian</em>'.
	 * @generated
	 */
	Radian createRadian();

	/**
	 * Returns a new object of class '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree</em>'.
	 * @generated
	 */
	Degree createDegree();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Gradian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gradian</em>'.
	 * @generated
	 */
	Gradian createGradian();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle</em>'.
	 * @generated
	 */
	Angle createAngle();

	/**
	 * Returns a new object of class '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Add</em>'.
	 * @generated
	 */
	LengthAdd createLengthAdd();

	/**
	 * Returns a new object of class '<em>Length Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Subtract</em>'.
	 * @generated
	 */
	LengthSubtract createLengthSubtract();

	/**
	 * Returns a new object of class '<em>Length Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Scalar Multiply</em>'.
	 * @generated
	 */
	LengthScalarMultiply createLengthScalarMultiply();

	/**
	 * Returns a new object of class '<em>Length Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Scalar Divide</em>'.
	 * @generated
	 */
	LengthScalarDivide createLengthScalarDivide();

	/**
	 * Returns a new object of class '<em>Length Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Equals</em>'.
	 * @generated
	 */
	LengthEquals createLengthEquals();

	/**
	 * Returns a new object of class '<em>Length Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Distinct</em>'.
	 * @generated
	 */
	LengthDistinct createLengthDistinct();

	/**
	 * Returns a new object of class '<em>Length Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Smaller</em>'.
	 * @generated
	 */
	LengthSmaller createLengthSmaller();

	/**
	 * Returns a new object of class '<em>Length Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Greater</em>'.
	 * @generated
	 */
	LengthGreater createLengthGreater();

	/**
	 * Returns a new object of class '<em>Angle Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Add</em>'.
	 * @generated
	 */
	AngleAdd createAngleAdd();

	/**
	 * Returns a new object of class '<em>Angle Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Subtract</em>'.
	 * @generated
	 */
	AngleSubtract createAngleSubtract();

	/**
	 * Returns a new object of class '<em>Angle Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Scalar Multiply</em>'.
	 * @generated
	 */
	AngleScalarMultiply createAngleScalarMultiply();

	/**
	 * Returns a new object of class '<em>Angle Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Scalar Divide</em>'.
	 * @generated
	 */
	AngleScalarDivide createAngleScalarDivide();

	/**
	 * Returns a new object of class '<em>Angle Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Equals</em>'.
	 * @generated
	 */
	AngleEquals createAngleEquals();

	/**
	 * Returns a new object of class '<em>Angle Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Distinct</em>'.
	 * @generated
	 */
	AngleDistinct createAngleDistinct();

	/**
	 * Returns a new object of class '<em>Angle Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Smaller</em>'.
	 * @generated
	 */
	AngleSmaller createAngleSmaller();

	/**
	 * Returns a new object of class '<em>Angle Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Greater</em>'.
	 * @generated
	 */
	AngleGreater createAngleGreater();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RaspiroverPackage getRaspiroverPackage();

} //RaspiroverFactory
