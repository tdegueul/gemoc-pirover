package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.IntegerVariableRef;
import rover.arduinomlmt.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariableRefAdapter extends EObjectAdapter<IntegerVariableRef> implements rover.arduinomlmt.arduino.IntegerVariableRef {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableRefAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntegerVariable getVariable() {
    return (IntegerVariable) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final IntegerVariable o) {
    if (o != null)
    	adaptee.setVariable(((rover.arduinoml.adapters.arduinomlmt.arduino.IntegerVariableAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.VariableRef_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariableRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		return getVariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE_REF__VARIABLE:
    		setVariable(
    		(rover.arduinomlmt.arduino.IntegerVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
