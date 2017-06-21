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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.units.UnitsPackage
 * @generated
 */
public interface UnitsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsFactory eINSTANCE = org.modelexecution.units.impl.UnitsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Centimeter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centimeter</em>'.
	 * @generated
	 */
	Centimeter createCentimeter();

	/**
	 * Returns a new object of class '<em>Millimeter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Millimeter</em>'.
	 * @generated
	 */
	Millimeter createMillimeter();

	/**
	 * Returns a new object of class '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter</em>'.
	 * @generated
	 */
	Meter createMeter();

	/**
	 * Returns a new object of class '<em>Foot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foot</em>'.
	 * @generated
	 */
	Foot createFoot();

	/**
	 * Returns a new object of class '<em>Inch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inch</em>'.
	 * @generated
	 */
	Inch createInch();

	/**
	 * Returns a new object of class '<em>Yard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yard</em>'.
	 * @generated
	 */
	Yard createYard();

	/**
	 * Returns a new object of class '<em>Radian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radian</em>'.
	 * @generated
	 */
	Radian createRadian();

	/**
	 * Returns a new object of class '<em>Degree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree</em>'.
	 * @generated
	 */
	Degree createDegree();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Gradian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gradian</em>'.
	 * @generated
	 */
	Gradian createGradian();

	/**
	 * Returns a new object of class '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length</em>'.
	 * @generated
	 */
	Length createLength();

	/**
	 * Returns a new object of class '<em>Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle</em>'.
	 * @generated
	 */
	Angle createAngle();

	/**
	 * Returns a new object of class '<em>Length Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Add</em>'.
	 * @generated
	 */
	LengthAdd createLengthAdd();

	/**
	 * Returns a new object of class '<em>Length Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Subtract</em>'.
	 * @generated
	 */
	LengthSubtract createLengthSubtract();

	/**
	 * Returns a new object of class '<em>Length Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Scalar Multiply</em>'.
	 * @generated
	 */
	LengthScalarMultiply createLengthScalarMultiply();

	/**
	 * Returns a new object of class '<em>Length Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Scalar Divide</em>'.
	 * @generated
	 */
	LengthScalarDivide createLengthScalarDivide();

	/**
	 * Returns a new object of class '<em>Length Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Equals</em>'.
	 * @generated
	 */
	LengthEquals createLengthEquals();

	/**
	 * Returns a new object of class '<em>Length Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Distinct</em>'.
	 * @generated
	 */
	LengthDistinct createLengthDistinct();

	/**
	 * Returns a new object of class '<em>Length Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Smaller</em>'.
	 * @generated
	 */
	LengthSmaller createLengthSmaller();

	/**
	 * Returns a new object of class '<em>Length Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Greater</em>'.
	 * @generated
	 */
	LengthGreater createLengthGreater();

	/**
	 * Returns a new object of class '<em>Angle Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Add</em>'.
	 * @generated
	 */
	AngleAdd createAngleAdd();

	/**
	 * Returns a new object of class '<em>Angle Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Subtract</em>'.
	 * @generated
	 */
	AngleSubtract createAngleSubtract();

	/**
	 * Returns a new object of class '<em>Angle Scalar Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Scalar Multiply</em>'.
	 * @generated
	 */
	AngleScalarMultiply createAngleScalarMultiply();

	/**
	 * Returns a new object of class '<em>Angle Scalar Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Scalar Divide</em>'.
	 * @generated
	 */
	AngleScalarDivide createAngleScalarDivide();

	/**
	 * Returns a new object of class '<em>Angle Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Equals</em>'.
	 * @generated
	 */
	AngleEquals createAngleEquals();

	/**
	 * Returns a new object of class '<em>Angle Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Distinct</em>'.
	 * @generated
	 */
	AngleDistinct createAngleDistinct();

	/**
	 * Returns a new object of class '<em>Angle Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Smaller</em>'.
	 * @generated
	 */
	AngleSmaller createAngleSmaller();

	/**
	 * Returns a new object of class '<em>Angle Greater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Greater</em>'.
	 * @generated
	 */
	AngleGreater createAngleGreater();

	/**
	 * Returns a new object of class '<em>Tmp Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tmp Container</em>'.
	 * @generated
	 */
	TmpContainer createTmpContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnitsPackage getUnitsPackage();

} //UnitsFactory
