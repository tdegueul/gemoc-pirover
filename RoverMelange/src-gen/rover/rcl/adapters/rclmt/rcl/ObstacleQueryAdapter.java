package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.ObstacleQuery;

@SuppressWarnings("all")
public class ObstacleQueryAdapter extends EObjectAdapter<ObstacleQuery> implements rover.rclmt.rcl.ObstacleQuery {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public ObstacleQueryAdapter() {
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
  public boolean isFront() {
    return adaptee.isFront();
  }
  
  @Override
  public void setFront(final boolean o) {
    adaptee.setFront(o);
  }
  
  @Override
  public boolean getBooleanValue() {
    return rover.rcl.aspects.ObstacleQueryAspect.getBooleanValue(adaptee);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  protected final static boolean FRONT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getObstacleQuery();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__FRONT:
    		return isFront() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__FRONT:
    		return isFront() != FRONT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__FRONT:
    		setFront(((java.lang.Boolean) newValue).booleanValue());
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
    if (baseClass == rover.rclmt.rcl.BooleanValue.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__BVALUE:
    			return rover.rclmt.rcl.RclPackage.BOOLEAN_VALUE__BVALUE;
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
    if (baseClass == rover.rclmt.rcl.BooleanValue.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.BOOLEAN_VALUE__BVALUE:
    			return rover.rclmt.rcl.RclPackage.OBSTACLE_QUERY__BVALUE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
