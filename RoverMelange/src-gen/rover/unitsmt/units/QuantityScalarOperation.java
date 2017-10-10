/**
 */
package rover.unitsmt.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Scalar Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.unitsmt.units.QuantityScalarOperation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.unitsmt.units.QuantityScalarOperation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see rover.unitsmt.units.UnitsPackage#getQuantityScalarOperation()
 * @model abstract="true"
 * @generated
 */
public interface QuantityScalarOperation extends QuantityOperation {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(Quantity)
	 * @see rover.unitsmt.units.UnitsPackage#getQuantityScalarOperation_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Quantity getLhs();

	/**
	 * Sets the value of the '{@link rover.unitsmt.units.QuantityScalarOperation#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' attribute.
	 * @see #setRhs(double)
	 * @see rover.unitsmt.units.UnitsPackage#getQuantityScalarOperation_Rhs()
	 * @model
	 * @generated
	 */
	double getRhs();

	/**
	 * Sets the value of the '{@link rover.unitsmt.units.QuantityScalarOperation#getRhs <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' attribute.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(double value);

} // QuantityScalarOperation
