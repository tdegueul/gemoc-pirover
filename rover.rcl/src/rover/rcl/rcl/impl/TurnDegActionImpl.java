/**
 */
package rover.rcl.rcl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.rcl.rcl.NumberValue;
import rover.rcl.rcl.RclPackage;
import rover.rcl.rcl.TurnDegAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Deg Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.rcl.rcl.impl.TurnDegActionImpl#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnDegActionImpl extends ActionImpl implements TurnDegAction {
	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected NumberValue degrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnDegActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RclPackage.Literals.TURN_DEG_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValue getDegrees() {
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegrees(NumberValue newDegrees, NotificationChain msgs) {
		NumberValue oldDegrees = degrees;
		degrees = newDegrees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RclPackage.TURN_DEG_ACTION__DEGREES, oldDegrees, newDegrees);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegrees(NumberValue newDegrees) {
		if (newDegrees != degrees) {
			NotificationChain msgs = null;
			if (degrees != null)
				msgs = ((InternalEObject)degrees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RclPackage.TURN_DEG_ACTION__DEGREES, null, msgs);
			if (newDegrees != null)
				msgs = ((InternalEObject)newDegrees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RclPackage.TURN_DEG_ACTION__DEGREES, null, msgs);
			msgs = basicSetDegrees(newDegrees, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.TURN_DEG_ACTION__DEGREES, newDegrees, newDegrees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RclPackage.TURN_DEG_ACTION__DEGREES:
				return basicSetDegrees(null, msgs);
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
			case RclPackage.TURN_DEG_ACTION__DEGREES:
				return getDegrees();
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
			case RclPackage.TURN_DEG_ACTION__DEGREES:
				setDegrees((NumberValue)newValue);
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
			case RclPackage.TURN_DEG_ACTION__DEGREES:
				setDegrees((NumberValue)null);
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
			case RclPackage.TURN_DEG_ACTION__DEGREES:
				return degrees != null;
		}
		return super.eIsSet(featureID);
	}

} //TurnDegActionImpl
