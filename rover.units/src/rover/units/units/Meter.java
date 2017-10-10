/**
 */
package rover.units.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.units.units.UnitsPackage#getMeter()
 * @model
 * @generated
 */
public interface Meter extends MetricSystemUnit, LengthUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double toCm(double value);

} // Meter
