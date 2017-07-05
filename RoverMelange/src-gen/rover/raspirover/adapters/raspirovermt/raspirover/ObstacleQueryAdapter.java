package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.ObstacleQuery;

@SuppressWarnings("all")
public class ObstacleQueryAdapter extends EObjectAdapter<ObstacleQuery> implements rover.raspirovermt.raspirover.ObstacleQuery {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public ObstacleQueryAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
    return rover.raspirover.aspects.ObstacleQueryAspect.getBooleanValue(adaptee);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  protected final static boolean FRONT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getObstacleQuery();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__FRONT:
    		return isFront() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__FRONT:
    		return isFront() != FRONT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__FRONT:
    		setFront(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.RoverValue.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.BooleanValue.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__BVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_VALUE__BVALUE;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.RoverValue.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.BooleanValue.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_VALUE__BVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.OBSTACLE_QUERY__BVALUE;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
