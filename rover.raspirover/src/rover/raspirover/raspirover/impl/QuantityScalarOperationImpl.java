/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityScalarOperation;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Scalar Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.QuantityScalarOperationImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.QuantityScalarOperationImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantityScalarOperationImpl extends QuantityOperationImpl implements QuantityScalarOperation {
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
	 * The default value of the '{@link #getRhs() <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected static final double RHS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected double rhs = RHS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityScalarOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.QUANTITY_SCALAR_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS, oldLhs, lhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(double newRhs) {
		double oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS:
				return getRhs();
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
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS:
				setLhs((Quantity)newValue);
				return;
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS:
				setRhs((Double)newValue);
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
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS:
				setLhs((Quantity)null);
				return;
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS:
				setRhs(RHS_EDEFAULT);
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
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS:
				return lhs != null;
			case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS:
				return rhs != RHS_EDEFAULT;
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
		result.append(" (rhs: ");
		result.append(rhs);
		result.append(')');
		return result.toString();
	}

} //QuantityScalarOperationImpl
