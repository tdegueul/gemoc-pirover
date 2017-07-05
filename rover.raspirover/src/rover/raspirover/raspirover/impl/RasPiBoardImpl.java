/**
 */
package rover.raspirover.raspirover.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rover.raspirover.raspirover.AnalogPin;
import rover.raspirover.raspirover.DigitalPin;
import rover.raspirover.raspirover.RasPiBoard;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ras Pi Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.RasPiBoardImpl#getDigitalPins <em>Digital Pins</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.RasPiBoardImpl#getAnalogPins <em>Analog Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RasPiBoardImpl extends BoardImpl implements RasPiBoard {
	/**
	 * The cached value of the '{@link #getDigitalPins() <em>Digital Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalPins()
	 * @generated
	 * @ordered
	 */
	protected EList<DigitalPin> digitalPins;

	/**
	 * The cached value of the '{@link #getAnalogPins() <em>Analog Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogPins()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalogPin> analogPins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasPiBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.RAS_PI_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DigitalPin> getDigitalPins() {
		if (digitalPins == null) {
			digitalPins = new EObjectContainmentEList<DigitalPin>(DigitalPin.class, this, RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS);
		}
		return digitalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalogPin> getAnalogPins() {
		if (analogPins == null) {
			analogPins = new EObjectContainmentEList<AnalogPin>(AnalogPin.class, this, RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS);
		}
		return analogPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
				return ((InternalEList<?>)getDigitalPins()).basicRemove(otherEnd, msgs);
			case RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
				return ((InternalEList<?>)getAnalogPins()).basicRemove(otherEnd, msgs);
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
			case RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
				return getDigitalPins();
			case RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
				return getAnalogPins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
				getDigitalPins().clear();
				getDigitalPins().addAll((Collection<? extends DigitalPin>)newValue);
				return;
			case RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
				getAnalogPins().clear();
				getAnalogPins().addAll((Collection<? extends AnalogPin>)newValue);
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
			case RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
				getDigitalPins().clear();
				return;
			case RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
				getAnalogPins().clear();
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
			case RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
				return digitalPins != null && !digitalPins.isEmpty();
			case RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
				return analogPins != null && !analogPins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RasPiBoardImpl
