/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Homogenous Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getQuantityHomogenousOperation()
 * @model abstract="true"
 * @generated
 */
public interface QuantityHomogenousOperation extends QuantityOperation {
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
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getQuantityHomogenousOperation_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Quantity getLhs();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getLhs <em>Lhs</em>}' reference.
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
	 * @see #setRhs(Quantity)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getQuantityHomogenousOperation_Rhs()
	 * @model required="true"
	 * @generated
	 */
	Quantity getRhs();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.QuantityHomogenousOperation#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Quantity value);

} // QuantityHomogenousOperation
