package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Delay;
import rover.arduinomlmt.arduino.Time;

@SuppressWarnings("all")
public class DelayAdapter extends EObjectAdapter<Delay> implements rover.arduinomlmt.arduino.Delay {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public DelayAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Time getUnit() {
    return rover.arduinomlmt.arduino.Time.get(adaptee.getUnit().getValue());
  }
  
  @Override
  public void setUnit(final Time o) {
    adaptee.setUnit(rover.arduinoml.arduino.Time.get(o.getValue()));
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
  public void execute() {
    rover.arduinoml.aspects.Delay_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.arduinoml.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  protected final static Time UNIT_EDEFAULT = rover.arduinomlmt.arduino.Time.MILLI_SECOND;
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getDelay();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit();
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__UNIT:
    		return getUnit() != UNIT_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__UNIT:
    		setUnit(
    		(rover.arduinomlmt.arduino.Time)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DELAY__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
