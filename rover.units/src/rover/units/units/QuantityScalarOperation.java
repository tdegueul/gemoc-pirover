/**
 */
package rover.units.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Scalar Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.units.units.QuantityScalarOperation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.units.units.QuantityScalarOperation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see rover.units.units.UnitsPackage#getQuantityScalarOperation()
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
	 * @see rover.units.units.UnitsPackage#getQuantityScalarOperation_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Quantity getLhs();

	/**
	 * Sets the value of the '{@link rover.units.units.QuantityScalarOperation#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(NumericValue)
	 * @see rover.units.units.UnitsPackage#getQuantityScalarOperation_Rhs()
	 * @model required="true"
	 * @generated
	 */
	NumericValue getRhs();

	/**
	 * Sets the value of the '{@link rover.units.units.QuantityScalarOperation#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(NumericValue value);

} // QuantityScalarOperation
