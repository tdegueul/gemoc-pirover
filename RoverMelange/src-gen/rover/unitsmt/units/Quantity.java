/**
 */
package rover.unitsmt.units;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.unitsmt.units.Quantity#getUnit <em>Unit</em>}</li>
 *   <li>{@link rover.unitsmt.units.Quantity#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rover.unitsmt.units.UnitsPackage#getQuantity()
 * @model abstract="true"
 * @generated
 */
public interface Quantity extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit)
	 * @see rover.unitsmt.units.UnitsPackage#getQuantity_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link rover.unitsmt.units.Quantity#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(NumericValue)
	 * @see rover.unitsmt.units.UnitsPackage#getQuantity_Value()
	 * @model required="true"
	 * @generated
	 */
	NumericValue getValue();

	/**
	 * Sets the value of the '{@link rover.unitsmt.units.Quantity#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NumericValue value);

} // Quantity
