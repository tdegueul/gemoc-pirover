/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.LengthScalarMultiply;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityScalarOperation;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Scalar Multiply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.LengthScalarMultiplyImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.LengthScalarMultiplyImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LengthScalarMultiplyImpl extends LengthOperationImpl implements LengthScalarMultiply {
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
	protected LengthScalarMultiplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.LENGTH_SCALAR_MULTIPLY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS, oldLhs, lhs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS, oldRhs, rhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS:
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
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS:
				setLhs((Quantity)newValue);
				return;
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS:
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
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS:
				setLhs((Quantity)null);
				return;
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS:
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
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS:
				return lhs != null;
			case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QuantityScalarOperation.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS: return RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS;
				case RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS: return RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS;
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
				case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__LHS: return RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__LHS;
				case RaspiroverPackage.QUANTITY_SCALAR_OPERATION__RHS: return RaspiroverPackage.LENGTH_SCALAR_MULTIPLY__RHS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //LengthScalarMultiplyImpl
