/**
 */
package rover.arduinomlmt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.arduinomlmt.arduino.UnaryBooleanExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see rover.arduinomlmt.arduino.ArduinoPackage#getUnaryBooleanExpression()
 * @model
 * @generated
 */
public interface UnaryBooleanExpression extends UnaryExpression, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link rover.arduinomlmt.arduino.UnaryBooleanOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinomlmt.arduino.UnaryBooleanOperatorKind
	 * @see #setOperator(UnaryBooleanOperatorKind)
	 * @see rover.arduinomlmt.arduino.ArduinoPackage#getUnaryBooleanExpression_Operator()
	 * @model
	 * @generated
	 */
	UnaryBooleanOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link rover.arduinomlmt.arduino.UnaryBooleanExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see rover.arduinomlmt.arduino.UnaryBooleanOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryBooleanOperatorKind value);

} // UnaryBooleanExpression
