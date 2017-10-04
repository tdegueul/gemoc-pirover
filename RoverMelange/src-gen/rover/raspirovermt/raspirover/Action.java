/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.Action#getAssociatedPin <em>Associated Pin</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends Statement {
	/**
	 * Returns the value of the '<em><b>Associated Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Pin</em>' reference.
	 * @see #setAssociatedPin(Pin)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getAction_AssociatedPin()
	 * @model
	 * @generated
	 */
	Pin getAssociatedPin();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Action#getAssociatedPin <em>Associated Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Pin</em>' reference.
	 * @see #getAssociatedPin()
	 * @generated
	 */
	void setAssociatedPin(Pin value);

} // Action
