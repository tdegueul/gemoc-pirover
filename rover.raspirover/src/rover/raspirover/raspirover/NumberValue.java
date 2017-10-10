/**
 */
package rover.raspirover.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.NumberValue#getNValue <em>NValue</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.NumberValue#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see rover.raspirover.raspirover.RaspiroverPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends RoverValue {
	/**
	 * Returns the value of the '<em><b>NValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NValue</em>' attribute.
	 * @see #setNValue(int)
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getNumberValue_NValue()
	 * @model
	 * @generated
	 */
	int getNValue();

	/**
	 * Sets the value of the '{@link rover.raspirover.raspirover.NumberValue#getNValue <em>NValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NValue</em>' attribute.
	 * @see #getNValue()
	 * @generated
	 */
	void setNValue(int value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getNumberValue_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link rover.raspirover.raspirover.NumberValue#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getIntValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String print();

} // NumberValue
