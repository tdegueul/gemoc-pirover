/**
 */
package rover.raspirovermt.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.StringValue#getSValue <em>SValue</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getStringValue()
 * @model
 * @generated
 */
public interface StringValue extends RoverValue {
	/**
	 * Returns the value of the '<em><b>SValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SValue</em>' attribute.
	 * @see #setSValue(String)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getStringValue_SValue()
	 * @model
	 * @generated
	 */
	String getSValue();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.StringValue#getSValue <em>SValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SValue</em>' attribute.
	 * @see #getSValue()
	 * @generated
	 */
	void setSValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getStringValue();

} // StringValue
