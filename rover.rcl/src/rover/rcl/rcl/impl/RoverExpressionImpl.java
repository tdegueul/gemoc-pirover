/**
 */
package rover.rcl.rcl.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import rover.rcl.rcl.RclPackage;
import rover.rcl.rcl.RoverExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RoverExpressionImpl extends EObjectImpl implements RoverExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RclPackage.Literals.ROVER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //RoverExpressionImpl
