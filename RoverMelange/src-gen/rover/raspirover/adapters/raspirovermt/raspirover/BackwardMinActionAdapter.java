package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirovermt.raspirover.NumberValue;
import rover.raspirovermt.raspirover.Pin;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;

@SuppressWarnings("all")
public class BackwardMinActionAdapter extends EObjectAdapter<BackwardMinAction> implements rover.raspirovermt.raspirover.BackwardMinAction {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public BackwardMinActionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public RclBlock getEnclosing() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final RclBlock o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  @Override
  public NumberValue getDistance() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getDistance(), eResource);
  }
  
  @Override
  public void setDistance(final NumberValue o) {
    if (o != null)
    	adaptee.setDistance(((rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter) o).getAdaptee());
    else adaptee.setDistance(null);
  }
  
  @Override
  public void eval() {
    rover.raspirover.aspects.BackwardMinActionWithPin.eval(adaptee);
  }
  
  @Override
  public Pin getAssociatedPin() {
    return (Pin) adaptersFactory.createAdapter(rover.raspirover.aspects.ActionToPin.associatedPin(adaptee), eResource);
  }
  
  @Override
  public void setAssociatedPin(final Pin associatedPin) {
    rover.raspirover.aspects.ActionToPin.associatedPin(adaptee, (rover.raspirover.raspirover.Pin)((EObjectAdapter)associatedPin).getAdaptee()
    );
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getBackwardMinAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ASSOCIATED_PIN:
    		return getAssociatedPin();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__DISTANCE:
    		return getDistance();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ASSOCIATED_PIN:
    		return getAssociatedPin() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__DISTANCE:
    		return getDistance() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__ASSOCIATED_PIN:
    		setAssociatedPin(
    		(rover.raspirovermt.raspirover.Pin)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BACKWARD_MIN_ACTION__DISTANCE:
    		setDistance(
    		(rover.raspirovermt.raspirover.NumberValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
