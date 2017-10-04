package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements rover.arduinomlmt.arduino.BooleanVariable {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isInitialValue() {
    return adaptee.isInitialValue();
  }
  
  @Override
  public void setInitialValue(final boolean o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.BooleanVariable_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public Boolean getValue() {
    return rover.arduinoml.aspects.BooleanVariable_EvaluableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final Boolean value) {
    rover.arduinoml.aspects.BooleanVariable_EvaluableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean INITIAL_VALUE_EDEFAULT = false;
  
  protected final static Boolean VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getBooleanVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() ? Boolean.TRUE : Boolean.FALSE;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOOLEAN_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
