/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.Conditional#getExpr <em>Expr</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.Conditional#getCondTrue <em>Cond True</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.Conditional#getCondFalse <em>Cond False</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(RoverExpression)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getConditional_Expr()
	 * @model containment="true"
	 * @generated
	 */
	RoverExpression getExpr();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Conditional#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(RoverExpression value);

	/**
	 * Returns the value of the '<em><b>Cond True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond True</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond True</em>' containment reference.
	 * @see #setCondTrue(RclBlock)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getConditional_CondTrue()
	 * @model containment="true"
	 * @generated
	 */
	RclBlock getCondTrue();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Conditional#getCondTrue <em>Cond True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond True</em>' containment reference.
	 * @see #getCondTrue()
	 * @generated
	 */
	void setCondTrue(RclBlock value);

	/**
	 * Returns the value of the '<em><b>Cond False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond False</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond False</em>' containment reference.
	 * @see #setCondFalse(RclBlock)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getConditional_CondFalse()
	 * @model containment="true"
	 * @generated
	 */
	RclBlock getCondFalse();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Conditional#getCondFalse <em>Cond False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond False</em>' containment reference.
	 * @see #getCondFalse()
	 * @generated
	 */
	void setCondFalse(RclBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // Conditional
