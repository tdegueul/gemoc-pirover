/**
 */
package rover.rcl.rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.NumberValue#getNValue <em>NValue</em>}</li>
 * </ul>
 *
 * @see rover.rcl.rcl.RclPackage#getNumberValue()
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
	 * @see rover.rcl.rcl.RclPackage#getNumberValue_NValue()
	 * @model
	 * @generated
	 */
	int getNValue();

	/**
	 * Sets the value of the '{@link rover.rcl.rcl.NumberValue#getNValue <em>NValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NValue</em>' attribute.
	 * @see #getNValue()
	 * @generated
	 */
	void setNValue(int value);

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
