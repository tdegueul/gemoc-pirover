/**
 */
package rover.raspirover.raspirover.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.Statement;
import rover.raspirover.raspirover.StringValue;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.raspirover.VarRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rover.raspirover.raspirover.impl.VarRefImpl#getNValue <em>NValue</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.VarRefImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.VarRefImpl#getSValue <em>SValue</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.VarRefImpl#getEnclosing <em>Enclosing</em>}</li>
 *   <li>{@link rover.raspirover.raspirover.impl.VarRefImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarRefImpl extends BooleanValueImpl implements VarRef {
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
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getSValue() <em>SValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSValue() <em>SValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSValue()
	 * @generated
	 * @ordered
	 */
	protected String sValue = SVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaspiroverPackage.Literals.VAR_REF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__NVALUE, oldNValue, nValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.VAR_REF__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RaspiroverPackage.VAR_REF__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSValue() {
		return sValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSValue(String newSValue) {
		String oldSValue = sValue;
		sValue = newSValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__SVALUE, oldSValue, sValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RclBlock getEnclosing() {
		if (eContainerFeatureID() != RaspiroverPackage.VAR_REF__ENCLOSING) return null;
		return (RclBlock)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosing(RclBlock newEnclosing, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosing, RaspiroverPackage.VAR_REF__ENCLOSING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosing(RclBlock newEnclosing) {
		if (newEnclosing != eInternalContainer() || (eContainerFeatureID() != RaspiroverPackage.VAR_REF__ENCLOSING && newEnclosing != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosing))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosing != null)
				msgs = ((InternalEObject)newEnclosing).eInverseAdd(this, RaspiroverPackage.RCL_BLOCK__STMTS, RclBlock.class, msgs);
			msgs = basicSetEnclosing(newEnclosing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__ENCLOSING, newEnclosing, newEnclosing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaspiroverPackage.VAR_REF__NAME, oldName, name));
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
	public String getStringValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverProgram getProgram() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosing((RclBlock)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaspiroverPackage.VAR_REF__UNIT:
				return basicSetUnit(null, msgs);
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				return basicSetEnclosing(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				return eInternalContainer().eInverseRemove(this, RaspiroverPackage.RCL_BLOCK__STMTS, RclBlock.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaspiroverPackage.VAR_REF__NVALUE:
				return getNValue();
			case RaspiroverPackage.VAR_REF__UNIT:
				return getUnit();
			case RaspiroverPackage.VAR_REF__SVALUE:
				return getSValue();
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				return getEnclosing();
			case RaspiroverPackage.VAR_REF__NAME:
				return getName();
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
			case RaspiroverPackage.VAR_REF__NVALUE:
				setNValue((Integer)newValue);
				return;
			case RaspiroverPackage.VAR_REF__UNIT:
				setUnit((Unit)newValue);
				return;
			case RaspiroverPackage.VAR_REF__SVALUE:
				setSValue((String)newValue);
				return;
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				setEnclosing((RclBlock)newValue);
				return;
			case RaspiroverPackage.VAR_REF__NAME:
				setName((String)newValue);
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
			case RaspiroverPackage.VAR_REF__NVALUE:
				setNValue(NVALUE_EDEFAULT);
				return;
			case RaspiroverPackage.VAR_REF__UNIT:
				setUnit((Unit)null);
				return;
			case RaspiroverPackage.VAR_REF__SVALUE:
				setSValue(SVALUE_EDEFAULT);
				return;
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				setEnclosing((RclBlock)null);
				return;
			case RaspiroverPackage.VAR_REF__NAME:
				setName(NAME_EDEFAULT);
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
			case RaspiroverPackage.VAR_REF__NVALUE:
				return nValue != NVALUE_EDEFAULT;
			case RaspiroverPackage.VAR_REF__UNIT:
				return unit != null;
			case RaspiroverPackage.VAR_REF__SVALUE:
				return SVALUE_EDEFAULT == null ? sValue != null : !SVALUE_EDEFAULT.equals(sValue);
			case RaspiroverPackage.VAR_REF__ENCLOSING:
				return getEnclosing() != null;
			case RaspiroverPackage.VAR_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (baseClass == NumberValue.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.VAR_REF__NVALUE: return RaspiroverPackage.NUMBER_VALUE__NVALUE;
				case RaspiroverPackage.VAR_REF__UNIT: return RaspiroverPackage.NUMBER_VALUE__UNIT;
				default: return -1;
			}
		}
		if (baseClass == StringValue.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.VAR_REF__SVALUE: return RaspiroverPackage.STRING_VALUE__SVALUE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case RaspiroverPackage.VAR_REF__ENCLOSING: return RaspiroverPackage.STATEMENT__ENCLOSING;
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
		if (baseClass == NumberValue.class) {
			switch (baseFeatureID) {
				case RaspiroverPackage.NUMBER_VALUE__NVALUE: return RaspiroverPackage.VAR_REF__NVALUE;
				case RaspiroverPackage.NUMBER_VALUE__UNIT: return RaspiroverPackage.VAR_REF__UNIT;
				default: return -1;
			}
		}
		if (baseClass == StringValue.class) {
			switch (baseFeatureID) {
				case RaspiroverPackage.STRING_VALUE__SVALUE: return RaspiroverPackage.VAR_REF__SVALUE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case RaspiroverPackage.STATEMENT__ENCLOSING: return RaspiroverPackage.VAR_REF__ENCLOSING;
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
		result.append(", sValue: ");
		result.append(sValue);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VarRefImpl
