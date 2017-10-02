/**
 */
package rcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rcl.Conditional;
import rcl.RclBlock;
import rcl.RclPackage;
import rcl.RoverExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rcl.impl.ConditionalImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link rcl.impl.ConditionalImpl#getCondTrue <em>Cond True</em>}</li>
 *   <li>{@link rcl.impl.ConditionalImpl#getCondFalse <em>Cond False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalImpl extends StatementImpl implements Conditional {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected RoverExpression expr;

	/**
	 * The cached value of the '{@link #getCondTrue() <em>Cond True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondTrue()
	 * @generated
	 * @ordered
	 */
	protected RclBlock condTrue;

	/**
	 * The cached value of the '{@link #getCondFalse() <em>Cond False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondFalse()
	 * @generated
	 * @ordered
	 */
	protected RclBlock condFalse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RclPackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(RoverExpression newExpr, NotificationChain msgs) {
		RoverExpression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(RoverExpression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclBlock getCondTrue() {
		return condTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondTrue(RclBlock newCondTrue, NotificationChain msgs) {
		RclBlock oldCondTrue = condTrue;
		condTrue = newCondTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__COND_TRUE, oldCondTrue, newCondTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondTrue(RclBlock newCondTrue) {
		if (newCondTrue != condTrue) {
			NotificationChain msgs = null;
			if (condTrue != null)
				msgs = ((InternalEObject)condTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__COND_TRUE, null, msgs);
			if (newCondTrue != null)
				msgs = ((InternalEObject)newCondTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__COND_TRUE, null, msgs);
			msgs = basicSetCondTrue(newCondTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__COND_TRUE, newCondTrue, newCondTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclBlock getCondFalse() {
		return condFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondFalse(RclBlock newCondFalse, NotificationChain msgs) {
		RclBlock oldCondFalse = condFalse;
		condFalse = newCondFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__COND_FALSE, oldCondFalse, newCondFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondFalse(RclBlock newCondFalse) {
		if (newCondFalse != condFalse) {
			NotificationChain msgs = null;
			if (condFalse != null)
				msgs = ((InternalEObject)condFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__COND_FALSE, null, msgs);
			if (newCondFalse != null)
				msgs = ((InternalEObject)newCondFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.CONDITIONAL__COND_FALSE, null, msgs);
			msgs = basicSetCondFalse(newCondFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.CONDITIONAL__COND_FALSE, newCondFalse, newCondFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RclPackage.CONDITIONAL__EXPR:
				return basicSetExpr(null, msgs);
			case RclPackage.CONDITIONAL__COND_TRUE:
				return basicSetCondTrue(null, msgs);
			case RclPackage.CONDITIONAL__COND_FALSE:
				return basicSetCondFalse(null, msgs);
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
			case RclPackage.CONDITIONAL__EXPR:
				return getExpr();
			case RclPackage.CONDITIONAL__COND_TRUE:
				return getCondTrue();
			case RclPackage.CONDITIONAL__COND_FALSE:
				return getCondFalse();
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
			case RclPackage.CONDITIONAL__EXPR:
				setExpr((RoverExpression)newValue);
				return;
			case RclPackage.CONDITIONAL__COND_TRUE:
				setCondTrue((RclBlock)newValue);
				return;
			case RclPackage.CONDITIONAL__COND_FALSE:
				setCondFalse((RclBlock)newValue);
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
			case RclPackage.CONDITIONAL__EXPR:
				setExpr((RoverExpression)null);
				return;
			case RclPackage.CONDITIONAL__COND_TRUE:
				setCondTrue((RclBlock)null);
				return;
			case RclPackage.CONDITIONAL__COND_FALSE:
				setCondFalse((RclBlock)null);
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
			case RclPackage.CONDITIONAL__EXPR:
				return expr != null;
			case RclPackage.CONDITIONAL__COND_TRUE:
				return condTrue != null;
			case RclPackage.CONDITIONAL__COND_FALSE:
				return condFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalImpl
