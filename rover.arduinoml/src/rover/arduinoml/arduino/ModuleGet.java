/**
 */
package rover.arduinoml.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.arduinoml.arduino.ModuleGet#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see rover.arduinoml.arduino.ArduinoPackage#getModuleGet()
 * @model abstract="true"
 * @generated
 */
public interface ModuleGet extends Expression {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(Module)
	 * @see rover.arduinoml.arduino.ArduinoPackage#getModuleGet_Module()
	 * @model required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link rover.arduinoml.arduino.ModuleGet#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // ModuleGet
