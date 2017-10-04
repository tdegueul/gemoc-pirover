/**
 */
package rover.unitsmt.units;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rover.unitsmt.units.UnitsPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double toCentimeters(double value);

} // Unit
