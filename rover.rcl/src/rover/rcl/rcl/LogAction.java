/**
 */
package rover.rcl.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.LogAction#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see rover.rcl.rcl.RclPackage#getLogAction()
 * @model
 * @generated
 */
public interface LogAction extends Action {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see rover.rcl.rcl.RclPackage#getLogAction_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.LogAction#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // LogAction
