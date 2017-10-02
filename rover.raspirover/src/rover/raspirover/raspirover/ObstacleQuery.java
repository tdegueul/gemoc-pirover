/**
 */
package rover.raspirover.raspirover;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.ObstacleQuery#isFront <em>Front</em>}</li>
 * </ul>
 *
 * @see rover.raspirover.raspirover.RaspiroverPackage#getObstacleQuery()
 * @model
 * @generated
 */
public interface ObstacleQuery extends Query, BooleanValue {
	/**
	 * Returns the value of the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front</em>' attribute.
	 * @see #setFront(boolean)
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getObstacleQuery_Front()
	 * @model
	 * @generated
	 */
	boolean isFront();

	/**
	 * Sets the value of the '{@link rover.raspirover.raspirover.ObstacleQuery#isFront <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front</em>' attribute.
	 * @see #isFront()
	 * @generated
	 */
	void setFront(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getBooleanValue();

} // ObstacleQuery