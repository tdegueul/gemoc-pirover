package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.IntegerExpression;

@SuppressWarnings("all")
public class IntegerExpressionAdapter extends EObjectAdapter<IntegerExpression> implements rover.arduinomlmt.arduino.IntegerExpression {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public IntegerExpressionAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getIntegerExpression();
  }
}
