/**
 */
package rover.raspirover.raspirover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.raspirover.raspirover.Board;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.Sketch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.ProjectImpl#getBoards <em>Boards</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.ProjectImpl#getSketches <em>Sketches</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.ProjectImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> boards;

	/**
	 * The cached value of the '{@link #getSketches() <em>Sketches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSketches()
	 * @generated
	 * @ordered
	 */
	protected EList<Sketch> sketches;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected RoverProgram program;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectContainmentWithInverseEList<Board>(Board.class, this, RaspiroverPackage.PROJECT__BOARDS, RaspiroverPackage.BOARD__PROJECT);
		}
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sketch> getSketches() {
		if (sketches == null) {
			sketches = new EObjectContainmentWithInverseEList<Sketch>(Sketch.class, this, RaspiroverPackage.PROJECT__SKETCHES, RaspiroverPackage.SKETCH__PROJECT);
		}
		return sketches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverProgram getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(RoverProgram newProgram, NotificationChain msgs) {
		RoverProgram oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaspiroverPackage.PROJECT__PROGRAM, oldProgram, newProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(RoverProgram newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.PROJECT__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.PROJECT__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.PROJECT__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoards()).basicAdd(otherEnd, msgs);
			case RaspiroverPackage.PROJECT__SKETCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSketches()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				return ((InternalEList<?>)getBoards()).basicRemove(otherEnd, msgs);
			case RaspiroverPackage.PROJECT__SKETCHES:
				return ((InternalEList<?>)getSketches()).basicRemove(otherEnd, msgs);
			case RaspiroverPackage.PROJECT__PROGRAM:
				return basicSetProgram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				return getBoards();
			case RaspiroverPackage.PROJECT__SKETCHES:
				return getSketches();
			case RaspiroverPackage.PROJECT__PROGRAM:
				return getProgram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				getBoards().clear();
				getBoards().addAll((Collection<? extends Board>)newValue);
				return;
			case RaspiroverPackage.PROJECT__SKETCHES:
				getSketches().clear();
				getSketches().addAll((Collection<? extends Sketch>)newValue);
				return;
			case RaspiroverPackage.PROJECT__PROGRAM:
				setProgram((RoverProgram)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				getBoards().clear();
				return;
			case RaspiroverPackage.PROJECT__SKETCHES:
				getSketches().clear();
				return;
			case RaspiroverPackage.PROJECT__PROGRAM:
				setProgram((RoverProgram)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaspiroverPackage.PROJECT__BOARDS:
				return boards != null && !boards.isEmpty();
			case RaspiroverPackage.PROJECT__SKETCHES:
				return sketches != null && !sketches.isEmpty();
			case RaspiroverPackage.PROJECT__PROGRAM:
				return program != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
