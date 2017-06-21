/**
 */
package rover.rcl.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Deg Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.TurnDegAction#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see rover.rcl.rcl.RclPackage#getTurnDegAction()
 * @model
 * @generated
 */
public interface TurnDegAction extends Action {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(int)
	 * @see rover.rcl.rcl.RclPackage#getTurnDegAction_Degrees()
	 * @model
	 * @generated
	 */
	int getDegrees();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.TurnDegAction#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // TurnDegAction
