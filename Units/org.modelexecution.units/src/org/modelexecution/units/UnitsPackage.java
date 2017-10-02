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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelexecution.units.UnitsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UnitsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2017 TU Wien.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelexecution.org/units";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "units";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsPackage eINSTANCE = org.modelexecution.units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.UnitImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthUnitImpl <em>Length Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthUnitImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthUnit()
	 * @generated
	 */
	int LENGTH_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Length Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.MetricSystemUnitImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMetricSystemUnit()
	 * @generated
	 */
	int METRIC_SYSTEM_UNIT = 8;

	/**
	 * The number of structural features of the '<em>Metric System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_SYSTEM_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.CentimeterImpl <em>Centimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.CentimeterImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getCentimeter()
	 * @generated
	 */
	int CENTIMETER = 2;

	/**
	 * The number of structural features of the '<em>Centimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Centimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTIMETER_OPERATION_COUNT = METRIC_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.MillimeterImpl <em>Millimeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.MillimeterImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMillimeter()
	 * @generated
	 */
	int MILLIMETER = 3;

	/**
	 * The number of structural features of the '<em>Millimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILLIMETER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Millimeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILLIMETER_OPERATION_COUNT = METRIC_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.MeterImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 4;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = METRIC_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = METRIC_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.ImperialSystemUnitImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getImperialSystemUnit()
	 * @generated
	 */
	int IMPERIAL_SYSTEM_UNIT = 9;

	/**
	 * The number of structural features of the '<em>Imperial System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Imperial System Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERIAL_SYSTEM_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.FootImpl <em>Foot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.FootImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getFoot()
	 * @generated
	 */
	int FOOT = 5;

	/**
	 * The number of structural features of the '<em>Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Foot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOT_OPERATION_COUNT = IMPERIAL_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.InchImpl <em>Inch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.InchImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getInch()
	 * @generated
	 */
	int INCH = 6;

	/**
	 * The number of structural features of the '<em>Inch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCH_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCH_OPERATION_COUNT = IMPERIAL_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.YardImpl <em>Yard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.YardImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getYard()
	 * @generated
	 */
	int YARD = 7;

	/**
	 * The number of structural features of the '<em>Yard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YARD_FEATURE_COUNT = IMPERIAL_SYSTEM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Yard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YARD_OPERATION_COUNT = IMPERIAL_SYSTEM_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleUnitImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleUnit()
	 * @generated
	 */
	int ANGLE_UNIT = 10;

	/**
	 * The number of structural features of the '<em>Angle Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Angle Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.RadianImpl <em>Radian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.RadianImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getRadian()
	 * @generated
	 */
	int RADIAN = 11;

	/**
	 * The number of structural features of the '<em>Radian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAN_OPERATION_COUNT = ANGLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.DegreeImpl <em>Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.DegreeImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getDegree()
	 * @generated
	 */
	int DEGREE = 12;

	/**
	 * The number of structural features of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_OPERATION_COUNT = ANGLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.TurnImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 13;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = ANGLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.GradianImpl <em>Gradian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.GradianImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getGradian()
	 * @generated
	 */
	int GRADIAN = 14;

	/**
	 * The number of structural features of the '<em>Gradian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIAN_FEATURE_COUNT = ANGLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gradian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIAN_OPERATION_COUNT = ANGLE_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 15;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 16;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 17;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = QUANTITY__VALUE;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.NumericValue <em>Numeric Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.NumericValue
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getNumericValue()
	 * @generated
	 */
	int NUMERIC_VALUE = 18;

	/**
	 * The number of structural features of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityOperation()
	 * @generated
	 */
	int QUANTITY_OPERATION = 19;

	/**
	 * The number of structural features of the '<em>Quantity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Quantity Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthOperationImpl <em>Length Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthOperation()
	 * @generated
	 */
	int LENGTH_OPERATION = 20;

	/**
	 * The number of structural features of the '<em>Length Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthAddImpl <em>Length Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthAddImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthAdd()
	 * @generated
	 */
	int LENGTH_ADD = 21;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_ADD_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthSubtractImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthSubtract()
	 * @generated
	 */
	int LENGTH_SUBTRACT = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SUBTRACT_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthScalarMultiplyImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthScalarMultiply()
	 * @generated
	 */
	int LENGTH_SCALAR_MULTIPLY = 23;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_MULTIPLY_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthScalarDivideImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthScalarDivide()
	 * @generated
	 */
	int LENGTH_SCALAR_DIVIDE = 24;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SCALAR_DIVIDE_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthEqualsImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthEquals()
	 * @generated
	 */
	int LENGTH_EQUALS = 25;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_EQUALS_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthDistinctImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthDistinct()
	 * @generated
	 */
	int LENGTH_DISTINCT = 26;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_DISTINCT_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthSmallerImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthSmaller()
	 * @generated
	 */
	int LENGTH_SMALLER = 27;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_SMALLER_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.LengthGreaterImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthGreater()
	 * @generated
	 */
	int LENGTH_GREATER = 28;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER__LHS = LENGTH_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER__RHS = LENGTH_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Length Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER_FEATURE_COUNT = LENGTH_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Length Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_GREATER_OPERATION_COUNT = LENGTH_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleOperation()
	 * @generated
	 */
	int ANGLE_OPERATION = 29;

	/**
	 * The number of structural features of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Angle Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleAddImpl <em>Angle Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleAddImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleAdd()
	 * @generated
	 */
	int ANGLE_ADD = 30;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_ADD_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleSubtractImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleSubtract()
	 * @generated
	 */
	int ANGLE_SUBTRACT = 31;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SUBTRACT_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleScalarMultiplyImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleScalarMultiply()
	 * @generated
	 */
	int ANGLE_SCALAR_MULTIPLY = 32;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Scalar Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_MULTIPLY_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleScalarDivideImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleScalarDivide()
	 * @generated
	 */
	int ANGLE_SCALAR_DIVIDE = 33;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Scalar Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SCALAR_DIVIDE_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleEqualsImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleEquals()
	 * @generated
	 */
	int ANGLE_EQUALS = 34;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_EQUALS_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleDistinctImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleDistinct()
	 * @generated
	 */
	int ANGLE_DISTINCT = 35;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_DISTINCT_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleSmallerImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleSmaller()
	 * @generated
	 */
	int ANGLE_SMALLER = 36;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_SMALLER_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.AngleGreaterImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleGreater()
	 * @generated
	 */
	int ANGLE_GREATER = 37;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER__LHS = ANGLE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER__RHS = ANGLE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Angle Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER_FEATURE_COUNT = ANGLE_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Angle Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_GREATER_OPERATION_COUNT = ANGLE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityArithmeticOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityArithmeticOperation()
	 * @generated
	 */
	int QUANTITY_ARITHMETIC_OPERATION = 38;

	/**
	 * The number of structural features of the '<em>Quantity Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ARITHMETIC_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quantity Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_ARITHMETIC_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityComparisonOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityComparisonOperation()
	 * @generated
	 */
	int QUANTITY_COMPARISON_OPERATION = 39;

	/**
	 * The number of structural features of the '<em>Quantity Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARISON_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quantity Comparison Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_COMPARISON_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityHomogenousOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityHomogenousOperation()
	 * @generated
	 */
	int QUANTITY_HOMOGENOUS_OPERATION = 40;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION__LHS = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION__RHS = QUANTITY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Homogenous Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantity Homogenous Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_HOMOGENOUS_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.units.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.units.impl.QuantityScalarOperationImpl
	 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityScalarOperation()
	 * @generated
	 */
	int QUANTITY_SCALAR_OPERATION = 41;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION__LHS = QUANTITY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION__RHS = QUANTITY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Scalar Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION_FEATURE_COUNT = QUANTITY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantity Scalar Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_SCALAR_OPERATION_OPERATION_COUNT = QUANTITY_OPERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.modelexecution.units.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthUnit <em>Length Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Unit</em>'.
	 * @see org.modelexecution.units.LengthUnit
	 * @generated
	 */
	EClass getLengthUnit();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Centimeter <em>Centimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centimeter</em>'.
	 * @see org.modelexecution.units.Centimeter
	 * @generated
	 */
	EClass getCentimeter();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Millimeter <em>Millimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Millimeter</em>'.
	 * @see org.modelexecution.units.Millimeter
	 * @generated
	 */
	EClass getMillimeter();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see org.modelexecution.units.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Foot <em>Foot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foot</em>'.
	 * @see org.modelexecution.units.Foot
	 * @generated
	 */
	EClass getFoot();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Inch <em>Inch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inch</em>'.
	 * @see org.modelexecution.units.Inch
	 * @generated
	 */
	EClass getInch();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Yard <em>Yard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yard</em>'.
	 * @see org.modelexecution.units.Yard
	 * @generated
	 */
	EClass getYard();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.MetricSystemUnit <em>Metric System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric System Unit</em>'.
	 * @see org.modelexecution.units.MetricSystemUnit
	 * @generated
	 */
	EClass getMetricSystemUnit();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.ImperialSystemUnit <em>Imperial System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperial System Unit</em>'.
	 * @see org.modelexecution.units.ImperialSystemUnit
	 * @generated
	 */
	EClass getImperialSystemUnit();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleUnit <em>Angle Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Unit</em>'.
	 * @see org.modelexecution.units.AngleUnit
	 * @generated
	 */
	EClass getAngleUnit();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Radian <em>Radian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radian</em>'.
	 * @see org.modelexecution.units.Radian
	 * @generated
	 */
	EClass getRadian();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Degree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree</em>'.
	 * @see org.modelexecution.units.Degree
	 * @generated
	 */
	EClass getDegree();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see org.modelexecution.units.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Gradian <em>Gradian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradian</em>'.
	 * @see org.modelexecution.units.Gradian
	 * @generated
	 */
	EClass getGradian();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.modelexecution.units.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.units.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.modelexecution.units.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.units.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.modelexecution.units.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see org.modelexecution.units.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see org.modelexecution.units.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value</em>'.
	 * @see org.modelexecution.units.NumericValue
	 * @generated
	 */
	EClass getNumericValue();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.QuantityOperation <em>Quantity Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Operation</em>'.
	 * @see org.modelexecution.units.QuantityOperation
	 * @generated
	 */
	EClass getQuantityOperation();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthOperation <em>Length Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Operation</em>'.
	 * @see org.modelexecution.units.LengthOperation
	 * @generated
	 */
	EClass getLengthOperation();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthAdd <em>Length Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Add</em>'.
	 * @see org.modelexecution.units.LengthAdd
	 * @generated
	 */
	EClass getLengthAdd();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthSubtract <em>Length Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Subtract</em>'.
	 * @see org.modelexecution.units.LengthSubtract
	 * @generated
	 */
	EClass getLengthSubtract();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthScalarMultiply <em>Length Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Multiply</em>'.
	 * @see org.modelexecution.units.LengthScalarMultiply
	 * @generated
	 */
	EClass getLengthScalarMultiply();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthScalarDivide <em>Length Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Scalar Divide</em>'.
	 * @see org.modelexecution.units.LengthScalarDivide
	 * @generated
	 */
	EClass getLengthScalarDivide();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthEquals <em>Length Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Equals</em>'.
	 * @see org.modelexecution.units.LengthEquals
	 * @generated
	 */
	EClass getLengthEquals();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthDistinct <em>Length Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Distinct</em>'.
	 * @see org.modelexecution.units.LengthDistinct
	 * @generated
	 */
	EClass getLengthDistinct();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthSmaller <em>Length Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Smaller</em>'.
	 * @see org.modelexecution.units.LengthSmaller
	 * @generated
	 */
	EClass getLengthSmaller();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.LengthGreater <em>Length Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Greater</em>'.
	 * @see org.modelexecution.units.LengthGreater
	 * @generated
	 */
	EClass getLengthGreater();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleOperation <em>Angle Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Operation</em>'.
	 * @see org.modelexecution.units.AngleOperation
	 * @generated
	 */
	EClass getAngleOperation();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleAdd <em>Angle Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Add</em>'.
	 * @see org.modelexecution.units.AngleAdd
	 * @generated
	 */
	EClass getAngleAdd();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleSubtract <em>Angle Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Subtract</em>'.
	 * @see org.modelexecution.units.AngleSubtract
	 * @generated
	 */
	EClass getAngleSubtract();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleScalarMultiply <em>Angle Scalar Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Multiply</em>'.
	 * @see org.modelexecution.units.AngleScalarMultiply
	 * @generated
	 */
	EClass getAngleScalarMultiply();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleScalarDivide <em>Angle Scalar Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Scalar Divide</em>'.
	 * @see org.modelexecution.units.AngleScalarDivide
	 * @generated
	 */
	EClass getAngleScalarDivide();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleEquals <em>Angle Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Equals</em>'.
	 * @see org.modelexecution.units.AngleEquals
	 * @generated
	 */
	EClass getAngleEquals();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleDistinct <em>Angle Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Distinct</em>'.
	 * @see org.modelexecution.units.AngleDistinct
	 * @generated
	 */
	EClass getAngleDistinct();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleSmaller <em>Angle Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Smaller</em>'.
	 * @see org.modelexecution.units.AngleSmaller
	 * @generated
	 */
	EClass getAngleSmaller();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.AngleGreater <em>Angle Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Greater</em>'.
	 * @see org.modelexecution.units.AngleGreater
	 * @generated
	 */
	EClass getAngleGreater();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.QuantityArithmeticOperation <em>Quantity Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Arithmetic Operation</em>'.
	 * @see org.modelexecution.units.QuantityArithmeticOperation
	 * @generated
	 */
	EClass getQuantityArithmeticOperation();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.QuantityComparisonOperation <em>Quantity Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Comparison Operation</em>'.
	 * @see org.modelexecution.units.QuantityComparisonOperation
	 * @generated
	 */
	EClass getQuantityComparisonOperation();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.QuantityHomogenousOperation <em>Quantity Homogenous Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Homogenous Operation</em>'.
	 * @see org.modelexecution.units.QuantityHomogenousOperation
	 * @generated
	 */
	EClass getQuantityHomogenousOperation();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.units.QuantityHomogenousOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see org.modelexecution.units.QuantityHomogenousOperation#getLhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Lhs();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.units.QuantityHomogenousOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see org.modelexecution.units.QuantityHomogenousOperation#getRhs()
	 * @see #getQuantityHomogenousOperation()
	 * @generated
	 */
	EReference getQuantityHomogenousOperation_Rhs();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.units.QuantityScalarOperation <em>Quantity Scalar Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Scalar Operation</em>'.
	 * @see org.modelexecution.units.QuantityScalarOperation
	 * @generated
	 */
	EClass getQuantityScalarOperation();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.units.QuantityScalarOperation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see org.modelexecution.units.QuantityScalarOperation#getLhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EReference getQuantityScalarOperation_Lhs();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.units.QuantityScalarOperation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see org.modelexecution.units.QuantityScalarOperation#getRhs()
	 * @see #getQuantityScalarOperation()
	 * @generated
	 */
	EReference getQuantityScalarOperation_Rhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.UnitImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthUnitImpl <em>Length Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthUnitImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthUnit()
		 * @generated
		 */
		EClass LENGTH_UNIT = eINSTANCE.getLengthUnit();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.CentimeterImpl <em>Centimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.CentimeterImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getCentimeter()
		 * @generated
		 */
		EClass CENTIMETER = eINSTANCE.getCentimeter();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.MillimeterImpl <em>Millimeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.MillimeterImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMillimeter()
		 * @generated
		 */
		EClass MILLIMETER = eINSTANCE.getMillimeter();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.MeterImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.FootImpl <em>Foot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.FootImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getFoot()
		 * @generated
		 */
		EClass FOOT = eINSTANCE.getFoot();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.InchImpl <em>Inch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.InchImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getInch()
		 * @generated
		 */
		EClass INCH = eINSTANCE.getInch();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.YardImpl <em>Yard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.YardImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getYard()
		 * @generated
		 */
		EClass YARD = eINSTANCE.getYard();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.MetricSystemUnitImpl <em>Metric System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.MetricSystemUnitImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getMetricSystemUnit()
		 * @generated
		 */
		EClass METRIC_SYSTEM_UNIT = eINSTANCE.getMetricSystemUnit();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.ImperialSystemUnitImpl <em>Imperial System Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.ImperialSystemUnitImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getImperialSystemUnit()
		 * @generated
		 */
		EClass IMPERIAL_SYSTEM_UNIT = eINSTANCE.getImperialSystemUnit();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleUnitImpl <em>Angle Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleUnitImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleUnit()
		 * @generated
		 */
		EClass ANGLE_UNIT = eINSTANCE.getAngleUnit();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.RadianImpl <em>Radian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.RadianImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getRadian()
		 * @generated
		 */
		EClass RADIAN = eINSTANCE.getRadian();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.DegreeImpl <em>Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.DegreeImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getDegree()
		 * @generated
		 */
		EClass DEGREE = eINSTANCE.getDegree();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.TurnImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.GradianImpl <em>Gradian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.GradianImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getGradian()
		 * @generated
		 */
		EClass GRADIAN = eINSTANCE.getGradian();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.NumericValue <em>Numeric Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.NumericValue
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getNumericValue()
		 * @generated
		 */
		EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityOperationImpl <em>Quantity Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityOperation()
		 * @generated
		 */
		EClass QUANTITY_OPERATION = eINSTANCE.getQuantityOperation();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthOperationImpl <em>Length Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthOperation()
		 * @generated
		 */
		EClass LENGTH_OPERATION = eINSTANCE.getLengthOperation();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthAddImpl <em>Length Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthAddImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthAdd()
		 * @generated
		 */
		EClass LENGTH_ADD = eINSTANCE.getLengthAdd();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthSubtractImpl <em>Length Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthSubtractImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthSubtract()
		 * @generated
		 */
		EClass LENGTH_SUBTRACT = eINSTANCE.getLengthSubtract();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthScalarMultiplyImpl <em>Length Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthScalarMultiplyImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthScalarMultiply()
		 * @generated
		 */
		EClass LENGTH_SCALAR_MULTIPLY = eINSTANCE.getLengthScalarMultiply();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthScalarDivideImpl <em>Length Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthScalarDivideImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthScalarDivide()
		 * @generated
		 */
		EClass LENGTH_SCALAR_DIVIDE = eINSTANCE.getLengthScalarDivide();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthEqualsImpl <em>Length Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthEqualsImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthEquals()
		 * @generated
		 */
		EClass LENGTH_EQUALS = eINSTANCE.getLengthEquals();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthDistinctImpl <em>Length Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthDistinctImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthDistinct()
		 * @generated
		 */
		EClass LENGTH_DISTINCT = eINSTANCE.getLengthDistinct();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthSmallerImpl <em>Length Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthSmallerImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthSmaller()
		 * @generated
		 */
		EClass LENGTH_SMALLER = eINSTANCE.getLengthSmaller();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.LengthGreaterImpl <em>Length Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.LengthGreaterImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getLengthGreater()
		 * @generated
		 */
		EClass LENGTH_GREATER = eINSTANCE.getLengthGreater();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleOperationImpl <em>Angle Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleOperation()
		 * @generated
		 */
		EClass ANGLE_OPERATION = eINSTANCE.getAngleOperation();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleAddImpl <em>Angle Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleAddImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleAdd()
		 * @generated
		 */
		EClass ANGLE_ADD = eINSTANCE.getAngleAdd();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleSubtractImpl <em>Angle Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleSubtractImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleSubtract()
		 * @generated
		 */
		EClass ANGLE_SUBTRACT = eINSTANCE.getAngleSubtract();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleScalarMultiplyImpl <em>Angle Scalar Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleScalarMultiplyImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleScalarMultiply()
		 * @generated
		 */
		EClass ANGLE_SCALAR_MULTIPLY = eINSTANCE.getAngleScalarMultiply();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleScalarDivideImpl <em>Angle Scalar Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleScalarDivideImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleScalarDivide()
		 * @generated
		 */
		EClass ANGLE_SCALAR_DIVIDE = eINSTANCE.getAngleScalarDivide();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleEqualsImpl <em>Angle Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleEqualsImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleEquals()
		 * @generated
		 */
		EClass ANGLE_EQUALS = eINSTANCE.getAngleEquals();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleDistinctImpl <em>Angle Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleDistinctImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleDistinct()
		 * @generated
		 */
		EClass ANGLE_DISTINCT = eINSTANCE.getAngleDistinct();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleSmallerImpl <em>Angle Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleSmallerImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleSmaller()
		 * @generated
		 */
		EClass ANGLE_SMALLER = eINSTANCE.getAngleSmaller();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.AngleGreaterImpl <em>Angle Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.AngleGreaterImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getAngleGreater()
		 * @generated
		 */
		EClass ANGLE_GREATER = eINSTANCE.getAngleGreater();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityArithmeticOperationImpl <em>Quantity Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityArithmeticOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityArithmeticOperation()
		 * @generated
		 */
		EClass QUANTITY_ARITHMETIC_OPERATION = eINSTANCE.getQuantityArithmeticOperation();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityComparisonOperationImpl <em>Quantity Comparison Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityComparisonOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityComparisonOperation()
		 * @generated
		 */
		EClass QUANTITY_COMPARISON_OPERATION = eINSTANCE.getQuantityComparisonOperation();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityHomogenousOperationImpl <em>Quantity Homogenous Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityHomogenousOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityHomogenousOperation()
		 * @generated
		 */
		EClass QUANTITY_HOMOGENOUS_OPERATION = eINSTANCE.getQuantityHomogenousOperation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_HOMOGENOUS_OPERATION__LHS = eINSTANCE.getQuantityHomogenousOperation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_HOMOGENOUS_OPERATION__RHS = eINSTANCE.getQuantityHomogenousOperation_Rhs();

		/**
		 * The meta object literal for the '{@link org.modelexecution.units.impl.QuantityScalarOperationImpl <em>Quantity Scalar Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.units.impl.QuantityScalarOperationImpl
		 * @see org.modelexecution.units.impl.UnitsPackageImpl#getQuantityScalarOperation()
		 * @generated
		 */
		EClass QUANTITY_SCALAR_OPERATION = eINSTANCE.getQuantityScalarOperation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_SCALAR_OPERATION__LHS = eINSTANCE.getQuantityScalarOperation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_SCALAR_OPERATION__RHS = eINSTANCE.getQuantityScalarOperation_Rhs();

	}

} //UnitsPackage
