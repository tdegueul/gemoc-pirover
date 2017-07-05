/**
 */
package rover.arduinoml.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.arduinoml.arduino.BinaryIntegerExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see rover.arduinoml.arduino.ArduinoPackage#getBinaryIntegerExpression()
 * @model
 * @generated
 */
public interface BinaryIntegerExpression extends BinaryExpression, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.arduinoml.arduino.BinaryIntegerOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinoml.arduino.BinaryIntegerOperatorKind
	 * @see #setOperator(BinaryIntegerOperatorKind)
	 * @see rover.arduinoml.arduino.ArduinoPackage#getBinaryIntegerExpression_Operator()
	 * @model
	 * @generated
	 */
	BinaryIntegerOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link rover.arduinoml.arduino.BinaryIntegerExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinoml.arduino.BinaryIntegerOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryIntegerOperatorKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="rover.arduinoml.arduino.Object"
	 * @generated
	 */
	Object evaluate();

} // BinaryIntegerExpression
