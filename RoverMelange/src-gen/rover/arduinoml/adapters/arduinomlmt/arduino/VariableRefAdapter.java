package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.VariableRef;

@SuppressWarnings("all")
public class VariableRefAdapter extends EObjectAdapter<VariableRef> implements rover.arduinomlmt.arduino.VariableRef {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public VariableRefAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.VariableRef_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getVariableRef();
  }
}
