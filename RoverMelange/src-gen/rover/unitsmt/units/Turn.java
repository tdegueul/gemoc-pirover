/**
 */
package rover.unitsmt.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.unitsmt.units.UnitsPackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends AngleUnit {
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
	double toRad(double value);

} // Turn
