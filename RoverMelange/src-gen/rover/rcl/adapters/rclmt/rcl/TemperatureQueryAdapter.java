package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.TemperatureQuery;

@SuppressWarnings("all")
public class TemperatureQueryAdapter extends EObjectAdapter<TemperatureQuery> implements rover.rclmt.rcl.TemperatureQuery {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public TemperatureQueryAdapter() {
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
    return rover.rcl.aspects.TemperatureQueryAspect.getIntValue(adaptee);
  }
  
  @Override
  public String print() {
    return rover.rcl.aspects.NumberValueAspect.print(adaptee);
  }
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getTemperatureQuery();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TEMPERATURE_QUERY__NVALUE:
    		return new java.lang.Integer(getNValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TEMPERATURE_QUERY__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TEMPERATURE_QUERY__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
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
    if (baseClass == rover.rclmt.rcl.NumberValue.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.TEMPERATURE_QUERY__NVALUE:
    			return rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE;
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
    if (baseClass == rover.rclmt.rcl.NumberValue.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE:
    			return rover.rclmt.rcl.RclPackage.TEMPERATURE_QUERY__NVALUE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
