/**
 */
package rover.units.units.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rover.units.units.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rover.units.units.UnitsPackage
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
	 * Creates a new adapter for an object of class '{@link rover.units.units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthUnit
	 * @generated
	 */
	public Adapter createLengthUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Centimeter
	 * @generated
	 */
	public Adapter createCentimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Millimeter
	 * @generated
	 */
	public Adapter createMillimeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Foot
	 * @generated
	 */
	public Adapter createFootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Inch
	 * @generated
	 */
	public Adapter createInchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Yard
	 * @generated
	 */
	public Adapter createYardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.MetricSystemUnit
	 * @generated
	 */
	public Adapter createMetricSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.ImperialSystemUnit
	 * @generated
	 */
	public Adapter createImperialSystemUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleUnit
	 * @generated
	 */
	public Adapter createAngleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Radian
	 * @generated
	 */
	public Adapter createRadianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Degree
	 * @generated
	 */
	public Adapter createDegreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Gradian
	 * @generated
	 */
	public Adapter createGradianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.Angle
	 * @generated
	 */
	public Adapter createAngleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.QuantityOperation
	 * @generated
	 */
	public Adapter createQuantityOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthOperation
	 * @generated
	 */
	public Adapter createLengthOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthAdd
	 * @generated
	 */
	public Adapter createLengthAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthSubtract
	 * @generated
	 */
	public Adapter createLengthSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthScalarMultiply
	 * @generated
	 */
	public Adapter createLengthScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthScalarDivide
	 * @generated
	 */
	public Adapter createLengthScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthEquals
	 * @generated
	 */
	public Adapter createLengthEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthDistinct
	 * @generated
	 */
	public Adapter createLengthDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthSmaller
	 * @generated
	 */
	public Adapter createLengthSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.LengthGreater
	 * @generated
	 */
	public Adapter createLengthGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleOperation
	 * @generated
	 */
	public Adapter createAngleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleAdd
	 * @generated
	 */
	public Adapter createAngleAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleSubtract
	 * @generated
	 */
	public Adapter createAngleSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleScalarMultiply
	 * @generated
	 */
	public Adapter createAngleScalarMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleScalarDivide
	 * @generated
	 */
	public Adapter createAngleScalarDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleEquals
	 * @generated
	 */
	public Adapter createAngleEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleDistinct
	 * @generated
	 */
	public Adapter createAngleDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleSmaller
	 * @generated
	 */
	public Adapter createAngleSmallerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.AngleGreater
	 * @generated
	 */
	public Adapter createAngleGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.QuantityArithmeticOperation
	 * @generated
	 */
	public Adapter createQuantityArithmeticOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.QuantityComparisonOperation
	 * @generated
	 */
	public Adapter createQuantityComparisonOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.QuantityHomogenousOperation
	 * @generated
	 */
	public Adapter createQuantityHomogenousOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rover.units.units.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rover.units.units.QuantityScalarOperation
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
