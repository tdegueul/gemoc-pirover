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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.modelexecution.units.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitsFactoryImpl extends EFactoryImpl implements UnitsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitsFactory init() {
		try {
			UnitsFactory theUnitsFactory = (UnitsFactory)EPackage.Registry.INSTANCE.getEFactory(UnitsPackage.eNS_URI);
			if (theUnitsFactory != null) {
				return theUnitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnitsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UnitsPackage.CENTIMETER: return createCentimeter();
			case UnitsPackage.MILLIMETER: return createMillimeter();
			case UnitsPackage.METER: return createMeter();
			case UnitsPackage.FOOT: return createFoot();
			case UnitsPackage.INCH: return createInch();
			case UnitsPackage.YARD: return createYard();
			case UnitsPackage.RADIAN: return createRadian();
			case UnitsPackage.DEGREE: return createDegree();
			case UnitsPackage.TURN: return createTurn();
			case UnitsPackage.GRADIAN: return createGradian();
			case UnitsPackage.LENGTH: return createLength();
			case UnitsPackage.ANGLE: return createAngle();
			case UnitsPackage.LENGTH_ADD: return createLengthAdd();
			case UnitsPackage.LENGTH_SUBTRACT: return createLengthSubtract();
			case UnitsPackage.LENGTH_SCALAR_MULTIPLY: return createLengthScalarMultiply();
			case UnitsPackage.LENGTH_SCALAR_DIVIDE: return createLengthScalarDivide();
			case UnitsPackage.LENGTH_EQUALS: return createLengthEquals();
			case UnitsPackage.LENGTH_DISTINCT: return createLengthDistinct();
			case UnitsPackage.LENGTH_SMALLER: return createLengthSmaller();
			case UnitsPackage.LENGTH_GREATER: return createLengthGreater();
			case UnitsPackage.ANGLE_ADD: return createAngleAdd();
			case UnitsPackage.ANGLE_SUBTRACT: return createAngleSubtract();
			case UnitsPackage.ANGLE_SCALAR_MULTIPLY: return createAngleScalarMultiply();
			case UnitsPackage.ANGLE_SCALAR_DIVIDE: return createAngleScalarDivide();
			case UnitsPackage.ANGLE_EQUALS: return createAngleEquals();
			case UnitsPackage.ANGLE_DISTINCT: return createAngleDistinct();
			case UnitsPackage.ANGLE_SMALLER: return createAngleSmaller();
			case UnitsPackage.ANGLE_GREATER: return createAngleGreater();
			case UnitsPackage.TMP_CONTAINER: return createTmpContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Centimeter createCentimeter() {
		CentimeterImpl centimeter = new CentimeterImpl();
		return centimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Millimeter createMillimeter() {
		MillimeterImpl millimeter = new MillimeterImpl();
		return millimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foot createFoot() {
		FootImpl foot = new FootImpl();
		return foot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inch createInch() {
		InchImpl inch = new InchImpl();
		return inch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yard createYard() {
		YardImpl yard = new YardImpl();
		return yard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radian createRadian() {
		RadianImpl radian = new RadianImpl();
		return radian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Degree createDegree() {
		DegreeImpl degree = new DegreeImpl();
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gradian createGradian() {
		GradianImpl gradian = new GradianImpl();
		return gradian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle createAngle() {
		AngleImpl angle = new AngleImpl();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthAdd createLengthAdd() {
		LengthAddImpl lengthAdd = new LengthAddImpl();
		return lengthAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthSubtract createLengthSubtract() {
		LengthSubtractImpl lengthSubtract = new LengthSubtractImpl();
		return lengthSubtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthScalarMultiply createLengthScalarMultiply() {
		LengthScalarMultiplyImpl lengthScalarMultiply = new LengthScalarMultiplyImpl();
		return lengthScalarMultiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthScalarDivide createLengthScalarDivide() {
		LengthScalarDivideImpl lengthScalarDivide = new LengthScalarDivideImpl();
		return lengthScalarDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthEquals createLengthEquals() {
		LengthEqualsImpl lengthEquals = new LengthEqualsImpl();
		return lengthEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthDistinct createLengthDistinct() {
		LengthDistinctImpl lengthDistinct = new LengthDistinctImpl();
		return lengthDistinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthSmaller createLengthSmaller() {
		LengthSmallerImpl lengthSmaller = new LengthSmallerImpl();
		return lengthSmaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthGreater createLengthGreater() {
		LengthGreaterImpl lengthGreater = new LengthGreaterImpl();
		return lengthGreater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleAdd createAngleAdd() {
		AngleAddImpl angleAdd = new AngleAddImpl();
		return angleAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleSubtract createAngleSubtract() {
		AngleSubtractImpl angleSubtract = new AngleSubtractImpl();
		return angleSubtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleScalarMultiply createAngleScalarMultiply() {
		AngleScalarMultiplyImpl angleScalarMultiply = new AngleScalarMultiplyImpl();
		return angleScalarMultiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleScalarDivide createAngleScalarDivide() {
		AngleScalarDivideImpl angleScalarDivide = new AngleScalarDivideImpl();
		return angleScalarDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleEquals createAngleEquals() {
		AngleEqualsImpl angleEquals = new AngleEqualsImpl();
		return angleEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleDistinct createAngleDistinct() {
		AngleDistinctImpl angleDistinct = new AngleDistinctImpl();
		return angleDistinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleSmaller createAngleSmaller() {
		AngleSmallerImpl angleSmaller = new AngleSmallerImpl();
		return angleSmaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleGreater createAngleGreater() {
		AngleGreaterImpl angleGreater = new AngleGreaterImpl();
		return angleGreater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmpContainer createTmpContainer() {
		TmpContainerImpl tmpContainer = new TmpContainerImpl();
		return tmpContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPackage getUnitsPackage() {
		return (UnitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnitsPackage getPackage() {
		return UnitsPackage.eINSTANCE;
	}

} //UnitsFactoryImpl
