/**
 */
package rcl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rcl.BooleanValue;
import rcl.ObstacleQuery;
import rcl.RclPackage;
import rcl.RoverValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rcl.impl.ObstacleQueryImpl#isBValue <em>BValue</em>}</li>
 *   <li>{@link rcl.impl.ObstacleQueryImpl#isFront <em>Front</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstacleQueryImpl extends QueryImpl implements ObstacleQuery {
	/**
	 * The default value of the '{@link #isBValue() <em>BValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BVALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBValue() <em>BValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBValue()
	 * @generated
	 * @ordered
	 */
	protected boolean bValue = BVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFront() <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFront() <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFront()
	 * @generated
	 * @ordered
	 */
	protected boolean front = FRONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RclPackage.Literals.OBSTACLE_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBValue() {
		return bValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBValue(boolean newBValue) {
		boolean oldBValue = bValue;
		bValue = newBValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.OBSTACLE_QUERY__BVALUE, oldBValue, bValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFront() {
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFront(boolean newFront) {
		boolean oldFront = front;
		front = newFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.OBSTACLE_QUERY__FRONT, oldFront, front));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RclPackage.OBSTACLE_QUERY__BVALUE:
				return isBValue();
			case RclPackage.OBSTACLE_QUERY__FRONT:
				return isFront();
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
			case RclPackage.OBSTACLE_QUERY__BVALUE:
				setBValue((Boolean)newValue);
				return;
			case RclPackage.OBSTACLE_QUERY__FRONT:
				setFront((Boolean)newValue);
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
			case RclPackage.OBSTACLE_QUERY__BVALUE:
				setBValue(BVALUE_EDEFAULT);
				return;
			case RclPackage.OBSTACLE_QUERY__FRONT:
				setFront(FRONT_EDEFAULT);
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
			case RclPackage.OBSTACLE_QUERY__BVALUE:
				return bValue != BVALUE_EDEFAULT;
			case RclPackage.OBSTACLE_QUERY__FRONT:
				return front != FRONT_EDEFAULT;
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
		if (baseClass == RoverValue.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BooleanValue.class) {
			switch (derivedFeatureID) {
				case RclPackage.OBSTACLE_QUERY__BVALUE: return RclPackage.BOOLEAN_VALUE__BVALUE;
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
		if (baseClass == RoverValue.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BooleanValue.class) {
			switch (baseFeatureID) {
				case RclPackage.BOOLEAN_VALUE__BVALUE: return RclPackage.OBSTACLE_QUERY__BVALUE;
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
		result.append(" (bValue: ");
		result.append(bValue);
		result.append(", front: ");
		result.append(front);
		result.append(')');
		return result.toString();
	}

} //ObstacleQueryImpl
