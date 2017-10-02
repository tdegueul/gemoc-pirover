/**
 */
package rcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rcl.BooleanValue#isBValue <em>BValue</em>}</li>
 * </ul>
 *
 * @see rcl.RclPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends RoverValue {
	/**
	 * Returns the value of the '<em><b>BValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BValue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BValue</em>' attribute.
	 * @see #setBValue(boolean)
	 * @see rcl.RclPackage#getBooleanValue_BValue()
	 * @model
	 * @generated
	 */
	boolean isBValue();

	/**
	 * Sets the value of the '{@link rcl.BooleanValue#isBValue <em>BValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BValue</em>' attribute.
	 * @see #isBValue()
	 * @generated
	 */
	void setBValue(boolean value);

} // BooleanValue
