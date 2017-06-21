/**
 */
package rover.rcl.rcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.Block#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see rover.rcl.rcl.RclPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link rover.rcl.rcl.Statement}.
	 * It is bidirectional and its opposite is '{@link rover.rcl.rcl.Statement#getEnclosing <em>Enclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see rover.rcl.rcl.RclPackage#getBlock_Stmts()
	 * @see rover.rcl.rcl.Statement#getEnclosing
	 * @model opposite="enclosing" containment="true"
	 * @generated
	 */
	EList<Statement> getStmts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void eval();

} // Block
