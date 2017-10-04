/**
 */
package rover.raspirovermt.raspirover;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rcl Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirovermt.raspirover.RclBlock#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getRclBlock()
 * @model
 * @generated
 */
public interface RclBlock extends Statement {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link rover.raspirovermt.raspirover.Statement}.
	 * It is bidirectional and its opposite is '{@link rover.raspirovermt.raspirover.Statement#getEnclosing <em>Enclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see rover.raspirovermt.raspirover.RaspiroverPackage#getRclBlock_Stmts()
	 * @see rover.raspirovermt.raspirover.Statement#getEnclosing
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

} // RclBlock
