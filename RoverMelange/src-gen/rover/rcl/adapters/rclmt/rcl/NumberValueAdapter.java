package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.NumberValue;

@SuppressWarnings("all")
public class NumberValueAdapter extends EObjectAdapter<NumberValue> implements rover.rclmt.rcl.NumberValue {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public NumberValueAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getNValue() {
    return adaptee.getNValue();
  }
  
  @Override
  public void setNValue(final int o) {
    adaptee.setNValue(o);
  }
  
  @Override
  public int getIntValue() {
    return rover.rcl.aspects.NumberValueAspect.getIntValue(adaptee);
  }
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getNumberValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE:
    		return new java.lang.Integer(getNValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
