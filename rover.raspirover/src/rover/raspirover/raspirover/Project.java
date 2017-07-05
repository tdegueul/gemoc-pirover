/**
 */
package rover.raspirover.raspirover;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.Project#getBoards <em>Boards</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.Project#getSketches <em>Sketches</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.Project#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see rover.raspirover.raspirover.RaspiroverPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link rover.raspirover.raspirover.Board}.
	 * It is bidirectional and its opposite is '{@link rover.raspirover.raspirover.Board#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getProject_Boards()
	 * @see rover.raspirover.raspirover.Board#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Sketches</b></em>' containment reference list.
	 * The list contents are of type {@link rover.raspirover.raspirover.Sketch}.
	 * It is bidirectional and its opposite is '{@link rover.raspirover.raspirover.Sketch#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sketches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sketches</em>' containment reference list.
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getProject_Sketches()
	 * @see rover.raspirover.raspirover.Sketch#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Sketch> getSketches();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(RoverProgram)
	 * @see rover.raspirover.raspirover.RaspiroverPackage#getProject_Program()
	 * @model containment="true"
	 * @generated
	 */
	RoverProgram getProgram();

	/**
	 * Sets the value of the '{@link rover.raspirover.raspirover.Project#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(RoverProgram value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Project
