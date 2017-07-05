package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAdapter extends EObjectAdapter<BooleanValue> implements rover.raspirovermt.raspirover.BooleanValue {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public BooleanValueAdapter() {
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
  public boolean getBooleanValue() {
    return rover.raspirover.aspects.BooleanValueAspect.getBooleanValue(adaptee);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getBooleanValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_VALUE__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_VALUE__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_VALUE__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
