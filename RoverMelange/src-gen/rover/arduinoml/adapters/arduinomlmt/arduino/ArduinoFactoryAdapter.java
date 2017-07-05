package rover.arduinoml.adapters.arduinomlmt.arduino;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinomlmt.arduino.AmbientLightSensor;
import rover.arduinomlmt.arduino.AnalogPin;
import rover.arduinomlmt.arduino.ArduinoBoard;
import rover.arduinomlmt.arduino.ArduinoFactory;
import rover.arduinomlmt.arduino.ArduinoPackage;
import rover.arduinomlmt.arduino.BinaryBooleanExpression;
import rover.arduinomlmt.arduino.BinaryIntegerExpression;
import rover.arduinomlmt.arduino.Block;
import rover.arduinomlmt.arduino.BluetoothTransceiver;
import rover.arduinomlmt.arduino.BooleanConstant;
import rover.arduinomlmt.arduino.BooleanModuleGet;
import rover.arduinomlmt.arduino.BooleanVariable;
import rover.arduinomlmt.arduino.BooleanVariableRef;
import rover.arduinomlmt.arduino.Buzzer;
import rover.arduinomlmt.arduino.Delay;
import rover.arduinomlmt.arduino.DigitalPin;
import rover.arduinomlmt.arduino.Fan;
import rover.arduinomlmt.arduino.If;
import rover.arduinomlmt.arduino.InfraRedSensor;
import rover.arduinomlmt.arduino.IntegerConstant;
import rover.arduinomlmt.arduino.IntegerModuleGet;
import rover.arduinomlmt.arduino.IntegerVariable;
import rover.arduinomlmt.arduino.IntegerVariableRef;
import rover.arduinomlmt.arduino.LED;
import rover.arduinomlmt.arduino.MicroServo;
import rover.arduinomlmt.arduino.ModuleAssignment;
import rover.arduinomlmt.arduino.MusicPlayer;
import rover.arduinomlmt.arduino.Project;
import rover.arduinomlmt.arduino.PushButton;
import rover.arduinomlmt.arduino.Repeat;
import rover.arduinomlmt.arduino.RotationSensor;
import rover.arduinomlmt.arduino.Sketch;
import rover.arduinomlmt.arduino.SoundSensor;
import rover.arduinomlmt.arduino.UnaryBooleanExpression;
import rover.arduinomlmt.arduino.UnaryIntegerExpression;
import rover.arduinomlmt.arduino.VariableAssignment;
import rover.arduinomlmt.arduino.VariableDeclaration;
import rover.arduinomlmt.arduino.While;

@SuppressWarnings("all")
public class ArduinoFactoryAdapter extends EFactoryImpl implements ArduinoFactory {
  private ArduinoMLMTAdaptersFactory adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  
  private rover.arduinoml.arduino.ArduinoFactory arduinoAdaptee = rover.arduinoml.arduino.ArduinoFactory.eINSTANCE;
  
  @Override
  public DigitalPin createDigitalPin() {
    return adaptersFactory.createDigitalPinAdapter(arduinoAdaptee.createDigitalPin(), null);
  }
  
  @Override
  public AnalogPin createAnalogPin() {
    return adaptersFactory.createAnalogPinAdapter(arduinoAdaptee.createAnalogPin(), null);
  }
  
  @Override
  public Sketch createSketch() {
    return adaptersFactory.createSketchAdapter(arduinoAdaptee.createSketch(), null);
  }
  
  @Override
  public Project createProject() {
    return adaptersFactory.createProjectAdapter(arduinoAdaptee.createProject(), null);
  }
  
  @Override
  public ModuleAssignment createModuleAssignment() {
    return adaptersFactory.createModuleAssignmentAdapter(arduinoAdaptee.createModuleAssignment(), null);
  }
  
  @Override
  public Delay createDelay() {
    return adaptersFactory.createDelayAdapter(arduinoAdaptee.createDelay(), null);
  }
  
  @Override
  public Repeat createRepeat() {
    return adaptersFactory.createRepeatAdapter(arduinoAdaptee.createRepeat(), null);
  }
  
  @Override
  public While createWhile() {
    return adaptersFactory.createWhileAdapter(arduinoAdaptee.createWhile(), null);
  }
  
  @Override
  public VariableAssignment createVariableAssignment() {
    return adaptersFactory.createVariableAssignmentAdapter(arduinoAdaptee.createVariableAssignment(), null);
  }
  
  @Override
  public BinaryIntegerExpression createBinaryIntegerExpression() {
    return adaptersFactory.createBinaryIntegerExpressionAdapter(arduinoAdaptee.createBinaryIntegerExpression(), null);
  }
  
  @Override
  public BinaryBooleanExpression createBinaryBooleanExpression() {
    return adaptersFactory.createBinaryBooleanExpressionAdapter(arduinoAdaptee.createBinaryBooleanExpression(), null);
  }
  
  @Override
  public If createIf() {
    return adaptersFactory.createIfAdapter(arduinoAdaptee.createIf(), null);
  }
  
  @Override
  public IntegerConstant createIntegerConstant() {
    return adaptersFactory.createIntegerConstantAdapter(arduinoAdaptee.createIntegerConstant(), null);
  }
  
  @Override
  public BooleanConstant createBooleanConstant() {
    return adaptersFactory.createBooleanConstantAdapter(arduinoAdaptee.createBooleanConstant(), null);
  }
  
  @Override
  public IntegerVariable createIntegerVariable() {
    return adaptersFactory.createIntegerVariableAdapter(arduinoAdaptee.createIntegerVariable(), null);
  }
  
  @Override
  public BooleanVariable createBooleanVariable() {
    return adaptersFactory.createBooleanVariableAdapter(arduinoAdaptee.createBooleanVariable(), null);
  }
  
  @Override
  public BooleanModuleGet createBooleanModuleGet() {
    return adaptersFactory.createBooleanModuleGetAdapter(arduinoAdaptee.createBooleanModuleGet(), null);
  }
  
  @Override
  public IntegerModuleGet createIntegerModuleGet() {
    return adaptersFactory.createIntegerModuleGetAdapter(arduinoAdaptee.createIntegerModuleGet(), null);
  }
  
  @Override
  public UnaryBooleanExpression createUnaryBooleanExpression() {
    return adaptersFactory.createUnaryBooleanExpressionAdapter(arduinoAdaptee.createUnaryBooleanExpression(), null);
  }
  
  @Override
  public UnaryIntegerExpression createUnaryIntegerExpression() {
    return adaptersFactory.createUnaryIntegerExpressionAdapter(arduinoAdaptee.createUnaryIntegerExpression(), null);
  }
  
  @Override
  public VariableDeclaration createVariableDeclaration() {
    return adaptersFactory.createVariableDeclarationAdapter(arduinoAdaptee.createVariableDeclaration(), null);
  }
  
  @Override
  public IntegerVariableRef createIntegerVariableRef() {
    return adaptersFactory.createIntegerVariableRefAdapter(arduinoAdaptee.createIntegerVariableRef(), null);
  }
  
  @Override
  public LED createLED() {
    return adaptersFactory.createLEDAdapter(arduinoAdaptee.createLED(), null);
  }
  
  @Override
  public PushButton createPushButton() {
    return adaptersFactory.createPushButtonAdapter(arduinoAdaptee.createPushButton(), null);
  }
  
  @Override
  public Buzzer createBuzzer() {
    return adaptersFactory.createBuzzerAdapter(arduinoAdaptee.createBuzzer(), null);
  }
  
  @Override
  public RotationSensor createRotationSensor() {
    return adaptersFactory.createRotationSensorAdapter(arduinoAdaptee.createRotationSensor(), null);
  }
  
  @Override
  public MicroServo createMicroServo() {
    return adaptersFactory.createMicroServoAdapter(arduinoAdaptee.createMicroServo(), null);
  }
  
  @Override
  public InfraRedSensor createInfraRedSensor() {
    return adaptersFactory.createInfraRedSensorAdapter(arduinoAdaptee.createInfraRedSensor(), null);
  }
  
  @Override
  public AmbientLightSensor createAmbientLightSensor() {
    return adaptersFactory.createAmbientLightSensorAdapter(arduinoAdaptee.createAmbientLightSensor(), null);
  }
  
  @Override
  public SoundSensor createSoundSensor() {
    return adaptersFactory.createSoundSensorAdapter(arduinoAdaptee.createSoundSensor(), null);
  }
  
  @Override
  public Fan createFan() {
    return adaptersFactory.createFanAdapter(arduinoAdaptee.createFan(), null);
  }
  
  @Override
  public MusicPlayer createMusicPlayer() {
    return adaptersFactory.createMusicPlayerAdapter(arduinoAdaptee.createMusicPlayer(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(arduinoAdaptee.createBlock(), null);
  }
  
  @Override
  public ArduinoBoard createArduinoBoard() {
    return adaptersFactory.createArduinoBoardAdapter(arduinoAdaptee.createArduinoBoard(), null);
  }
  
  @Override
  public BooleanVariableRef createBooleanVariableRef() {
    return adaptersFactory.createBooleanVariableRefAdapter(arduinoAdaptee.createBooleanVariableRef(), null);
  }
  
  @Override
  public BluetoothTransceiver createBluetoothTransceiver() {
    return adaptersFactory.createBluetoothTransceiverAdapter(arduinoAdaptee.createBluetoothTransceiver(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getArduinoPackage();
  }
  
  public ArduinoPackage getArduinoPackage() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE;
  }
}
