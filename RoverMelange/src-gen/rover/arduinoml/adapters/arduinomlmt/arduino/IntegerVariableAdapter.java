package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.IntegerVariable;

@SuppressWarnings("all")
public class IntegerVariableAdapter extends EObjectAdapter<IntegerVariable> implements rover.arduinomlmt.arduino.IntegerVariable {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public IntegerVariableAdapter() {
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
  public int getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final int o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.IntegerVariable_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public Integer getValue() {
    return rover.arduinoml.aspects.IntegerVariable_EvaluableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final Integer value) {
    rover.arduinoml.aspects.IntegerVariable_EvaluableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int INITIAL_VALUE_EDEFAULT = 0;
  
  protected final static Integer VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getIntegerVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return new java.lang.Integer(getInitialValue());
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.INTEGER_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Integer)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
