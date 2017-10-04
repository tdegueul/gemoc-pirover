package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.IntegerConstant;

@SuppressWarnings("all")
public class IntegerConstantAdapter extends EObjectAdapter<IntegerConstant> implements rover.arduinomlmt.arduino.IntegerConstant {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public IntegerConstantAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.IntegerConstant_ExecutableAspect.evaluate(adaptee);
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getIntegerConstant();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_CONSTANT__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_CONSTANT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_CONSTANT__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
