/**
 */
package rover.units.units.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rover.units.units.*;

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
 * @see rover.units.units.UnitsPackage
 * @generated
 */
public class UnitsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnitsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsSwitch() {
		if (modelPackage == null) {
			modelPackage = UnitsPackage.eINSTANCE;
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
			case UnitsPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_UNIT: {
				LengthUnit lengthUnit = (LengthUnit)theEObject;
				T result = caseLengthUnit(lengthUnit);
				if (result == null) result = caseUnit(lengthUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.CENTIMETER: {
				Centimeter centimeter = (Centimeter)theEObject;
				T result = caseCentimeter(centimeter);
				if (result == null) result = caseMetricSystemUnit(centimeter);
				if (result == null) result = caseLengthUnit(centimeter);
				if (result == null) result = caseUnit(centimeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.MILLIMETER: {
				Millimeter millimeter = (Millimeter)theEObject;
				T result = caseMillimeter(millimeter);
				if (result == null) result = caseMetricSystemUnit(millimeter);
				if (result == null) result = caseLengthUnit(millimeter);
				if (result == null) result = caseUnit(millimeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = caseMetricSystemUnit(meter);
				if (result == null) result = caseLengthUnit(meter);
				if (result == null) result = caseUnit(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.FOOT: {
				Foot foot = (Foot)theEObject;
				T result = caseFoot(foot);
				if (result == null) result = caseImperialSystemUnit(foot);
				if (result == null) result = caseLengthUnit(foot);
				if (result == null) result = caseUnit(foot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.INCH: {
				Inch inch = (Inch)theEObject;
				T result = caseInch(inch);
				if (result == null) result = caseImperialSystemUnit(inch);
				if (result == null) result = caseLengthUnit(inch);
				if (result == null) result = caseUnit(inch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.YARD: {
				Yard yard = (Yard)theEObject;
				T result = caseYard(yard);
				if (result == null) result = caseImperialSystemUnit(yard);
				if (result == null) result = caseLengthUnit(yard);
				if (result == null) result = caseUnit(yard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.METRIC_SYSTEM_UNIT: {
				MetricSystemUnit metricSystemUnit = (MetricSystemUnit)theEObject;
				T result = caseMetricSystemUnit(metricSystemUnit);
				if (result == null) result = caseUnit(metricSystemUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.IMPERIAL_SYSTEM_UNIT: {
				ImperialSystemUnit imperialSystemUnit = (ImperialSystemUnit)theEObject;
				T result = caseImperialSystemUnit(imperialSystemUnit);
				if (result == null) result = caseUnit(imperialSystemUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_UNIT: {
				AngleUnit angleUnit = (AngleUnit)theEObject;
				T result = caseAngleUnit(angleUnit);
				if (result == null) result = caseUnit(angleUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.RADIAN: {
				Radian radian = (Radian)theEObject;
				T result = caseRadian(radian);
				if (result == null) result = caseAngleUnit(radian);
				if (result == null) result = caseUnit(radian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.DEGREE: {
				Degree degree = (Degree)theEObject;
				T result = caseDegree(degree);
				if (result == null) result = caseAngleUnit(degree);
				if (result == null) result = caseUnit(degree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.TURN: {
				Turn turn = (Turn)theEObject;
				T result = caseTurn(turn);
				if (result == null) result = caseAngleUnit(turn);
				if (result == null) result = caseUnit(turn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.GRADIAN: {
				Gradian gradian = (Gradian)theEObject;
				T result = caseGradian(gradian);
				if (result == null) result = caseAngleUnit(gradian);
				if (result == null) result = caseUnit(gradian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseQuantity(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE: {
				Angle angle = (Angle)theEObject;
				T result = caseAngle(angle);
				if (result == null) result = caseQuantity(angle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T result = caseNumericValue(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY_OPERATION: {
				QuantityOperation quantityOperation = (QuantityOperation)theEObject;
				T result = caseQuantityOperation(quantityOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_OPERATION: {
				LengthOperation lengthOperation = (LengthOperation)theEObject;
				T result = caseLengthOperation(lengthOperation);
				if (result == null) result = caseQuantityOperation(lengthOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_ADD: {
				LengthAdd lengthAdd = (LengthAdd)theEObject;
				T result = caseLengthAdd(lengthAdd);
				if (result == null) result = caseLengthOperation(lengthAdd);
				if (result == null) result = caseQuantityHomogenousOperation(lengthAdd);
				if (result == null) result = caseQuantityOperation(lengthAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_SUBTRACT: {
				LengthSubtract lengthSubtract = (LengthSubtract)theEObject;
				T result = caseLengthSubtract(lengthSubtract);
				if (result == null) result = caseLengthOperation(lengthSubtract);
				if (result == null) result = caseQuantityHomogenousOperation(lengthSubtract);
				if (result == null) result = caseQuantityOperation(lengthSubtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_SCALAR_MULTIPLY: {
				LengthScalarMultiply lengthScalarMultiply = (LengthScalarMultiply)theEObject;
				T result = caseLengthScalarMultiply(lengthScalarMultiply);
				if (result == null) result = caseLengthOperation(lengthScalarMultiply);
				if (result == null) result = caseQuantityScalarOperation(lengthScalarMultiply);
				if (result == null) result = caseQuantityOperation(lengthScalarMultiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_SCALAR_DIVIDE: {
				LengthScalarDivide lengthScalarDivide = (LengthScalarDivide)theEObject;
				T result = caseLengthScalarDivide(lengthScalarDivide);
				if (result == null) result = caseLengthOperation(lengthScalarDivide);
				if (result == null) result = caseQuantityScalarOperation(lengthScalarDivide);
				if (result == null) result = caseQuantityOperation(lengthScalarDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_EQUALS: {
				LengthEquals lengthEquals = (LengthEquals)theEObject;
				T result = caseLengthEquals(lengthEquals);
				if (result == null) result = caseLengthOperation(lengthEquals);
				if (result == null) result = caseQuantityHomogenousOperation(lengthEquals);
				if (result == null) result = caseQuantityOperation(lengthEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_DISTINCT: {
				LengthDistinct lengthDistinct = (LengthDistinct)theEObject;
				T result = caseLengthDistinct(lengthDistinct);
				if (result == null) result = caseLengthOperation(lengthDistinct);
				if (result == null) result = caseQuantityHomogenousOperation(lengthDistinct);
				if (result == null) result = caseQuantityOperation(lengthDistinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_SMALLER: {
				LengthSmaller lengthSmaller = (LengthSmaller)theEObject;
				T result = caseLengthSmaller(lengthSmaller);
				if (result == null) result = caseLengthOperation(lengthSmaller);
				if (result == null) result = caseQuantityHomogenousOperation(lengthSmaller);
				if (result == null) result = caseQuantityOperation(lengthSmaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.LENGTH_GREATER: {
				LengthGreater lengthGreater = (LengthGreater)theEObject;
				T result = caseLengthGreater(lengthGreater);
				if (result == null) result = caseLengthOperation(lengthGreater);
				if (result == null) result = caseQuantityHomogenousOperation(lengthGreater);
				if (result == null) result = caseQuantityOperation(lengthGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_OPERATION: {
				AngleOperation angleOperation = (AngleOperation)theEObject;
				T result = caseAngleOperation(angleOperation);
				if (result == null) result = caseQuantityOperation(angleOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_ADD: {
				AngleAdd angleAdd = (AngleAdd)theEObject;
				T result = caseAngleAdd(angleAdd);
				if (result == null) result = caseAngleOperation(angleAdd);
				if (result == null) result = caseQuantityHomogenousOperation(angleAdd);
				if (result == null) result = caseQuantityOperation(angleAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_SUBTRACT: {
				AngleSubtract angleSubtract = (AngleSubtract)theEObject;
				T result = caseAngleSubtract(angleSubtract);
				if (result == null) result = caseAngleOperation(angleSubtract);
				if (result == null) result = caseQuantityHomogenousOperation(angleSubtract);
				if (result == null) result = caseQuantityOperation(angleSubtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_SCALAR_MULTIPLY: {
				AngleScalarMultiply angleScalarMultiply = (AngleScalarMultiply)theEObject;
				T result = caseAngleScalarMultiply(angleScalarMultiply);
				if (result == null) result = caseAngleOperation(angleScalarMultiply);
				if (result == null) result = caseQuantityScalarOperation(angleScalarMultiply);
				if (result == null) result = caseQuantityOperation(angleScalarMultiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_SCALAR_DIVIDE: {
				AngleScalarDivide angleScalarDivide = (AngleScalarDivide)theEObject;
				T result = caseAngleScalarDivide(angleScalarDivide);
				if (result == null) result = caseAngleOperation(angleScalarDivide);
				if (result == null) result = caseQuantityScalarOperation(angleScalarDivide);
				if (result == null) result = caseQuantityOperation(angleScalarDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_EQUALS: {
				AngleEquals angleEquals = (AngleEquals)theEObject;
				T result = caseAngleEquals(angleEquals);
				if (result == null) result = caseAngleOperation(angleEquals);
				if (result == null) result = caseQuantityHomogenousOperation(angleEquals);
				if (result == null) result = caseQuantityOperation(angleEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_DISTINCT: {
				AngleDistinct angleDistinct = (AngleDistinct)theEObject;
				T result = caseAngleDistinct(angleDistinct);
				if (result == null) result = caseAngleOperation(angleDistinct);
				if (result == null) result = caseQuantityHomogenousOperation(angleDistinct);
				if (result == null) result = caseQuantityOperation(angleDistinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_SMALLER: {
				AngleSmaller angleSmaller = (AngleSmaller)theEObject;
				T result = caseAngleSmaller(angleSmaller);
				if (result == null) result = caseAngleOperation(angleSmaller);
				if (result == null) result = caseQuantityHomogenousOperation(angleSmaller);
				if (result == null) result = caseQuantityOperation(angleSmaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.ANGLE_GREATER: {
				AngleGreater angleGreater = (AngleGreater)theEObject;
				T result = caseAngleGreater(angleGreater);
				if (result == null) result = caseAngleOperation(angleGreater);
				if (result == null) result = caseQuantityHomogenousOperation(angleGreater);
				if (result == null) result = caseQuantityOperation(angleGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY_ARITHMETIC_OPERATION: {
				QuantityArithmeticOperation quantityArithmeticOperation = (QuantityArithmeticOperation)theEObject;
				T result = caseQuantityArithmeticOperation(quantityArithmeticOperation);
				if (result == null) result = caseQuantityOperation(quantityArithmeticOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY_COMPARISON_OPERATION: {
				QuantityComparisonOperation quantityComparisonOperation = (QuantityComparisonOperation)theEObject;
				T result = caseQuantityComparisonOperation(quantityComparisonOperation);
				if (result == null) result = caseQuantityOperation(quantityComparisonOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION: {
				QuantityHomogenousOperation quantityHomogenousOperation = (QuantityHomogenousOperation)theEObject;
				T result = caseQuantityHomogenousOperation(quantityHomogenousOperation);
				if (result == null) result = caseQuantityOperation(quantityHomogenousOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnitsPackage.QUANTITY_SCALAR_OPERATION: {
				QuantityScalarOperation quantityScalarOperation = (QuantityScalarOperation)theEObject;
				T result = caseQuantityScalarOperation(quantityScalarOperation);
				if (result == null) result = caseQuantityOperation(quantityScalarOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthUnit(LengthUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centimeter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centimeter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentimeter(Centimeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Millimeter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Millimeter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMillimeter(Millimeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoot(Foot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInch(Inch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYard(Yard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric System Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric System Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricSystemUnit(MetricSystemUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperial System Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperial System Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperialSystemUnit(ImperialSystemUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleUnit(AngleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadian(Radian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegree(Degree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradian(Gradian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngle(Angle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericValue(NumericValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityOperation(QuantityOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthOperation(LengthOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthAdd(LengthAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthSubtract(LengthSubtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Scalar Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthScalarMultiply(LengthScalarMultiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Scalar Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthScalarDivide(LengthScalarDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthEquals(LengthEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthDistinct(LengthDistinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Smaller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthSmaller(LengthSmaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthGreater(LengthGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleOperation(AngleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleAdd(AngleAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleSubtract(AngleSubtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Scalar Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleScalarMultiply(AngleScalarMultiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Scalar Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleScalarDivide(AngleScalarDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleEquals(AngleEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleDistinct(AngleDistinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Smaller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleSmaller(AngleSmaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleGreater(AngleGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Arithmetic Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityArithmeticOperation(QuantityArithmeticOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Comparison Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Comparison Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityComparisonOperation(QuantityComparisonOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Homogenous Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Homogenous Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityHomogenousOperation(QuantityHomogenousOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Scalar Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Scalar Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityScalarOperation(QuantityScalarOperation object) {
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

} //UnitsSwitch
