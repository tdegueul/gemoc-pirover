package rover.arduinoml.adapters.arduinomlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import rover.arduinoml.adapters.arduinomlmt.arduino.AmbientLightSensorAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.AnalogPinAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoAnalogModuleAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoBoardAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoCommunicationModuleAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoDigitalModuleAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoModuleAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.AssignmentAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BinaryBooleanExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BinaryExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BinaryIntegerExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BluetoothTransceiverAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BoardAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BooleanConstantAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BooleanExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BooleanModuleGetAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableRefAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.BuzzerAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ConstantAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ControlAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.DelayAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.DigitalPinAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.FanAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IfAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.InfraRedSensorAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.InstructionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IntegerConstantAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IntegerExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IntegerModuleGetAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableRefAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.LEDAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.MicroServoAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAssignmentAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ModuleGetAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ModuleInstructionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.MusicPlayerAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.NamedElementAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.PinAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.PushButtonAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.RepeatAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.RotationSensorAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.SketchAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.SoundSensorAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.UnaryBooleanExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.UnaryExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.UnaryIntegerExpressionAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.UtilitiesAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.VariableAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.VariableAssignmentAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.VariableDeclarationAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.VariableRefAdapter;
import rover.arduinoml.adapters.arduinomlmt.arduino.WhileAdapter;
import rover.arduinoml.arduino.AmbientLightSensor;
import rover.arduinoml.arduino.AnalogPin;
import rover.arduinoml.arduino.ArduinoAnalogModule;
import rover.arduinoml.arduino.ArduinoBoard;
import rover.arduinoml.arduino.ArduinoCommunicationModule;
import rover.arduinoml.arduino.ArduinoDigitalModule;
import rover.arduinoml.arduino.ArduinoModule;
import rover.arduinoml.arduino.Assignment;
import rover.arduinoml.arduino.BinaryBooleanExpression;
import rover.arduinoml.arduino.BinaryExpression;
import rover.arduinoml.arduino.BinaryIntegerExpression;
import rover.arduinoml.arduino.Block;
import rover.arduinoml.arduino.BluetoothTransceiver;
import rover.arduinoml.arduino.Board;
import rover.arduinoml.arduino.BooleanConstant;
import rover.arduinoml.arduino.BooleanExpression;
import rover.arduinoml.arduino.BooleanModuleGet;
import rover.arduinoml.arduino.BooleanVariable;
import rover.arduinoml.arduino.BooleanVariableRef;
import rover.arduinoml.arduino.Buzzer;
import rover.arduinoml.arduino.Constant;
import rover.arduinoml.arduino.Control;
import rover.arduinoml.arduino.Delay;
import rover.arduinoml.arduino.DigitalPin;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.Fan;
import rover.arduinoml.arduino.If;
import rover.arduinoml.arduino.InfraRedSensor;
import rover.arduinoml.arduino.Instruction;
import rover.arduinoml.arduino.IntegerConstant;
import rover.arduinoml.arduino.IntegerExpression;
import rover.arduinoml.arduino.IntegerModuleGet;
import rover.arduinoml.arduino.IntegerVariable;
import rover.arduinoml.arduino.IntegerVariableRef;
import rover.arduinoml.arduino.LED;
import rover.arduinoml.arduino.MicroServo;
import rover.arduinoml.arduino.Module;
import rover.arduinoml.arduino.ModuleAssignment;
import rover.arduinoml.arduino.ModuleGet;
import rover.arduinoml.arduino.ModuleInstruction;
import rover.arduinoml.arduino.MusicPlayer;
import rover.arduinoml.arduino.NamedElement;
import rover.arduinoml.arduino.Pin;
import rover.arduinoml.arduino.Project;
import rover.arduinoml.arduino.PushButton;
import rover.arduinoml.arduino.Repeat;
import rover.arduinoml.arduino.RotationSensor;
import rover.arduinoml.arduino.Sketch;
import rover.arduinoml.arduino.SoundSensor;
import rover.arduinoml.arduino.UnaryBooleanExpression;
import rover.arduinoml.arduino.UnaryExpression;
import rover.arduinoml.arduino.UnaryIntegerExpression;
import rover.arduinoml.arduino.Utilities;
import rover.arduinoml.arduino.Variable;
import rover.arduinoml.arduino.VariableAssignment;
import rover.arduinoml.arduino.VariableDeclaration;
import rover.arduinoml.arduino.VariableRef;
import rover.arduinoml.arduino.While;

@SuppressWarnings("all")
public class ArduinoMLMTAdaptersFactory implements AdaptersFactory {
  private static ArduinoMLMTAdaptersFactory instance;
  
  public static ArduinoMLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ArduinoMLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof rover.arduinoml.arduino.DigitalPin){
    	return createDigitalPinAdapter((rover.arduinoml.arduino.DigitalPin) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.AnalogPin){
    	return createAnalogPinAdapter((rover.arduinoml.arduino.AnalogPin) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Sketch){
    	return createSketchAdapter((rover.arduinoml.arduino.Sketch) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Project){
    	return createProjectAdapter((rover.arduinoml.arduino.Project) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.ModuleAssignment){
    	return createModuleAssignmentAdapter((rover.arduinoml.arduino.ModuleAssignment) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Delay){
    	return createDelayAdapter((rover.arduinoml.arduino.Delay) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Repeat){
    	return createRepeatAdapter((rover.arduinoml.arduino.Repeat) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.While){
    	return createWhileAdapter((rover.arduinoml.arduino.While) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.VariableAssignment){
    	return createVariableAssignmentAdapter((rover.arduinoml.arduino.VariableAssignment) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BinaryIntegerExpression){
    	return createBinaryIntegerExpressionAdapter((rover.arduinoml.arduino.BinaryIntegerExpression) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BinaryBooleanExpression){
    	return createBinaryBooleanExpressionAdapter((rover.arduinoml.arduino.BinaryBooleanExpression) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.If){
    	return createIfAdapter((rover.arduinoml.arduino.If) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.IntegerConstant){
    	return createIntegerConstantAdapter((rover.arduinoml.arduino.IntegerConstant) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BooleanConstant){
    	return createBooleanConstantAdapter((rover.arduinoml.arduino.BooleanConstant) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.IntegerVariable){
    	return createIntegerVariableAdapter((rover.arduinoml.arduino.IntegerVariable) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BooleanVariable){
    	return createBooleanVariableAdapter((rover.arduinoml.arduino.BooleanVariable) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BooleanModuleGet){
    	return createBooleanModuleGetAdapter((rover.arduinoml.arduino.BooleanModuleGet) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.IntegerModuleGet){
    	return createIntegerModuleGetAdapter((rover.arduinoml.arduino.IntegerModuleGet) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.UnaryBooleanExpression){
    	return createUnaryBooleanExpressionAdapter((rover.arduinoml.arduino.UnaryBooleanExpression) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.UnaryIntegerExpression){
    	return createUnaryIntegerExpressionAdapter((rover.arduinoml.arduino.UnaryIntegerExpression) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.VariableDeclaration){
    	return createVariableDeclarationAdapter((rover.arduinoml.arduino.VariableDeclaration) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.IntegerVariableRef){
    	return createIntegerVariableRefAdapter((rover.arduinoml.arduino.IntegerVariableRef) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.LED){
    	return createLEDAdapter((rover.arduinoml.arduino.LED) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.PushButton){
    	return createPushButtonAdapter((rover.arduinoml.arduino.PushButton) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Buzzer){
    	return createBuzzerAdapter((rover.arduinoml.arduino.Buzzer) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.RotationSensor){
    	return createRotationSensorAdapter((rover.arduinoml.arduino.RotationSensor) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.MicroServo){
    	return createMicroServoAdapter((rover.arduinoml.arduino.MicroServo) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.InfraRedSensor){
    	return createInfraRedSensorAdapter((rover.arduinoml.arduino.InfraRedSensor) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.AmbientLightSensor){
    	return createAmbientLightSensorAdapter((rover.arduinoml.arduino.AmbientLightSensor) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.SoundSensor){
    	return createSoundSensorAdapter((rover.arduinoml.arduino.SoundSensor) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Fan){
    	return createFanAdapter((rover.arduinoml.arduino.Fan) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.MusicPlayer){
    	return createMusicPlayerAdapter((rover.arduinoml.arduino.MusicPlayer) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.Block){
    	return createBlockAdapter((rover.arduinoml.arduino.Block) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.ArduinoBoard){
    	return createArduinoBoardAdapter((rover.arduinoml.arduino.ArduinoBoard) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((rover.arduinoml.arduino.BooleanVariableRef) o, res);
    }
    if (o instanceof rover.arduinoml.arduino.BluetoothTransceiver){
    	return createBluetoothTransceiverAdapter((rover.arduinoml.arduino.BluetoothTransceiver) o, res);
    }
    
    return null;
  }
  
  public BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BoardAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BoardAdapter) adapter;
    }
  }
  
  public ModuleAdapter createModuleAdapter(final Module adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter) adapter;
    }
  }
  
  public DigitalPinAdapter createDigitalPinAdapter(final DigitalPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.DigitalPinAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.DigitalPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.DigitalPinAdapter) adapter;
    }
  }
  
  public PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.PinAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.PinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.PinAdapter) adapter;
    }
  }
  
  public AnalogPinAdapter createAnalogPinAdapter(final AnalogPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.AnalogPinAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.AnalogPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.AnalogPinAdapter) adapter;
    }
  }
  
  public SketchAdapter createSketchAdapter(final Sketch adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.SketchAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.SketchAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.SketchAdapter) adapter;
    }
  }
  
  public ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter) adapter;
    }
  }
  
  public InstructionAdapter createInstructionAdapter(final Instruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.InstructionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.InstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.InstructionAdapter) adapter;
    }
  }
  
  public ModuleAssignmentAdapter createModuleAssignmentAdapter(final ModuleAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAssignmentAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAssignmentAdapter) adapter;
    }
  }
  
  public ModuleInstructionAdapter createModuleInstructionAdapter(final ModuleInstruction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleInstructionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ModuleInstructionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleInstructionAdapter) adapter;
    }
  }
  
  public ControlAdapter createControlAdapter(final Control adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ControlAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ControlAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ControlAdapter) adapter;
    }
  }
  
  public UtilitiesAdapter createUtilitiesAdapter(final Utilities adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.UtilitiesAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.UtilitiesAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.UtilitiesAdapter) adapter;
    }
  }
  
  public DelayAdapter createDelayAdapter(final Delay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.DelayAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.DelayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.DelayAdapter) adapter;
    }
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.NamedElementAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.NamedElementAdapter) adapter;
    }
  }
  
  public RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.RepeatAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.RepeatAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.RepeatAdapter) adapter;
    }
  }
  
  public ModuleGetAdapter createModuleGetAdapter(final ModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleGetAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ModuleGetAdapter) adapter;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.WhileAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.WhileAdapter) adapter;
    }
  }
  
  public BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryExpressionAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableAdapter) adapter;
    }
  }
  
  public VariableAssignmentAdapter createVariableAssignmentAdapter(final VariableAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableAssignmentAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.VariableAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableAssignmentAdapter) adapter;
    }
  }
  
  public BinaryIntegerExpressionAdapter createBinaryIntegerExpressionAdapter(final BinaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BinaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public BinaryBooleanExpressionAdapter createBinaryBooleanExpressionAdapter(final BinaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BinaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BinaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ExpressionAdapter) adapter;
    }
  }
  
  public ConstantAdapter createConstantAdapter(final Constant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ConstantAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ConstantAdapter) adapter;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IfAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IfAdapter) adapter;
    }
  }
  
  public IntegerConstantAdapter createIntegerConstantAdapter(final IntegerConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerConstantAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IntegerConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerConstantAdapter) adapter;
    }
  }
  
  public BooleanConstantAdapter createBooleanConstantAdapter(final BooleanConstant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanConstantAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BooleanConstantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanConstantAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanExpressionAdapter) adapter;
    }
  }
  
  public IntegerExpressionAdapter createIntegerExpressionAdapter(final IntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerExpressionAdapter) adapter;
    }
  }
  
  public AssignmentAdapter createAssignmentAdapter(final Assignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.AssignmentAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.AssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.AssignmentAdapter) adapter;
    }
  }
  
  public IntegerVariableAdapter createIntegerVariableAdapter(final IntegerVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableAdapter) adapter;
    }
  }
  
  public BooleanVariableAdapter createBooleanVariableAdapter(final BooleanVariable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableAdapter) adapter;
    }
  }
  
  public BooleanModuleGetAdapter createBooleanModuleGetAdapter(final BooleanModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanModuleGetAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BooleanModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanModuleGetAdapter) adapter;
    }
  }
  
  public IntegerModuleGetAdapter createIntegerModuleGetAdapter(final IntegerModuleGet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerModuleGetAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IntegerModuleGetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerModuleGetAdapter) adapter;
    }
  }
  
  public UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryExpressionAdapter) adapter;
    }
  }
  
  public UnaryBooleanExpressionAdapter createUnaryBooleanExpressionAdapter(final UnaryBooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryBooleanExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.UnaryBooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryBooleanExpressionAdapter) adapter;
    }
  }
  
  public UnaryIntegerExpressionAdapter createUnaryIntegerExpressionAdapter(final UnaryIntegerExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryIntegerExpressionAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.UnaryIntegerExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.UnaryIntegerExpressionAdapter) adapter;
    }
  }
  
  public VariableDeclarationAdapter createVariableDeclarationAdapter(final VariableDeclaration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableDeclarationAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.VariableDeclarationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableDeclarationAdapter) adapter;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableRefAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.VariableRefAdapter) adapter;
    }
  }
  
  public IntegerVariableRefAdapter createIntegerVariableRefAdapter(final IntegerVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableRefAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableRefAdapter) adapter;
    }
  }
  
  public LEDAdapter createLEDAdapter(final LED adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.LEDAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.LEDAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.LEDAdapter) adapter;
    }
  }
  
  public PushButtonAdapter createPushButtonAdapter(final PushButton adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.PushButtonAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.PushButtonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.PushButtonAdapter) adapter;
    }
  }
  
  public BuzzerAdapter createBuzzerAdapter(final Buzzer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BuzzerAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BuzzerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BuzzerAdapter) adapter;
    }
  }
  
  public RotationSensorAdapter createRotationSensorAdapter(final RotationSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.RotationSensorAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.RotationSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.RotationSensorAdapter) adapter;
    }
  }
  
  public MicroServoAdapter createMicroServoAdapter(final MicroServo adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.MicroServoAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.MicroServoAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.MicroServoAdapter) adapter;
    }
  }
  
  public InfraRedSensorAdapter createInfraRedSensorAdapter(final InfraRedSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.InfraRedSensorAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.InfraRedSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.InfraRedSensorAdapter) adapter;
    }
  }
  
  public AmbientLightSensorAdapter createAmbientLightSensorAdapter(final AmbientLightSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.AmbientLightSensorAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.AmbientLightSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.AmbientLightSensorAdapter) adapter;
    }
  }
  
  public SoundSensorAdapter createSoundSensorAdapter(final SoundSensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.SoundSensorAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.SoundSensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.SoundSensorAdapter) adapter;
    }
  }
  
  public FanAdapter createFanAdapter(final Fan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.FanAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.FanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.FanAdapter) adapter;
    }
  }
  
  public MusicPlayerAdapter createMusicPlayerAdapter(final MusicPlayer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.MusicPlayerAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.MusicPlayerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.MusicPlayerAdapter) adapter;
    }
  }
  
  public ArduinoModuleAdapter createArduinoModuleAdapter(final ArduinoModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoModuleAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoModuleAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter) adapter;
    }
  }
  
  public ArduinoBoardAdapter createArduinoBoardAdapter(final ArduinoBoard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoBoardAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoBoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoBoardAdapter) adapter;
    }
  }
  
  public ArduinoDigitalModuleAdapter createArduinoDigitalModuleAdapter(final ArduinoDigitalModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoDigitalModuleAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoDigitalModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoDigitalModuleAdapter) adapter;
    }
  }
  
  public ArduinoAnalogModuleAdapter createArduinoAnalogModuleAdapter(final ArduinoAnalogModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoAnalogModuleAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoAnalogModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoAnalogModuleAdapter) adapter;
    }
  }
  
  public BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BooleanVariableRefAdapter) adapter;
    }
  }
  
  public ArduinoCommunicationModuleAdapter createArduinoCommunicationModuleAdapter(final ArduinoCommunicationModule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoCommunicationModuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoCommunicationModuleAdapter) adapter;
    }
  }
  
  public BluetoothTransceiverAdapter createBluetoothTransceiverAdapter(final BluetoothTransceiver adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (rover.arduinoml.adapters.arduinomlmt.arduino.BluetoothTransceiverAdapter) adapter;
    else {
    	adapter = new rover.arduinoml.adapters.arduinomlmt.arduino.BluetoothTransceiverAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (rover.arduinoml.adapters.arduinomlmt.arduino.BluetoothTransceiverAdapter) adapter;
    }
  }
}
