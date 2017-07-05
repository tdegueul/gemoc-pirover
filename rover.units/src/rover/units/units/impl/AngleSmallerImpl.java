/**
 */
package rover.units.units.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.units.units.AngleSmaller;
import rover.units.units.Quantity;
import rover.units.units.QuantityHomogenousOperation;
import rover.units.units.UnitsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Smaller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.units.units.impl.AngleSmallerImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.units.units.impl.AngleSmallerImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleSmallerImpl extends AngleOperationImpl implements AngleSmaller {
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
	protected AngleSmallerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitsPackage.Literals.ANGLE_SMALLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnitsPackage.ANGLE_SMALLER__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.ANGLE_SMALLER__LHS, oldLhs, lhs));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnitsPackage.ANGLE_SMALLER__RHS, oldRhs, rhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.ANGLE_SMALLER__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnitsPackage.ANGLE_SMALLER__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case UnitsPackage.ANGLE_SMALLER__RHS:
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
			case UnitsPackage.ANGLE_SMALLER__LHS:
				setLhs((Quantity)newValue);
				return;
			case UnitsPackage.ANGLE_SMALLER__RHS:
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
			case UnitsPackage.ANGLE_SMALLER__LHS:
				setLhs((Quantity)null);
				return;
			case UnitsPackage.ANGLE_SMALLER__RHS:
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
			case UnitsPackage.ANGLE_SMALLER__LHS:
				return lhs != null;
			case UnitsPackage.ANGLE_SMALLER__RHS:
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
		if (baseClass == QuantityHomogenousOperation.class) {
			switch (derivedFeatureID) {
				case UnitsPackage.ANGLE_SMALLER__LHS: return UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS;
				case UnitsPackage.ANGLE_SMALLER__RHS: return UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS;
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
		if (baseClass == QuantityHomogenousOperation.class) {
			switch (baseFeatureID) {
				case UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS: return UnitsPackage.ANGLE_SMALLER__LHS;
				case UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS: return UnitsPackage.ANGLE_SMALLER__RHS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AngleSmallerImpl
