package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.DigitalPin;
import rover.arduinomlmt.arduino.ArduinoDigitalModule;

@SuppressWarnings("all")
public class DigitalPinAdapter extends EObjectAdapter<DigitalPin> implements rover.arduinomlmt.arduino.DigitalPin {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public DigitalPinAdapter() {
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
  public ArduinoDigitalModule getModule() {
    return (ArduinoDigitalModule) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }
  
  @Override
  public void setModule(final ArduinoDigitalModule o) {
    if (o != null)
    	adaptee.setModule(((rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoDigitalModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }
  
  @Override
  public int getLevel() {
    return rover.arduinoml.aspects.Pin_EvaluableAspect.level(adaptee);
  }
  
  @Override
  public void setLevel(final int level) {
    rover.arduinoml.aspects.Pin_EvaluableAspect.level(adaptee, level
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int LEVEL_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getDigitalPin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__LEVEL:
    		return new java.lang.Integer(getLevel());
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__LEVEL:
    		return getLevel() != LEVEL_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__LEVEL:
    		setLevel(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.DIGITAL_PIN__MODULE:
    		setModule(
    		(rover.arduinomlmt.arduino.ArduinoDigitalModule)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
