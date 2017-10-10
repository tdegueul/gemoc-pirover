/**
 */
package rover.unitsmt.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.unitsmt.units.UnitsPackage#getLength()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LengthRequiresLengthUnit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LengthRequiresLengthUnit='self.unit.oclIsKindOf(LengthUnit)'"
 * @generated
 */
public interface Length extends Quantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double toCm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

} // Length
