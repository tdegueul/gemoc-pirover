/**
 * Copyright (c) 2017 TU Wien.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.units.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelexecution.units.NumericValue;
import org.modelexecution.units.Quantity;
import org.modelexecution.units.QuantityOperation;
import org.modelexecution.units.TmpContainer;
import org.modelexecution.units.UnitsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tmp Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.units.impl.TmpContainerImpl#getQuantities <em>Quantities</em>}</li>
 *   <li>{@link org.modelexecution.units.impl.TmpContainerImpl#getNumericValues <em>Numeric Values</em>}</li>
 *   <li>{@link org.modelexecution.units.impl.TmpContainerImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TmpContainerImpl extends MinimalEObjectImpl.Container implements TmpContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * The cached value of the '{@link #getQuantities() <em>Quantities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantities()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> quantities;

	/**
	 * The cached value of the '{@link #getNumericValues() <em>Numeric Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericValues()
	 * @generated
	 * @ordered
	 */
	protected EList<NumericValue> numericValues;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TmpContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitsPackage.Literals.TMP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getQuantities() {
		if (quantities == null) {
			quantities = new EObjectContainmentEList<Quantity>(Quantity.class, this, UnitsPackage.TMP_CONTAINER__QUANTITIES);
		}
		return quantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumericValue> getNumericValues() {
		if (numericValues == null) {
			numericValues = new EObjectContainmentEList<NumericValue>(NumericValue.class, this, UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES);
		}
		return numericValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<QuantityOperation>(QuantityOperation.class, this, UnitsPackage.TMP_CONTAINER__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnitsPackage.TMP_CONTAINER__QUANTITIES:
				return ((InternalEList<?>)getQuantities()).basicRemove(otherEnd, msgs);
			case UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES:
				return ((InternalEList<?>)getNumericValues()).basicRemove(otherEnd, msgs);
			case UnitsPackage.TMP_CONTAINER__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case UnitsPackage.TMP_CONTAINER__QUANTITIES:
				return getQuantities();
			case UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES:
				return getNumericValues();
			case UnitsPackage.TMP_CONTAINER__OPERATIONS:
				return getOperations();
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
			case UnitsPackage.TMP_CONTAINER__QUANTITIES:
				getQuantities().clear();
				getQuantities().addAll((Collection<? extends Quantity>)newValue);
				return;
			case UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES:
				getNumericValues().clear();
				getNumericValues().addAll((Collection<? extends NumericValue>)newValue);
				return;
			case UnitsPackage.TMP_CONTAINER__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends QuantityOperation>)newValue);
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
			case UnitsPackage.TMP_CONTAINER__QUANTITIES:
				getQuantities().clear();
				return;
			case UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES:
				getNumericValues().clear();
				return;
			case UnitsPackage.TMP_CONTAINER__OPERATIONS:
				getOperations().clear();
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
			case UnitsPackage.TMP_CONTAINER__QUANTITIES:
				return quantities != null && !quantities.isEmpty();
			case UnitsPackage.TMP_CONTAINER__NUMERIC_VALUES:
				return numericValues != null && !numericValues.isEmpty();
			case UnitsPackage.TMP_CONTAINER__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TmpContainerImpl
