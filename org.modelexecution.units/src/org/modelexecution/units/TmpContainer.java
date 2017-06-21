/**
 * Copyright (c) 2017 TU Wien.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.units;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tmp Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.units.TmpContainer#getQuantities <em>Quantities</em>}</li>
 *   <li>{@link org.modelexecution.units.TmpContainer#getNumericValues <em>Numeric Values</em>}</li>
 *   <li>{@link org.modelexecution.units.TmpContainer#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.units.UnitsPackage#getTmpContainer()
 * @model
 * @generated
 */
public interface TmpContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Quantities</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.units.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantities</em>' containment reference list.
	 * @see org.modelexecution.units.UnitsPackage#getTmpContainer_Quantities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quantity> getQuantities();

	/**
	 * Returns the value of the '<em><b>Numeric Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.units.NumericValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Values</em>' containment reference list.
	 * @see org.modelexecution.units.UnitsPackage#getTmpContainer_NumericValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumericValue> getNumericValues();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.modelexecution.units.QuantityOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.modelexecution.units.UnitsPackage#getTmpContainer_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuantityOperation> getOperations();

} // TmpContainer
