/**
 */
package rover.unitsmt.units.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rover.unitsmt.units.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rover.unitsmt.units.UnitsPackage
 * @generated
 */
public class UnitsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnitsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UnitsPackage.eINSTANCE;
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
	protected UnitsSwitch<Adapter> modelSwitch =
		new UnitsSwitch<Adapter>() {
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
			public Adapter caseNumericValue(NumericValue object) {
				return createNumericValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthUnit
	 * @generated
	 */
	public Adapter createLengthUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Centimeter
	 * @generated
	 */
	public Adapter createCentimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Millimeter
	 * @generated
	 */
	public Adapter createMillimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Foot
	 * @generated
	 */
	public Adapter createFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Inch
	 * @generated
	 */
	public Adapter createInchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Yard
	 * @generated
	 */
	public Adapter createYardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.MetricSystemUnit
	 * @generated
	 */
	public Adapter createMetricSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.ImperialSystemUnit
	 * @generated
	 */
	public Adapter createImperialSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleUnit
	 * @generated
	 */
	public Adapter createAngleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Radian
	 * @generated
	 */
	public Adapter createRadianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Gradian
	 * @generated
	 */
	public Adapter createGradianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.Angle
	 * @generated
	 */
	public Adapter createAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.QuantityOperation
	 * @generated
	 */
	public Adapter createQuantityOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthOperation
	 * @generated
	 */
	public Adapter createLengthOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthAdd
	 * @generated
	 */
	public Adapter createLengthAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthSubtract
	 * @generated
	 */
	public Adapter createLengthSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthScalarMultiply
	 * @generated
	 */
	public Adapter createLengthScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthScalarDivide
	 * @generated
	 */
	public Adapter createLengthScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthEquals
	 * @generated
	 */
	public Adapter createLengthEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthDistinct
	 * @generated
	 */
	public Adapter createLengthDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthSmaller
	 * @generated
	 */
	public Adapter createLengthSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.LengthGreater
	 * @generated
	 */
	public Adapter createLengthGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleOperation
	 * @generated
	 */
	public Adapter createAngleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleAdd
	 * @generated
	 */
	public Adapter createAngleAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleSubtract
	 * @generated
	 */
	public Adapter createAngleSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleScalarMultiply
	 * @generated
	 */
	public Adapter createAngleScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleScalarDivide
	 * @generated
	 */
	public Adapter createAngleScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleEquals
	 * @generated
	 */
	public Adapter createAngleEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleDistinct
	 * @generated
	 */
	public Adapter createAngleDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleSmaller
	 * @generated
	 */
	public Adapter createAngleSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.AngleGreater
	 * @generated
	 */
	public Adapter createAngleGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.QuantityArithmeticOperation
	 * @generated
	 */
	public Adapter createQuantityArithmeticOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.QuantityComparisonOperation
	 * @generated
	 */
	public Adapter createQuantityComparisonOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.QuantityHomogenousOperation
	 * @generated
	 */
	public Adapter createQuantityHomogenousOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.unitsmt.units.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.unitsmt.units.QuantityScalarOperation
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

} //UnitsAdapterFactory
