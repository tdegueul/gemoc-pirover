package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Pin;

@SuppressWarnings("all")
public class PinAdapter extends EObjectAdapter<Pin> implements rover.raspirovermt.raspirover.Pin {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public PinAdapter() {
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
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getPin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__LEVEL:
    		return new java.lang.Integer(getLevel());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__LEVEL:
    		return getLevel() != LEVEL_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PIN__LEVEL:
    		setLevel(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
