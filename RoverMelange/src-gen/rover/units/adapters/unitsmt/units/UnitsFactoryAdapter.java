package rover.units.adapters.unitsmt.units;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.unitsmt.units.Angle;
import rover.unitsmt.units.AngleAdd;
import rover.unitsmt.units.AngleDistinct;
import rover.unitsmt.units.AngleEquals;
import rover.unitsmt.units.AngleGreater;
import rover.unitsmt.units.AngleScalarDivide;
import rover.unitsmt.units.AngleScalarMultiply;
import rover.unitsmt.units.AngleSmaller;
import rover.unitsmt.units.AngleSubtract;
import rover.unitsmt.units.Centimeter;
import rover.unitsmt.units.Degree;
import rover.unitsmt.units.Foot;
import rover.unitsmt.units.Gradian;
import rover.unitsmt.units.Inch;
import rover.unitsmt.units.Length;
import rover.unitsmt.units.LengthAdd;
import rover.unitsmt.units.LengthDistinct;
import rover.unitsmt.units.LengthEquals;
import rover.unitsmt.units.LengthGreater;
import rover.unitsmt.units.LengthScalarDivide;
import rover.unitsmt.units.LengthScalarMultiply;
import rover.unitsmt.units.LengthSmaller;
import rover.unitsmt.units.LengthSubtract;
import rover.unitsmt.units.Meter;
import rover.unitsmt.units.Millimeter;
import rover.unitsmt.units.Radian;
import rover.unitsmt.units.Turn;
import rover.unitsmt.units.UnitsFactory;
import rover.unitsmt.units.UnitsPackage;
import rover.unitsmt.units.Yard;

@SuppressWarnings("all")
public class UnitsFactoryAdapter extends EFactoryImpl implements UnitsFactory {
  private UnitsMTAdaptersFactory adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  
  private rover.units.units.UnitsFactory unitsAdaptee = rover.units.units.UnitsFactory.eINSTANCE;
  
  @Override
  public Centimeter createCentimeter() {
    return adaptersFactory.createCentimeterAdapter(unitsAdaptee.createCentimeter(), null);
  }
  
  @Override
  public Millimeter createMillimeter() {
    return adaptersFactory.createMillimeterAdapter(unitsAdaptee.createMillimeter(), null);
  }
  
  @Override
  public Meter createMeter() {
    return adaptersFactory.createMeterAdapter(unitsAdaptee.createMeter(), null);
  }
  
  @Override
  public Foot createFoot() {
    return adaptersFactory.createFootAdapter(unitsAdaptee.createFoot(), null);
  }
  
  @Override
  public Inch createInch() {
    return adaptersFactory.createInchAdapter(unitsAdaptee.createInch(), null);
  }
  
  @Override
  public Yard createYard() {
    return adaptersFactory.createYardAdapter(unitsAdaptee.createYard(), null);
  }
  
  @Override
  public Radian createRadian() {
    return adaptersFactory.createRadianAdapter(unitsAdaptee.createRadian(), null);
  }
  
  @Override
  public Degree createDegree() {
    return adaptersFactory.createDegreeAdapter(unitsAdaptee.createDegree(), null);
  }
  
  @Override
  public Turn createTurn() {
    return adaptersFactory.createTurnAdapter(unitsAdaptee.createTurn(), null);
  }
  
  @Override
  public Gradian createGradian() {
    return adaptersFactory.createGradianAdapter(unitsAdaptee.createGradian(), null);
  }
  
  @Override
  public Length createLength() {
    return adaptersFactory.createLengthAdapter(unitsAdaptee.createLength(), null);
  }
  
  @Override
  public Angle createAngle() {
    return adaptersFactory.createAngleAdapter(unitsAdaptee.createAngle(), null);
  }
  
  @Override
  public LengthAdd createLengthAdd() {
    return adaptersFactory.createLengthAddAdapter(unitsAdaptee.createLengthAdd(), null);
  }
  
  @Override
  public LengthSubtract createLengthSubtract() {
    return adaptersFactory.createLengthSubtractAdapter(unitsAdaptee.createLengthSubtract(), null);
  }
  
  @Override
  public LengthScalarMultiply createLengthScalarMultiply() {
    return adaptersFactory.createLengthScalarMultiplyAdapter(unitsAdaptee.createLengthScalarMultiply(), null);
  }
  
  @Override
  public LengthScalarDivide createLengthScalarDivide() {
    return adaptersFactory.createLengthScalarDivideAdapter(unitsAdaptee.createLengthScalarDivide(), null);
  }
  
  @Override
  public LengthEquals createLengthEquals() {
    return adaptersFactory.createLengthEqualsAdapter(unitsAdaptee.createLengthEquals(), null);
  }
  
  @Override
  public LengthDistinct createLengthDistinct() {
    return adaptersFactory.createLengthDistinctAdapter(unitsAdaptee.createLengthDistinct(), null);
  }
  
  @Override
  public LengthSmaller createLengthSmaller() {
    return adaptersFactory.createLengthSmallerAdapter(unitsAdaptee.createLengthSmaller(), null);
  }
  
  @Override
  public LengthGreater createLengthGreater() {
    return adaptersFactory.createLengthGreaterAdapter(unitsAdaptee.createLengthGreater(), null);
  }
  
  @Override
  public AngleAdd createAngleAdd() {
    return adaptersFactory.createAngleAddAdapter(unitsAdaptee.createAngleAdd(), null);
  }
  
  @Override
  public AngleSubtract createAngleSubtract() {
    return adaptersFactory.createAngleSubtractAdapter(unitsAdaptee.createAngleSubtract(), null);
  }
  
  @Override
  public AngleScalarMultiply createAngleScalarMultiply() {
    return adaptersFactory.createAngleScalarMultiplyAdapter(unitsAdaptee.createAngleScalarMultiply(), null);
  }
  
  @Override
  public AngleScalarDivide createAngleScalarDivide() {
    return adaptersFactory.createAngleScalarDivideAdapter(unitsAdaptee.createAngleScalarDivide(), null);
  }
  
  @Override
  public AngleEquals createAngleEquals() {
    return adaptersFactory.createAngleEqualsAdapter(unitsAdaptee.createAngleEquals(), null);
  }
  
  @Override
  public AngleDistinct createAngleDistinct() {
    return adaptersFactory.createAngleDistinctAdapter(unitsAdaptee.createAngleDistinct(), null);
  }
  
  @Override
  public AngleSmaller createAngleSmaller() {
    return adaptersFactory.createAngleSmallerAdapter(unitsAdaptee.createAngleSmaller(), null);
  }
  
  @Override
  public AngleGreater createAngleGreater() {
    return adaptersFactory.createAngleGreaterAdapter(unitsAdaptee.createAngleGreater(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getUnitsPackage();
  }
  
  public UnitsPackage getUnitsPackage() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE;
  }
}
