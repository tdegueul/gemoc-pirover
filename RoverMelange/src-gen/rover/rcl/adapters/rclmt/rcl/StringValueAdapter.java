package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.StringValue;

@SuppressWarnings("all")
public class StringValueAdapter extends EObjectAdapter<StringValue> implements rover.rclmt.rcl.StringValue {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public StringValueAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getSValue() {
    return adaptee.getSValue();
  }
  
  @Override
  public void setSValue(final String o) {
    adaptee.setSValue(o);
  }
  
  @Override
  public String getStringValue() {
    return rover.rcl.aspects.StringValueAspect.getStringValue(adaptee);
  }
  
  protected final static String SVALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getStringValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE:
    		return getSValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE:
    		return getSValue() != SVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE:
    		setSValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
