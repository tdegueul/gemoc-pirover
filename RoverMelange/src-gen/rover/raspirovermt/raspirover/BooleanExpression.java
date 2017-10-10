/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.BooleanExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.BooleanExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.BooleanExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends RoverExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(BooleanValue)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getBooleanExpression_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	BooleanValue getLhs();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.BooleanExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(BooleanValue)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getBooleanExpression_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	BooleanValue getRhs();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.BooleanExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.raspirovermt.raspirover.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see rover.raspirovermt.raspirover.BooleanOperator
	 * @see #setOp(BooleanOperator)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getBooleanExpression_Op()
	 * @model
	 * @generated
	 */
	BooleanOperator getOp();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.BooleanExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see rover.raspirovermt.raspirover.BooleanOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(BooleanOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval();

} // BooleanExpression
