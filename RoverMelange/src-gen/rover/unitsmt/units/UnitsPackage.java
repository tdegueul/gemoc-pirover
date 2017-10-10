/**
 */
package rover.unitsmt.units;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see rover.unitsmt.units.UnitsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UnitsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rover.unitsmt/units/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "units";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsPackage eINSTANCE = rover.unitsmt.units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.UnitImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthUnitImpl <em>Length Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthUnitImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthUnit()
	 * @generated
	 */
	int LENGTH_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Length Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.MetricSystemUnitImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMetricSystemUnit()
	 * @generated
	 */
	int METRIC_SYSTEM_UNIT = 8;

	/**
	 * The number of structural features of the '<em>Metric System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.CentimeterImpl <em>Centimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.CentimeterImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getCentimeter()
	 * @generated
	 */
	int CENTIMETER = 2;

	/**
	 * The number of structural features of the '<em>Centimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.MillimeterImpl <em>Millimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.MillimeterImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMillimeter()
	 * @generated
	 */
	int MILLIMETER = 3;

	/**
	 * The number of structural features of the '<em>Millimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILLIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.MeterImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 4;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.ImperialSystemUnitImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getImperialSystemUnit()
	 * @generated
	 */
	int IMPERIAL_SYSTEM_UNIT = 9;

	/**
	 * The number of structural features of the '<em>Imperial System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.FootImpl <em>Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.FootImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getFoot()
	 * @generated
	 */
	int FOOT = 5;

	/**
	 * The number of structural features of the '<em>Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.InchImpl <em>Inch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.InchImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getInch()
	 * @generated
	 */
	int INCH = 6;

	/**
	 * The number of structural features of the '<em>Inch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCH_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.YardImpl <em>Yard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.YardImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getYard()
	 * @generated
	 */
	int YARD = 7;

	/**
	 * The number of structural features of the '<em>Yard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YARD_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleUnitImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 10;

	/**
	 * The number of structural features of the '<em>Angle Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.RadianImpl <em>Radian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.RadianImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getRadian()
	 * @generated
	 */
	int RADIAN = 11;

	/**
	 * The number of structural features of the '<em>Radian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.DegreeImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 12;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.TurnImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 13;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.GradianImpl <em>Gradian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.GradianImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getGradian()
	 * @generated
	 */
	int GRADIAN = 14;

	/**
	 * The number of structural features of the '<em>Gradian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 15;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 16;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 17;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityOperation()
	 * @generated
	 */
	int QUANTITY_OPERATION = 18;

	/**
	 * The number of structural features of the '<em>Quantity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthOperationImpl <em>Length Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthOperation()
	 * @generated
	 */
	int LENGTH_OPERATION = 19;

	/**
	 * The number of structural features of the '<em>Length Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthAddImpl <em>Length Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthAddImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthAdd()
	 * @generated
	 */
	int LENGTH_ADD = 20;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthSubtractImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthSubtract()
	 * @generated
	 */
	int LENGTH_SUBTRACT = 21;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthScalarMultiplyImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthScalarMultiply()
	 * @generated
	 */
	int LENGTH_SCALAR_MULTIPLY = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthScalarDivideImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthScalarDivide()
	 * @generated
	 */
	int LENGTH_SCALAR_DIVIDE = 23;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthEqualsImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthEquals()
	 * @generated
	 */
	int LENGTH_EQUALS = 24;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthDistinctImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthDistinct()
	 * @generated
	 */
	int LENGTH_DISTINCT = 25;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthSmallerImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthSmaller()
	 * @generated
	 */
	int LENGTH_SMALLER = 26;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.LengthGreaterImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthGreater()
	 * @generated
	 */
	int LENGTH_GREATER = 27;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleOperation()
	 * @generated
	 */
	int ANGLE_OPERATION = 28;

	/**
	 * The number of structural features of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleAddImpl <em>Angle Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleAddImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleAdd()
	 * @generated
	 */
	int ANGLE_ADD = 29;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleSubtractImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleSubtract()
	 * @generated
	 */
	int ANGLE_SUBTRACT = 30;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleScalarMultiplyImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleScalarMultiply()
	 * @generated
	 */
	int ANGLE_SCALAR_MULTIPLY = 31;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleScalarDivideImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleScalarDivide()
	 * @generated
	 */
	int ANGLE_SCALAR_DIVIDE = 32;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleEqualsImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleEquals()
	 * @generated
	 */
	int ANGLE_EQUALS = 33;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleDistinctImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleDistinct()
	 * @generated
	 */
	int ANGLE_DISTINCT = 34;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleSmallerImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleSmaller()
	 * @generated
	 */
	int ANGLE_SMALLER = 35;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.AngleGreaterImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleGreater()
	 * @generated
	 */
	int ANGLE_GREATER = 36;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityArithmeticOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityArithmeticOperation()
	 * @generated
	 */
	int QUANTITY_ARITHMETIC_OPERATION = 37;

	/**
	 * The number of structural features of the '<em>Quantity Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ARITHMETIC_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityComparisonOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityComparisonOperation()
	 * @generated
	 */
	int QUANTITY_COMPARISON_OPERATION = 38;

	/**
	 * The number of structural features of the '<em>Quantity Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARISON_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityHomogenousOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityHomogenousOperation()
	 * @generated
	 */
	int QUANTITY_HOMOGENOUS_OPERATION = 39;

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
	 * The meta object id for the '{@link rover.unitsmt.units.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rover.unitsmt.units.impl.QuantityScalarOperationImpl
	 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityScalarOperation()
	 * @generated
	 */
	int QUANTITY_SCALAR_OPERATION = 40;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION__LHS = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' attribute.
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
	 * Returns the meta object for class '{@link rover.unitsmt.units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see rover.unitsmt.units.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Unit</em>'.
	 * @see rover.unitsmt.units.LengthUnit
	 * @generated
	 */
	EClass getLengthUnit();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centimeter</em>'.
	 * @see rover.unitsmt.units.Centimeter
	 * @generated
	 */
	EClass getCentimeter();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Millimeter</em>'.
	 * @see rover.unitsmt.units.Millimeter
	 * @generated
	 */
	EClass getMillimeter();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see rover.unitsmt.units.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foot</em>'.
	 * @see rover.unitsmt.units.Foot
	 * @generated
	 */
	EClass getFoot();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inch</em>'.
	 * @see rover.unitsmt.units.Inch
	 * @generated
	 */
	EClass getInch();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yard</em>'.
	 * @see rover.unitsmt.units.Yard
	 * @generated
	 */
	EClass getYard();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric System Unit</em>'.
	 * @see rover.unitsmt.units.MetricSystemUnit
	 * @generated
	 */
	EClass getMetricSystemUnit();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperial System Unit</em>'.
	 * @see rover.unitsmt.units.ImperialSystemUnit
	 * @generated
	 */
	EClass getImperialSystemUnit();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Unit</em>'.
	 * @see rover.unitsmt.units.AngleUnit
	 * @generated
	 */
	EClass getAngleUnit();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radian</em>'.
	 * @see rover.unitsmt.units.Radian
	 * @generated
	 */
	EClass getRadian();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see rover.unitsmt.units.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see rover.unitsmt.units.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradian</em>'.
	 * @see rover.unitsmt.units.Gradian
	 * @generated
	 */
	EClass getGradian();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see rover.unitsmt.units.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link rover.unitsmt.units.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see rover.unitsmt.units.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the attribute '{@link rover.unitsmt.units.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rover.unitsmt.units.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see rover.unitsmt.units.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see rover.unitsmt.units.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Operation</em>'.
	 * @see rover.unitsmt.units.QuantityOperation
	 * @generated
	 */
	EClass getQuantityOperation();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Operation</em>'.
	 * @see rover.unitsmt.units.LengthOperation
	 * @generated
	 */
	EClass getLengthOperation();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Add</em>'.
	 * @see rover.unitsmt.units.LengthAdd
	 * @generated
	 */
	EClass getLengthAdd();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Subtract</em>'.
	 * @see rover.unitsmt.units.LengthSubtract
	 * @generated
	 */
	EClass getLengthSubtract();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Multiply</em>'.
	 * @see rover.unitsmt.units.LengthScalarMultiply
	 * @generated
	 */
	EClass getLengthScalarMultiply();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Divide</em>'.
	 * @see rover.unitsmt.units.LengthScalarDivide
	 * @generated
	 */
	EClass getLengthScalarDivide();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Equals</em>'.
	 * @see rover.unitsmt.units.LengthEquals
	 * @generated
	 */
	EClass getLengthEquals();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Distinct</em>'.
	 * @see rover.unitsmt.units.LengthDistinct
	 * @generated
	 */
	EClass getLengthDistinct();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Smaller</em>'.
	 * @see rover.unitsmt.units.LengthSmaller
	 * @generated
	 */
	EClass getLengthSmaller();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Greater</em>'.
	 * @see rover.unitsmt.units.LengthGreater
	 * @generated
	 */
	EClass getLengthGreater();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Operation</em>'.
	 * @see rover.unitsmt.units.AngleOperation
	 * @generated
	 */
	EClass getAngleOperation();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Add</em>'.
	 * @see rover.unitsmt.units.AngleAdd
	 * @generated
	 */
	EClass getAngleAdd();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Subtract</em>'.
	 * @see rover.unitsmt.units.AngleSubtract
	 * @generated
	 */
	EClass getAngleSubtract();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Multiply</em>'.
	 * @see rover.unitsmt.units.AngleScalarMultiply
	 * @generated
	 */
	EClass getAngleScalarMultiply();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Divide</em>'.
	 * @see rover.unitsmt.units.AngleScalarDivide
	 * @generated
	 */
	EClass getAngleScalarDivide();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Equals</em>'.
	 * @see rover.unitsmt.units.AngleEquals
	 * @generated
	 */
	EClass getAngleEquals();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Distinct</em>'.
	 * @see rover.unitsmt.units.AngleDistinct
	 * @generated
	 */
	EClass getAngleDistinct();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Smaller</em>'.
	 * @see rover.unitsmt.units.AngleSmaller
	 * @generated
	 */
	EClass getAngleSmaller();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Greater</em>'.
	 * @see rover.unitsmt.units.AngleGreater
	 * @generated
	 */
	EClass getAngleGreater();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Arithmetic Operation</em>'.
	 * @see rover.unitsmt.units.QuantityArithmeticOperation
	 * @generated
	 */
	EClass getQuantityArithmeticOperation();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Comparison Operation</em>'.
	 * @see rover.unitsmt.units.QuantityComparisonOperation
	 * @generated
	 */
	EClass getQuantityComparisonOperation();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Homogenous Operation</em>'.
	 * @see rover.unitsmt.units.QuantityHomogenousOperation
	 * @generated
	 */
	EClass getQuantityHomogenousOperation();

	/**
	 * Returns the meta object for the reference '{@link rover.unitsmt.units.QuantityHomogenousOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see rover.unitsmt.units.QuantityHomogenousOperation#getLhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Lhs();

	/**
	 * Returns the meta object for the reference '{@link rover.unitsmt.units.QuantityHomogenousOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see rover.unitsmt.units.QuantityHomogenousOperation#getRhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Rhs();

	/**
	 * Returns the meta object for class '{@link rover.unitsmt.units.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Scalar Operation</em>'.
	 * @see rover.unitsmt.units.QuantityScalarOperation
	 * @generated
	 */
	EClass getQuantityScalarOperation();

	/**
	 * Returns the meta object for the reference '{@link rover.unitsmt.units.QuantityScalarOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see rover.unitsmt.units.QuantityScalarOperation#getLhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EReference getQuantityScalarOperation_Lhs();

	/**
	 * Returns the meta object for the attribute '{@link rover.unitsmt.units.QuantityScalarOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rhs</em>'.
	 * @see rover.unitsmt.units.QuantityScalarOperation#getRhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EAttribute getQuantityScalarOperation_Rhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

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
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.UnitImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthUnitImpl <em>Length Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthUnitImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthUnit()
		 * @generated
		 */
		EClass LENGTH_UNIT = eINSTANCE.getLengthUnit();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.CentimeterImpl <em>Centimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.CentimeterImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getCentimeter()
		 * @generated
		 */
		EClass CENTIMETER = eINSTANCE.getCentimeter();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.MillimeterImpl <em>Millimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.MillimeterImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMillimeter()
		 * @generated
		 */
		EClass MILLIMETER = eINSTANCE.getMillimeter();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.MeterImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.FootImpl <em>Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.FootImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getFoot()
		 * @generated
		 */
		EClass FOOT = eINSTANCE.getFoot();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.InchImpl <em>Inch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.InchImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getInch()
		 * @generated
		 */
		EClass INCH = eINSTANCE.getInch();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.YardImpl <em>Yard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.YardImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getYard()
		 * @generated
		 */
		EClass YARD = eINSTANCE.getYard();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.MetricSystemUnitImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getMetricSystemUnit()
		 * @generated
		 */
		EClass METRIC_SYSTEM_UNIT = eINSTANCE.getMetricSystemUnit();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.ImperialSystemUnitImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getImperialSystemUnit()
		 * @generated
		 */
		EClass IMPERIAL_SYSTEM_UNIT = eINSTANCE.getImperialSystemUnit();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleUnitImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleUnit()
		 * @generated
		 */
		EClass ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.RadianImpl <em>Radian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.RadianImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getRadian()
		 * @generated
		 */
		EClass RADIAN = eINSTANCE.getRadian();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.DegreeImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.TurnImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.GradianImpl <em>Gradian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.GradianImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getGradian()
		 * @generated
		 */
		EClass GRADIAN = eINSTANCE.getGradian();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantity()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityOperation()
		 * @generated
		 */
		EClass QUANTITY_OPERATION = eINSTANCE.getQuantityOperation();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthOperationImpl <em>Length Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthOperation()
		 * @generated
		 */
		EClass LENGTH_OPERATION = eINSTANCE.getLengthOperation();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthAddImpl <em>Length Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthAddImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthAdd()
		 * @generated
		 */
		EClass LENGTH_ADD = eINSTANCE.getLengthAdd();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthSubtractImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthSubtract()
		 * @generated
		 */
		EClass LENGTH_SUBTRACT = eINSTANCE.getLengthSubtract();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthScalarMultiplyImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthScalarMultiply()
		 * @generated
		 */
		EClass LENGTH_SCALAR_MULTIPLY = eINSTANCE.getLengthScalarMultiply();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthScalarDivideImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthScalarDivide()
		 * @generated
		 */
		EClass LENGTH_SCALAR_DIVIDE = eINSTANCE.getLengthScalarDivide();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthEqualsImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthEquals()
		 * @generated
		 */
		EClass LENGTH_EQUALS = eINSTANCE.getLengthEquals();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthDistinctImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthDistinct()
		 * @generated
		 */
		EClass LENGTH_DISTINCT = eINSTANCE.getLengthDistinct();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthSmallerImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthSmaller()
		 * @generated
		 */
		EClass LENGTH_SMALLER = eINSTANCE.getLengthSmaller();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.LengthGreaterImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getLengthGreater()
		 * @generated
		 */
		EClass LENGTH_GREATER = eINSTANCE.getLengthGreater();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleOperation()
		 * @generated
		 */
		EClass ANGLE_OPERATION = eINSTANCE.getAngleOperation();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleAddImpl <em>Angle Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleAddImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleAdd()
		 * @generated
		 */
		EClass ANGLE_ADD = eINSTANCE.getAngleAdd();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleSubtractImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleSubtract()
		 * @generated
		 */
		EClass ANGLE_SUBTRACT = eINSTANCE.getAngleSubtract();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleScalarMultiplyImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleScalarMultiply()
		 * @generated
		 */
		EClass ANGLE_SCALAR_MULTIPLY = eINSTANCE.getAngleScalarMultiply();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleScalarDivideImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleScalarDivide()
		 * @generated
		 */
		EClass ANGLE_SCALAR_DIVIDE = eINSTANCE.getAngleScalarDivide();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleEqualsImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleEquals()
		 * @generated
		 */
		EClass ANGLE_EQUALS = eINSTANCE.getAngleEquals();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleDistinctImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleDistinct()
		 * @generated
		 */
		EClass ANGLE_DISTINCT = eINSTANCE.getAngleDistinct();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleSmallerImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleSmaller()
		 * @generated
		 */
		EClass ANGLE_SMALLER = eINSTANCE.getAngleSmaller();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.AngleGreaterImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getAngleGreater()
		 * @generated
		 */
		EClass ANGLE_GREATER = eINSTANCE.getAngleGreater();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityArithmeticOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityArithmeticOperation()
		 * @generated
		 */
		EClass QUANTITY_ARITHMETIC_OPERATION = eINSTANCE.getQuantityArithmeticOperation();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityComparisonOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityComparisonOperation()
		 * @generated
		 */
		EClass QUANTITY_COMPARISON_OPERATION = eINSTANCE.getQuantityComparisonOperation();

		/**
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityHomogenousOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityHomogenousOperation()
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
		 * The meta object literal for the '{@link rover.unitsmt.units.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rover.unitsmt.units.impl.QuantityScalarOperationImpl
		 * @see rover.unitsmt.units.impl.UnitsPackageImpl#getQuantityScalarOperation()
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
		 * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_SCALAR_OPERATION__RHS = eINSTANCE.getQuantityScalarOperation_Rhs();

	}

} //UnitsPackage
