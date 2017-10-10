/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getInch()
 * @model
 * @generated
 */
public interface Inch extends ImperialSystemUnit, LengthUnit {
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

} // Inch
