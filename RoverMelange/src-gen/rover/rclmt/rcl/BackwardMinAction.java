/**
 */
package rover.rclmt.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backward Min Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rclmt.rcl.BackwardMinAction#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see rover.rclmt.rcl.RclPackage#getBackwardMinAction()
 * @model
 * @generated
 */
public interface BackwardMinAction extends Action {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(NumberValue)
	 * @see rover.rclmt.rcl.RclPackage#getBackwardMinAction_Distance()
	 * @model containment="true"
	 * @generated
	 */
	NumberValue getDistance();

	/**
	 * Sets the value of the '{@link rover.rclmt.rcl.BackwardMinAction#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(NumberValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // BackwardMinAction
