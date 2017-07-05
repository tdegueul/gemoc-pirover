package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.ArduinoBoard;
import rover.arduinomlmt.arduino.AnalogPin;
import rover.arduinomlmt.arduino.DigitalPin;
import rover.arduinomlmt.arduino.Project;

@SuppressWarnings("all")
public class ArduinoBoardAdapter extends EObjectAdapter<ArduinoBoard> implements rover.arduinomlmt.arduino.ArduinoBoard {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public ArduinoBoardAdapter() {
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
  public Project getProject() {
    return (Project) adaptersFactory.createAdapter(adaptee.getProject(), eResource);
  }
  
  @Override
  public void setProject(final Project o) {
    if (o != null)
    	adaptee.setProject(((rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter) o).getAdaptee());
    else adaptee.setProject(null);
  }
  
  private EList<DigitalPin> digitalPins_;
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    if (digitalPins_ == null)
    	digitalPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory, eResource);
    return digitalPins_;
  }
  
  private EList<AnalogPin> analogPins_;
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    if (analogPins_ == null)
    	analogPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory, eResource);
    return analogPins_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getArduinoBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject();
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins();
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		return getProject() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		return getDigitalPins() != null && !getDigitalPins().isEmpty();
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		return getAnalogPins() != null && !getAnalogPins().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__PROJECT:
    		setProject(
    		(rover.arduinomlmt.arduino.Project)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection) newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.ARDUINO_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
