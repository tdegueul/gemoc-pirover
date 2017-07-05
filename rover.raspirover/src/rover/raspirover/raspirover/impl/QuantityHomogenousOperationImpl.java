/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityHomogenousOperation;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Homogenous Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.QuantityHomogenousOperationImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.QuantityHomogenousOperationImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantityHomogenousOperationImpl extends QuantityOperationImpl implements QuantityHomogenousOperation {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Quantity lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Quantity rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityHomogenousOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.QUANTITY_HOMOGENOUS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getLhs() {
		if (lhs != null && lhs.eIsProxy()) {
			InternalEObject oldLhs = (InternalEObject)lhs;
			lhs = (Quantity)eResolveProxy(oldLhs);
			if (lhs != oldLhs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS, oldLhs, lhs));
			}
		}
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Quantity newLhs) {
		Quantity oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS, oldLhs, lhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getRhs() {
		if (rhs != null && rhs.eIsProxy()) {
			InternalEObject oldRhs = (InternalEObject)rhs;
			rhs = (Quantity)eResolveProxy(oldRhs);
			if (rhs != oldRhs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS, oldRhs, rhs));
			}
		}
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Quantity newRhs) {
		Quantity oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
				if (resolve) return getRhs();
				return basicGetRhs();
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
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
				setLhs((Quantity)newValue);
				return;
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
				setRhs((Quantity)newValue);
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
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
				setLhs((Quantity)null);
				return;
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
				setRhs((Quantity)null);
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
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
				return lhs != null;
			case RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantityHomogenousOperationImpl
