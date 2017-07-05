/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rover.raspirover.raspirover.Action;
import rover.raspirover.raspirover.AnalogPin;
import rover.raspirover.raspirover.Angle;
import rover.raspirover.raspirover.AngleAdd;
import rover.raspirover.raspirover.AngleDistinct;
import rover.raspirover.raspirover.AngleEquals;
import rover.raspirover.raspirover.AngleGreater;
import rover.raspirover.raspirover.AngleOperation;
import rover.raspirover.raspirover.AngleScalarDivide;
import rover.raspirover.raspirover.AngleScalarMultiply;
import rover.raspirover.raspirover.AngleSmaller;
import rover.raspirover.raspirover.AngleSubtract;
import rover.raspirover.raspirover.AngleUnit;
import rover.raspirover.raspirover.ArduinoAnalogModule;
import rover.raspirover.raspirover.ArduinoDigitalModule;
import rover.raspirover.raspirover.ArduinoModule;
import rover.raspirover.raspirover.BackwardAction;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.raspirover.Block;
import rover.raspirover.raspirover.Board;
import rover.raspirover.raspirover.BooleanExpression;
import rover.raspirover.raspirover.BooleanOperator;
import rover.raspirover.raspirover.BooleanValue;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.raspirover.Conditional;
import rover.raspirover.raspirover.Degree;
import rover.raspirover.raspirover.DigitalPin;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.raspirover.ForwardAction;
import rover.raspirover.raspirover.ForwardMinAction;
import rover.raspirover.raspirover.Gradian;
import rover.raspirover.raspirover.HumidityQuery;
import rover.raspirover.raspirover.ImperialSystemUnit;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.raspirover.Instruction;
import rover.raspirover.raspirover.Length;
import rover.raspirover.raspirover.LengthAdd;
import rover.raspirover.raspirover.LengthDistinct;
import rover.raspirover.raspirover.LengthEquals;
import rover.raspirover.raspirover.LengthGreater;
import rover.raspirover.raspirover.LengthOperation;
import rover.raspirover.raspirover.LengthScalarDivide;
import rover.raspirover.raspirover.LengthScalarMultiply;
import rover.raspirover.raspirover.LengthSmaller;
import rover.raspirover.raspirover.LengthSubtract;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.raspirover.LogAction;
import rover.raspirover.raspirover.Loop;
import rover.raspirover.raspirover.MessageQuery;
import rover.raspirover.raspirover.Meter;
import rover.raspirover.raspirover.MetricSystemUnit;
import rover.raspirover.raspirover.Millimeter;
import rover.raspirover.raspirover.Module;
import rover.raspirover.raspirover.NamedElement;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.NumericExpression;
import rover.raspirover.raspirover.NumericOperator;
import rover.raspirover.raspirover.NumericValue;
import rover.raspirover.raspirover.ObstacleQuery;
import rover.raspirover.raspirover.Param;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityArithmeticOperation;
import rover.raspirover.raspirover.QuantityComparisonOperation;
import rover.raspirover.raspirover.QuantityHomogenousOperation;
import rover.raspirover.raspirover.QuantityOperation;
import rover.raspirover.raspirover.QuantityScalarOperation;
import rover.raspirover.raspirover.Query;
import rover.raspirover.raspirover.Radian;
import rover.raspirover.raspirover.RasPiBoard;
import rover.raspirover.raspirover.RaspiroverFactory;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.RoverExpression;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.RoverValue;
import rover.raspirover.raspirover.SendAction;
import rover.raspirover.raspirover.Sketch;
import rover.raspirover.raspirover.Statement;
import rover.raspirover.raspirover.StopAction;
import rover.raspirover.raspirover.StringExpression;
import rover.raspirover.raspirover.StringOperator;
import rover.raspirover.raspirover.StringValue;
import rover.raspirover.raspirover.TemperatureQuery;
import rover.raspirover.raspirover.Turn;
import rover.raspirover.raspirover.TurnAction;
import rover.raspirover.raspirover.TurnDegAction;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.raspirover.VarAssignment;
import rover.raspirover.raspirover.VarRef;
import rover.raspirover.raspirover.Yard;

import rover.raspirover.raspirover.util.RaspiroverValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaspiroverPackageImpl extends EPackageImpl implements RaspiroverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasPiBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

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
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoDigitalModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoAnalogModuleEClass = null;

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
	private EClass varAssignmentEClass = null;

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
	private EClass rclBlockEClass = null;

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
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centimeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass millimeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricSystemUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperialSystemUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthSubtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthScalarMultiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthScalarDivideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthDistinctEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthSmallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthGreaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleSubtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleScalarMultiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleScalarDivideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleDistinctEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleSmallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleGreaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityArithmeticOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityComparisonOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityHomogenousOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityScalarOperationEClass = null;

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
	 * @see rover.raspirover.raspirover.RaspiroverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RaspiroverPackageImpl() {
		super(eNS_URI, RaspiroverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RaspiroverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RaspiroverPackage init() {
		if (isInited) return (RaspiroverPackage)EPackage.Registry.INSTANCE.getEPackage(RaspiroverPackage.eNS_URI);

		// Obtain or create and register package
		RaspiroverPackageImpl theRaspiroverPackage = (RaspiroverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RaspiroverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RaspiroverPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRaspiroverPackage.createPackageContents();

		// Initialize created meta-data
		theRaspiroverPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRaspiroverPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RaspiroverValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRaspiroverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RaspiroverPackage.eNS_URI, theRaspiroverPackage);
		return theRaspiroverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRasPiBoard() {
		return rasPiBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasPiBoard_DigitalPins() {
		return (EReference)rasPiBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRasPiBoard_AnalogPins() {
		return (EReference)rasPiBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Project() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Boards() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Sketches() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Program() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Project() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Block() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Board() {
		return (EReference)sketchEClass.getEStructuralFeatures().get(2);
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
	public EReference getBlock_Instructions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalPin() {
		return digitalPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalPin_Module() {
		return (EReference)digitalPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_Level() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoDigitalModule() {
		return arduinoDigitalModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoModule() {
		return arduinoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogPin() {
		return analogPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalogPin_Module() {
		return (EReference)analogPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoAnalogModule() {
		return arduinoAnalogModuleEClass;
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
	public EClass getVarAssignment() {
		return varAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarAssignment_Name() {
		return (EAttribute)varAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarAssignment_Value() {
		return (EReference)varAssignmentEClass.getEStructuralFeatures().get(1);
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
	public EClass getRclBlock() {
		return rclBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRclBlock_Stmts() {
		return (EReference)rclBlockEClass.getEStructuralFeatures().get(0);
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
	public EReference getNumberValue_Unit() {
		return (EReference)numberValueEClass.getEStructuralFeatures().get(1);
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
	public EReference getForwardMinAction_Distance() {
		return (EReference)forwardMinActionEClass.getEStructuralFeatures().get(0);
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
	public EReference getBackwardMinAction_Distance() {
		return (EReference)backwardMinActionEClass.getEStructuralFeatures().get(0);
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
	public EReference getTurnDegAction_Degrees() {
		return (EReference)turnDegActionEClass.getEStructuralFeatures().get(0);
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
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthUnit() {
		return lengthUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentimeter() {
		return centimeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMillimeter() {
		return millimeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeter() {
		return meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoot() {
		return footEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInch() {
		return inchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYard() {
		return yardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricSystemUnit() {
		return metricSystemUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperialSystemUnit() {
		return imperialSystemUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleUnit() {
		return angleUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadian() {
		return radianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDegree() {
		return degreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradian() {
		return gradianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Unit() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Value() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngle() {
		return angleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValue() {
		return numericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityOperation() {
		return quantityOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthOperation() {
		return lengthOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthAdd() {
		return lengthAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthSubtract() {
		return lengthSubtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthScalarMultiply() {
		return lengthScalarMultiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthScalarDivide() {
		return lengthScalarDivideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthEquals() {
		return lengthEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthDistinct() {
		return lengthDistinctEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthSmaller() {
		return lengthSmallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthGreater() {
		return lengthGreaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleOperation() {
		return angleOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleAdd() {
		return angleAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleSubtract() {
		return angleSubtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleScalarMultiply() {
		return angleScalarMultiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleScalarDivide() {
		return angleScalarDivideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleEquals() {
		return angleEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleDistinct() {
		return angleDistinctEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleSmaller() {
		return angleSmallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleGreater() {
		return angleGreaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityArithmeticOperation() {
		return quantityArithmeticOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityComparisonOperation() {
		return quantityComparisonOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityHomogenousOperation() {
		return quantityHomogenousOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityHomogenousOperation_Lhs() {
		return (EReference)quantityHomogenousOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityHomogenousOperation_Rhs() {
		return (EReference)quantityHomogenousOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityScalarOperation() {
		return quantityScalarOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityScalarOperation_Lhs() {
		return (EReference)quantityScalarOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityScalarOperation_Rhs() {
		return (EReference)quantityScalarOperationEClass.getEStructuralFeatures().get(1);
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
	public RaspiroverFactory getRaspiroverFactory() {
		return (RaspiroverFactory)getEFactoryInstance();
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
		rasPiBoardEClass = createEClass(RAS_PI_BOARD);
		createEReference(rasPiBoardEClass, RAS_PI_BOARD__DIGITAL_PINS);
		createEReference(rasPiBoardEClass, RAS_PI_BOARD__ANALOG_PINS);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__PROJECT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__BOARDS);
		createEReference(projectEClass, PROJECT__SKETCHES);
		createEReference(projectEClass, PROJECT__PROGRAM);

		sketchEClass = createEClass(SKETCH);
		createEReference(sketchEClass, SKETCH__PROJECT);
		createEReference(sketchEClass, SKETCH__BLOCK);
		createEReference(sketchEClass, SKETCH__BOARD);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		digitalPinEClass = createEClass(DIGITAL_PIN);
		createEReference(digitalPinEClass, DIGITAL_PIN__MODULE);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__LEVEL);

		arduinoDigitalModuleEClass = createEClass(ARDUINO_DIGITAL_MODULE);

		arduinoModuleEClass = createEClass(ARDUINO_MODULE);

		moduleEClass = createEClass(MODULE);

		analogPinEClass = createEClass(ANALOG_PIN);
		createEReference(analogPinEClass, ANALOG_PIN__MODULE);

		arduinoAnalogModuleEClass = createEClass(ARDUINO_ANALOG_MODULE);

		roverProgramEClass = createEClass(ROVER_PROGRAM);
		createEAttribute(roverProgramEClass, ROVER_PROGRAM__NAME);
		createEReference(roverProgramEClass, ROVER_PROGRAM__PARAMS);
		createEReference(roverProgramEClass, ROVER_PROGRAM__BLOCK);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__ENCLOSING);

		varAssignmentEClass = createEClass(VAR_ASSIGNMENT);
		createEAttribute(varAssignmentEClass, VAR_ASSIGNMENT__NAME);
		createEReference(varAssignmentEClass, VAR_ASSIGNMENT__VALUE);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__EXPR);
		createEReference(conditionalEClass, CONDITIONAL__COND_TRUE);
		createEReference(conditionalEClass, CONDITIONAL__COND_FALSE);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__EXPR);
		createEReference(loopEClass, LOOP__BLOCK);

		rclBlockEClass = createEClass(RCL_BLOCK);
		createEReference(rclBlockEClass, RCL_BLOCK__STMTS);

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
		createEReference(numberValueEClass, NUMBER_VALUE__UNIT);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__SVALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__BVALUE);

		actionEClass = createEClass(ACTION);

		forwardActionEClass = createEClass(FORWARD_ACTION);

		forwardMinActionEClass = createEClass(FORWARD_MIN_ACTION);
		createEReference(forwardMinActionEClass, FORWARD_MIN_ACTION__DISTANCE);

		backwardActionEClass = createEClass(BACKWARD_ACTION);

		backwardMinActionEClass = createEClass(BACKWARD_MIN_ACTION);
		createEReference(backwardMinActionEClass, BACKWARD_MIN_ACTION__DISTANCE);

		turnActionEClass = createEClass(TURN_ACTION);

		turnDegActionEClass = createEClass(TURN_DEG_ACTION);
		createEReference(turnDegActionEClass, TURN_DEG_ACTION__DEGREES);

		stopActionEClass = createEClass(STOP_ACTION);

		logActionEClass = createEClass(LOG_ACTION);
		createEAttribute(logActionEClass, LOG_ACTION__MESSAGE);

		sendActionEClass = createEClass(SEND_ACTION);
		createEAttribute(sendActionEClass, SEND_ACTION__MESSAGE);

		varRefEClass = createEClass(VAR_REF);
		createEAttribute(varRefEClass, VAR_REF__NAME);

		unitEClass = createEClass(UNIT);

		lengthUnitEClass = createEClass(LENGTH_UNIT);

		centimeterEClass = createEClass(CENTIMETER);

		millimeterEClass = createEClass(MILLIMETER);

		meterEClass = createEClass(METER);

		footEClass = createEClass(FOOT);

		inchEClass = createEClass(INCH);

		yardEClass = createEClass(YARD);

		metricSystemUnitEClass = createEClass(METRIC_SYSTEM_UNIT);

		imperialSystemUnitEClass = createEClass(IMPERIAL_SYSTEM_UNIT);

		angleUnitEClass = createEClass(ANGLE_UNIT);

		radianEClass = createEClass(RADIAN);

		degreeEClass = createEClass(DEGREE);

		turnEClass = createEClass(TURN);

		gradianEClass = createEClass(GRADIAN);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__UNIT);
		createEReference(quantityEClass, QUANTITY__VALUE);

		lengthEClass = createEClass(LENGTH);

		angleEClass = createEClass(ANGLE);

		numericValueEClass = createEClass(NUMERIC_VALUE);

		quantityOperationEClass = createEClass(QUANTITY_OPERATION);

		lengthOperationEClass = createEClass(LENGTH_OPERATION);

		lengthAddEClass = createEClass(LENGTH_ADD);

		lengthSubtractEClass = createEClass(LENGTH_SUBTRACT);

		lengthScalarMultiplyEClass = createEClass(LENGTH_SCALAR_MULTIPLY);

		lengthScalarDivideEClass = createEClass(LENGTH_SCALAR_DIVIDE);

		lengthEqualsEClass = createEClass(LENGTH_EQUALS);

		lengthDistinctEClass = createEClass(LENGTH_DISTINCT);

		lengthSmallerEClass = createEClass(LENGTH_SMALLER);

		lengthGreaterEClass = createEClass(LENGTH_GREATER);

		angleOperationEClass = createEClass(ANGLE_OPERATION);

		angleAddEClass = createEClass(ANGLE_ADD);

		angleSubtractEClass = createEClass(ANGLE_SUBTRACT);

		angleScalarMultiplyEClass = createEClass(ANGLE_SCALAR_MULTIPLY);

		angleScalarDivideEClass = createEClass(ANGLE_SCALAR_DIVIDE);

		angleEqualsEClass = createEClass(ANGLE_EQUALS);

		angleDistinctEClass = createEClass(ANGLE_DISTINCT);

		angleSmallerEClass = createEClass(ANGLE_SMALLER);

		angleGreaterEClass = createEClass(ANGLE_GREATER);

		quantityArithmeticOperationEClass = createEClass(QUANTITY_ARITHMETIC_OPERATION);

		quantityComparisonOperationEClass = createEClass(QUANTITY_COMPARISON_OPERATION);

		quantityHomogenousOperationEClass = createEClass(QUANTITY_HOMOGENOUS_OPERATION);
		createEReference(quantityHomogenousOperationEClass, QUANTITY_HOMOGENOUS_OPERATION__LHS);
		createEReference(quantityHomogenousOperationEClass, QUANTITY_HOMOGENOUS_OPERATION__RHS);

		quantityScalarOperationEClass = createEClass(QUANTITY_SCALAR_OPERATION);
		createEReference(quantityScalarOperationEClass, QUANTITY_SCALAR_OPERATION__LHS);
		createEReference(quantityScalarOperationEClass, QUANTITY_SCALAR_OPERATION__RHS);

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
		rasPiBoardEClass.getESuperTypes().add(this.getBoard());
		boardEClass.getESuperTypes().add(this.getNamedElement());
		sketchEClass.getESuperTypes().add(this.getNamedElement());
		digitalPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getNamedElement());
		arduinoDigitalModuleEClass.getESuperTypes().add(this.getArduinoModule());
		arduinoModuleEClass.getESuperTypes().add(this.getModule());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		analogPinEClass.getESuperTypes().add(this.getPin());
		arduinoAnalogModuleEClass.getESuperTypes().add(this.getArduinoModule());
		varAssignmentEClass.getESuperTypes().add(this.getStatement());
		conditionalEClass.getESuperTypes().add(this.getStatement());
		loopEClass.getESuperTypes().add(this.getStatement());
		rclBlockEClass.getESuperTypes().add(this.getStatement());
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
		lengthUnitEClass.getESuperTypes().add(this.getUnit());
		centimeterEClass.getESuperTypes().add(this.getMetricSystemUnit());
		centimeterEClass.getESuperTypes().add(this.getLengthUnit());
		millimeterEClass.getESuperTypes().add(this.getMetricSystemUnit());
		millimeterEClass.getESuperTypes().add(this.getLengthUnit());
		meterEClass.getESuperTypes().add(this.getMetricSystemUnit());
		meterEClass.getESuperTypes().add(this.getLengthUnit());
		footEClass.getESuperTypes().add(this.getImperialSystemUnit());
		footEClass.getESuperTypes().add(this.getLengthUnit());
		inchEClass.getESuperTypes().add(this.getImperialSystemUnit());
		inchEClass.getESuperTypes().add(this.getLengthUnit());
		yardEClass.getESuperTypes().add(this.getImperialSystemUnit());
		yardEClass.getESuperTypes().add(this.getLengthUnit());
		metricSystemUnitEClass.getESuperTypes().add(this.getUnit());
		imperialSystemUnitEClass.getESuperTypes().add(this.getUnit());
		angleUnitEClass.getESuperTypes().add(this.getUnit());
		radianEClass.getESuperTypes().add(this.getAngleUnit());
		degreeEClass.getESuperTypes().add(this.getAngleUnit());
		turnEClass.getESuperTypes().add(this.getAngleUnit());
		gradianEClass.getESuperTypes().add(this.getAngleUnit());
		lengthEClass.getESuperTypes().add(this.getQuantity());
		angleEClass.getESuperTypes().add(this.getQuantity());
		lengthOperationEClass.getESuperTypes().add(this.getQuantityOperation());
		lengthAddEClass.getESuperTypes().add(this.getLengthOperation());
		lengthAddEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		lengthSubtractEClass.getESuperTypes().add(this.getLengthOperation());
		lengthSubtractEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		lengthScalarMultiplyEClass.getESuperTypes().add(this.getLengthOperation());
		lengthScalarMultiplyEClass.getESuperTypes().add(this.getQuantityScalarOperation());
		lengthScalarDivideEClass.getESuperTypes().add(this.getLengthOperation());
		lengthScalarDivideEClass.getESuperTypes().add(this.getQuantityScalarOperation());
		lengthEqualsEClass.getESuperTypes().add(this.getLengthOperation());
		lengthEqualsEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		lengthDistinctEClass.getESuperTypes().add(this.getLengthOperation());
		lengthDistinctEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		lengthSmallerEClass.getESuperTypes().add(this.getLengthOperation());
		lengthSmallerEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		lengthGreaterEClass.getESuperTypes().add(this.getLengthOperation());
		lengthGreaterEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleOperationEClass.getESuperTypes().add(this.getQuantityOperation());
		angleAddEClass.getESuperTypes().add(this.getAngleOperation());
		angleAddEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleSubtractEClass.getESuperTypes().add(this.getAngleOperation());
		angleSubtractEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleScalarMultiplyEClass.getESuperTypes().add(this.getAngleOperation());
		angleScalarMultiplyEClass.getESuperTypes().add(this.getQuantityScalarOperation());
		angleScalarDivideEClass.getESuperTypes().add(this.getAngleOperation());
		angleScalarDivideEClass.getESuperTypes().add(this.getQuantityScalarOperation());
		angleEqualsEClass.getESuperTypes().add(this.getAngleOperation());
		angleEqualsEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleDistinctEClass.getESuperTypes().add(this.getAngleOperation());
		angleDistinctEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleSmallerEClass.getESuperTypes().add(this.getAngleOperation());
		angleSmallerEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		angleGreaterEClass.getESuperTypes().add(this.getAngleOperation());
		angleGreaterEClass.getESuperTypes().add(this.getQuantityHomogenousOperation());
		quantityArithmeticOperationEClass.getESuperTypes().add(this.getQuantityOperation());
		quantityComparisonOperationEClass.getESuperTypes().add(this.getQuantityOperation());
		quantityHomogenousOperationEClass.getESuperTypes().add(this.getQuantityOperation());
		quantityScalarOperationEClass.getESuperTypes().add(this.getQuantityOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(rasPiBoardEClass, RasPiBoard.class, "RasPiBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasPiBoard_DigitalPins(), this.getDigitalPin(), null, "digitalPins", null, 0, -1, RasPiBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRasPiBoard_AnalogPins(), this.getAnalogPin(), null, "analogPins", null, 0, -1, RasPiBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Project(), this.getProject(), this.getProject_Boards(), "project", null, 1, 1, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Boards(), this.getBoard(), this.getBoard_Project(), "boards", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Sketches(), this.getSketch(), this.getSketch_Project(), "sketches", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Program(), this.getRoverProgram(), null, "program", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(projectEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketch_Project(), this.getProject(), this.getProject_Sketches(), "project", null, 1, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Block(), this.getBlock(), null, "block", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Board(), this.getBoard(), null, "board", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(blockEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(instructionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(instructionEClass, null, "finalize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(digitalPinEClass, DigitalPin.class, "DigitalPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalPin_Module(), this.getArduinoDigitalModule(), null, "module", null, 0, 1, DigitalPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoDigitalModuleEClass, ArduinoDigitalModule.class, "ArduinoDigitalModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoModuleEClass, ArduinoModule.class, "ArduinoModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogPinEClass, AnalogPin.class, "AnalogPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalogPin_Module(), this.getArduinoAnalogModule(), null, "module", null, 0, 1, AnalogPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoAnalogModuleEClass, ArduinoAnalogModule.class, "ArduinoAnalogModule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roverProgramEClass, RoverProgram.class, "RoverProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoverProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverProgram_Params(), this.getParam(), null, "params", null, 0, -1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoverProgram_Block(), this.getRclBlock(), null, "block", null, 0, 1, RoverProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(roverProgramEClass, this.getRoverValue(), "getVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(roverProgramEClass, null, "bindVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRoverValue(), "v", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roverProgramEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Enclosing(), this.getRclBlock(), this.getRclBlock_Stmts(), "enclosing", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(statementEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(statementEClass, this.getRoverProgram(), "getProgram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(varAssignmentEClass, VarAssignment.class, "VarAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarAssignment_Value(), this.getRoverValue(), null, "value", null, 0, 1, VarAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(varAssignmentEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditional_Expr(), this.getRoverExpression(), null, "expr", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_CondTrue(), this.getRclBlock(), null, "condTrue", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditional_CondFalse(), this.getRclBlock(), null, "condFalse", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(conditionalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Expr(), this.getRoverExpression(), null, "expr", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Block(), this.getRclBlock(), null, "block", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(loopEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rclBlockEClass, RclBlock.class, "RclBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRclBlock_Stmts(), this.getStatement(), this.getStatement_Enclosing(), "stmts", null, 0, -1, RclBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(rclBlockEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getNumberValue_Unit(), this.getUnit(), null, "unit", null, 0, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getForwardMinAction_Distance(), this.getNumberValue(), null, "distance", null, 0, 1, ForwardMinAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(forwardMinActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(backwardActionEClass, BackwardAction.class, "BackwardAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(backwardActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(backwardMinActionEClass, BackwardMinAction.class, "BackwardMinAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackwardMinAction_Distance(), this.getNumberValue(), null, "distance", null, 0, 1, BackwardMinAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(backwardMinActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(turnActionEClass, TurnAction.class, "TurnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(turnActionEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(turnDegActionEClass, TurnDegAction.class, "TurnDegAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurnDegAction_Degrees(), this.getNumberValue(), null, "degrees", null, 0, 1, TurnDegAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthUnitEClass, LengthUnit.class, "LengthUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(centimeterEClass, Centimeter.class, "Centimeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(millimeterEClass, Millimeter.class, "Millimeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meterEClass, Meter.class, "Meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(footEClass, Foot.class, "Foot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inchEClass, Inch.class, "Inch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yardEClass, Yard.class, "Yard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricSystemUnitEClass, MetricSystemUnit.class, "MetricSystemUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imperialSystemUnitEClass, ImperialSystemUnit.class, "ImperialSystemUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleUnitEClass, AngleUnit.class, "AngleUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radianEClass, Radian.class, "Radian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(degreeEClass, Degree.class, "Degree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gradianEClass, Gradian.class, "Gradian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_Unit(), this.getUnit(), null, "unit", null, 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Value(), this.getNumericValue(), null, "value", null, 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthEClass, Length.class, "Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleEClass, Angle.class, "Angle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericValueEClass, NumericValue.class, "NumericValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityOperationEClass, QuantityOperation.class, "QuantityOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthOperationEClass, LengthOperation.class, "LengthOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthAddEClass, LengthAdd.class, "LengthAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthSubtractEClass, LengthSubtract.class, "LengthSubtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthScalarMultiplyEClass, LengthScalarMultiply.class, "LengthScalarMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthScalarDivideEClass, LengthScalarDivide.class, "LengthScalarDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthEqualsEClass, LengthEquals.class, "LengthEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthDistinctEClass, LengthDistinct.class, "LengthDistinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthSmallerEClass, LengthSmaller.class, "LengthSmaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lengthGreaterEClass, LengthGreater.class, "LengthGreater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleOperationEClass, AngleOperation.class, "AngleOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleAddEClass, AngleAdd.class, "AngleAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleSubtractEClass, AngleSubtract.class, "AngleSubtract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleScalarMultiplyEClass, AngleScalarMultiply.class, "AngleScalarMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleScalarDivideEClass, AngleScalarDivide.class, "AngleScalarDivide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleEqualsEClass, AngleEquals.class, "AngleEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleDistinctEClass, AngleDistinct.class, "AngleDistinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleSmallerEClass, AngleSmaller.class, "AngleSmaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleGreaterEClass, AngleGreater.class, "AngleGreater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityArithmeticOperationEClass, QuantityArithmeticOperation.class, "QuantityArithmeticOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityComparisonOperationEClass, QuantityComparisonOperation.class, "QuantityComparisonOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityHomogenousOperationEClass, QuantityHomogenousOperation.class, "QuantityHomogenousOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityHomogenousOperation_Lhs(), this.getQuantity(), null, "lhs", null, 1, 1, QuantityHomogenousOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantityHomogenousOperation_Rhs(), this.getQuantity(), null, "rhs", null, 1, 1, QuantityHomogenousOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityScalarOperationEClass, QuantityScalarOperation.class, "QuantityScalarOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityScalarOperation_Lhs(), this.getQuantity(), null, "lhs", null, 1, 1, QuantityScalarOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantityScalarOperation_Rhs(), this.getNumericValue(), null, "rhs", null, 1, 1, QuantityScalarOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (projectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProject_Program(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (blockEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (instructionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (instructionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPin_Level(), 
		   source, 
		   new String[] {
		   });	
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
		  (varAssignmentEClass.getEOperations().get(0), 
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
		  (rclBlockEClass.getEOperations().get(0), 
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
		  (getNumberValue_Unit(), 
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

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "constraints", "LengthRequiresLengthUnit"
		   });	
		addAnnotation
		  (angleEClass, 
		   source, 
		   new String[] {
			 "constraints", "AngleRequiresAngleUnit"
		   });	
		addAnnotation
		  (lengthAddEClass, 
		   source, 
		   new String[] {
			 "constraints", "QuantityHomogenousOperationRequiresHomogenousQuantities"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (lengthEClass, 
		   source, 
		   new String[] {
			 "LengthRequiresLengthUnit", "self.unit.oclIsKindOf(LengthUnit)"
		   });	
		addAnnotation
		  (angleEClass, 
		   source, 
		   new String[] {
			 "AngleRequiresAngleUnit", "self.unit.oclIsKindOf(AngleUnit)"
		   });	
		addAnnotation
		  (lengthAddEClass, 
		   source, 
		   new String[] {
			 "QuantityHomogenousOperationRequiresHomogenousQuantities", "self.lhs.oclType() = self.rhs.oclType()"
		   });
	}

} //RaspiroverPackageImpl
