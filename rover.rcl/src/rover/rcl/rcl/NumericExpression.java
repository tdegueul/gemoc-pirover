/**
 */
package rover.rcl.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.NumericExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.rcl.rcl.NumericExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link rover.rcl.rcl.NumericExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rover.rcl.rcl.RclPackage#getNumericExpression()
 * @model
 * @generated
 */
public interface NumericExpression extends RoverExpression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(NumberValue)
	 * @see rover.rcl.rcl.RclPackage#getNumericExpression_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	NumberValue getLhs();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.NumericExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(NumberValue value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(NumberValue)
	 * @see rover.rcl.rcl.RclPackage#getNumericExpression_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	NumberValue getRhs();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.NumericExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(NumberValue value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.rcl.rcl.NumericOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see rover.rcl.rcl.NumericOperator
	 * @see #setOp(NumericOperator)
	 * @see rover.rcl.rcl.RclPackage#getNumericExpression_Op()
	 * @model
	 * @generated
	 */
	NumericOperator getOp();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.NumericExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see rover.rcl.rcl.NumericOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(NumericOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean eval();

} // NumericExpression
