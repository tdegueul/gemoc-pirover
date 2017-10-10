/**
 */
package rover.units.units.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rover.units.units.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rover.units.units.UnitsPackage
 * @generated
 */
public class UnitsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UnitsValidator INSTANCE = new UnitsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rover.units.units";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UnitsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UnitsPackage.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case UnitsPackage.LENGTH_UNIT:
				return validateLengthUnit((LengthUnit)value, diagnostics, context);
			case UnitsPackage.CENTIMETER:
				return validateCentimeter((Centimeter)value, diagnostics, context);
			case UnitsPackage.MILLIMETER:
				return validateMillimeter((Millimeter)value, diagnostics, context);
			case UnitsPackage.METER:
				return validateMeter((Meter)value, diagnostics, context);
			case UnitsPackage.FOOT:
				return validateFoot((Foot)value, diagnostics, context);
			case UnitsPackage.INCH:
				return validateInch((Inch)value, diagnostics, context);
			case UnitsPackage.YARD:
				return validateYard((Yard)value, diagnostics, context);
			case UnitsPackage.METRIC_SYSTEM_UNIT:
				return validateMetricSystemUnit((MetricSystemUnit)value, diagnostics, context);
			case UnitsPackage.IMPERIAL_SYSTEM_UNIT:
				return validateImperialSystemUnit((ImperialSystemUnit)value, diagnostics, context);
			case UnitsPackage.ANGLE_UNIT:
				return validateAngleUnit((AngleUnit)value, diagnostics, context);
			case UnitsPackage.RADIAN:
				return validateRadian((Radian)value, diagnostics, context);
			case UnitsPackage.DEGREE:
				return validateDegree((Degree)value, diagnostics, context);
			case UnitsPackage.TURN:
				return validateTurn((Turn)value, diagnostics, context);
			case UnitsPackage.GRADIAN:
				return validateGradian((Gradian)value, diagnostics, context);
			case UnitsPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case UnitsPackage.LENGTH:
				return validateLength((Length)value, diagnostics, context);
			case UnitsPackage.ANGLE:
				return validateAngle((Angle)value, diagnostics, context);
			case UnitsPackage.QUANTITY_OPERATION:
				return validateQuantityOperation((QuantityOperation)value, diagnostics, context);
			case UnitsPackage.LENGTH_OPERATION:
				return validateLengthOperation((LengthOperation)value, diagnostics, context);
			case UnitsPackage.LENGTH_ADD:
				return validateLengthAdd((LengthAdd)value, diagnostics, context);
			case UnitsPackage.LENGTH_SUBTRACT:
				return validateLengthSubtract((LengthSubtract)value, diagnostics, context);
			case UnitsPackage.LENGTH_SCALAR_MULTIPLY:
				return validateLengthScalarMultiply((LengthScalarMultiply)value, diagnostics, context);
			case UnitsPackage.LENGTH_SCALAR_DIVIDE:
				return validateLengthScalarDivide((LengthScalarDivide)value, diagnostics, context);
			case UnitsPackage.LENGTH_EQUALS:
				return validateLengthEquals((LengthEquals)value, diagnostics, context);
			case UnitsPackage.LENGTH_DISTINCT:
				return validateLengthDistinct((LengthDistinct)value, diagnostics, context);
			case UnitsPackage.LENGTH_SMALLER:
				return validateLengthSmaller((LengthSmaller)value, diagnostics, context);
			case UnitsPackage.LENGTH_GREATER:
				return validateLengthGreater((LengthGreater)value, diagnostics, context);
			case UnitsPackage.ANGLE_OPERATION:
				return validateAngleOperation((AngleOperation)value, diagnostics, context);
			case UnitsPackage.ANGLE_ADD:
				return validateAngleAdd((AngleAdd)value, diagnostics, context);
			case UnitsPackage.ANGLE_SUBTRACT:
				return validateAngleSubtract((AngleSubtract)value, diagnostics, context);
			case UnitsPackage.ANGLE_SCALAR_MULTIPLY:
				return validateAngleScalarMultiply((AngleScalarMultiply)value, diagnostics, context);
			case UnitsPackage.ANGLE_SCALAR_DIVIDE:
				return validateAngleScalarDivide((AngleScalarDivide)value, diagnostics, context);
			case UnitsPackage.ANGLE_EQUALS:
				return validateAngleEquals((AngleEquals)value, diagnostics, context);
			case UnitsPackage.ANGLE_DISTINCT:
				return validateAngleDistinct((AngleDistinct)value, diagnostics, context);
			case UnitsPackage.ANGLE_SMALLER:
				return validateAngleSmaller((AngleSmaller)value, diagnostics, context);
			case UnitsPackage.ANGLE_GREATER:
				return validateAngleGreater((AngleGreater)value, diagnostics, context);
			case UnitsPackage.QUANTITY_ARITHMETIC_OPERATION:
				return validateQuantityArithmeticOperation((QuantityArithmeticOperation)value, diagnostics, context);
			case UnitsPackage.QUANTITY_COMPARISON_OPERATION:
				return validateQuantityComparisonOperation((QuantityComparisonOperation)value, diagnostics, context);
			case UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION:
				return validateQuantityHomogenousOperation((QuantityHomogenousOperation)value, diagnostics, context);
			case UnitsPackage.QUANTITY_SCALAR_OPERATION:
				return validateQuantityScalarOperation((QuantityScalarOperation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthUnit(LengthUnit lengthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentimeter(Centimeter centimeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(centimeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMillimeter(Millimeter millimeter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(millimeter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeter(Meter meter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFoot(Foot foot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInch(Inch inch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYard(Yard yard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricSystemUnit(MetricSystemUnit metricSystemUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metricSystemUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImperialSystemUnit(ImperialSystemUnit imperialSystemUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imperialSystemUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleUnit(AngleUnit angleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadian(Radian radian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegree(Degree degree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurn(Turn turn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradian(Gradian gradian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gradian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(length, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(length, diagnostics, context);
		if (result || diagnostics != null) result &= validateLength_LengthRequiresLengthUnit(length, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LengthRequiresLengthUnit constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LENGTH__LENGTH_REQUIRES_LENGTH_UNIT__EEXPRESSION = "self.unit.oclIsKindOf(LengthUnit)";

	/**
	 * Validates the LengthRequiresLengthUnit constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_LengthRequiresLengthUnit(Length length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UnitsPackage.Literals.LENGTH,
				 length,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LengthRequiresLengthUnit",
				 LENGTH__LENGTH_REQUIRES_LENGTH_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(angle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(angle, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle_AngleRequiresAngleUnit(angle, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AngleRequiresAngleUnit constraint of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ANGLE__ANGLE_REQUIRES_ANGLE_UNIT__EEXPRESSION = "self.unit.oclIsKindOf(AngleUnit)";

	/**
	 * Validates the AngleRequiresAngleUnit constraint of '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle_AngleRequiresAngleUnit(Angle angle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UnitsPackage.Literals.ANGLE,
				 angle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AngleRequiresAngleUnit",
				 ANGLE__ANGLE_REQUIRES_ANGLE_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityOperation(QuantityOperation quantityOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthOperation(LengthOperation lengthOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthAdd(LengthAdd lengthAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lengthAdd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lengthAdd, diagnostics, context);
		if (result || diagnostics != null) result &= validateLengthAdd_QuantityHomogenousOperationRequiresHomogenousQuantities(lengthAdd, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the QuantityHomogenousOperationRequiresHomogenousQuantities constraint of '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LENGTH_ADD__QUANTITY_HOMOGENOUS_OPERATION_REQUIRES_HOMOGENOUS_QUANTITIES__EEXPRESSION = "self.lhs.oclType() = self.rhs.oclType()";

	/**
	 * Validates the QuantityHomogenousOperationRequiresHomogenousQuantities constraint of '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthAdd_QuantityHomogenousOperationRequiresHomogenousQuantities(LengthAdd lengthAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UnitsPackage.Literals.LENGTH_ADD,
				 lengthAdd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "QuantityHomogenousOperationRequiresHomogenousQuantities",
				 LENGTH_ADD__QUANTITY_HOMOGENOUS_OPERATION_REQUIRES_HOMOGENOUS_QUANTITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthSubtract(LengthSubtract lengthSubtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthSubtract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthScalarMultiply(LengthScalarMultiply lengthScalarMultiply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthScalarMultiply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthScalarDivide(LengthScalarDivide lengthScalarDivide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthScalarDivide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthEquals(LengthEquals lengthEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthEquals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthDistinct(LengthDistinct lengthDistinct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthDistinct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthSmaller(LengthSmaller lengthSmaller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthSmaller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthGreater(LengthGreater lengthGreater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthGreater, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleOperation(AngleOperation angleOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleAdd(AngleAdd angleAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleSubtract(AngleSubtract angleSubtract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleSubtract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleScalarMultiply(AngleScalarMultiply angleScalarMultiply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleScalarMultiply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleScalarDivide(AngleScalarDivide angleScalarDivide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleScalarDivide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleEquals(AngleEquals angleEquals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleEquals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleDistinct(AngleDistinct angleDistinct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleDistinct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleSmaller(AngleSmaller angleSmaller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleSmaller, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleGreater(AngleGreater angleGreater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleGreater, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityArithmeticOperation(QuantityArithmeticOperation quantityArithmeticOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityArithmeticOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparisonOperation(QuantityComparisonOperation quantityComparisonOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparisonOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityHomogenousOperation(QuantityHomogenousOperation quantityHomogenousOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityHomogenousOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityScalarOperation(QuantityScalarOperation quantityScalarOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityScalarOperation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UnitsValidator
