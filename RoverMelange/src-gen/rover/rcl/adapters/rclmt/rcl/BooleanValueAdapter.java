package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAdapter extends EObjectAdapter<BooleanValue> implements rover.rclmt.rcl.BooleanValue {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public BooleanValueAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isBValue() {
    return adaptee.isBValue();
  }
  
  @Override
  public void setBValue(final boolean o) {
    adaptee.setBValue(o);
  }
  
  @Override
  public boolean getBooleanValue() {
    return rover.rcl.aspects.BooleanValueAspect.getBooleanValue(adaptee);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getBooleanValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_VALUE__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_VALUE__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_VALUE__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
