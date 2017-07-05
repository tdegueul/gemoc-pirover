/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.AngleScalarMultiply;
import rover.raspirover.raspirover.NumericValue;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityScalarOperation;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Scalar Multiply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.AngleScalarMultiplyImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.AngleScalarMultiplyImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleScalarMultiplyImpl extends AngleOperationImpl implements AngleScalarMultiply {
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
	protected NumericValue rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleScalarMultiplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.ANGLE_SCALAR_MULTIPLY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS, oldLhs, lhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getRhs() {
		if (rhs != null && rhs.eIsProxy()) {
			InternalEObject oldRhs = (InternalEObject)rhs;
			rhs = (NumericValue)eResolveProxy(oldRhs);
			if (rhs != oldRhs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS, oldRhs, rhs));
			}
		}
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue basicGetRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(NumericValue newRhs) {
		NumericValue oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS:
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
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS:
				setLhs((Quantity)newValue);
				return;
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS:
				setRhs((NumericValue)newValue);
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
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS:
				setLhs((Quantity)null);
				return;
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS:
				setRhs((NumericValue)null);
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
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS:
				return lhs != null;
			case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS:
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QuantityScalarOperation.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS: return RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS;
				case RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS: return RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QuantityScalarOperation.class) {
			switch (baseFeatureID) {
				case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS: return RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__LHS;
				case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS: return RaspiroverPackage.ANGLE_SCALAR_MULTIPLY__RHS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AngleScalarMultiplyImpl
