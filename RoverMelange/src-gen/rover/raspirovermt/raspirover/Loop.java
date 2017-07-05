/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.Loop#getExpr <em>Expr</em>}</li>
 *   <li>{@link rover.raspirovermt.raspirover.Loop#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement {
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
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getLoop_Expr()
	 * @model containment="true"
	 * @generated
	 */
	RoverExpression getExpr();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Loop#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(RoverExpression value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(RclBlock)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getLoop_Block()
	 * @model containment="true"
	 * @generated
	 */
	RclBlock getBlock();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Loop#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(RclBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // Loop
