package rover.rcl.adapters.rclmt.rcl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rclmt.rcl.Assignment;
import rover.rclmt.rcl.BackwardAction;
import rover.rclmt.rcl.BackwardMinAction;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.BooleanExpression;
import rover.rclmt.rcl.BooleanValue;
import rover.rclmt.rcl.Conditional;
import rover.rclmt.rcl.ForwardAction;
import rover.rclmt.rcl.ForwardMinAction;
import rover.rclmt.rcl.HumidityQuery;
import rover.rclmt.rcl.LogAction;
import rover.rclmt.rcl.Loop;
import rover.rclmt.rcl.MessageQuery;
import rover.rclmt.rcl.NumberValue;
import rover.rclmt.rcl.NumericExpression;
import rover.rclmt.rcl.ObstacleQuery;
import rover.rclmt.rcl.Param;
import rover.rclmt.rcl.RclFactory;
import rover.rclmt.rcl.RclPackage;
import rover.rclmt.rcl.RoverProgram;
import rover.rclmt.rcl.RoverValue;
import rover.rclmt.rcl.SendAction;
import rover.rclmt.rcl.StopAction;
import rover.rclmt.rcl.StringExpression;
import rover.rclmt.rcl.StringValue;
import rover.rclmt.rcl.TemperatureQuery;
import rover.rclmt.rcl.TurnAction;
import rover.rclmt.rcl.TurnDegAction;
import rover.rclmt.rcl.VarRef;

@SuppressWarnings("all")
public class RclFactoryAdapter extends EFactoryImpl implements RclFactory {
  private RCLMTAdaptersFactory adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  
  private rover.rcl.rcl.RclFactory rclAdaptee = rover.rcl.rcl.RclFactory.eINSTANCE;
  
  @Override
  public RoverProgram createRoverProgram() {
    return adaptersFactory.createRoverProgramAdapter(rclAdaptee.createRoverProgram(), null);
  }
  
  @Override
  public Param createParam() {
    return adaptersFactory.createParamAdapter(rclAdaptee.createParam(), null);
  }
  
  @Override
  public Assignment createAssignment() {
    return adaptersFactory.createAssignmentAdapter(rclAdaptee.createAssignment(), null);
  }
  
  @Override
  public Conditional createConditional() {
    return adaptersFactory.createConditionalAdapter(rclAdaptee.createConditional(), null);
  }
  
  @Override
  public Loop createLoop() {
    return adaptersFactory.createLoopAdapter(rclAdaptee.createLoop(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(rclAdaptee.createBlock(), null);
  }
  
  @Override
  public TemperatureQuery createTemperatureQuery() {
    return adaptersFactory.createTemperatureQueryAdapter(rclAdaptee.createTemperatureQuery(), null);
  }
  
  @Override
  public HumidityQuery createHumidityQuery() {
    return adaptersFactory.createHumidityQueryAdapter(rclAdaptee.createHumidityQuery(), null);
  }
  
  @Override
  public MessageQuery createMessageQuery() {
    return adaptersFactory.createMessageQueryAdapter(rclAdaptee.createMessageQuery(), null);
  }
  
  @Override
  public ObstacleQuery createObstacleQuery() {
    return adaptersFactory.createObstacleQueryAdapter(rclAdaptee.createObstacleQuery(), null);
  }
  
  @Override
  public NumericExpression createNumericExpression() {
    return adaptersFactory.createNumericExpressionAdapter(rclAdaptee.createNumericExpression(), null);
  }
  
  @Override
  public StringExpression createStringExpression() {
    return adaptersFactory.createStringExpressionAdapter(rclAdaptee.createStringExpression(), null);
  }
  
  @Override
  public BooleanExpression createBooleanExpression() {
    return adaptersFactory.createBooleanExpressionAdapter(rclAdaptee.createBooleanExpression(), null);
  }
  
  @Override
  public RoverValue createRoverValue() {
    return adaptersFactory.createRoverValueAdapter(rclAdaptee.createRoverValue(), null);
  }
  
  @Override
  public NumberValue createNumberValue() {
    return adaptersFactory.createNumberValueAdapter(rclAdaptee.createNumberValue(), null);
  }
  
  @Override
  public StringValue createStringValue() {
    return adaptersFactory.createStringValueAdapter(rclAdaptee.createStringValue(), null);
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(rclAdaptee.createBooleanValue(), null);
  }
  
  @Override
  public ForwardAction createForwardAction() {
    return adaptersFactory.createForwardActionAdapter(rclAdaptee.createForwardAction(), null);
  }
  
  @Override
  public ForwardMinAction createForwardMinAction() {
    return adaptersFactory.createForwardMinActionAdapter(rclAdaptee.createForwardMinAction(), null);
  }
  
  @Override
  public BackwardAction createBackwardAction() {
    return adaptersFactory.createBackwardActionAdapter(rclAdaptee.createBackwardAction(), null);
  }
  
  @Override
  public BackwardMinAction createBackwardMinAction() {
    return adaptersFactory.createBackwardMinActionAdapter(rclAdaptee.createBackwardMinAction(), null);
  }
  
  @Override
  public TurnAction createTurnAction() {
    return adaptersFactory.createTurnActionAdapter(rclAdaptee.createTurnAction(), null);
  }
  
  @Override
  public TurnDegAction createTurnDegAction() {
    return adaptersFactory.createTurnDegActionAdapter(rclAdaptee.createTurnDegAction(), null);
  }
  
  @Override
  public StopAction createStopAction() {
    return adaptersFactory.createStopActionAdapter(rclAdaptee.createStopAction(), null);
  }
  
  @Override
  public LogAction createLogAction() {
    return adaptersFactory.createLogActionAdapter(rclAdaptee.createLogAction(), null);
  }
  
  @Override
  public SendAction createSendAction() {
    return adaptersFactory.createSendActionAdapter(rclAdaptee.createSendAction(), null);
  }
  
  @Override
  public VarRef createVarRef() {
    return adaptersFactory.createVarRefAdapter(rclAdaptee.createVarRef(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRclPackage();
  }
  
  public RclPackage getRclPackage() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE;
  }
}
