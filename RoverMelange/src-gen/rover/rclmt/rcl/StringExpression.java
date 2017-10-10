/**
 */
package rover.rclmt.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rclmt.rcl.StringExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.rclmt.rcl.StringExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link rover.rclmt.rcl.StringExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rover.rclmt.rcl.RclPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends RoverExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(StringValue)
	 * @see rover.rclmt.rcl.RclPackage#getStringExpression_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	StringValue getLhs();

	/**
	 * Sets the value of the '{@link rover.rclmt.rcl.StringExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(StringValue value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(StringValue)
	 * @see rover.rclmt.rcl.RclPackage#getStringExpression_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	StringValue getRhs();

	/**
	 * Sets the value of the '{@link rover.rclmt.rcl.StringExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(StringValue value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.rclmt.rcl.StringOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see rover.rclmt.rcl.StringOperator
	 * @see #setOp(StringOperator)
	 * @see rover.rclmt.rcl.RclPackage#getStringExpression_Op()
	 * @model
	 * @generated
	 */
	StringOperator getOp();

	/**
	 * Sets the value of the '{@link rover.rclmt.rcl.StringExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see rover.rclmt.rcl.StringOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(StringOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval();

} // StringExpression
