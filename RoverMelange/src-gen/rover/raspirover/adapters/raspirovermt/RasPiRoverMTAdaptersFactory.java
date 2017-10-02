package rover.raspirover.adapters.raspirovermt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import rover.raspirover.adapters.raspirovermt.raspirover.ActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AnalogPinAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleAddAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleDistinctAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleEqualsAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleGreaterAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarDivideAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarMultiplyAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleSmallerAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleSubtractAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.AngleUnitAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ArduinoAnalogModuleAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ArduinoDigitalModuleAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ArduinoModuleAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BackwardActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BackwardMinActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BlockAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BoardAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BooleanExpressionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.CentimeterAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ConditionalAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.DegreeAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.DigitalPinAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.FootAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ForwardActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ForwardMinActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.GradianAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.HumidityQueryAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ImperialSystemUnitAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.InchAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.InstructionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthAddAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthDistinctAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthEqualsAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthGreaterAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarDivideAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarMultiplyAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthSmallerAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthSubtractAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LengthUnitAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LogActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.LoopAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.MessageQueryAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.MeterAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.MetricSystemUnitAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.MillimeterAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ModuleAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.NamedElementAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.NumericExpressionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.NumericValueAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ObstacleQueryAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ParamAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.PinAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.ProjectAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityArithmeticOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityComparisonOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityHomogenousOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QuantityScalarOperationAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.QueryAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RadianAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RasPiBoardAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RoverExpressionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RoverProgramAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.RoverValueAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.SendActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.SketchAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.StatementAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.StopActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.StringExpressionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.TemperatureQueryAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.TurnActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.TurnAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.TurnDegActionAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.UnitAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.VarAssignmentAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.VarRefAdapter;
import rover.raspirover.adapters.raspirovermt.raspirover.YardAdapter;
import rover.raspirover.raspirover.Action;
import rover.raspirover.raspirover.AnalogPin;
import rover.raspirover.raspirover.Angle;
import rover.raspirover.raspirover.AngleAdd;
import rover.raspirover.raspirover.AngleDistinct;
import rover.raspirover.raspirover.AngleEquals;
import rover.raspirover.raspirover.AngleGreater;
import rover.raspirover.raspirover.AngleOperation;
import rover.raspirover.raspirover.AngleScalarDivide;
import rover.raspirover.raspirover.AngleScalarMultiply;
import rover.raspirover.raspirover.AngleSmaller;
import rover.raspirover.raspirover.AngleSubtract;
import rover.raspirover.raspirover.AngleUnit;
import rover.raspirover.raspirover.ArduinoAnalogModule;
import rover.raspirover.raspirover.ArduinoDigitalModule;
import rover.raspirover.raspirover.ArduinoModule;
import rover.raspirover.raspirover.BackwardAction;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.raspirover.Block;
import rover.raspirover.raspirover.Board;
import rover.raspirover.raspirover.BooleanExpression;
import rover.raspirover.raspirover.BooleanValue;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.raspirover.Conditional;
import rover.raspirover.raspirover.Degree;
import rover.raspirover.raspirover.DigitalPin;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.raspirover.ForwardAction;
import rover.raspirover.raspirover.ForwardMinAction;
import rover.raspirover.raspirover.Gradian;
import rover.raspirover.raspirover.HumidityQuery;
import rover.raspirover.raspirover.ImperialSystemUnit;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.raspirover.Instruction;
import rover.raspirover.raspirover.Length;
import rover.raspirover.raspirover.LengthAdd;
import rover.raspirover.raspirover.LengthDistinct;
import rover.raspirover.raspirover.LengthEquals;
import rover.raspirover.raspirover.LengthGreater;
import rover.raspirover.raspirover.LengthOperation;
import rover.raspirover.raspirover.LengthScalarDivide;
import rover.raspirover.raspirover.LengthScalarMultiply;
import rover.raspirover.raspirover.LengthSmaller;
import rover.raspirover.raspirover.LengthSubtract;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.raspirover.LogAction;
import rover.raspirover.raspirover.Loop;
import rover.raspirover.raspirover.MessageQuery;
import rover.raspirover.raspirover.Meter;
import rover.raspirover.raspirover.MetricSystemUnit;
import rover.raspirover.raspirover.Millimeter;
import rover.raspirover.raspirover.Module;
import rover.raspirover.raspirover.NamedElement;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.NumericExpression;
import rover.raspirover.raspirover.NumericValue;
import rover.raspirover.raspirover.ObstacleQuery;
import rover.raspirover.raspirover.Param;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.QuantityArithmeticOperation;
import rover.raspirover.raspirover.QuantityComparisonOperation;
import rover.raspirover.raspirover.QuantityHomogenousOperation;
import rover.raspirover.raspirover.QuantityOperation;
import rover.raspirover.raspirover.QuantityScalarOperation;
import rover.raspirover.raspirover.Query;
import rover.raspirover.raspirover.Radian;
import rover.raspirover.raspirover.RasPiBoard;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.RoverExpression;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirover.raspirover.RoverValue;
import rover.raspirover.raspirover.SendAction;
import rover.raspirover.raspirover.Sketch;
import rover.raspirover.raspirover.Statement;
import rover.raspirover.raspirover.StopAction;
import rover.raspirover.raspirover.StringExpression;
import rover.raspirover.raspirover.StringValue;
import rover.raspirover.raspirover.TemperatureQuery;
import rover.raspirover.raspirover.Turn;
import rover.raspirover.raspirover.TurnAction;
import rover.raspirover.raspirover.TurnDegAction;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.raspirover.VarAssignment;
import rover.raspirover.raspirover.VarRef;
import rover.raspirover.raspirover.Yard;

@SuppressWarnings("all")
public class RasPiRoverMTAdaptersFactory implements AdaptersFactory {
  private static RasPiRoverMTAdaptersFactory instance;
  
  public static RasPiRoverMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public RasPiRoverMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof rover.raspirover.raspirover.RasPiBoard){
    	return createRasPiBoardAdapter((rover.raspirover.raspirover.RasPiBoard) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Project){
    	return createProjectAdapter((rover.raspirover.raspirover.Project) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Sketch){
    	return createSketchAdapter((rover.raspirover.raspirover.Sketch) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Block){
    	return createBlockAdapter((rover.raspirover.raspirover.Block) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.DigitalPin){
    	return createDigitalPinAdapter((rover.raspirover.raspirover.DigitalPin) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AnalogPin){
    	return createAnalogPinAdapter((rover.raspirover.raspirover.AnalogPin) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Pin){
    	return createPinAdapter((rover.raspirover.raspirover.Pin) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.RoverProgram){
    	return createRoverProgramAdapter((rover.raspirover.raspirover.RoverProgram) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Param){
    	return createParamAdapter((rover.raspirover.raspirover.Param) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.VarAssignment){
    	return createVarAssignmentAdapter((rover.raspirover.raspirover.VarAssignment) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Conditional){
    	return createConditionalAdapter((rover.raspirover.raspirover.Conditional) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Loop){
    	return createLoopAdapter((rover.raspirover.raspirover.Loop) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.RclBlock){
    	return createRclBlockAdapter((rover.raspirover.raspirover.RclBlock) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.TemperatureQuery){
    	return createTemperatureQueryAdapter((rover.raspirover.raspirover.TemperatureQuery) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.HumidityQuery){
    	return createHumidityQueryAdapter((rover.raspirover.raspirover.HumidityQuery) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.MessageQuery){
    	return createMessageQueryAdapter((rover.raspirover.raspirover.MessageQuery) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.ObstacleQuery){
    	return createObstacleQueryAdapter((rover.raspirover.raspirover.ObstacleQuery) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.NumericExpression){
    	return createNumericExpressionAdapter((rover.raspirover.raspirover.NumericExpression) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.StringExpression){
    	return createStringExpressionAdapter((rover.raspirover.raspirover.StringExpression) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.BooleanExpression){
    	return createBooleanExpressionAdapter((rover.raspirover.raspirover.BooleanExpression) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.NumberValue){
    	return createNumberValueAdapter((rover.raspirover.raspirover.NumberValue) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.StringValue){
    	return createStringValueAdapter((rover.raspirover.raspirover.StringValue) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.BooleanValue){
    	return createBooleanValueAdapter((rover.raspirover.raspirover.BooleanValue) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.RoverValue){
    	return createRoverValueAdapter((rover.raspirover.raspirover.RoverValue) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.ForwardAction){
    	return createForwardActionAdapter((rover.raspirover.raspirover.ForwardAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.ForwardMinAction){
    	return createForwardMinActionAdapter((rover.raspirover.raspirover.ForwardMinAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.BackwardAction){
    	return createBackwardActionAdapter((rover.raspirover.raspirover.BackwardAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.BackwardMinAction){
    	return createBackwardMinActionAdapter((rover.raspirover.raspirover.BackwardMinAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.TurnAction){
    	return createTurnActionAdapter((rover.raspirover.raspirover.TurnAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.TurnDegAction){
    	return createTurnDegActionAdapter((rover.raspirover.raspirover.TurnDegAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.StopAction){
    	return createStopActionAdapter((rover.raspirover.raspirover.StopAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LogAction){
    	return createLogActionAdapter((rover.raspirover.raspirover.LogAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.SendAction){
    	return createSendActionAdapter((rover.raspirover.raspirover.SendAction) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.VarRef){
    	return createVarRefAdapter((rover.raspirover.raspirover.VarRef) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Centimeter){
    	return createCentimeterAdapter((rover.raspirover.raspirover.Centimeter) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Millimeter){
    	return createMillimeterAdapter((rover.raspirover.raspirover.Millimeter) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Meter){
    	return createMeterAdapter((rover.raspirover.raspirover.Meter) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Foot){
    	return createFootAdapter((rover.raspirover.raspirover.Foot) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Inch){
    	return createInchAdapter((rover.raspirover.raspirover.Inch) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Yard){
    	return createYardAdapter((rover.raspirover.raspirover.Yard) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Radian){
    	return createRadianAdapter((rover.raspirover.raspirover.Radian) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Degree){
    	return createDegreeAdapter((rover.raspirover.raspirover.Degree) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Turn){
    	return createTurnAdapter((rover.raspirover.raspirover.Turn) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Gradian){
    	return createGradianAdapter((rover.raspirover.raspirover.Gradian) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Unit){
    	return createUnitAdapter((rover.raspirover.raspirover.Unit) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Length){
    	return createLengthAdapter((rover.raspirover.raspirover.Length) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.Angle){
    	return createAngleAdapter((rover.raspirover.raspirover.Angle) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthAdd){
    	return createLengthAddAdapter((rover.raspirover.raspirover.LengthAdd) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthSubtract){
    	return createLengthSubtractAdapter((rover.raspirover.raspirover.LengthSubtract) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthScalarMultiply){
    	return createLengthScalarMultiplyAdapter((rover.raspirover.raspirover.LengthScalarMultiply) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthScalarDivide){
    	return createLengthScalarDivideAdapter((rover.raspirover.raspirover.LengthScalarDivide) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthEquals){
    	return createLengthEqualsAdapter((rover.raspirover.raspirover.LengthEquals) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthDistinct){
    	return createLengthDistinctAdapter((rover.raspirover.raspirover.LengthDistinct) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthSmaller){
    	return createLengthSmallerAdapter((rover.raspirover.raspirover.LengthSmaller) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.LengthGreater){
    	return createLengthGreaterAdapter((rover.raspirover.raspirover.LengthGreater) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleAdd){
    	return createAngleAddAdapter((rover.raspirover.raspirover.AngleAdd) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleSubtract){
    	return createAngleSubtractAdapter((rover.raspirover.raspirover.AngleSubtract) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleScalarMultiply){
    	return createAngleScalarMultiplyAdapter((rover.raspirover.raspirover.AngleScalarMultiply) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleScalarDivide){
    	return createAngleScalarDivideAdapter((rover.raspirover.raspirover.AngleScalarDivide) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleEquals){
    	return createAngleEqualsAdapter((rover.raspirover.raspirover.AngleEquals) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleDistinct){
    	return createAngleDistinctAdapter((rover.raspirover.raspirover.AngleDistinct) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleSmaller){
    	return createAngleSmallerAdapter((rover.raspirover.raspirover.AngleSmaller) o, res);
    }
    if (o instanceof rover.raspirover.raspirover.AngleGreater){
    	return createAngleGreaterAdapter((rover.raspirover.raspirover.AngleGreater) o, res);
    }
    
    return null;
  }
  
  public RasPiBoardAdapter createRasPiBoardAdapter(final RasPiBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RasPiBoardAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RasPiBoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RasPiBoardAdapter) adapter;
    }
  }
  
  public BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BoardAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BoardAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.NamedElementAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.NamedElementAdapter) adapter;
    }
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ProjectAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ProjectAdapter) adapter;
    }
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.SketchAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.SketchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.SketchAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BlockAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BlockAdapter) adapter;
    }
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.InstructionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.InstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.InstructionAdapter) adapter;
    }
  }
  
  public DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.DigitalPinAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.DigitalPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.DigitalPinAdapter) adapter;
    }
  }
  
  public PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.PinAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.PinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.PinAdapter) adapter;
    }
  }
  
  public ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ArduinoDigitalModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoDigitalModuleAdapter) adapter;
    }
  }
  
  public ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ArduinoModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoModuleAdapter) adapter;
    }
  }
  
  public ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ModuleAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ModuleAdapter) adapter;
    }
  }
  
  public AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AnalogPinAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AnalogPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AnalogPinAdapter) adapter;
    }
  }
  
  public ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ArduinoAnalogModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ArduinoAnalogModuleAdapter) adapter;
    }
  }
  
  public RoverProgramAdapter createRoverProgramAdapter(final RoverProgram adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RoverProgramAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RoverProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RoverProgramAdapter) adapter;
    }
  }
  
  public ParamAdapter createParamAdapter(final Param adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ParamAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ParamAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ParamAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.StatementAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.StatementAdapter) adapter;
    }
  }
  
  public VarAssignmentAdapter createVarAssignmentAdapter(final VarAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.VarAssignmentAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.VarAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.VarAssignmentAdapter) adapter;
    }
  }
  
  public ConditionalAdapter createConditionalAdapter(final Conditional adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ConditionalAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ConditionalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ConditionalAdapter) adapter;
    }
  }
  
  public LoopAdapter createLoopAdapter(final Loop adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LoopAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LoopAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LoopAdapter) adapter;
    }
  }
  
  public RclBlockAdapter createRclBlockAdapter(final RclBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) adapter;
    }
  }
  
  public QueryAdapter createQueryAdapter(final Query adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QueryAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QueryAdapter) adapter;
    }
  }
  
  public TemperatureQueryAdapter createTemperatureQueryAdapter(final TemperatureQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.TemperatureQueryAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.TemperatureQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.TemperatureQueryAdapter) adapter;
    }
  }
  
  public HumidityQueryAdapter createHumidityQueryAdapter(final HumidityQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.HumidityQueryAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.HumidityQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.HumidityQueryAdapter) adapter;
    }
  }
  
  public MessageQueryAdapter createMessageQueryAdapter(final MessageQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.MessageQueryAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.MessageQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.MessageQueryAdapter) adapter;
    }
  }
  
  public ObstacleQueryAdapter createObstacleQueryAdapter(final ObstacleQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ObstacleQueryAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ObstacleQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ObstacleQueryAdapter) adapter;
    }
  }
  
  public RoverExpressionAdapter createRoverExpressionAdapter(final RoverExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RoverExpressionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RoverExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RoverExpressionAdapter) adapter;
    }
  }
  
  public NumericExpressionAdapter createNumericExpressionAdapter(final NumericExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.NumericExpressionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.NumericExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.NumericExpressionAdapter) adapter;
    }
  }
  
  public StringExpressionAdapter createStringExpressionAdapter(final StringExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.StringExpressionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.StringExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.StringExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BooleanExpressionAdapter) adapter;
    }
  }
  
  public RoverValueAdapter createRoverValueAdapter(final RoverValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RoverValueAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RoverValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RoverValueAdapter) adapter;
    }
  }
  
  public NumberValueAdapter createNumberValueAdapter(final NumberValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter) adapter;
    }
  }
  
  public StringValueAdapter createStringValueAdapter(final StringValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ActionAdapter) adapter;
    }
  }
  
  public ForwardActionAdapter createForwardActionAdapter(final ForwardAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ForwardActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ForwardActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ForwardActionAdapter) adapter;
    }
  }
  
  public ForwardMinActionAdapter createForwardMinActionAdapter(final ForwardMinAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ForwardMinActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ForwardMinActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ForwardMinActionAdapter) adapter;
    }
  }
  
  public BackwardActionAdapter createBackwardActionAdapter(final BackwardAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BackwardActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BackwardActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BackwardActionAdapter) adapter;
    }
  }
  
  public BackwardMinActionAdapter createBackwardMinActionAdapter(final BackwardMinAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.BackwardMinActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.BackwardMinActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.BackwardMinActionAdapter) adapter;
    }
  }
  
  public TurnActionAdapter createTurnActionAdapter(final TurnAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.TurnActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.TurnActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.TurnActionAdapter) adapter;
    }
  }
  
  public TurnDegActionAdapter createTurnDegActionAdapter(final TurnDegAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.TurnDegActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.TurnDegActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.TurnDegActionAdapter) adapter;
    }
  }
  
  public StopActionAdapter createStopActionAdapter(final StopAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.StopActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.StopActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.StopActionAdapter) adapter;
    }
  }
  
  public LogActionAdapter createLogActionAdapter(final LogAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LogActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LogActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LogActionAdapter) adapter;
    }
  }
  
  public SendActionAdapter createSendActionAdapter(final SendAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.SendActionAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.SendActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.SendActionAdapter) adapter;
    }
  }
  
  public VarRefAdapter createVarRefAdapter(final VarRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.VarRefAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.VarRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.VarRefAdapter) adapter;
    }
  }
  
  public UnitAdapter createUnitAdapter(final Unit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.UnitAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.UnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.UnitAdapter) adapter;
    }
  }
  
  public LengthUnitAdapter createLengthUnitAdapter(final LengthUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthUnitAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthUnitAdapter) adapter;
    }
  }
  
  public CentimeterAdapter createCentimeterAdapter(final Centimeter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.CentimeterAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.CentimeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.CentimeterAdapter) adapter;
    }
  }
  
  public MillimeterAdapter createMillimeterAdapter(final Millimeter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.MillimeterAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.MillimeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.MillimeterAdapter) adapter;
    }
  }
  
  public MeterAdapter createMeterAdapter(final Meter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.MeterAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.MeterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.MeterAdapter) adapter;
    }
  }
  
  public FootAdapter createFootAdapter(final Foot adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.FootAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.FootAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.FootAdapter) adapter;
    }
  }
  
  public InchAdapter createInchAdapter(final Inch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.InchAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.InchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.InchAdapter) adapter;
    }
  }
  
  public YardAdapter createYardAdapter(final Yard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.YardAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.YardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.YardAdapter) adapter;
    }
  }
  
  public MetricSystemUnitAdapter createMetricSystemUnitAdapter(final MetricSystemUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.MetricSystemUnitAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.MetricSystemUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.MetricSystemUnitAdapter) adapter;
    }
  }
  
  public ImperialSystemUnitAdapter createImperialSystemUnitAdapter(final ImperialSystemUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.ImperialSystemUnitAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.ImperialSystemUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.ImperialSystemUnitAdapter) adapter;
    }
  }
  
  public AngleUnitAdapter createAngleUnitAdapter(final AngleUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleUnitAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleUnitAdapter) adapter;
    }
  }
  
  public RadianAdapter createRadianAdapter(final Radian adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.RadianAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.RadianAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.RadianAdapter) adapter;
    }
  }
  
  public DegreeAdapter createDegreeAdapter(final Degree adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.DegreeAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.DegreeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.DegreeAdapter) adapter;
    }
  }
  
  public TurnAdapter createTurnAdapter(final Turn adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.TurnAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.TurnAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.TurnAdapter) adapter;
    }
  }
  
  public GradianAdapter createGradianAdapter(final Gradian adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.GradianAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.GradianAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.GradianAdapter) adapter;
    }
  }
  
  public QuantityAdapter createQuantityAdapter(final Quantity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter) adapter;
    }
  }
  
  public LengthAdapter createLengthAdapter(final Length adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthAdapter) adapter;
    }
  }
  
  public AngleAdapter createAngleAdapter(final Angle adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleAdapter) adapter;
    }
  }
  
  public NumericValueAdapter createNumericValueAdapter(final NumericValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.NumericValueAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.NumericValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.NumericValueAdapter) adapter;
    }
  }
  
  public QuantityOperationAdapter createQuantityOperationAdapter(final QuantityOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityOperationAdapter) adapter;
    }
  }
  
  public LengthOperationAdapter createLengthOperationAdapter(final LengthOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthOperationAdapter) adapter;
    }
  }
  
  public LengthAddAdapter createLengthAddAdapter(final LengthAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthAddAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthAddAdapter) adapter;
    }
  }
  
  public LengthSubtractAdapter createLengthSubtractAdapter(final LengthSubtract adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthSubtractAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthSubtractAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthSubtractAdapter) adapter;
    }
  }
  
  public LengthScalarMultiplyAdapter createLengthScalarMultiplyAdapter(final LengthScalarMultiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarMultiplyAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarMultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarMultiplyAdapter) adapter;
    }
  }
  
  public LengthScalarDivideAdapter createLengthScalarDivideAdapter(final LengthScalarDivide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarDivideAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarDivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthScalarDivideAdapter) adapter;
    }
  }
  
  public LengthEqualsAdapter createLengthEqualsAdapter(final LengthEquals adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthEqualsAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthEqualsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthEqualsAdapter) adapter;
    }
  }
  
  public LengthDistinctAdapter createLengthDistinctAdapter(final LengthDistinct adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthDistinctAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthDistinctAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthDistinctAdapter) adapter;
    }
  }
  
  public LengthSmallerAdapter createLengthSmallerAdapter(final LengthSmaller adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthSmallerAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthSmallerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthSmallerAdapter) adapter;
    }
  }
  
  public LengthGreaterAdapter createLengthGreaterAdapter(final LengthGreater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.LengthGreaterAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.LengthGreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.LengthGreaterAdapter) adapter;
    }
  }
  
  public AngleOperationAdapter createAngleOperationAdapter(final AngleOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleOperationAdapter) adapter;
    }
  }
  
  public AngleAddAdapter createAngleAddAdapter(final AngleAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleAddAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleAddAdapter) adapter;
    }
  }
  
  public AngleSubtractAdapter createAngleSubtractAdapter(final AngleSubtract adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleSubtractAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleSubtractAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleSubtractAdapter) adapter;
    }
  }
  
  public AngleScalarMultiplyAdapter createAngleScalarMultiplyAdapter(final AngleScalarMultiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarMultiplyAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarMultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarMultiplyAdapter) adapter;
    }
  }
  
  public AngleScalarDivideAdapter createAngleScalarDivideAdapter(final AngleScalarDivide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarDivideAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarDivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleScalarDivideAdapter) adapter;
    }
  }
  
  public AngleEqualsAdapter createAngleEqualsAdapter(final AngleEquals adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleEqualsAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleEqualsAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleEqualsAdapter) adapter;
    }
  }
  
  public AngleDistinctAdapter createAngleDistinctAdapter(final AngleDistinct adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleDistinctAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleDistinctAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleDistinctAdapter) adapter;
    }
  }
  
  public AngleSmallerAdapter createAngleSmallerAdapter(final AngleSmaller adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleSmallerAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleSmallerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleSmallerAdapter) adapter;
    }
  }
  
  public AngleGreaterAdapter createAngleGreaterAdapter(final AngleGreater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.AngleGreaterAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.AngleGreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.AngleGreaterAdapter) adapter;
    }
  }
  
  public QuantityArithmeticOperationAdapter createQuantityArithmeticOperationAdapter(final QuantityArithmeticOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityArithmeticOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityArithmeticOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityArithmeticOperationAdapter) adapter;
    }
  }
  
  public QuantityComparisonOperationAdapter createQuantityComparisonOperationAdapter(final QuantityComparisonOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityComparisonOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityComparisonOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityComparisonOperationAdapter) adapter;
    }
  }
  
  public QuantityHomogenousOperationAdapter createQuantityHomogenousOperationAdapter(final QuantityHomogenousOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityHomogenousOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityHomogenousOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityHomogenousOperationAdapter) adapter;
    }
  }
  
  public QuantityScalarOperationAdapter createQuantityScalarOperationAdapter(final QuantityScalarOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityScalarOperationAdapter) adapter;
    else {
    	adapter = new rover.raspirover.adapters.raspirovermt.raspirover.QuantityScalarOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.raspirover.adapters.raspirovermt.raspirover.QuantityScalarOperationAdapter) adapter;
    }
  }
}
