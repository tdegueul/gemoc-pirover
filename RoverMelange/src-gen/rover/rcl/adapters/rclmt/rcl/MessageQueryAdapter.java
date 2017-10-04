package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.MessageQuery;

@SuppressWarnings("all")
public class MessageQueryAdapter extends EObjectAdapter<MessageQuery> implements rover.rclmt.rcl.MessageQuery {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public MessageQueryAdapter() {
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
    return rover.rcl.aspects.MessageQueryAspect.getStringValue(adaptee);
  }
  
  protected final static String SVALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getMessageQuery();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.MESSAGE_QUERY__SVALUE:
    		return getSValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.MESSAGE_QUERY__SVALUE:
    		return getSValue() != SVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.MESSAGE_QUERY__SVALUE:
    		setSValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.rclmt.rcl.RoverValue.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.StringValue.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.MESSAGE_QUERY__SVALUE:
    			return rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.rclmt.rcl.RoverValue.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.StringValue.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE:
    			return rover.rclmt.rcl.RclPackage.MESSAGE_QUERY__SVALUE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
