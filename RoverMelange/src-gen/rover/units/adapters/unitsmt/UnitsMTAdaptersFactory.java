package rover.units.adapters.unitsmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import rover.units.adapters.unitsmt.units.AngleAdapter;
import rover.units.adapters.unitsmt.units.AngleAddAdapter;
import rover.units.adapters.unitsmt.units.AngleDistinctAdapter;
import rover.units.adapters.unitsmt.units.AngleEqualsAdapter;
import rover.units.adapters.unitsmt.units.AngleGreaterAdapter;
import rover.units.adapters.unitsmt.units.AngleOperationAdapter;
import rover.units.adapters.unitsmt.units.AngleScalarDivideAdapter;
import rover.units.adapters.unitsmt.units.AngleScalarMultiplyAdapter;
import rover.units.adapters.unitsmt.units.AngleSmallerAdapter;
import rover.units.adapters.unitsmt.units.AngleSubtractAdapter;
import rover.units.adapters.unitsmt.units.AngleUnitAdapter;
import rover.units.adapters.unitsmt.units.CentimeterAdapter;
import rover.units.adapters.unitsmt.units.DegreeAdapter;
import rover.units.adapters.unitsmt.units.FootAdapter;
import rover.units.adapters.unitsmt.units.GradianAdapter;
import rover.units.adapters.unitsmt.units.ImperialSystemUnitAdapter;
import rover.units.adapters.unitsmt.units.InchAdapter;
import rover.units.adapters.unitsmt.units.LengthAdapter;
import rover.units.adapters.unitsmt.units.LengthAddAdapter;
import rover.units.adapters.unitsmt.units.LengthDistinctAdapter;
import rover.units.adapters.unitsmt.units.LengthEqualsAdapter;
import rover.units.adapters.unitsmt.units.LengthGreaterAdapter;
import rover.units.adapters.unitsmt.units.LengthOperationAdapter;
import rover.units.adapters.unitsmt.units.LengthScalarDivideAdapter;
import rover.units.adapters.unitsmt.units.LengthScalarMultiplyAdapter;
import rover.units.adapters.unitsmt.units.LengthSmallerAdapter;
import rover.units.adapters.unitsmt.units.LengthSubtractAdapter;
import rover.units.adapters.unitsmt.units.LengthUnitAdapter;
import rover.units.adapters.unitsmt.units.MeterAdapter;
import rover.units.adapters.unitsmt.units.MetricSystemUnitAdapter;
import rover.units.adapters.unitsmt.units.MillimeterAdapter;
import rover.units.adapters.unitsmt.units.NumericValueAdapter;
import rover.units.adapters.unitsmt.units.QuantityAdapter;
import rover.units.adapters.unitsmt.units.QuantityArithmeticOperationAdapter;
import rover.units.adapters.unitsmt.units.QuantityComparisonOperationAdapter;
import rover.units.adapters.unitsmt.units.QuantityHomogenousOperationAdapter;
import rover.units.adapters.unitsmt.units.QuantityOperationAdapter;
import rover.units.adapters.unitsmt.units.QuantityScalarOperationAdapter;
import rover.units.adapters.unitsmt.units.RadianAdapter;
import rover.units.adapters.unitsmt.units.TurnAdapter;
import rover.units.adapters.unitsmt.units.UnitAdapter;
import rover.units.adapters.unitsmt.units.YardAdapter;
import rover.units.units.Angle;
import rover.units.units.AngleAdd;
import rover.units.units.AngleDistinct;
import rover.units.units.AngleEquals;
import rover.units.units.AngleGreater;
import rover.units.units.AngleOperation;
import rover.units.units.AngleScalarDivide;
import rover.units.units.AngleScalarMultiply;
import rover.units.units.AngleSmaller;
import rover.units.units.AngleSubtract;
import rover.units.units.AngleUnit;
import rover.units.units.Centimeter;
import rover.units.units.Degree;
import rover.units.units.Foot;
import rover.units.units.Gradian;
import rover.units.units.ImperialSystemUnit;
import rover.units.units.Inch;
import rover.units.units.Length;
import rover.units.units.LengthAdd;
import rover.units.units.LengthDistinct;
import rover.units.units.LengthEquals;
import rover.units.units.LengthGreater;
import rover.units.units.LengthOperation;
import rover.units.units.LengthScalarDivide;
import rover.units.units.LengthScalarMultiply;
import rover.units.units.LengthSmaller;
import rover.units.units.LengthSubtract;
import rover.units.units.LengthUnit;
import rover.units.units.Meter;
import rover.units.units.MetricSystemUnit;
import rover.units.units.Millimeter;
import rover.units.units.NumericValue;
import rover.units.units.Quantity;
import rover.units.units.QuantityArithmeticOperation;
import rover.units.units.QuantityComparisonOperation;
import rover.units.units.QuantityHomogenousOperation;
import rover.units.units.QuantityOperation;
import rover.units.units.QuantityScalarOperation;
import rover.units.units.Radian;
import rover.units.units.Turn;
import rover.units.units.Unit;
import rover.units.units.Yard;

@SuppressWarnings("all")
public class UnitsMTAdaptersFactory implements AdaptersFactory {
  private static UnitsMTAdaptersFactory instance;
  
  public static UnitsMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new rover.units.adapters.unitsmt.UnitsMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public UnitsMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof rover.units.units.Centimeter){
    	return createCentimeterAdapter((rover.units.units.Centimeter) o, res);
    }
    if (o instanceof rover.units.units.Millimeter){
    	return createMillimeterAdapter((rover.units.units.Millimeter) o, res);
    }
    if (o instanceof rover.units.units.Meter){
    	return createMeterAdapter((rover.units.units.Meter) o, res);
    }
    if (o instanceof rover.units.units.Foot){
    	return createFootAdapter((rover.units.units.Foot) o, res);
    }
    if (o instanceof rover.units.units.Inch){
    	return createInchAdapter((rover.units.units.Inch) o, res);
    }
    if (o instanceof rover.units.units.Yard){
    	return createYardAdapter((rover.units.units.Yard) o, res);
    }
    if (o instanceof rover.units.units.Radian){
    	return createRadianAdapter((rover.units.units.Radian) o, res);
    }
    if (o instanceof rover.units.units.Degree){
    	return createDegreeAdapter((rover.units.units.Degree) o, res);
    }
    if (o instanceof rover.units.units.Turn){
    	return createTurnAdapter((rover.units.units.Turn) o, res);
    }
    if (o instanceof rover.units.units.Gradian){
    	return createGradianAdapter((rover.units.units.Gradian) o, res);
    }
    if (o instanceof rover.units.units.Length){
    	return createLengthAdapter((rover.units.units.Length) o, res);
    }
    if (o instanceof rover.units.units.Angle){
    	return createAngleAdapter((rover.units.units.Angle) o, res);
    }
    if (o instanceof rover.units.units.LengthAdd){
    	return createLengthAddAdapter((rover.units.units.LengthAdd) o, res);
    }
    if (o instanceof rover.units.units.LengthSubtract){
    	return createLengthSubtractAdapter((rover.units.units.LengthSubtract) o, res);
    }
    if (o instanceof rover.units.units.LengthScalarMultiply){
    	return createLengthScalarMultiplyAdapter((rover.units.units.LengthScalarMultiply) o, res);
    }
    if (o instanceof rover.units.units.LengthScalarDivide){
    	return createLengthScalarDivideAdapter((rover.units.units.LengthScalarDivide) o, res);
    }
    if (o instanceof rover.units.units.LengthEquals){
    	return createLengthEqualsAdapter((rover.units.units.LengthEquals) o, res);
    }
    if (o instanceof rover.units.units.LengthDistinct){
    	return createLengthDistinctAdapter((rover.units.units.LengthDistinct) o, res);
    }
    if (o instanceof rover.units.units.LengthSmaller){
    	return createLengthSmallerAdapter((rover.units.units.LengthSmaller) o, res);
    }
    if (o instanceof rover.units.units.LengthGreater){
    	return createLengthGreaterAdapter((rover.units.units.LengthGreater) o, res);
    }
    if (o instanceof rover.units.units.AngleAdd){
    	return createAngleAddAdapter((rover.units.units.AngleAdd) o, res);
    }
    if (o instanceof rover.units.units.AngleSubtract){
    	return createAngleSubtractAdapter((rover.units.units.AngleSubtract) o, res);
    }
    if (o instanceof rover.units.units.AngleScalarMultiply){
    	return createAngleScalarMultiplyAdapter((rover.units.units.AngleScalarMultiply) o, res);
    }
    if (o instanceof rover.units.units.AngleScalarDivide){
    	return createAngleScalarDivideAdapter((rover.units.units.AngleScalarDivide) o, res);
    }
    if (o instanceof rover.units.units.AngleEquals){
    	return createAngleEqualsAdapter((rover.units.units.AngleEquals) o, res);
    }
    if (o instanceof rover.units.units.AngleDistinct){
    	return createAngleDistinctAdapter((rover.units.units.AngleDistinct) o, res);
    }
    if (o instanceof rover.units.units.AngleSmaller){
    	return createAngleSmallerAdapter((rover.units.units.AngleSmaller) o, res);
    }
    if (o instanceof rover.units.units.AngleGreater){
    	return createAngleGreaterAdapter((rover.units.units.AngleGreater) o, res);
    }
    
    return null;
  }
  
  public UnitAdapter createUnitAdapter(final Unit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.UnitAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.UnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.UnitAdapter) adapter;
    }
  }
  
  public LengthUnitAdapter createLengthUnitAdapter(final LengthUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthUnitAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthUnitAdapter) adapter;
    }
  }
  
  public CentimeterAdapter createCentimeterAdapter(final Centimeter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.CentimeterAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.CentimeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.CentimeterAdapter) adapter;
    }
  }
  
  public MillimeterAdapter createMillimeterAdapter(final Millimeter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.MillimeterAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.MillimeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.MillimeterAdapter) adapter;
    }
  }
  
  public MeterAdapter createMeterAdapter(final Meter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.MeterAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.MeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.MeterAdapter) adapter;
    }
  }
  
  public FootAdapter createFootAdapter(final Foot adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.FootAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.FootAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.FootAdapter) adapter;
    }
  }
  
  public InchAdapter createInchAdapter(final Inch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.InchAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.InchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.InchAdapter) adapter;
    }
  }
  
  public YardAdapter createYardAdapter(final Yard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.YardAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.YardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.YardAdapter) adapter;
    }
  }
  
  public MetricSystemUnitAdapter createMetricSystemUnitAdapter(final MetricSystemUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.MetricSystemUnitAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.MetricSystemUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.MetricSystemUnitAdapter) adapter;
    }
  }
  
  public ImperialSystemUnitAdapter createImperialSystemUnitAdapter(final ImperialSystemUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.ImperialSystemUnitAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.ImperialSystemUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.ImperialSystemUnitAdapter) adapter;
    }
  }
  
  public AngleUnitAdapter createAngleUnitAdapter(final AngleUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleUnitAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleUnitAdapter) adapter;
    }
  }
  
  public RadianAdapter createRadianAdapter(final Radian adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.RadianAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.RadianAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.RadianAdapter) adapter;
    }
  }
  
  public DegreeAdapter createDegreeAdapter(final Degree adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.DegreeAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.DegreeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.DegreeAdapter) adapter;
    }
  }
  
  public TurnAdapter createTurnAdapter(final Turn adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.TurnAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.TurnAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.TurnAdapter) adapter;
    }
  }
  
  public GradianAdapter createGradianAdapter(final Gradian adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.GradianAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.GradianAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.GradianAdapter) adapter;
    }
  }
  
  public QuantityAdapter createQuantityAdapter(final Quantity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityAdapter) adapter;
    }
  }
  
  public LengthAdapter createLengthAdapter(final Length adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthAdapter) adapter;
    }
  }
  
  public AngleAdapter createAngleAdapter(final Angle adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleAdapter) adapter;
    }
  }
  
  public NumericValueAdapter createNumericValueAdapter(final NumericValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.NumericValueAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.NumericValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.NumericValueAdapter) adapter;
    }
  }
  
  public QuantityOperationAdapter createQuantityOperationAdapter(final QuantityOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityOperationAdapter) adapter;
    }
  }
  
  public LengthOperationAdapter createLengthOperationAdapter(final LengthOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthOperationAdapter) adapter;
    }
  }
  
  public LengthAddAdapter createLengthAddAdapter(final LengthAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthAddAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthAddAdapter) adapter;
    }
  }
  
  public LengthSubtractAdapter createLengthSubtractAdapter(final LengthSubtract adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthSubtractAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthSubtractAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthSubtractAdapter) adapter;
    }
  }
  
  public LengthScalarMultiplyAdapter createLengthScalarMultiplyAdapter(final LengthScalarMultiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthScalarMultiplyAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthScalarMultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthScalarMultiplyAdapter) adapter;
    }
  }
  
  public LengthScalarDivideAdapter createLengthScalarDivideAdapter(final LengthScalarDivide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthScalarDivideAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthScalarDivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthScalarDivideAdapter) adapter;
    }
  }
  
  public LengthEqualsAdapter createLengthEqualsAdapter(final LengthEquals adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthEqualsAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthEqualsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthEqualsAdapter) adapter;
    }
  }
  
  public LengthDistinctAdapter createLengthDistinctAdapter(final LengthDistinct adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthDistinctAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthDistinctAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthDistinctAdapter) adapter;
    }
  }
  
  public LengthSmallerAdapter createLengthSmallerAdapter(final LengthSmaller adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthSmallerAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthSmallerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthSmallerAdapter) adapter;
    }
  }
  
  public LengthGreaterAdapter createLengthGreaterAdapter(final LengthGreater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.LengthGreaterAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.LengthGreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.LengthGreaterAdapter) adapter;
    }
  }
  
  public AngleOperationAdapter createAngleOperationAdapter(final AngleOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleOperationAdapter) adapter;
    }
  }
  
  public AngleAddAdapter createAngleAddAdapter(final AngleAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleAddAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleAddAdapter) adapter;
    }
  }
  
  public AngleSubtractAdapter createAngleSubtractAdapter(final AngleSubtract adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleSubtractAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleSubtractAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleSubtractAdapter) adapter;
    }
  }
  
  public AngleScalarMultiplyAdapter createAngleScalarMultiplyAdapter(final AngleScalarMultiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleScalarMultiplyAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleScalarMultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleScalarMultiplyAdapter) adapter;
    }
  }
  
  public AngleScalarDivideAdapter createAngleScalarDivideAdapter(final AngleScalarDivide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleScalarDivideAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleScalarDivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleScalarDivideAdapter) adapter;
    }
  }
  
  public AngleEqualsAdapter createAngleEqualsAdapter(final AngleEquals adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleEqualsAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleEqualsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleEqualsAdapter) adapter;
    }
  }
  
  public AngleDistinctAdapter createAngleDistinctAdapter(final AngleDistinct adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleDistinctAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleDistinctAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleDistinctAdapter) adapter;
    }
  }
  
  public AngleSmallerAdapter createAngleSmallerAdapter(final AngleSmaller adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleSmallerAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleSmallerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleSmallerAdapter) adapter;
    }
  }
  
  public AngleGreaterAdapter createAngleGreaterAdapter(final AngleGreater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.AngleGreaterAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.AngleGreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.AngleGreaterAdapter) adapter;
    }
  }
  
  public QuantityArithmeticOperationAdapter createQuantityArithmeticOperationAdapter(final QuantityArithmeticOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityArithmeticOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityArithmeticOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityArithmeticOperationAdapter) adapter;
    }
  }
  
  public QuantityComparisonOperationAdapter createQuantityComparisonOperationAdapter(final QuantityComparisonOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityComparisonOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityComparisonOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityComparisonOperationAdapter) adapter;
    }
  }
  
  public QuantityHomogenousOperationAdapter createQuantityHomogenousOperationAdapter(final QuantityHomogenousOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityHomogenousOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityHomogenousOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityHomogenousOperationAdapter) adapter;
    }
  }
  
  public QuantityScalarOperationAdapter createQuantityScalarOperationAdapter(final QuantityScalarOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.units.adapters.unitsmt.units.QuantityScalarOperationAdapter) adapter;
    else {
    	adapter = new rover.units.adapters.unitsmt.units.QuantityScalarOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.units.adapters.unitsmt.units.QuantityScalarOperationAdapter) adapter;
    }
  }
}
