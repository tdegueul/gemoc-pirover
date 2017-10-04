/**
 */
package rover.raspirovermt.raspirover;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.Statement#getEnclosing <em>Enclosing</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclosing</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rover.raspirovermt.raspirover.RclBlock#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing</em>' container reference.
	 * @see #setEnclosing(RclBlock)
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getStatement_Enclosing()
	 * @see rover.raspirovermt.raspirover.RclBlock#getStmts
	 * @model opposite="stmts" transient="false"
	 * @generated
	 */
	RclBlock getEnclosing();

	/**
	 * Sets the value of the '{@link rover.raspirovermt.raspirover.Statement#getEnclosing <em>Enclosing</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing</em>' container reference.
	 * @see #getEnclosing()
	 * @generated
	 */
	void setEnclosing(RclBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RoverProgram getProgram();

} // Statement
