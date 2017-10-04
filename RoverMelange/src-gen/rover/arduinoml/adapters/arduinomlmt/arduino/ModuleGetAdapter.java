package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.ModuleGet;
import rover.arduinomlmt.arduino.Module;

@SuppressWarnings("all")
public class ModuleGetAdapter extends EObjectAdapter<ModuleGet> implements rover.arduinomlmt.arduino.ModuleGet {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public ModuleGetAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Module getModule() {
    return (Module) adaptersFactory.createAdapter(adaptee.getModule(), eResource);
  }
  
  @Override
  public void setModule(final Module o) {
    if (o != null)
    	adaptee.setModule(((rover.arduinoml.adapters.arduinomlmt.arduino.ModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }
  
  @Override
  public Object evaluate() {
    return rover.arduinoml.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getModuleGet();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.MODULE_GET__MODULE:
    		setModule(
    		(rover.arduinomlmt.arduino.Module)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
