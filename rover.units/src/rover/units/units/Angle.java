/**
 */
package rover.units.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.units.units.UnitsPackage#getAngle()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AngleRequiresAngleUnit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AngleRequiresAngleUnit='self.unit.oclIsKindOf(AngleUnit)'"
 * @generated
 */
public interface Angle extends Quantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double toRad();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

} // Angle
