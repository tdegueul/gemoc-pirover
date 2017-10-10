/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rover.raspirover.raspirover.HumidityQuery;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.RoverValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Humidity Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.HumidityQueryImpl#getNValue <em>NValue</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.HumidityQueryImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumidityQueryImpl extends QueryImpl implements HumidityQuery {
	/**
	 * The default value of the '{@link #getNValue() <em>NValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNValue()
	 * @generated
	 * @ordered
	 */
	protected static final int NVALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNValue() <em>NValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNValue()
	 * @generated
	 * @ordered
	 */
	protected int nValue = NVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumidityQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.HUMIDITY_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNValue() {
		return nValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNValue(int newNValue) {
		int oldNValue = nValue;
		nValue = newNValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.HUMIDITY_QUERY__NVALUE, oldNValue, nValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaspiroverPackage.HUMIDITY_QUERY__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.HUMIDITY_QUERY__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.HUMIDITY_QUERY__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.HUMIDITY_QUERY__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String print() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY:
				return basicSetQuantity(null, msgs);
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
			case RaspiroverPackage.HUMIDITY_QUERY__NVALUE:
				return getNValue();
			case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY:
				return getQuantity();
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
			case RaspiroverPackage.HUMIDITY_QUERY__NVALUE:
				setNValue((Integer)newValue);
				return;
			case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY:
				setQuantity((Quantity)newValue);
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
			case RaspiroverPackage.HUMIDITY_QUERY__NVALUE:
				setNValue(NVALUE_EDEFAULT);
				return;
			case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY:
				setQuantity((Quantity)null);
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
			case RaspiroverPackage.HUMIDITY_QUERY__NVALUE:
				return nValue != NVALUE_EDEFAULT;
			case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY:
				return quantity != null;
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
		if (baseClass == NumberValue.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.HUMIDITY_QUERY__NVALUE: return RaspiroverPackage.NUMBER_VALUE__NVALUE;
				case RaspiroverPackage.HUMIDITY_QUERY__QUANTITY: return RaspiroverPackage.NUMBER_VALUE__QUANTITY;
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
		if (baseClass == NumberValue.class) {
			switch (baseFeatureID) {
				case RaspiroverPackage.NUMBER_VALUE__NVALUE: return RaspiroverPackage.HUMIDITY_QUERY__NVALUE;
				case RaspiroverPackage.NUMBER_VALUE__QUANTITY: return RaspiroverPackage.HUMIDITY_QUERY__QUANTITY;
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
		result.append(" (nValue: ");
		result.append(nValue);
		result.append(')');
		return result.toString();
	}

} //HumidityQueryImpl
