/**
 */
package rcl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rcl.RclPackage;
import rcl.TurnDegAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Deg Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rcl.impl.TurnDegActionImpl#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnDegActionImpl extends ActionImpl implements TurnDegAction {
	/**
	 * The default value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected int degrees = DEGREES_EDEFAULT;

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
	public int getDegrees() {
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegrees(int newDegrees) {
		int oldDegrees = degrees;
		degrees = newDegrees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.TURN_DEG_ACTION__DEGREES, oldDegrees, degrees));
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
				setDegrees((Integer)newValue);
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
				setDegrees(DEGREES_EDEFAULT);
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
				return degrees != DEGREES_EDEFAULT;
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
		result.append(" (degrees: ");
		result.append(degrees);
		result.append(')');
		return result.toString();
	}

} //TurnDegActionImpl
