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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Scalar Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.units.QuantityScalarOperation#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.modelexecution.units.QuantityScalarOperation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.modelexecution.units.UnitsPackage#getQuantityScalarOperation()
 * @model abstract="true"
 * @generated
 */
public interface QuantityScalarOperation extends QuantityOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(Quantity)
	 * @see org.modelexecution.units.UnitsPackage#getQuantityScalarOperation_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Quantity getLhs();

	/**
	 * Sets the value of the '{@link org.modelexecution.units.QuantityScalarOperation#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Quantity value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(NumericValue)
	 * @see org.modelexecution.units.UnitsPackage#getQuantityScalarOperation_Rhs()
	 * @model required="true"
	 * @generated
	 */
	NumericValue getRhs();

	/**
	 * Sets the value of the '{@link org.modelexecution.units.QuantityScalarOperation#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(NumericValue value);

} // QuantityScalarOperation
