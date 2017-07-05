/**
 */
package rover.raspirovermt.raspirover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rover.raspirovermt.raspirover.RaspiroverFactory
 * @model kind="package"
 * @generated
 */
public interface RaspiroverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "raspirover";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rover.raspirovermt/raspirover/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaspiroverPackage eINSTANCE = rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl.init();

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.NamedElementImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BoardImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RasPiBoardImpl <em>Ras Pi Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RasPiBoardImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRasPiBoard()
	 * @generated
	 */
	int RAS_PI_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAS_PI_BOARD__NAME = BOARD__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAS_PI_BOARD__PROJECT = BOARD__PROJECT;

	/**
	 * The feature id for the '<em><b>Digital Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAS_PI_BOARD__DIGITAL_PINS = BOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analog Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAS_PI_BOARD__ANALOG_PINS = BOARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ras Pi Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAS_PI_BOARD_FEATURE_COUNT = BOARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ProjectImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BOARDS = 0;

	/**
	 * The feature id for the '<em><b>Sketches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SKETCHES = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROGRAM = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.SketchImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__BOARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BlockImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.InstructionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 6;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.PinImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.DigitalPinImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getDigitalPin()
	 * @generated
	 */
	int DIGITAL_PIN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.Module <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.Module
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ArduinoModuleImpl <em>Arduino Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ArduinoModuleImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoModule()
	 * @generated
	 */
	int ARDUINO_MODULE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE__NAME = MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Arduino Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ArduinoDigitalModuleImpl <em>Arduino Digital Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ArduinoDigitalModuleImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoDigitalModule()
	 * @generated
	 */
	int ARDUINO_DIGITAL_MODULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Arduino Digital Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_DIGITAL_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AnalogPinImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAnalogPin()
	 * @generated
	 */
	int ANALOG_PIN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__LEVEL = PIN__LEVEL;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN__MODULE = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ArduinoAnalogModuleImpl <em>Arduino Analog Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ArduinoAnalogModuleImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoAnalogModule()
	 * @generated
	 */
	int ARDUINO_ANALOG_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE__NAME = ARDUINO_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Arduino Analog Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_ANALOG_MODULE_FEATURE_COUNT = ARDUINO_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RoverProgramImpl <em>Rover Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RoverProgramImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverProgram()
	 * @generated
	 */
	int ROVER_PROGRAM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM__BLOCK = 2;

	/**
	 * The number of structural features of the '<em>Rover Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ParamImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.StatementImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ENCLOSING = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.VarAssignmentImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getVarAssignment()
	 * @generated
	 */
	int VAR_ASSIGNMENT = 17;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ConditionalImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 18;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__COND_TRUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cond False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__COND_FALSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LoopImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 19;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RclBlockImpl <em>Rcl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RclBlockImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRclBlock()
	 * @generated
	 */
	int RCL_BLOCK = 20;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK__STMTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rcl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCL_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QueryImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 21;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.TemperatureQueryImpl <em>Temperature Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.TemperatureQueryImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTemperatureQuery()
	 * @generated
	 */
	int TEMPERATURE_QUERY = 22;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY__NVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY__UNIT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temperature Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.HumidityQueryImpl <em>Humidity Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.HumidityQueryImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getHumidityQuery()
	 * @generated
	 */
	int HUMIDITY_QUERY = 23;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY__NVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY__UNIT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Humidity Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.MessageQueryImpl <em>Message Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.MessageQueryImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMessageQuery()
	 * @generated
	 */
	int MESSAGE_QUERY = 24;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUERY__SVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ObstacleQueryImpl <em>Obstacle Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ObstacleQueryImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getObstacleQuery()
	 * @generated
	 */
	int OBSTACLE_QUERY = 25;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY__BVALUE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY__FRONT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstacle Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RoverExpressionImpl <em>Rover Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RoverExpressionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverExpression()
	 * @generated
	 */
	int ROVER_EXPRESSION = 26;

	/**
	 * The number of structural features of the '<em>Rover Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.NumericExpressionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericExpression()
	 * @generated
	 */
	int NUMERIC_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.StringExpressionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BooleanExpressionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LHS = ROVER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__RHS = ROVER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OP = ROVER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = ROVER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RoverValueImpl <em>Rover Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RoverValueImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverValue()
	 * @generated
	 */
	int ROVER_VALUE = 30;

	/**
	 * The number of structural features of the '<em>Rover Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROVER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.NumberValueImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 31;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__NVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__UNIT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.StringValueImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 32;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__SVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BooleanValueImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 33;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__BVALUE = ROVER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = ROVER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 34;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENCLOSING = STATEMENT__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ForwardActionImpl <em>Forward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ForwardActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getForwardAction()
	 * @generated
	 */
	int FORWARD_ACTION = 35;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ForwardMinActionImpl <em>Forward Min Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ForwardMinActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getForwardMinAction()
	 * @generated
	 */
	int FORWARD_MIN_ACTION = 36;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_MIN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BackwardActionImpl <em>Backward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BackwardActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBackwardAction()
	 * @generated
	 */
	int BACKWARD_ACTION = 37;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Backward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.BackwardMinActionImpl <em>Backward Min Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.BackwardMinActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBackwardMinAction()
	 * @generated
	 */
	int BACKWARD_MIN_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION__DISTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backward Min Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_MIN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.TurnActionImpl <em>Turn Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.TurnActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurnAction()
	 * @generated
	 */
	int TURN_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Turn Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.TurnDegActionImpl <em>Turn Deg Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.TurnDegActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurnDegAction()
	 * @generated
	 */
	int TURN_DEG_ACTION = 40;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION__DEGREES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Deg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_DEG_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.StopActionImpl <em>Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.StopActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStopAction()
	 * @generated
	 */
	int STOP_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The number of structural features of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LogActionImpl <em>Log Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LogActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLogAction()
	 * @generated
	 */
	int LOG_ACTION = 42;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.SendActionImpl <em>Send Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.SendActionImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getSendAction()
	 * @generated
	 */
	int SEND_ACTION = 43;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__ENCLOSING = ACTION__ENCLOSING;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.VarRefImpl <em>Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.VarRefImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getVarRef()
	 * @generated
	 */
	int VAR_REF = 44;

	/**
	 * The feature id for the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__BVALUE = BOOLEAN_VALUE__BVALUE;

	/**
	 * The feature id for the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NVALUE = BOOLEAN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__UNIT = BOOLEAN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__SVALUE = BOOLEAN_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enclosing</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__ENCLOSING = BOOLEAN_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF__NAME = BOOLEAN_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REF_FEATURE_COUNT = BOOLEAN_VALUE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.UnitImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 45;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthUnitImpl <em>Length Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthUnitImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthUnit()
	 * @generated
	 */
	int LENGTH_UNIT = 46;

	/**
	 * The number of structural features of the '<em>Length Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.MetricSystemUnitImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMetricSystemUnit()
	 * @generated
	 */
	int METRIC_SYSTEM_UNIT = 53;

	/**
	 * The number of structural features of the '<em>Metric System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.CentimeterImpl <em>Centimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.CentimeterImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getCentimeter()
	 * @generated
	 */
	int CENTIMETER = 47;

	/**
	 * The number of structural features of the '<em>Centimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.MillimeterImpl <em>Millimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.MillimeterImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMillimeter()
	 * @generated
	 */
	int MILLIMETER = 48;

	/**
	 * The number of structural features of the '<em>Millimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILLIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.MeterImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 49;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.ImperialSystemUnitImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getImperialSystemUnit()
	 * @generated
	 */
	int IMPERIAL_SYSTEM_UNIT = 54;

	/**
	 * The number of structural features of the '<em>Imperial System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.FootImpl <em>Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.FootImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getFoot()
	 * @generated
	 */
	int FOOT = 50;

	/**
	 * The number of structural features of the '<em>Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.InchImpl <em>Inch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.InchImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getInch()
	 * @generated
	 */
	int INCH = 51;

	/**
	 * The number of structural features of the '<em>Inch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCH_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.YardImpl <em>Yard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.YardImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getYard()
	 * @generated
	 */
	int YARD = 52;

	/**
	 * The number of structural features of the '<em>Yard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YARD_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleUnitImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 55;

	/**
	 * The number of structural features of the '<em>Angle Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.RadianImpl <em>Radian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.RadianImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRadian()
	 * @generated
	 */
	int RADIAN = 56;

	/**
	 * The number of structural features of the '<em>Radian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.DegreeImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 57;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.TurnImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 58;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.GradianImpl <em>Gradian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.GradianImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getGradian()
	 * @generated
	 */
	int GRADIAN = 59;

	/**
	 * The number of structural features of the '<em>Gradian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 60;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 61;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 62;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.NumericValue <em>Numeric Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.NumericValue
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericValue()
	 * @generated
	 */
	int NUMERIC_VALUE = 63;

	/**
	 * The number of structural features of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityOperation()
	 * @generated
	 */
	int QUANTITY_OPERATION = 64;

	/**
	 * The number of structural features of the '<em>Quantity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthOperationImpl <em>Length Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthOperation()
	 * @generated
	 */
	int LENGTH_OPERATION = 65;

	/**
	 * The number of structural features of the '<em>Length Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthAddImpl <em>Length Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthAddImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthAdd()
	 * @generated
	 */
	int LENGTH_ADD = 66;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthSubtractImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthSubtract()
	 * @generated
	 */
	int LENGTH_SUBTRACT = 67;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthScalarMultiplyImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthScalarMultiply()
	 * @generated
	 */
	int LENGTH_SCALAR_MULTIPLY = 68;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthScalarDivideImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthScalarDivide()
	 * @generated
	 */
	int LENGTH_SCALAR_DIVIDE = 69;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthEqualsImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthEquals()
	 * @generated
	 */
	int LENGTH_EQUALS = 70;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthDistinctImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthDistinct()
	 * @generated
	 */
	int LENGTH_DISTINCT = 71;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthSmallerImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthSmaller()
	 * @generated
	 */
	int LENGTH_SMALLER = 72;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.LengthGreaterImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthGreater()
	 * @generated
	 */
	int LENGTH_GREATER = 73;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleOperation()
	 * @generated
	 */
	int ANGLE_OPERATION = 74;

	/**
	 * The number of structural features of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleAddImpl <em>Angle Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleAddImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleAdd()
	 * @generated
	 */
	int ANGLE_ADD = 75;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleSubtractImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleSubtract()
	 * @generated
	 */
	int ANGLE_SUBTRACT = 76;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleScalarMultiplyImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleScalarMultiply()
	 * @generated
	 */
	int ANGLE_SCALAR_MULTIPLY = 77;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleScalarDivideImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleScalarDivide()
	 * @generated
	 */
	int ANGLE_SCALAR_DIVIDE = 78;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleEqualsImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleEquals()
	 * @generated
	 */
	int ANGLE_EQUALS = 79;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleDistinctImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleDistinct()
	 * @generated
	 */
	int ANGLE_DISTINCT = 80;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleSmallerImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleSmaller()
	 * @generated
	 */
	int ANGLE_SMALLER = 81;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.AngleGreaterImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleGreater()
	 * @generated
	 */
	int ANGLE_GREATER = 82;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityArithmeticOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityArithmeticOperation()
	 * @generated
	 */
	int QUANTITY_ARITHMETIC_OPERATION = 83;

	/**
	 * The number of structural features of the '<em>Quantity Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ARITHMETIC_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityComparisonOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityComparisonOperation()
	 * @generated
	 */
	int QUANTITY_COMPARISON_OPERATION = 84;

	/**
	 * The number of structural features of the '<em>Quantity Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARISON_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityHomogenousOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityHomogenousOperation()
	 * @generated
	 */
	int QUANTITY_HOMOGENOUS_OPERATION = 85;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION__LHS = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION__RHS = QUANTITY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Homogenous Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.impl.QuantityScalarOperationImpl
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityScalarOperation()
	 * @generated
	 */
	int QUANTITY_SCALAR_OPERATION = 86;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION__LHS = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION__RHS = QUANTITY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Scalar Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.NumericOperator <em>Numeric Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.NumericOperator
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericOperator()
	 * @generated
	 */
	int NUMERIC_OPERATOR = 87;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.StringOperator
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 88;

	/**
	 * The meta object id for the '{@link rover.raspirovermt.raspirover.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.raspirovermt.raspirover.BooleanOperator
	 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 89;


	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.RasPiBoard <em>Ras Pi Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ras Pi Board</em>'.
	 * @see rover.raspirovermt.raspirover.RasPiBoard
	 * @generated
	 */
	EClass getRasPiBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.RasPiBoard#getDigitalPins <em>Digital Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Pins</em>'.
	 * @see rover.raspirovermt.raspirover.RasPiBoard#getDigitalPins()
	 * @see #getRasPiBoard()
	 * @generated
	 */
	EReference getRasPiBoard_DigitalPins();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.RasPiBoard#getAnalogPins <em>Analog Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analog Pins</em>'.
	 * @see rover.raspirovermt.raspirover.RasPiBoard#getAnalogPins()
	 * @see #getRasPiBoard()
	 * @generated
	 */
	EReference getRasPiBoard_AnalogPins();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see rover.raspirovermt.raspirover.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the container reference '{@link rover.raspirovermt.raspirover.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see rover.raspirovermt.raspirover.Board#getProject()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Project();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see rover.raspirovermt.raspirover.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.raspirovermt.raspirover.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rover.raspirovermt.raspirover.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.Project#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see rover.raspirovermt.raspirover.Project#getBoards()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Boards();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.Project#getSketches <em>Sketches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sketches</em>'.
	 * @see rover.raspirovermt.raspirover.Project#getSketches()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sketches();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Project#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program</em>'.
	 * @see rover.raspirovermt.raspirover.Project#getProgram()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Program();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see rover.raspirovermt.raspirover.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the container reference '{@link rover.raspirovermt.raspirover.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see rover.raspirovermt.raspirover.Sketch#getProject()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Project();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Sketch#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rover.raspirovermt.raspirover.Sketch#getBlock()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Block();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.Sketch#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see rover.raspirovermt.raspirover.Sketch#getBoard()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Board();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see rover.raspirovermt.raspirover.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.Block#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see rover.raspirovermt.raspirover.Block#getInstructions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instructions();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see rover.raspirovermt.raspirover.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.DigitalPin <em>Digital Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Pin</em>'.
	 * @see rover.raspirovermt.raspirover.DigitalPin
	 * @generated
	 */
	EClass getDigitalPin();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.DigitalPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see rover.raspirovermt.raspirover.DigitalPin#getModule()
	 * @see #getDigitalPin()
	 * @generated
	 */
	EReference getDigitalPin_Module();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see rover.raspirovermt.raspirover.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.Pin#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see rover.raspirovermt.raspirover.Pin#getLevel()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Level();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ArduinoDigitalModule <em>Arduino Digital Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Digital Module</em>'.
	 * @see rover.raspirovermt.raspirover.ArduinoDigitalModule
	 * @generated
	 */
	EClass getArduinoDigitalModule();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ArduinoModule <em>Arduino Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Module</em>'.
	 * @see rover.raspirovermt.raspirover.ArduinoModule
	 * @generated
	 */
	EClass getArduinoModule();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see rover.raspirovermt.raspirover.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AnalogPin <em>Analog Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Pin</em>'.
	 * @see rover.raspirovermt.raspirover.AnalogPin
	 * @generated
	 */
	EClass getAnalogPin();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.AnalogPin#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see rover.raspirovermt.raspirover.AnalogPin#getModule()
	 * @see #getAnalogPin()
	 * @generated
	 */
	EReference getAnalogPin_Module();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ArduinoAnalogModule <em>Arduino Analog Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Analog Module</em>'.
	 * @see rover.raspirovermt.raspirover.ArduinoAnalogModule
	 * @generated
	 */
	EClass getArduinoAnalogModule();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.RoverProgram <em>Rover Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Program</em>'.
	 * @see rover.raspirovermt.raspirover.RoverProgram
	 * @generated
	 */
	EClass getRoverProgram();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.RoverProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.raspirovermt.raspirover.RoverProgram#getName()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EAttribute getRoverProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.RoverProgram#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see rover.raspirovermt.raspirover.RoverProgram#getParams()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Params();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.RoverProgram#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rover.raspirovermt.raspirover.RoverProgram#getBlock()
	 * @see #getRoverProgram()
	 * @generated
	 */
	EReference getRoverProgram_Block();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see rover.raspirovermt.raspirover.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.raspirovermt.raspirover.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see rover.raspirovermt.raspirover.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link rover.raspirovermt.raspirover.Statement#getEnclosing <em>Enclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing</em>'.
	 * @see rover.raspirovermt.raspirover.Statement#getEnclosing()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Enclosing();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.VarAssignment <em>Var Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Assignment</em>'.
	 * @see rover.raspirovermt.raspirover.VarAssignment
	 * @generated
	 */
	EClass getVarAssignment();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.VarAssignment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.raspirovermt.raspirover.VarAssignment#getName()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EAttribute getVarAssignment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.VarAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rover.raspirovermt.raspirover.VarAssignment#getValue()
	 * @see #getVarAssignment()
	 * @generated
	 */
	EReference getVarAssignment_Value();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see rover.raspirovermt.raspirover.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Conditional#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rover.raspirovermt.raspirover.Conditional#getExpr()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Conditional#getCondTrue <em>Cond True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond True</em>'.
	 * @see rover.raspirovermt.raspirover.Conditional#getCondTrue()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_CondTrue();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Conditional#getCondFalse <em>Cond False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond False</em>'.
	 * @see rover.raspirovermt.raspirover.Conditional#getCondFalse()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_CondFalse();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see rover.raspirovermt.raspirover.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Loop#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rover.raspirovermt.raspirover.Loop#getExpr()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Expr();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Loop#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see rover.raspirovermt.raspirover.Loop#getBlock()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Block();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.RclBlock <em>Rcl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rcl Block</em>'.
	 * @see rover.raspirovermt.raspirover.RclBlock
	 * @generated
	 */
	EClass getRclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link rover.raspirovermt.raspirover.RclBlock#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see rover.raspirovermt.raspirover.RclBlock#getStmts()
	 * @see #getRclBlock()
	 * @generated
	 */
	EReference getRclBlock_Stmts();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see rover.raspirovermt.raspirover.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.TemperatureQuery <em>Temperature Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Query</em>'.
	 * @see rover.raspirovermt.raspirover.TemperatureQuery
	 * @generated
	 */
	EClass getTemperatureQuery();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.HumidityQuery <em>Humidity Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Query</em>'.
	 * @see rover.raspirovermt.raspirover.HumidityQuery
	 * @generated
	 */
	EClass getHumidityQuery();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.MessageQuery <em>Message Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Query</em>'.
	 * @see rover.raspirovermt.raspirover.MessageQuery
	 * @generated
	 */
	EClass getMessageQuery();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ObstacleQuery <em>Obstacle Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle Query</em>'.
	 * @see rover.raspirovermt.raspirover.ObstacleQuery
	 * @generated
	 */
	EClass getObstacleQuery();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.ObstacleQuery#isFront <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front</em>'.
	 * @see rover.raspirovermt.raspirover.ObstacleQuery#isFront()
	 * @see #getObstacleQuery()
	 * @generated
	 */
	EAttribute getObstacleQuery_Front();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.RoverExpression <em>Rover Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Expression</em>'.
	 * @see rover.raspirovermt.raspirover.RoverExpression
	 * @generated
	 */
	EClass getRoverExpression();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Expression</em>'.
	 * @see rover.raspirovermt.raspirover.NumericExpression
	 * @generated
	 */
	EClass getNumericExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.NumericExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rover.raspirovermt.raspirover.NumericExpression#getLhs()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EReference getNumericExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.NumericExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rover.raspirovermt.raspirover.NumericExpression#getRhs()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EReference getNumericExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.NumericExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rover.raspirovermt.raspirover.NumericExpression#getOp()
	 * @see #getNumericExpression()
	 * @generated
	 */
	EAttribute getNumericExpression_Op();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see rover.raspirovermt.raspirover.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.StringExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rover.raspirovermt.raspirover.StringExpression#getLhs()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.StringExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rover.raspirovermt.raspirover.StringExpression#getRhs()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.StringExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rover.raspirovermt.raspirover.StringExpression#getOp()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_Op();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.BooleanExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanExpression#getLhs()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.BooleanExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanExpression#getRhs()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.BooleanExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanExpression#getOp()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Op();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.RoverValue <em>Rover Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rover Value</em>'.
	 * @see rover.raspirovermt.raspirover.RoverValue
	 * @generated
	 */
	EClass getRoverValue();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see rover.raspirovermt.raspirover.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.NumberValue#getNValue <em>NValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NValue</em>'.
	 * @see rover.raspirovermt.raspirover.NumberValue#getNValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_NValue();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.NumberValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see rover.raspirovermt.raspirover.NumberValue#getUnit()
	 * @see #getNumberValue()
	 * @generated
	 */
	EReference getNumberValue_Unit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see rover.raspirovermt.raspirover.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.StringValue#getSValue <em>SValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SValue</em>'.
	 * @see rover.raspirovermt.raspirover.StringValue#getSValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_SValue();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.BooleanValue#isBValue <em>BValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BValue</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanValue#isBValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_BValue();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see rover.raspirovermt.raspirover.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ForwardAction <em>Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Action</em>'.
	 * @see rover.raspirovermt.raspirover.ForwardAction
	 * @generated
	 */
	EClass getForwardAction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ForwardMinAction <em>Forward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Min Action</em>'.
	 * @see rover.raspirovermt.raspirover.ForwardMinAction
	 * @generated
	 */
	EClass getForwardMinAction();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.ForwardMinAction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see rover.raspirovermt.raspirover.ForwardMinAction#getDistance()
	 * @see #getForwardMinAction()
	 * @generated
	 */
	EReference getForwardMinAction_Distance();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.BackwardAction <em>Backward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward Action</em>'.
	 * @see rover.raspirovermt.raspirover.BackwardAction
	 * @generated
	 */
	EClass getBackwardAction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.BackwardMinAction <em>Backward Min Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward Min Action</em>'.
	 * @see rover.raspirovermt.raspirover.BackwardMinAction
	 * @generated
	 */
	EClass getBackwardMinAction();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.BackwardMinAction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see rover.raspirovermt.raspirover.BackwardMinAction#getDistance()
	 * @see #getBackwardMinAction()
	 * @generated
	 */
	EReference getBackwardMinAction_Distance();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.TurnAction <em>Turn Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Action</em>'.
	 * @see rover.raspirovermt.raspirover.TurnAction
	 * @generated
	 */
	EClass getTurnAction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.TurnDegAction <em>Turn Deg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Deg Action</em>'.
	 * @see rover.raspirovermt.raspirover.TurnDegAction
	 * @generated
	 */
	EClass getTurnDegAction();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.TurnDegAction#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Degrees</em>'.
	 * @see rover.raspirovermt.raspirover.TurnDegAction#getDegrees()
	 * @see #getTurnDegAction()
	 * @generated
	 */
	EReference getTurnDegAction_Degrees();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Action</em>'.
	 * @see rover.raspirovermt.raspirover.StopAction
	 * @generated
	 */
	EClass getStopAction();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LogAction <em>Log Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Action</em>'.
	 * @see rover.raspirovermt.raspirover.LogAction
	 * @generated
	 */
	EClass getLogAction();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.LogAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see rover.raspirovermt.raspirover.LogAction#getMessage()
	 * @see #getLogAction()
	 * @generated
	 */
	EAttribute getLogAction_Message();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Action</em>'.
	 * @see rover.raspirovermt.raspirover.SendAction
	 * @generated
	 */
	EClass getSendAction();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.SendAction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see rover.raspirovermt.raspirover.SendAction#getMessage()
	 * @see #getSendAction()
	 * @generated
	 */
	EAttribute getSendAction_Message();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.VarRef <em>Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Ref</em>'.
	 * @see rover.raspirovermt.raspirover.VarRef
	 * @generated
	 */
	EClass getVarRef();

	/**
	 * Returns the meta object for the attribute '{@link rover.raspirovermt.raspirover.VarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rover.raspirovermt.raspirover.VarRef#getName()
	 * @see #getVarRef()
	 * @generated
	 */
	EAttribute getVarRef_Name();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see rover.raspirovermt.raspirover.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Unit</em>'.
	 * @see rover.raspirovermt.raspirover.LengthUnit
	 * @generated
	 */
	EClass getLengthUnit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centimeter</em>'.
	 * @see rover.raspirovermt.raspirover.Centimeter
	 * @generated
	 */
	EClass getCentimeter();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Millimeter</em>'.
	 * @see rover.raspirovermt.raspirover.Millimeter
	 * @generated
	 */
	EClass getMillimeter();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see rover.raspirovermt.raspirover.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foot</em>'.
	 * @see rover.raspirovermt.raspirover.Foot
	 * @generated
	 */
	EClass getFoot();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inch</em>'.
	 * @see rover.raspirovermt.raspirover.Inch
	 * @generated
	 */
	EClass getInch();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yard</em>'.
	 * @see rover.raspirovermt.raspirover.Yard
	 * @generated
	 */
	EClass getYard();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric System Unit</em>'.
	 * @see rover.raspirovermt.raspirover.MetricSystemUnit
	 * @generated
	 */
	EClass getMetricSystemUnit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperial System Unit</em>'.
	 * @see rover.raspirovermt.raspirover.ImperialSystemUnit
	 * @generated
	 */
	EClass getImperialSystemUnit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Unit</em>'.
	 * @see rover.raspirovermt.raspirover.AngleUnit
	 * @generated
	 */
	EClass getAngleUnit();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radian</em>'.
	 * @see rover.raspirovermt.raspirover.Radian
	 * @generated
	 */
	EClass getRadian();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see rover.raspirovermt.raspirover.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see rover.raspirovermt.raspirover.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradian</em>'.
	 * @see rover.raspirovermt.raspirover.Gradian
	 * @generated
	 */
	EClass getGradian();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see rover.raspirovermt.raspirover.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link rover.raspirovermt.raspirover.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see rover.raspirovermt.raspirover.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see rover.raspirovermt.raspirover.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see rover.raspirovermt.raspirover.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see rover.raspirovermt.raspirover.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value</em>'.
	 * @see rover.raspirovermt.raspirover.NumericValue
	 * @generated
	 */
	EClass getNumericValue();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Operation</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityOperation
	 * @generated
	 */
	EClass getQuantityOperation();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Operation</em>'.
	 * @see rover.raspirovermt.raspirover.LengthOperation
	 * @generated
	 */
	EClass getLengthOperation();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Add</em>'.
	 * @see rover.raspirovermt.raspirover.LengthAdd
	 * @generated
	 */
	EClass getLengthAdd();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Subtract</em>'.
	 * @see rover.raspirovermt.raspirover.LengthSubtract
	 * @generated
	 */
	EClass getLengthSubtract();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Multiply</em>'.
	 * @see rover.raspirovermt.raspirover.LengthScalarMultiply
	 * @generated
	 */
	EClass getLengthScalarMultiply();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Divide</em>'.
	 * @see rover.raspirovermt.raspirover.LengthScalarDivide
	 * @generated
	 */
	EClass getLengthScalarDivide();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Equals</em>'.
	 * @see rover.raspirovermt.raspirover.LengthEquals
	 * @generated
	 */
	EClass getLengthEquals();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Distinct</em>'.
	 * @see rover.raspirovermt.raspirover.LengthDistinct
	 * @generated
	 */
	EClass getLengthDistinct();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Smaller</em>'.
	 * @see rover.raspirovermt.raspirover.LengthSmaller
	 * @generated
	 */
	EClass getLengthSmaller();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Greater</em>'.
	 * @see rover.raspirovermt.raspirover.LengthGreater
	 * @generated
	 */
	EClass getLengthGreater();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Operation</em>'.
	 * @see rover.raspirovermt.raspirover.AngleOperation
	 * @generated
	 */
	EClass getAngleOperation();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Add</em>'.
	 * @see rover.raspirovermt.raspirover.AngleAdd
	 * @generated
	 */
	EClass getAngleAdd();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Subtract</em>'.
	 * @see rover.raspirovermt.raspirover.AngleSubtract
	 * @generated
	 */
	EClass getAngleSubtract();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Multiply</em>'.
	 * @see rover.raspirovermt.raspirover.AngleScalarMultiply
	 * @generated
	 */
	EClass getAngleScalarMultiply();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Divide</em>'.
	 * @see rover.raspirovermt.raspirover.AngleScalarDivide
	 * @generated
	 */
	EClass getAngleScalarDivide();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Equals</em>'.
	 * @see rover.raspirovermt.raspirover.AngleEquals
	 * @generated
	 */
	EClass getAngleEquals();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Distinct</em>'.
	 * @see rover.raspirovermt.raspirover.AngleDistinct
	 * @generated
	 */
	EClass getAngleDistinct();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Smaller</em>'.
	 * @see rover.raspirovermt.raspirover.AngleSmaller
	 * @generated
	 */
	EClass getAngleSmaller();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Greater</em>'.
	 * @see rover.raspirovermt.raspirover.AngleGreater
	 * @generated
	 */
	EClass getAngleGreater();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Arithmetic Operation</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityArithmeticOperation
	 * @generated
	 */
	EClass getQuantityArithmeticOperation();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Comparison Operation</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityComparisonOperation
	 * @generated
	 */
	EClass getQuantityComparisonOperation();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Homogenous Operation</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityHomogenousOperation
	 * @generated
	 */
	EClass getQuantityHomogenousOperation();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityHomogenousOperation#getLhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Lhs();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityHomogenousOperation#getRhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Rhs();

	/**
	 * Returns the meta object for class '{@link rover.raspirovermt.raspirover.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Scalar Operation</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityScalarOperation
	 * @generated
	 */
	EClass getQuantityScalarOperation();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.QuantityScalarOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityScalarOperation#getLhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EReference getQuantityScalarOperation_Lhs();

	/**
	 * Returns the meta object for the reference '{@link rover.raspirovermt.raspirover.QuantityScalarOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see rover.raspirovermt.raspirover.QuantityScalarOperation#getRhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EReference getQuantityScalarOperation_Rhs();

	/**
	 * Returns the meta object for enum '{@link rover.raspirovermt.raspirover.NumericOperator <em>Numeric Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Operator</em>'.
	 * @see rover.raspirovermt.raspirover.NumericOperator
	 * @generated
	 */
	EEnum getNumericOperator();

	/**
	 * Returns the meta object for enum '{@link rover.raspirovermt.raspirover.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see rover.raspirovermt.raspirover.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link rover.raspirovermt.raspirover.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see rover.raspirovermt.raspirover.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RaspiroverFactory getRaspiroverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RasPiBoardImpl <em>Ras Pi Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RasPiBoardImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRasPiBoard()
		 * @generated
		 */
		EClass RAS_PI_BOARD = eINSTANCE.getRasPiBoard();

		/**
		 * The meta object literal for the '<em><b>Digital Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAS_PI_BOARD__DIGITAL_PINS = eINSTANCE.getRasPiBoard_DigitalPins();

		/**
		 * The meta object literal for the '<em><b>Analog Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAS_PI_BOARD__ANALOG_PINS = eINSTANCE.getRasPiBoard_AnalogPins();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BoardImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PROJECT = eINSTANCE.getBoard_Project();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.NamedElementImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ProjectImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BOARDS = eINSTANCE.getProject_Boards();

		/**
		 * The meta object literal for the '<em><b>Sketches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SKETCHES = eINSTANCE.getProject_Sketches();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROGRAM = eINSTANCE.getProject_Program();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.SketchImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__PROJECT = eINSTANCE.getSketch_Project();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__BLOCK = eINSTANCE.getSketch_Block();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__BOARD = eINSTANCE.getSketch_Board();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BlockImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.InstructionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.DigitalPinImpl <em>Digital Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.DigitalPinImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getDigitalPin()
		 * @generated
		 */
		EClass DIGITAL_PIN = eINSTANCE.getDigitalPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_PIN__MODULE = eINSTANCE.getDigitalPin_Module();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.PinImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__LEVEL = eINSTANCE.getPin_Level();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ArduinoDigitalModuleImpl <em>Arduino Digital Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ArduinoDigitalModuleImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoDigitalModule()
		 * @generated
		 */
		EClass ARDUINO_DIGITAL_MODULE = eINSTANCE.getArduinoDigitalModule();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ArduinoModuleImpl <em>Arduino Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ArduinoModuleImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoModule()
		 * @generated
		 */
		EClass ARDUINO_MODULE = eINSTANCE.getArduinoModule();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.Module <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.Module
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AnalogPinImpl <em>Analog Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AnalogPinImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAnalogPin()
		 * @generated
		 */
		EClass ANALOG_PIN = eINSTANCE.getAnalogPin();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALOG_PIN__MODULE = eINSTANCE.getAnalogPin_Module();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ArduinoAnalogModuleImpl <em>Arduino Analog Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ArduinoAnalogModuleImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getArduinoAnalogModule()
		 * @generated
		 */
		EClass ARDUINO_ANALOG_MODULE = eINSTANCE.getArduinoAnalogModule();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RoverProgramImpl <em>Rover Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RoverProgramImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverProgram()
		 * @generated
		 */
		EClass ROVER_PROGRAM = eINSTANCE.getRoverProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROVER_PROGRAM__NAME = eINSTANCE.getRoverProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__PARAMS = eINSTANCE.getRoverProgram_Params();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROVER_PROGRAM__BLOCK = eINSTANCE.getRoverProgram_Block();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ParamImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.StatementImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Enclosing</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__ENCLOSING = eINSTANCE.getStatement_Enclosing();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.VarAssignmentImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getVarAssignment()
		 * @generated
		 */
		EClass VAR_ASSIGNMENT = eINSTANCE.getVarAssignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_ASSIGNMENT__NAME = eINSTANCE.getVarAssignment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_ASSIGNMENT__VALUE = eINSTANCE.getVarAssignment_Value();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ConditionalImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__EXPR = eINSTANCE.getConditional_Expr();

		/**
		 * The meta object literal for the '<em><b>Cond True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__COND_TRUE = eINSTANCE.getConditional_CondTrue();

		/**
		 * The meta object literal for the '<em><b>Cond False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__COND_FALSE = eINSTANCE.getConditional_CondFalse();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LoopImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__EXPR = eINSTANCE.getLoop_Expr();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BLOCK = eINSTANCE.getLoop_Block();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RclBlockImpl <em>Rcl Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RclBlockImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRclBlock()
		 * @generated
		 */
		EClass RCL_BLOCK = eINSTANCE.getRclBlock();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCL_BLOCK__STMTS = eINSTANCE.getRclBlock_Stmts();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QueryImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.TemperatureQueryImpl <em>Temperature Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.TemperatureQueryImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTemperatureQuery()
		 * @generated
		 */
		EClass TEMPERATURE_QUERY = eINSTANCE.getTemperatureQuery();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.HumidityQueryImpl <em>Humidity Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.HumidityQueryImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getHumidityQuery()
		 * @generated
		 */
		EClass HUMIDITY_QUERY = eINSTANCE.getHumidityQuery();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.MessageQueryImpl <em>Message Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.MessageQueryImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMessageQuery()
		 * @generated
		 */
		EClass MESSAGE_QUERY = eINSTANCE.getMessageQuery();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ObstacleQueryImpl <em>Obstacle Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ObstacleQueryImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getObstacleQuery()
		 * @generated
		 */
		EClass OBSTACLE_QUERY = eINSTANCE.getObstacleQuery();

		/**
		 * The meta object literal for the '<em><b>Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE_QUERY__FRONT = eINSTANCE.getObstacleQuery_Front();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RoverExpressionImpl <em>Rover Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RoverExpressionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverExpression()
		 * @generated
		 */
		EClass ROVER_EXPRESSION = eINSTANCE.getRoverExpression();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.NumericExpressionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericExpression()
		 * @generated
		 */
		EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_EXPRESSION__LHS = eINSTANCE.getNumericExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_EXPRESSION__RHS = eINSTANCE.getNumericExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_EXPRESSION__OP = eINSTANCE.getNumericExpression_Op();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.StringExpressionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__LHS = eINSTANCE.getStringExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__RHS = eINSTANCE.getStringExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__OP = eINSTANCE.getStringExpression_Op();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BooleanExpressionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__LHS = eINSTANCE.getBooleanExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__RHS = eINSTANCE.getBooleanExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__OP = eINSTANCE.getBooleanExpression_Op();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RoverValueImpl <em>Rover Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RoverValueImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRoverValue()
		 * @generated
		 */
		EClass ROVER_VALUE = eINSTANCE.getRoverValue();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.NumberValueImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>NValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__NVALUE = eINSTANCE.getNumberValue_NValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_VALUE__UNIT = eINSTANCE.getNumberValue_Unit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.StringValueImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>SValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__SVALUE = eINSTANCE.getStringValue_SValue();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BooleanValueImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>BValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__BVALUE = eINSTANCE.getBooleanValue_BValue();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ForwardActionImpl <em>Forward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ForwardActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getForwardAction()
		 * @generated
		 */
		EClass FORWARD_ACTION = eINSTANCE.getForwardAction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ForwardMinActionImpl <em>Forward Min Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ForwardMinActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getForwardMinAction()
		 * @generated
		 */
		EClass FORWARD_MIN_ACTION = eINSTANCE.getForwardMinAction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD_MIN_ACTION__DISTANCE = eINSTANCE.getForwardMinAction_Distance();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BackwardActionImpl <em>Backward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BackwardActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBackwardAction()
		 * @generated
		 */
		EClass BACKWARD_ACTION = eINSTANCE.getBackwardAction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.BackwardMinActionImpl <em>Backward Min Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.BackwardMinActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBackwardMinAction()
		 * @generated
		 */
		EClass BACKWARD_MIN_ACTION = eINSTANCE.getBackwardMinAction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKWARD_MIN_ACTION__DISTANCE = eINSTANCE.getBackwardMinAction_Distance();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.TurnActionImpl <em>Turn Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.TurnActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurnAction()
		 * @generated
		 */
		EClass TURN_ACTION = eINSTANCE.getTurnAction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.TurnDegActionImpl <em>Turn Deg Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.TurnDegActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurnDegAction()
		 * @generated
		 */
		EClass TURN_DEG_ACTION = eINSTANCE.getTurnDegAction();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN_DEG_ACTION__DEGREES = eINSTANCE.getTurnDegAction_Degrees();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.StopActionImpl <em>Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.StopActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStopAction()
		 * @generated
		 */
		EClass STOP_ACTION = eINSTANCE.getStopAction();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LogActionImpl <em>Log Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LogActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLogAction()
		 * @generated
		 */
		EClass LOG_ACTION = eINSTANCE.getLogAction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ACTION__MESSAGE = eINSTANCE.getLogAction_Message();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.SendActionImpl <em>Send Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.SendActionImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getSendAction()
		 * @generated
		 */
		EClass SEND_ACTION = eINSTANCE.getSendAction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_ACTION__MESSAGE = eINSTANCE.getSendAction_Message();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.VarRefImpl <em>Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.VarRefImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getVarRef()
		 * @generated
		 */
		EClass VAR_REF = eINSTANCE.getVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.UnitImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthUnitImpl <em>Length Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthUnitImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthUnit()
		 * @generated
		 */
		EClass LENGTH_UNIT = eINSTANCE.getLengthUnit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.CentimeterImpl <em>Centimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.CentimeterImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getCentimeter()
		 * @generated
		 */
		EClass CENTIMETER = eINSTANCE.getCentimeter();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.MillimeterImpl <em>Millimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.MillimeterImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMillimeter()
		 * @generated
		 */
		EClass MILLIMETER = eINSTANCE.getMillimeter();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.MeterImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.FootImpl <em>Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.FootImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getFoot()
		 * @generated
		 */
		EClass FOOT = eINSTANCE.getFoot();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.InchImpl <em>Inch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.InchImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getInch()
		 * @generated
		 */
		EClass INCH = eINSTANCE.getInch();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.YardImpl <em>Yard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.YardImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getYard()
		 * @generated
		 */
		EClass YARD = eINSTANCE.getYard();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.MetricSystemUnitImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getMetricSystemUnit()
		 * @generated
		 */
		EClass METRIC_SYSTEM_UNIT = eINSTANCE.getMetricSystemUnit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.ImperialSystemUnitImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getImperialSystemUnit()
		 * @generated
		 */
		EClass IMPERIAL_SYSTEM_UNIT = eINSTANCE.getImperialSystemUnit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleUnitImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleUnit()
		 * @generated
		 */
		EClass ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.RadianImpl <em>Radian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.RadianImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getRadian()
		 * @generated
		 */
		EClass RADIAN = eINSTANCE.getRadian();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.DegreeImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.TurnImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.GradianImpl <em>Gradian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.GradianImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getGradian()
		 * @generated
		 */
		EClass GRADIAN = eINSTANCE.getGradian();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.NumericValue <em>Numeric Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.NumericValue
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericValue()
		 * @generated
		 */
		EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityOperation()
		 * @generated
		 */
		EClass QUANTITY_OPERATION = eINSTANCE.getQuantityOperation();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthOperationImpl <em>Length Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthOperation()
		 * @generated
		 */
		EClass LENGTH_OPERATION = eINSTANCE.getLengthOperation();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthAddImpl <em>Length Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthAddImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthAdd()
		 * @generated
		 */
		EClass LENGTH_ADD = eINSTANCE.getLengthAdd();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthSubtractImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthSubtract()
		 * @generated
		 */
		EClass LENGTH_SUBTRACT = eINSTANCE.getLengthSubtract();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthScalarMultiplyImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthScalarMultiply()
		 * @generated
		 */
		EClass LENGTH_SCALAR_MULTIPLY = eINSTANCE.getLengthScalarMultiply();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthScalarDivideImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthScalarDivide()
		 * @generated
		 */
		EClass LENGTH_SCALAR_DIVIDE = eINSTANCE.getLengthScalarDivide();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthEqualsImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthEquals()
		 * @generated
		 */
		EClass LENGTH_EQUALS = eINSTANCE.getLengthEquals();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthDistinctImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthDistinct()
		 * @generated
		 */
		EClass LENGTH_DISTINCT = eINSTANCE.getLengthDistinct();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthSmallerImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthSmaller()
		 * @generated
		 */
		EClass LENGTH_SMALLER = eINSTANCE.getLengthSmaller();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.LengthGreaterImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getLengthGreater()
		 * @generated
		 */
		EClass LENGTH_GREATER = eINSTANCE.getLengthGreater();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleOperation()
		 * @generated
		 */
		EClass ANGLE_OPERATION = eINSTANCE.getAngleOperation();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleAddImpl <em>Angle Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleAddImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleAdd()
		 * @generated
		 */
		EClass ANGLE_ADD = eINSTANCE.getAngleAdd();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleSubtractImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleSubtract()
		 * @generated
		 */
		EClass ANGLE_SUBTRACT = eINSTANCE.getAngleSubtract();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleScalarMultiplyImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleScalarMultiply()
		 * @generated
		 */
		EClass ANGLE_SCALAR_MULTIPLY = eINSTANCE.getAngleScalarMultiply();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleScalarDivideImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleScalarDivide()
		 * @generated
		 */
		EClass ANGLE_SCALAR_DIVIDE = eINSTANCE.getAngleScalarDivide();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleEqualsImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleEquals()
		 * @generated
		 */
		EClass ANGLE_EQUALS = eINSTANCE.getAngleEquals();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleDistinctImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleDistinct()
		 * @generated
		 */
		EClass ANGLE_DISTINCT = eINSTANCE.getAngleDistinct();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleSmallerImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleSmaller()
		 * @generated
		 */
		EClass ANGLE_SMALLER = eINSTANCE.getAngleSmaller();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.AngleGreaterImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getAngleGreater()
		 * @generated
		 */
		EClass ANGLE_GREATER = eINSTANCE.getAngleGreater();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityArithmeticOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityArithmeticOperation()
		 * @generated
		 */
		EClass QUANTITY_ARITHMETIC_OPERATION = eINSTANCE.getQuantityArithmeticOperation();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityComparisonOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityComparisonOperation()
		 * @generated
		 */
		EClass QUANTITY_COMPARISON_OPERATION = eINSTANCE.getQuantityComparisonOperation();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityHomogenousOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityHomogenousOperation()
		 * @generated
		 */
		EClass QUANTITY_HOMOGENOUS_OPERATION = eINSTANCE.getQuantityHomogenousOperation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_HOMOGENOUS_OPERATION__LHS = eINSTANCE.getQuantityHomogenousOperation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_HOMOGENOUS_OPERATION__RHS = eINSTANCE.getQuantityHomogenousOperation_Rhs();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.impl.QuantityScalarOperationImpl
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getQuantityScalarOperation()
		 * @generated
		 */
		EClass QUANTITY_SCALAR_OPERATION = eINSTANCE.getQuantityScalarOperation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_SCALAR_OPERATION__LHS = eINSTANCE.getQuantityScalarOperation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_SCALAR_OPERATION__RHS = eINSTANCE.getQuantityScalarOperation_Rhs();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.NumericOperator <em>Numeric Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.NumericOperator
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getNumericOperator()
		 * @generated
		 */
		EEnum NUMERIC_OPERATOR = eINSTANCE.getNumericOperator();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.StringOperator
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link rover.raspirovermt.raspirover.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.raspirovermt.raspirover.BooleanOperator
		 * @see rover.raspirovermt.raspirover.impl.RaspiroverPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //RaspiroverPackage
