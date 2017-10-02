/**
 */
package rcl;

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
 *   <li>{@link rcl.RclBlock#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see rcl.RclPackage#getRclBlock()
 * @model
 * @generated
 */
public interface RclBlock extends Statement {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link rcl.Statement}.
	 * It is bidirectional and its opposite is '{@link rcl.Statement#getEnclosing <em>Enclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see rcl.RclPackage#getRclBlock_Stmts()
	 * @see rcl.Statement#getEnclosing
	 * @model opposite="enclosing" containment="true"
	 * @generated
	 */
	EList<Statement> getStmts();

} // RclBlock
