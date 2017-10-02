package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.StringValue;

@SuppressWarnings("all")
public class StringValueAdapter extends EObjectAdapter<StringValue> implements rover.raspirovermt.raspirover.StringValue {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public StringValueAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
    return rover.raspirover.aspects.StringValueAspect.getStringValue(adaptee);
  }
  
  protected final static String SVALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getStringValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_VALUE__SVALUE:
    		return getSValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_VALUE__SVALUE:
    		return getSValue() != SVALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_VALUE__SVALUE:
    		setSValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
