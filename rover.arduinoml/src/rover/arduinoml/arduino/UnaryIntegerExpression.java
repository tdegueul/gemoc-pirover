/**
 */
package rover.arduinoml.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.arduinoml.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see rover.arduinoml.arduino.ArduinoPackage#getUnaryIntegerExpression()
 * @model
 * @generated
 */
public interface UnaryIntegerExpression extends UnaryExpression, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.arduinoml.arduino.UnaryIntegerOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinoml.arduino.UnaryIntegerOperatorKind
	 * @see #setOperator(UnaryIntegerOperatorKind)
	 * @see rover.arduinoml.arduino.ArduinoPackage#getUnaryIntegerExpression_Operator()
	 * @model
	 * @generated
	 */
	UnaryIntegerOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link rover.arduinoml.arduino.UnaryIntegerExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinoml.arduino.UnaryIntegerOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryIntegerOperatorKind value);

} // UnaryIntegerExpression
