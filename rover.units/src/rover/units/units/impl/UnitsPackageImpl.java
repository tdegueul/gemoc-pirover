/**
 */
package rover.units.units.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rover.units.units.Angle;
import rover.units.units.AngleAdd;
import rover.units.units.AngleDistinct;
import rover.units.units.AngleEquals;
import rover.units.units.AngleGreater;
import rover.units.units.AngleOperation;
import rover.units.units.AngleScalarDivide;
import rover.units.units.AngleScalarMultiply;
import rover.units.units.AngleSmaller;
import rover.units.units.AngleSubtract;
import rover.units.units.AngleUnit;
import rover.units.units.Centimeter;
import rover.units.units.Degree;
import rover.units.units.Foot;
import rover.units.units.Gradian;
import rover.units.units.ImperialSystemUnit;
import rover.units.units.Inch;
import rover.units.units.Length;
import rover.units.units.LengthAdd;
import rover.units.units.LengthDistinct;
import rover.units.units.LengthEquals;
import rover.units.units.LengthGreater;
import rover.units.units.LengthOperation;
import rover.units.units.LengthScalarDivide;
import rover.units.units.LengthScalarMultiply;
import rover.units.units.LengthSmaller;
import rover.units.units.LengthSubtract;
import rover.units.units.LengthUnit;
import rover.units.units.Meter;
import rover.units.units.MetricSystemUnit;
import rover.units.units.Millimeter;
import rover.units.units.NumericValue;
import rover.units.units.Quantity;
import rover.units.units.QuantityArithmeticOperation;
import rover.units.units.QuantityComparisonOperation;
import rover.units.units.QuantityHomogenousOperation;
import rover.units.units.QuantityOperation;
import rover.units.units.QuantityScalarOperation;
import rover.units.units.Radian;
import rover.units.units.Turn;
import rover.units.units.Unit;
import rover.units.units.UnitsFactory;
import rover.units.units.UnitsPackage;
import rover.units.units.Yard;

import rover.units.units.util.UnitsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitsPackageImpl extends EPackageImpl implements UnitsPackage {
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
	 * @see rover.units.units.UnitsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnitsPackageImpl() {
		super(eNS_URI, UnitsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnitsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnitsPackage init() {
		if (isInited) return (UnitsPackage)EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Obtain or create and register package
		UnitsPackageImpl theUnitsPackage = (UnitsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnitsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnitsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUnitsPackage.createPackageContents();

		// Initialize created meta-data
		theUnitsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUnitsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return UnitsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUnitsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnitsPackage.eNS_URI, theUnitsPackage);
		return theUnitsPackage;
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
	public UnitsFactory getUnitsFactory() {
		return (UnitsFactory)getEFactoryInstance();
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
		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(unitEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lengthUnitEClass, LengthUnit.class, "LengthUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(lengthUnitEClass, ecorePackage.getEInt(), "asCentimeters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(centimeterEClass, Centimeter.class, "Centimeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(centimeterEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(millimeterEClass, Millimeter.class, "Millimeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(millimeterEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(meterEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(footEClass, Foot.class, "Foot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(footEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inchEClass, Inch.class, "Inch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(inchEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yardEClass, Yard.class, "Yard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yardEClass, ecorePackage.getEString(), "print", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// aspect
		createAspectAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
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
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (unitEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (lengthUnitEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (centimeterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (millimeterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (meterEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (footEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (inchEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (yardEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
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

} //UnitsPackageImpl
