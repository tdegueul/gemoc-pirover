/**
 */
package rcl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import rcl.Block;
import rcl.NumberValue;
import rcl.RclPackage;
import rcl.Statement;
import rcl.StringValue;
import rcl.VarRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rcl.impl.VarRefImpl#getNValue <em>NValue</em>}</li>
 *   <li>{@link rcl.impl.VarRefImpl#getSValue <em>SValue</em>}</li>
 *   <li>{@link rcl.impl.VarRefImpl#getEnclosing <em>Enclosing</em>}</li>
 *   <li>{@link rcl.impl.VarRefImpl#getName <em>Name</em>}</li>
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
		return RclPackage.Literals.VAR_REF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.VAR_REF__NVALUE, oldNValue, nValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.VAR_REF__SVALUE, oldSValue, sValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getEnclosing() {
		if (eContainerFeatureID() != RclPackage.VAR_REF__ENCLOSING) return null;
		return (Block)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosing(Block newEnclosing, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosing, RclPackage.VAR_REF__ENCLOSING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosing(Block newEnclosing) {
		if (newEnclosing != eInternalContainer() || (eContainerFeatureID() != RclPackage.VAR_REF__ENCLOSING && newEnclosing != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosing))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosing != null)
				msgs = ((InternalEObject)newEnclosing).eInverseAdd(this, RclPackage.BLOCK__STMTS, Block.class, msgs);
			msgs = basicSetEnclosing(newEnclosing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.VAR_REF__ENCLOSING, newEnclosing, newEnclosing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RclPackage.VAR_REF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RclPackage.VAR_REF__ENCLOSING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosing((Block)otherEnd, msgs);
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
			case RclPackage.VAR_REF__ENCLOSING:
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
			case RclPackage.VAR_REF__ENCLOSING:
				return eInternalContainer().eInverseRemove(this, RclPackage.BLOCK__STMTS, Block.class, msgs);
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
			case RclPackage.VAR_REF__NVALUE:
				return getNValue();
			case RclPackage.VAR_REF__SVALUE:
				return getSValue();
			case RclPackage.VAR_REF__ENCLOSING:
				return getEnclosing();
			case RclPackage.VAR_REF__NAME:
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
			case RclPackage.VAR_REF__NVALUE:
				setNValue((Integer)newValue);
				return;
			case RclPackage.VAR_REF__SVALUE:
				setSValue((String)newValue);
				return;
			case RclPackage.VAR_REF__ENCLOSING:
				setEnclosing((Block)newValue);
				return;
			case RclPackage.VAR_REF__NAME:
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
			case RclPackage.VAR_REF__NVALUE:
				setNValue(NVALUE_EDEFAULT);
				return;
			case RclPackage.VAR_REF__SVALUE:
				setSValue(SVALUE_EDEFAULT);
				return;
			case RclPackage.VAR_REF__ENCLOSING:
				setEnclosing((Block)null);
				return;
			case RclPackage.VAR_REF__NAME:
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
			case RclPackage.VAR_REF__NVALUE:
				return nValue != NVALUE_EDEFAULT;
			case RclPackage.VAR_REF__SVALUE:
				return SVALUE_EDEFAULT == null ? sValue != null : !SVALUE_EDEFAULT.equals(sValue);
			case RclPackage.VAR_REF__ENCLOSING:
				return getEnclosing() != null;
			case RclPackage.VAR_REF__NAME:
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
				case RclPackage.VAR_REF__NVALUE: return RclPackage.NUMBER_VALUE__NVALUE;
				default: return -1;
			}
		}
		if (baseClass == StringValue.class) {
			switch (derivedFeatureID) {
				case RclPackage.VAR_REF__SVALUE: return RclPackage.STRING_VALUE__SVALUE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case RclPackage.VAR_REF__ENCLOSING: return RclPackage.STATEMENT__ENCLOSING;
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
				case RclPackage.NUMBER_VALUE__NVALUE: return RclPackage.VAR_REF__NVALUE;
				default: return -1;
			}
		}
		if (baseClass == StringValue.class) {
			switch (baseFeatureID) {
				case RclPackage.STRING_VALUE__SVALUE: return RclPackage.VAR_REF__SVALUE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case RclPackage.STATEMENT__ENCLOSING: return RclPackage.VAR_REF__ENCLOSING;
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
