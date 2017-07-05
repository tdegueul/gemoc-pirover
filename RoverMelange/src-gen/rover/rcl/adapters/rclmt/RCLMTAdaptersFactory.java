package rover.rcl.adapters.rclmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import rover.rcl.adapters.rclmt.rcl.ActionAdapter;
import rover.rcl.adapters.rclmt.rcl.BackwardActionAdapter;
import rover.rcl.adapters.rclmt.rcl.BackwardMinActionAdapter;
import rover.rcl.adapters.rclmt.rcl.BooleanExpressionAdapter;
import rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter;
import rover.rcl.adapters.rclmt.rcl.ConditionalAdapter;
import rover.rcl.adapters.rclmt.rcl.ForwardActionAdapter;
import rover.rcl.adapters.rclmt.rcl.ForwardMinActionAdapter;
import rover.rcl.adapters.rclmt.rcl.HumidityQueryAdapter;
import rover.rcl.adapters.rclmt.rcl.LogActionAdapter;
import rover.rcl.adapters.rclmt.rcl.LoopAdapter;
import rover.rcl.adapters.rclmt.rcl.MessageQueryAdapter;
import rover.rcl.adapters.rclmt.rcl.NumberValueAdapter;
import rover.rcl.adapters.rclmt.rcl.NumericExpressionAdapter;
import rover.rcl.adapters.rclmt.rcl.ObstacleQueryAdapter;
import rover.rcl.adapters.rclmt.rcl.ParamAdapter;
import rover.rcl.adapters.rclmt.rcl.QueryAdapter;
import rover.rcl.adapters.rclmt.rcl.RclBlockAdapter;
import rover.rcl.adapters.rclmt.rcl.RoverExpressionAdapter;
import rover.rcl.adapters.rclmt.rcl.RoverProgramAdapter;
import rover.rcl.adapters.rclmt.rcl.RoverValueAdapter;
import rover.rcl.adapters.rclmt.rcl.SendActionAdapter;
import rover.rcl.adapters.rclmt.rcl.StatementAdapter;
import rover.rcl.adapters.rclmt.rcl.StopActionAdapter;
import rover.rcl.adapters.rclmt.rcl.StringExpressionAdapter;
import rover.rcl.adapters.rclmt.rcl.StringValueAdapter;
import rover.rcl.adapters.rclmt.rcl.TemperatureQueryAdapter;
import rover.rcl.adapters.rclmt.rcl.TurnActionAdapter;
import rover.rcl.adapters.rclmt.rcl.TurnDegActionAdapter;
import rover.rcl.adapters.rclmt.rcl.VarAssignmentAdapter;
import rover.rcl.adapters.rclmt.rcl.VarRefAdapter;
import rover.rcl.rcl.Action;
import rover.rcl.rcl.BackwardAction;
import rover.rcl.rcl.BackwardMinAction;
import rover.rcl.rcl.BooleanExpression;
import rover.rcl.rcl.BooleanValue;
import rover.rcl.rcl.Conditional;
import rover.rcl.rcl.ForwardAction;
import rover.rcl.rcl.ForwardMinAction;
import rover.rcl.rcl.HumidityQuery;
import rover.rcl.rcl.LogAction;
import rover.rcl.rcl.Loop;
import rover.rcl.rcl.MessageQuery;
import rover.rcl.rcl.NumberValue;
import rover.rcl.rcl.NumericExpression;
import rover.rcl.rcl.ObstacleQuery;
import rover.rcl.rcl.Param;
import rover.rcl.rcl.Query;
import rover.rcl.rcl.RclBlock;
import rover.rcl.rcl.RoverExpression;
import rover.rcl.rcl.RoverProgram;
import rover.rcl.rcl.RoverValue;
import rover.rcl.rcl.SendAction;
import rover.rcl.rcl.Statement;
import rover.rcl.rcl.StopAction;
import rover.rcl.rcl.StringExpression;
import rover.rcl.rcl.StringValue;
import rover.rcl.rcl.TemperatureQuery;
import rover.rcl.rcl.TurnAction;
import rover.rcl.rcl.TurnDegAction;
import rover.rcl.rcl.VarAssignment;
import rover.rcl.rcl.VarRef;

@SuppressWarnings("all")
public class RCLMTAdaptersFactory implements AdaptersFactory {
  private static RCLMTAdaptersFactory instance;
  
  public static RCLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new rover.rcl.adapters.rclmt.RCLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public RCLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof rover.rcl.rcl.RoverProgram){
    	return createRoverProgramAdapter((rover.rcl.rcl.RoverProgram) o, res);
    }
    if (o instanceof rover.rcl.rcl.Param){
    	return createParamAdapter((rover.rcl.rcl.Param) o, res);
    }
    if (o instanceof rover.rcl.rcl.VarAssignment){
    	return createVarAssignmentAdapter((rover.rcl.rcl.VarAssignment) o, res);
    }
    if (o instanceof rover.rcl.rcl.Conditional){
    	return createConditionalAdapter((rover.rcl.rcl.Conditional) o, res);
    }
    if (o instanceof rover.rcl.rcl.Loop){
    	return createLoopAdapter((rover.rcl.rcl.Loop) o, res);
    }
    if (o instanceof rover.rcl.rcl.RclBlock){
    	return createRclBlockAdapter((rover.rcl.rcl.RclBlock) o, res);
    }
    if (o instanceof rover.rcl.rcl.TemperatureQuery){
    	return createTemperatureQueryAdapter((rover.rcl.rcl.TemperatureQuery) o, res);
    }
    if (o instanceof rover.rcl.rcl.HumidityQuery){
    	return createHumidityQueryAdapter((rover.rcl.rcl.HumidityQuery) o, res);
    }
    if (o instanceof rover.rcl.rcl.MessageQuery){
    	return createMessageQueryAdapter((rover.rcl.rcl.MessageQuery) o, res);
    }
    if (o instanceof rover.rcl.rcl.ObstacleQuery){
    	return createObstacleQueryAdapter((rover.rcl.rcl.ObstacleQuery) o, res);
    }
    if (o instanceof rover.rcl.rcl.NumericExpression){
    	return createNumericExpressionAdapter((rover.rcl.rcl.NumericExpression) o, res);
    }
    if (o instanceof rover.rcl.rcl.StringExpression){
    	return createStringExpressionAdapter((rover.rcl.rcl.StringExpression) o, res);
    }
    if (o instanceof rover.rcl.rcl.BooleanExpression){
    	return createBooleanExpressionAdapter((rover.rcl.rcl.BooleanExpression) o, res);
    }
    if (o instanceof rover.rcl.rcl.VarRef){
    	return createVarRefAdapter((rover.rcl.rcl.VarRef) o, res);
    }
    if (o instanceof rover.rcl.rcl.NumberValue){
    	return createNumberValueAdapter((rover.rcl.rcl.NumberValue) o, res);
    }
    if (o instanceof rover.rcl.rcl.StringValue){
    	return createStringValueAdapter((rover.rcl.rcl.StringValue) o, res);
    }
    if (o instanceof rover.rcl.rcl.BooleanValue){
    	return createBooleanValueAdapter((rover.rcl.rcl.BooleanValue) o, res);
    }
    if (o instanceof rover.rcl.rcl.RoverValue){
    	return createRoverValueAdapter((rover.rcl.rcl.RoverValue) o, res);
    }
    if (o instanceof rover.rcl.rcl.ForwardAction){
    	return createForwardActionAdapter((rover.rcl.rcl.ForwardAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.ForwardMinAction){
    	return createForwardMinActionAdapter((rover.rcl.rcl.ForwardMinAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.BackwardAction){
    	return createBackwardActionAdapter((rover.rcl.rcl.BackwardAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.BackwardMinAction){
    	return createBackwardMinActionAdapter((rover.rcl.rcl.BackwardMinAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.TurnAction){
    	return createTurnActionAdapter((rover.rcl.rcl.TurnAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.TurnDegAction){
    	return createTurnDegActionAdapter((rover.rcl.rcl.TurnDegAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.StopAction){
    	return createStopActionAdapter((rover.rcl.rcl.StopAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.LogAction){
    	return createLogActionAdapter((rover.rcl.rcl.LogAction) o, res);
    }
    if (o instanceof rover.rcl.rcl.SendAction){
    	return createSendActionAdapter((rover.rcl.rcl.SendAction) o, res);
    }
    
    return null;
  }
  
  public RoverProgramAdapter createRoverProgramAdapter(final RoverProgram adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.RoverProgramAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.RoverProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.RoverProgramAdapter) adapter;
    }
  }
  
  public ParamAdapter createParamAdapter(final Param adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ParamAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ParamAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ParamAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.StatementAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.StatementAdapter) adapter;
    }
  }
  
  public VarAssignmentAdapter createVarAssignmentAdapter(final VarAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.VarAssignmentAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.VarAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.VarAssignmentAdapter) adapter;
    }
  }
  
  public ConditionalAdapter createConditionalAdapter(final Conditional adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ConditionalAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ConditionalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ConditionalAdapter) adapter;
    }
  }
  
  public LoopAdapter createLoopAdapter(final Loop adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.LoopAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.LoopAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.LoopAdapter) adapter;
    }
  }
  
  public RclBlockAdapter createRclBlockAdapter(final RclBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.RclBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) adapter;
    }
  }
  
  public QueryAdapter createQueryAdapter(final Query adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.QueryAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.QueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.QueryAdapter) adapter;
    }
  }
  
  public TemperatureQueryAdapter createTemperatureQueryAdapter(final TemperatureQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.TemperatureQueryAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.TemperatureQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.TemperatureQueryAdapter) adapter;
    }
  }
  
  public HumidityQueryAdapter createHumidityQueryAdapter(final HumidityQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.HumidityQueryAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.HumidityQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.HumidityQueryAdapter) adapter;
    }
  }
  
  public MessageQueryAdapter createMessageQueryAdapter(final MessageQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.MessageQueryAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.MessageQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.MessageQueryAdapter) adapter;
    }
  }
  
  public ObstacleQueryAdapter createObstacleQueryAdapter(final ObstacleQuery adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ObstacleQueryAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ObstacleQueryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ObstacleQueryAdapter) adapter;
    }
  }
  
  public RoverExpressionAdapter createRoverExpressionAdapter(final RoverExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.RoverExpressionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.RoverExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.RoverExpressionAdapter) adapter;
    }
  }
  
  public NumericExpressionAdapter createNumericExpressionAdapter(final NumericExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.NumericExpressionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.NumericExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.NumericExpressionAdapter) adapter;
    }
  }
  
  public StringExpressionAdapter createStringExpressionAdapter(final StringExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.StringExpressionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.StringExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.StringExpressionAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.BooleanExpressionAdapter) adapter;
    }
  }
  
  public RoverValueAdapter createRoverValueAdapter(final RoverValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.RoverValueAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.RoverValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.RoverValueAdapter) adapter;
    }
  }
  
  public NumberValueAdapter createNumberValueAdapter(final NumberValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.NumberValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) adapter;
    }
  }
  
  public StringValueAdapter createStringValueAdapter(final StringValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.StringValueAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.StringValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.StringValueAdapter) adapter;
    }
  }
  
  public BooleanValueAdapter createBooleanValueAdapter(final BooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ActionAdapter) adapter;
    }
  }
  
  public ForwardActionAdapter createForwardActionAdapter(final ForwardAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ForwardActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ForwardActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ForwardActionAdapter) adapter;
    }
  }
  
  public ForwardMinActionAdapter createForwardMinActionAdapter(final ForwardMinAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.ForwardMinActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.ForwardMinActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.ForwardMinActionAdapter) adapter;
    }
  }
  
  public BackwardActionAdapter createBackwardActionAdapter(final BackwardAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.BackwardActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.BackwardActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.BackwardActionAdapter) adapter;
    }
  }
  
  public BackwardMinActionAdapter createBackwardMinActionAdapter(final BackwardMinAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.BackwardMinActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.BackwardMinActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.BackwardMinActionAdapter) adapter;
    }
  }
  
  public TurnActionAdapter createTurnActionAdapter(final TurnAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.TurnActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.TurnActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.TurnActionAdapter) adapter;
    }
  }
  
  public TurnDegActionAdapter createTurnDegActionAdapter(final TurnDegAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.TurnDegActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.TurnDegActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.TurnDegActionAdapter) adapter;
    }
  }
  
  public StopActionAdapter createStopActionAdapter(final StopAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.StopActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.StopActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.StopActionAdapter) adapter;
    }
  }
  
  public LogActionAdapter createLogActionAdapter(final LogAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.LogActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.LogActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.LogActionAdapter) adapter;
    }
  }
  
  public SendActionAdapter createSendActionAdapter(final SendAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.SendActionAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.SendActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.SendActionAdapter) adapter;
    }
  }
  
  public VarRefAdapter createVarRefAdapter(final VarRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.rcl.adapters.rclmt.rcl.VarRefAdapter) adapter;
    else {
    	adapter = new rover.rcl.adapters.rclmt.rcl.VarRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.rcl.adapters.rclmt.rcl.VarRefAdapter) adapter;
    }
  }
}
