/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.Action;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.ActionImpl#getAssociatedPin <em>Associated Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends StatementImpl implements Action {
	/**
	 * The cached value of the '{@link #getAssociatedPin() <em>Associated Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPin()
	 * @generated
	 * @ordered
	 */
	protected Pin associatedPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getAssociatedPin() {
		if (associatedPin != null && associatedPin.eIsProxy()) {
			InternalEObject oldAssociatedPin = (InternalEObject)associatedPin;
			associatedPin = (Pin)eResolveProxy(oldAssociatedPin);
			if (associatedPin != oldAssociatedPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.ACTION__ASSOCIATED_PIN, oldAssociatedPin, associatedPin));
			}
		}
		return associatedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetAssociatedPin() {
		return associatedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedPin(Pin newAssociatedPin) {
		Pin oldAssociatedPin = associatedPin;
		associatedPin = newAssociatedPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.ACTION__ASSOCIATED_PIN, oldAssociatedPin, associatedPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.ACTION__ASSOCIATED_PIN:
				if (resolve) return getAssociatedPin();
				return basicGetAssociatedPin();
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
			case RaspiroverPackage.ACTION__ASSOCIATED_PIN:
				setAssociatedPin((Pin)newValue);
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
			case RaspiroverPackage.ACTION__ASSOCIATED_PIN:
				setAssociatedPin((Pin)null);
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
			case RaspiroverPackage.ACTION__ASSOCIATED_PIN:
				return associatedPin != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
