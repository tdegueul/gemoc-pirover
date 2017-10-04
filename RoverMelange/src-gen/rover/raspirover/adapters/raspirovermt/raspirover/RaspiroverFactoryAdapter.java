package rover.raspirover.adapters.raspirovermt.raspirover;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirovermt.raspirover.AnalogPin;
import rover.raspirovermt.raspirover.Angle;
import rover.raspirovermt.raspirover.AngleAdd;
import rover.raspirovermt.raspirover.AngleDistinct;
import rover.raspirovermt.raspirover.AngleEquals;
import rover.raspirovermt.raspirover.AngleGreater;
import rover.raspirovermt.raspirover.AngleScalarDivide;
import rover.raspirovermt.raspirover.AngleScalarMultiply;
import rover.raspirovermt.raspirover.AngleSmaller;
import rover.raspirovermt.raspirover.AngleSubtract;
import rover.raspirovermt.raspirover.BackwardAction;
import rover.raspirovermt.raspirover.BackwardMinAction;
import rover.raspirovermt.raspirover.Block;
import rover.raspirovermt.raspirover.BooleanExpression;
import rover.raspirovermt.raspirover.BooleanValue;
import rover.raspirovermt.raspirover.Centimeter;
import rover.raspirovermt.raspirover.Conditional;
import rover.raspirovermt.raspirover.Degree;
import rover.raspirovermt.raspirover.DigitalPin;
import rover.raspirovermt.raspirover.Foot;
import rover.raspirovermt.raspirover.ForwardAction;
import rover.raspirovermt.raspirover.ForwardMinAction;
import rover.raspirovermt.raspirover.Gradian;
import rover.raspirovermt.raspirover.HumidityQuery;
import rover.raspirovermt.raspirover.Inch;
import rover.raspirovermt.raspirover.Length;
import rover.raspirovermt.raspirover.LengthAdd;
import rover.raspirovermt.raspirover.LengthDistinct;
import rover.raspirovermt.raspirover.LengthEquals;
import rover.raspirovermt.raspirover.LengthGreater;
import rover.raspirovermt.raspirover.LengthScalarDivide;
import rover.raspirovermt.raspirover.LengthScalarMultiply;
import rover.raspirovermt.raspirover.LengthSmaller;
import rover.raspirovermt.raspirover.LengthSubtract;
import rover.raspirovermt.raspirover.LogAction;
import rover.raspirovermt.raspirover.Loop;
import rover.raspirovermt.raspirover.MessageQuery;
import rover.raspirovermt.raspirover.Meter;
import rover.raspirovermt.raspirover.Millimeter;
import rover.raspirovermt.raspirover.NumberValue;
import rover.raspirovermt.raspirover.NumericExpression;
import rover.raspirovermt.raspirover.ObstacleQuery;
import rover.raspirovermt.raspirover.Param;
import rover.raspirovermt.raspirover.Pin;
import rover.raspirovermt.raspirover.Project;
import rover.raspirovermt.raspirover.Radian;
import rover.raspirovermt.raspirover.RasPiBoard;
import rover.raspirovermt.raspirover.RaspiroverFactory;
import rover.raspirovermt.raspirover.RaspiroverPackage;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.RoverValue;
import rover.raspirovermt.raspirover.SendAction;
import rover.raspirovermt.raspirover.Sketch;
import rover.raspirovermt.raspirover.StopAction;
import rover.raspirovermt.raspirover.StringExpression;
import rover.raspirovermt.raspirover.StringValue;
import rover.raspirovermt.raspirover.TemperatureQuery;
import rover.raspirovermt.raspirover.Turn;
import rover.raspirovermt.raspirover.TurnAction;
import rover.raspirovermt.raspirover.TurnDegAction;
import rover.raspirovermt.raspirover.Unit;
import rover.raspirovermt.raspirover.VarAssignment;
import rover.raspirovermt.raspirover.VarRef;
import rover.raspirovermt.raspirover.Yard;

@SuppressWarnings("all")
public class RaspiroverFactoryAdapter extends EFactoryImpl implements RaspiroverFactory {
  private RasPiRoverMTAdaptersFactory adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  
  private rover.raspirover.raspirover.RaspiroverFactory raspiroverAdaptee = rover.raspirover.raspirover.RaspiroverFactory.eINSTANCE;
  
  @Override
  public RasPiBoard createRasPiBoard() {
    return adaptersFactory.createRasPiBoardAdapter(raspiroverAdaptee.createRasPiBoard(), null);
  }
  
  @Override
  public Project createProject() {
    return adaptersFactory.createProjectAdapter(raspiroverAdaptee.createProject(), null);
  }
  
  @Override
  public Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(raspiroverAdaptee.createSketch(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(raspiroverAdaptee.createBlock(), null);
  }
  
  @Override
  public DigitalPin createDigitalPin() {
    return adaptersFactory.createDigitalPinAdapter(raspiroverAdaptee.createDigitalPin(), null);
  }
  
  @Override
  public Pin createPin() {
    return adaptersFactory.createPinAdapter(raspiroverAdaptee.createPin(), null);
  }
  
  @Override
  public AnalogPin createAnalogPin() {
    return adaptersFactory.createAnalogPinAdapter(raspiroverAdaptee.createAnalogPin(), null);
  }
  
  @Override
  public RoverProgram createRoverProgram() {
    return adaptersFactory.createRoverProgramAdapter(raspiroverAdaptee.createRoverProgram(), null);
  }
  
  @Override
  public Param createParam() {
    return adaptersFactory.createParamAdapter(raspiroverAdaptee.createParam(), null);
  }
  
  @Override
  public VarAssignment createVarAssignment() {
    return adaptersFactory.createVarAssignmentAdapter(raspiroverAdaptee.createVarAssignment(), null);
  }
  
  @Override
  public Conditional createConditional() {
    return adaptersFactory.createConditionalAdapter(raspiroverAdaptee.createConditional(), null);
  }
  
  @Override
  public Loop createLoop() {
    return adaptersFactory.createLoopAdapter(raspiroverAdaptee.createLoop(), null);
  }
  
  @Override
  public RclBlock createRclBlock() {
    return adaptersFactory.createRclBlockAdapter(raspiroverAdaptee.createRclBlock(), null);
  }
  
  @Override
  public TemperatureQuery createTemperatureQuery() {
    return adaptersFactory.createTemperatureQueryAdapter(raspiroverAdaptee.createTemperatureQuery(), null);
  }
  
  @Override
  public HumidityQuery createHumidityQuery() {
    return adaptersFactory.createHumidityQueryAdapter(raspiroverAdaptee.createHumidityQuery(), null);
  }
  
  @Override
  public MessageQuery createMessageQuery() {
    return adaptersFactory.createMessageQueryAdapter(raspiroverAdaptee.createMessageQuery(), null);
  }
  
  @Override
  public ObstacleQuery createObstacleQuery() {
    return adaptersFactory.createObstacleQueryAdapter(raspiroverAdaptee.createObstacleQuery(), null);
  }
  
  @Override
  public NumericExpression createNumericExpression() {
    return adaptersFactory.createNumericExpressionAdapter(raspiroverAdaptee.createNumericExpression(), null);
  }
  
  @Override
  public StringExpression createStringExpression() {
    return adaptersFactory.createStringExpressionAdapter(raspiroverAdaptee.createStringExpression(), null);
  }
  
  @Override
  public BooleanExpression createBooleanExpression() {
    return adaptersFactory.createBooleanExpressionAdapter(raspiroverAdaptee.createBooleanExpression(), null);
  }
  
  @Override
  public RoverValue createRoverValue() {
    return adaptersFactory.createRoverValueAdapter(raspiroverAdaptee.createRoverValue(), null);
  }
  
  @Override
  public NumberValue createNumberValue() {
    return adaptersFactory.createNumberValueAdapter(raspiroverAdaptee.createNumberValue(), null);
  }
  
  @Override
  public StringValue createStringValue() {
    return adaptersFactory.createStringValueAdapter(raspiroverAdaptee.createStringValue(), null);
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(raspiroverAdaptee.createBooleanValue(), null);
  }
  
  @Override
  public ForwardAction createForwardAction() {
    return adaptersFactory.createForwardActionAdapter(raspiroverAdaptee.createForwardAction(), null);
  }
  
  @Override
  public ForwardMinAction createForwardMinAction() {
    return adaptersFactory.createForwardMinActionAdapter(raspiroverAdaptee.createForwardMinAction(), null);
  }
  
  @Override
  public BackwardAction createBackwardAction() {
    return adaptersFactory.createBackwardActionAdapter(raspiroverAdaptee.createBackwardAction(), null);
  }
  
  @Override
  public BackwardMinAction createBackwardMinAction() {
    return adaptersFactory.createBackwardMinActionAdapter(raspiroverAdaptee.createBackwardMinAction(), null);
  }
  
  @Override
  public TurnAction createTurnAction() {
    return adaptersFactory.createTurnActionAdapter(raspiroverAdaptee.createTurnAction(), null);
  }
  
  @Override
  public TurnDegAction createTurnDegAction() {
    return adaptersFactory.createTurnDegActionAdapter(raspiroverAdaptee.createTurnDegAction(), null);
  }
  
  @Override
  public StopAction createStopAction() {
    return adaptersFactory.createStopActionAdapter(raspiroverAdaptee.createStopAction(), null);
  }
  
  @Override
  public LogAction createLogAction() {
    return adaptersFactory.createLogActionAdapter(raspiroverAdaptee.createLogAction(), null);
  }
  
  @Override
  public SendAction createSendAction() {
    return adaptersFactory.createSendActionAdapter(raspiroverAdaptee.createSendAction(), null);
  }
  
  @Override
  public VarRef createVarRef() {
    return adaptersFactory.createVarRefAdapter(raspiroverAdaptee.createVarRef(), null);
  }
  
  @Override
  public Unit createUnit() {
    return adaptersFactory.createUnitAdapter(raspiroverAdaptee.createUnit(), null);
  }
  
  @Override
  public Centimeter createCentimeter() {
    return adaptersFactory.createCentimeterAdapter(raspiroverAdaptee.createCentimeter(), null);
  }
  
  @Override
  public Millimeter createMillimeter() {
    return adaptersFactory.createMillimeterAdapter(raspiroverAdaptee.createMillimeter(), null);
  }
  
  @Override
  public Meter createMeter() {
    return adaptersFactory.createMeterAdapter(raspiroverAdaptee.createMeter(), null);
  }
  
  @Override
  public Foot createFoot() {
    return adaptersFactory.createFootAdapter(raspiroverAdaptee.createFoot(), null);
  }
  
  @Override
  public Inch createInch() {
    return adaptersFactory.createInchAdapter(raspiroverAdaptee.createInch(), null);
  }
  
  @Override
  public Yard createYard() {
    return adaptersFactory.createYardAdapter(raspiroverAdaptee.createYard(), null);
  }
  
  @Override
  public Radian createRadian() {
    return adaptersFactory.createRadianAdapter(raspiroverAdaptee.createRadian(), null);
  }
  
  @Override
  public Degree createDegree() {
    return adaptersFactory.createDegreeAdapter(raspiroverAdaptee.createDegree(), null);
  }
  
  @Override
  public Turn createTurn() {
    return adaptersFactory.createTurnAdapter(raspiroverAdaptee.createTurn(), null);
  }
  
  @Override
  public Gradian createGradian() {
    return adaptersFactory.createGradianAdapter(raspiroverAdaptee.createGradian(), null);
  }
  
  @Override
  public Length createLength() {
    return adaptersFactory.createLengthAdapter(raspiroverAdaptee.createLength(), null);
  }
  
  @Override
  public Angle createAngle() {
    return adaptersFactory.createAngleAdapter(raspiroverAdaptee.createAngle(), null);
  }
  
  @Override
  public LengthAdd createLengthAdd() {
    return adaptersFactory.createLengthAddAdapter(raspiroverAdaptee.createLengthAdd(), null);
  }
  
  @Override
  public LengthSubtract createLengthSubtract() {
    return adaptersFactory.createLengthSubtractAdapter(raspiroverAdaptee.createLengthSubtract(), null);
  }
  
  @Override
  public LengthScalarMultiply createLengthScalarMultiply() {
    return adaptersFactory.createLengthScalarMultiplyAdapter(raspiroverAdaptee.createLengthScalarMultiply(), null);
  }
  
  @Override
  public LengthScalarDivide createLengthScalarDivide() {
    return adaptersFactory.createLengthScalarDivideAdapter(raspiroverAdaptee.createLengthScalarDivide(), null);
  }
  
  @Override
  public LengthEquals createLengthEquals() {
    return adaptersFactory.createLengthEqualsAdapter(raspiroverAdaptee.createLengthEquals(), null);
  }
  
  @Override
  public LengthDistinct createLengthDistinct() {
    return adaptersFactory.createLengthDistinctAdapter(raspiroverAdaptee.createLengthDistinct(), null);
  }
  
  @Override
  public LengthSmaller createLengthSmaller() {
    return adaptersFactory.createLengthSmallerAdapter(raspiroverAdaptee.createLengthSmaller(), null);
  }
  
  @Override
  public LengthGreater createLengthGreater() {
    return adaptersFactory.createLengthGreaterAdapter(raspiroverAdaptee.createLengthGreater(), null);
  }
  
  @Override
  public AngleAdd createAngleAdd() {
    return adaptersFactory.createAngleAddAdapter(raspiroverAdaptee.createAngleAdd(), null);
  }
  
  @Override
  public AngleSubtract createAngleSubtract() {
    return adaptersFactory.createAngleSubtractAdapter(raspiroverAdaptee.createAngleSubtract(), null);
  }
  
  @Override
  public AngleScalarMultiply createAngleScalarMultiply() {
    return adaptersFactory.createAngleScalarMultiplyAdapter(raspiroverAdaptee.createAngleScalarMultiply(), null);
  }
  
  @Override
  public AngleScalarDivide createAngleScalarDivide() {
    return adaptersFactory.createAngleScalarDivideAdapter(raspiroverAdaptee.createAngleScalarDivide(), null);
  }
  
  @Override
  public AngleEquals createAngleEquals() {
    return adaptersFactory.createAngleEqualsAdapter(raspiroverAdaptee.createAngleEquals(), null);
  }
  
  @Override
  public AngleDistinct createAngleDistinct() {
    return adaptersFactory.createAngleDistinctAdapter(raspiroverAdaptee.createAngleDistinct(), null);
  }
  
  @Override
  public AngleSmaller createAngleSmaller() {
    return adaptersFactory.createAngleSmallerAdapter(raspiroverAdaptee.createAngleSmaller(), null);
  }
  
  @Override
  public AngleGreater createAngleGreater() {
    return adaptersFactory.createAngleGreaterAdapter(raspiroverAdaptee.createAngleGreater(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRaspiroverPackage();
  }
  
  public RaspiroverPackage getRaspiroverPackage() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE;
  }
}
