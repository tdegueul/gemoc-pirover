package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.DigitalPin;
import rover.raspirovermt.raspirover.ArduinoDigitalModule;

@SuppressWarnings("all")
public class DigitalPinAdapter extends EObjectAdapter<DigitalPin> implements rover.raspirovermt.raspirover.DigitalPin {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public DigitalPinAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
    	adaptee.setModule(((rover.raspirover.adapters.raspirovermt.raspirover.ArduinoDigitalModuleAdapter) o).getAdaptee());
    else adaptee.setModule(null);
  }
  
  @Override
  public int getLevel() {
    return rover.raspirover.aspects.Pin_EvaluableAspect.level(adaptee);
  }
  
  @Override
  public void setLevel(final int level) {
    rover.raspirover.aspects.Pin_EvaluableAspect.level(adaptee, level
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int LEVEL_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getDigitalPin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__LEVEL:
    		return new java.lang.Integer(getLevel());
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__MODULE:
    		return getModule();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__LEVEL:
    		return getLevel() != LEVEL_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__MODULE:
    		return getModule() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__LEVEL:
    		setLevel(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.DIGITAL_PIN__MODULE:
    		setModule(
    		(rover.raspirovermt.raspirover.ArduinoDigitalModule)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
