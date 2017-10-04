package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Instruction;

@SuppressWarnings("all")
public class InstructionAdapter extends EObjectAdapter<Instruction> implements rover.arduinomlmt.arduino.Instruction {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public InstructionAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getInstruction();
  }
}
