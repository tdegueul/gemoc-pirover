package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.LogAction;
import rover.raspirovermt.raspirover.Pin;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;

@SuppressWarnings("all")
public class LogActionAdapter extends EObjectAdapter<LogAction> implements rover.raspirovermt.raspirover.LogAction {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public LogActionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getMessage() {
    return adaptee.getMessage();
  }
  
  @Override
  public void setMessage(final String o) {
    adaptee.setMessage(o);
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
  public void eval() {
    rover.raspirover.aspects.LogActionAspect.eval(adaptee);
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
  
  protected final static String MESSAGE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getLogAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ASSOCIATED_PIN:
    		return getAssociatedPin();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__MESSAGE:
    		return getMessage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ASSOCIATED_PIN:
    		return getAssociatedPin() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__MESSAGE:
    		return getMessage() != MESSAGE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__ASSOCIATED_PIN:
    		setAssociatedPin(
    		(rover.raspirovermt.raspirover.Pin)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOG_ACTION__MESSAGE:
    		setMessage(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
