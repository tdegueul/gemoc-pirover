/**
 */
package rcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rcl.BooleanExpression;
import rcl.BooleanOperator;
import rcl.BooleanValue;
import rcl.RclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rcl.impl.BooleanExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rcl.impl.BooleanExpressionImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link rcl.impl.BooleanExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanExpressionImpl extends RoverExpressionImpl implements BooleanExpression {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected BooleanValue lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected BooleanValue rhs;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperator OP_EDEFAULT = BooleanOperator.EQ;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperator op = OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RclPackage.Literals.BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(BooleanValue newLhs, NotificationChain msgs) {
		BooleanValue oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.BOOLEAN_EXPRESSION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(BooleanValue newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.BOOLEAN_EXPRESSION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.BOOLEAN_EXPRESSION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.BOOLEAN_EXPRESSION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(BooleanValue newRhs, NotificationChain msgs) {
		BooleanValue oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.BOOLEAN_EXPRESSION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(BooleanValue newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.BOOLEAN_EXPRESSION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.BOOLEAN_EXPRESSION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.BOOLEAN_EXPRESSION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(BooleanOperator newOp) {
		BooleanOperator oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.BOOLEAN_EXPRESSION__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RclPackage.BOOLEAN_EXPRESSION__LHS:
				return basicSetLhs(null, msgs);
			case RclPackage.BOOLEAN_EXPRESSION__RHS:
				return basicSetRhs(null, msgs);
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
			case RclPackage.BOOLEAN_EXPRESSION__LHS:
				return getLhs();
			case RclPackage.BOOLEAN_EXPRESSION__RHS:
				return getRhs();
			case RclPackage.BOOLEAN_EXPRESSION__OP:
				return getOp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RclPackage.BOOLEAN_EXPRESSION__LHS:
				setLhs((BooleanValue)newValue);
				return;
			case RclPackage.BOOLEAN_EXPRESSION__RHS:
				setRhs((BooleanValue)newValue);
				return;
			case RclPackage.BOOLEAN_EXPRESSION__OP:
				setOp((BooleanOperator)newValue);
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
			case RclPackage.BOOLEAN_EXPRESSION__LHS:
				setLhs((BooleanValue)null);
				return;
			case RclPackage.BOOLEAN_EXPRESSION__RHS:
				setRhs((BooleanValue)null);
				return;
			case RclPackage.BOOLEAN_EXPRESSION__OP:
				setOp(OP_EDEFAULT);
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
			case RclPackage.BOOLEAN_EXPRESSION__LHS:
				return lhs != null;
			case RclPackage.BOOLEAN_EXPRESSION__RHS:
				return rhs != null;
			case RclPackage.BOOLEAN_EXPRESSION__OP:
				return op != OP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //BooleanExpressionImpl
