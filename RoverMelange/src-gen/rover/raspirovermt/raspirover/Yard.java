/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Yard</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getYard()
 * @model
 * @generated
 */
public interface Yard extends ImperialSystemUnit, LengthUnit {
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

} // Yard
