package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.LED;
import rover.arduinomlmt.arduino.Color;

@SuppressWarnings("all")
public class LEDAdapter extends EObjectAdapter<LED> implements rover.arduinomlmt.arduino.LED {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public LEDAdapter() {
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
  public Color getColor() {
    return rover.arduinomlmt.arduino.Color.get(adaptee.getColor().getValue());
  }
  
  @Override
  public void setColor(final Color o) {
    adaptee.setColor(rover.arduinoml.arduino.Color.get(o.getValue()));
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Color COLOR_EDEFAULT = rover.arduinomlmt.arduino.Color.BLUE;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getLED();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__COLOR:
    		return getColor() != COLOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.LED__COLOR:
    		setColor(
    		(rover.arduinomlmt.arduino.Color)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
