/**
 */
package rover.raspirovermt.raspirover.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rover.raspirovermt.raspirover.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rover.raspirovermt.raspirover.RaspiroverPackage
 * @generated
 */
public class RaspiroverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RaspiroverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaspiroverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RaspiroverPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaspiroverSwitch<Adapter> modelSwitch =
		new RaspiroverSwitch<Adapter>() {
			@Override
			public Adapter caseRasPiBoard(RasPiBoard object) {
				return createRasPiBoardAdapter();
			}
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseSketch(Sketch object) {
				return createSketchAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseDigitalPin(DigitalPin object) {
				return createDigitalPinAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseArduinoDigitalModule(ArduinoDigitalModule object) {
				return createArduinoDigitalModuleAdapter();
			}
			@Override
			public Adapter caseArduinoModule(ArduinoModule object) {
				return createArduinoModuleAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseAnalogPin(AnalogPin object) {
				return createAnalogPinAdapter();
			}
			@Override
			public Adapter caseArduinoAnalogModule(ArduinoAnalogModule object) {
				return createArduinoAnalogModuleAdapter();
			}
			@Override
			public Adapter caseRoverProgram(RoverProgram object) {
				return createRoverProgramAdapter();
			}
			@Override
			public Adapter caseParam(Param object) {
				return createParamAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseVarAssignment(VarAssignment object) {
				return createVarAssignmentAdapter();
			}
			@Override
			public Adapter caseConditional(Conditional object) {
				return createConditionalAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseRclBlock(RclBlock object) {
				return createRclBlockAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseTemperatureQuery(TemperatureQuery object) {
				return createTemperatureQueryAdapter();
			}
			@Override
			public Adapter caseHumidityQuery(HumidityQuery object) {
				return createHumidityQueryAdapter();
			}
			@Override
			public Adapter caseMessageQuery(MessageQuery object) {
				return createMessageQueryAdapter();
			}
			@Override
			public Adapter caseObstacleQuery(ObstacleQuery object) {
				return createObstacleQueryAdapter();
			}
			@Override
			public Adapter caseRoverExpression(RoverExpression object) {
				return createRoverExpressionAdapter();
			}
			@Override
			public Adapter caseNumericExpression(NumericExpression object) {
				return createNumericExpressionAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseRoverValue(RoverValue object) {
				return createRoverValueAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseForwardAction(ForwardAction object) {
				return createForwardActionAdapter();
			}
			@Override
			public Adapter caseForwardMinAction(ForwardMinAction object) {
				return createForwardMinActionAdapter();
			}
			@Override
			public Adapter caseBackwardAction(BackwardAction object) {
				return createBackwardActionAdapter();
			}
			@Override
			public Adapter caseBackwardMinAction(BackwardMinAction object) {
				return createBackwardMinActionAdapter();
			}
			@Override
			public Adapter caseTurnAction(TurnAction object) {
				return createTurnActionAdapter();
			}
			@Override
			public Adapter caseTurnDegAction(TurnDegAction object) {
				return createTurnDegActionAdapter();
			}
			@Override
			public Adapter caseStopAction(StopAction object) {
				return createStopActionAdapter();
			}
			@Override
			public Adapter caseLogAction(LogAction object) {
				return createLogActionAdapter();
			}
			@Override
			public Adapter caseSendAction(SendAction object) {
				return createSendActionAdapter();
			}
			@Override
			public Adapter caseVarRef(VarRef object) {
				return createVarRefAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseLengthUnit(LengthUnit object) {
				return createLengthUnitAdapter();
			}
			@Override
			public Adapter caseCentimeter(Centimeter object) {
				return createCentimeterAdapter();
			}
			@Override
			public Adapter caseMillimeter(Millimeter object) {
				return createMillimeterAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseFoot(Foot object) {
				return createFootAdapter();
			}
			@Override
			public Adapter caseInch(Inch object) {
				return createInchAdapter();
			}
			@Override
			public Adapter caseYard(Yard object) {
				return createYardAdapter();
			}
			@Override
			public Adapter caseMetricSystemUnit(MetricSystemUnit object) {
				return createMetricSystemUnitAdapter();
			}
			@Override
			public Adapter caseImperialSystemUnit(ImperialSystemUnit object) {
				return createImperialSystemUnitAdapter();
			}
			@Override
			public Adapter caseAngleUnit(AngleUnit object) {
				return createAngleUnitAdapter();
			}
			@Override
			public Adapter caseRadian(Radian object) {
				return createRadianAdapter();
			}
			@Override
			public Adapter caseDegree(Degree object) {
				return createDegreeAdapter();
			}
			@Override
			public Adapter caseTurn(Turn object) {
				return createTurnAdapter();
			}
			@Override
			public Adapter caseGradian(Gradian object) {
				return createGradianAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseLength(Length object) {
				return createLengthAdapter();
			}
			@Override
			public Adapter caseAngle(Angle object) {
				return createAngleAdapter();
			}
			@Override
			public Adapter caseQuantityOperation(QuantityOperation object) {
				return createQuantityOperationAdapter();
			}
			@Override
			public Adapter caseLengthOperation(LengthOperation object) {
				return createLengthOperationAdapter();
			}
			@Override
			public Adapter caseLengthAdd(LengthAdd object) {
				return createLengthAddAdapter();
			}
			@Override
			public Adapter caseLengthSubtract(LengthSubtract object) {
				return createLengthSubtractAdapter();
			}
			@Override
			public Adapter caseLengthScalarMultiply(LengthScalarMultiply object) {
				return createLengthScalarMultiplyAdapter();
			}
			@Override
			public Adapter caseLengthScalarDivide(LengthScalarDivide object) {
				return createLengthScalarDivideAdapter();
			}
			@Override
			public Adapter caseLengthEquals(LengthEquals object) {
				return createLengthEqualsAdapter();
			}
			@Override
			public Adapter caseLengthDistinct(LengthDistinct object) {
				return createLengthDistinctAdapter();
			}
			@Override
			public Adapter caseLengthSmaller(LengthSmaller object) {
				return createLengthSmallerAdapter();
			}
			@Override
			public Adapter caseLengthGreater(LengthGreater object) {
				return createLengthGreaterAdapter();
			}
			@Override
			public Adapter caseAngleOperation(AngleOperation object) {
				return createAngleOperationAdapter();
			}
			@Override
			public Adapter caseAngleAdd(AngleAdd object) {
				return createAngleAddAdapter();
			}
			@Override
			public Adapter caseAngleSubtract(AngleSubtract object) {
				return createAngleSubtractAdapter();
			}
			@Override
			public Adapter caseAngleScalarMultiply(AngleScalarMultiply object) {
				return createAngleScalarMultiplyAdapter();
			}
			@Override
			public Adapter caseAngleScalarDivide(AngleScalarDivide object) {
				return createAngleScalarDivideAdapter();
			}
			@Override
			public Adapter caseAngleEquals(AngleEquals object) {
				return createAngleEqualsAdapter();
			}
			@Override
			public Adapter caseAngleDistinct(AngleDistinct object) {
				return createAngleDistinctAdapter();
			}
			@Override
			public Adapter caseAngleSmaller(AngleSmaller object) {
				return createAngleSmallerAdapter();
			}
			@Override
			public Adapter caseAngleGreater(AngleGreater object) {
				return createAngleGreaterAdapter();
			}
			@Override
			public Adapter caseQuantityArithmeticOperation(QuantityArithmeticOperation object) {
				return createQuantityArithmeticOperationAdapter();
			}
			@Override
			public Adapter caseQuantityComparisonOperation(QuantityComparisonOperation object) {
				return createQuantityComparisonOperationAdapter();
			}
			@Override
			public Adapter caseQuantityHomogenousOperation(QuantityHomogenousOperation object) {
				return createQuantityHomogenousOperationAdapter();
			}
			@Override
			public Adapter caseQuantityScalarOperation(QuantityScalarOperation object) {
				return createQuantityScalarOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.RasPiBoard <em>Ras Pi Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.RasPiBoard
	 * @generated
	 */
	public Adapter createRasPiBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.DigitalPin
	 * @generated
	 */
	public Adapter createDigitalPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ArduinoDigitalModule <em>Arduino Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ArduinoDigitalModule
	 * @generated
	 */
	public Adapter createArduinoDigitalModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ArduinoModule <em>Arduino Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ArduinoModule
	 * @generated
	 */
	public Adapter createArduinoModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AnalogPin
	 * @generated
	 */
	public Adapter createAnalogPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ArduinoAnalogModule <em>Arduino Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ArduinoAnalogModule
	 * @generated
	 */
	public Adapter createArduinoAnalogModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.RoverProgram <em>Rover Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.RoverProgram
	 * @generated
	 */
	public Adapter createRoverProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.VarAssignment <em>Var Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.VarAssignment
	 * @generated
	 */
	public Adapter createVarAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.RclBlock <em>Rcl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.RclBlock
	 * @generated
	 */
	public Adapter createRclBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.TemperatureQuery <em>Temperature Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.TemperatureQuery
	 * @generated
	 */
	public Adapter createTemperatureQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.HumidityQuery <em>Humidity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.HumidityQuery
	 * @generated
	 */
	public Adapter createHumidityQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.MessageQuery <em>Message Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.MessageQuery
	 * @generated
	 */
	public Adapter createMessageQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ObstacleQuery <em>Obstacle Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ObstacleQuery
	 * @generated
	 */
	public Adapter createObstacleQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.RoverExpression <em>Rover Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.RoverExpression
	 * @generated
	 */
	public Adapter createRoverExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.NumericExpression
	 * @generated
	 */
	public Adapter createNumericExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.RoverValue <em>Rover Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.RoverValue
	 * @generated
	 */
	public Adapter createRoverValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ForwardAction <em>Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ForwardAction
	 * @generated
	 */
	public Adapter createForwardActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ForwardMinAction <em>Forward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ForwardMinAction
	 * @generated
	 */
	public Adapter createForwardMinActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.BackwardAction <em>Backward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.BackwardAction
	 * @generated
	 */
	public Adapter createBackwardActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.BackwardMinAction <em>Backward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.BackwardMinAction
	 * @generated
	 */
	public Adapter createBackwardMinActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.TurnAction <em>Turn Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.TurnAction
	 * @generated
	 */
	public Adapter createTurnActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.TurnDegAction <em>Turn Deg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.TurnDegAction
	 * @generated
	 */
	public Adapter createTurnDegActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.StopAction
	 * @generated
	 */
	public Adapter createStopActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LogAction <em>Log Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LogAction
	 * @generated
	 */
	public Adapter createLogActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.SendAction
	 * @generated
	 */
	public Adapter createSendActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.VarRef
	 * @generated
	 */
	public Adapter createVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthUnit
	 * @generated
	 */
	public Adapter createLengthUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Centimeter
	 * @generated
	 */
	public Adapter createCentimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Millimeter
	 * @generated
	 */
	public Adapter createMillimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Foot
	 * @generated
	 */
	public Adapter createFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Inch
	 * @generated
	 */
	public Adapter createInchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Yard
	 * @generated
	 */
	public Adapter createYardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.MetricSystemUnit
	 * @generated
	 */
	public Adapter createMetricSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.ImperialSystemUnit
	 * @generated
	 */
	public Adapter createImperialSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleUnit
	 * @generated
	 */
	public Adapter createAngleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Radian
	 * @generated
	 */
	public Adapter createRadianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Gradian
	 * @generated
	 */
	public Adapter createGradianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.Angle
	 * @generated
	 */
	public Adapter createAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.QuantityOperation
	 * @generated
	 */
	public Adapter createQuantityOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthOperation
	 * @generated
	 */
	public Adapter createLengthOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthAdd
	 * @generated
	 */
	public Adapter createLengthAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthSubtract
	 * @generated
	 */
	public Adapter createLengthSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthScalarMultiply
	 * @generated
	 */
	public Adapter createLengthScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthScalarDivide
	 * @generated
	 */
	public Adapter createLengthScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthEquals
	 * @generated
	 */
	public Adapter createLengthEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthDistinct
	 * @generated
	 */
	public Adapter createLengthDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthSmaller
	 * @generated
	 */
	public Adapter createLengthSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.LengthGreater
	 * @generated
	 */
	public Adapter createLengthGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleOperation
	 * @generated
	 */
	public Adapter createAngleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleAdd
	 * @generated
	 */
	public Adapter createAngleAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleSubtract
	 * @generated
	 */
	public Adapter createAngleSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleScalarMultiply
	 * @generated
	 */
	public Adapter createAngleScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleScalarDivide
	 * @generated
	 */
	public Adapter createAngleScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleEquals
	 * @generated
	 */
	public Adapter createAngleEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleDistinct
	 * @generated
	 */
	public Adapter createAngleDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleSmaller
	 * @generated
	 */
	public Adapter createAngleSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.AngleGreater
	 * @generated
	 */
	public Adapter createAngleGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.QuantityArithmeticOperation
	 * @generated
	 */
	public Adapter createQuantityArithmeticOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.QuantityComparisonOperation
	 * @generated
	 */
	public Adapter createQuantityComparisonOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.QuantityHomogenousOperation
	 * @generated
	 */
	public Adapter createQuantityHomogenousOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.raspirovermt.raspirover.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.raspirovermt.raspirover.QuantityScalarOperation
	 * @generated
	 */
	public Adapter createQuantityScalarOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RaspiroverAdapterFactory
