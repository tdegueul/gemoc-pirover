/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Deg Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.TurnDegAction#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getTurnDegAction()
 * @model
 * @generated
 */
public interface TurnDegAction extends Action {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(NumberValue)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getTurnDegAction_Degrees()
	 * @model containment="true"
	 * @generated
	 */
	NumberValue getDegrees();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.TurnDegAction#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(NumberValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // TurnDegAction
