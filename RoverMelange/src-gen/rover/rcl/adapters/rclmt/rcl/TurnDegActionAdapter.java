package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.TurnDegAction;
import rover.rclmt.rcl.NumberValue;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class TurnDegActionAdapter extends EObjectAdapter<TurnDegAction> implements rover.rclmt.rcl.TurnDegAction {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public TurnDegActionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public RclBlock getEnclosing() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final RclBlock o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  @Override
  public NumberValue getDegrees() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getDegrees(), eResource);
  }
  
  @Override
  public void setDegrees(final NumberValue o) {
    if (o != null)
    	adaptee.setDegrees(((rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) o).getAdaptee());
    else adaptee.setDegrees(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.TurnDegActionAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getTurnDegAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__DEGREES:
    		return getDegrees();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__DEGREES:
    		return getDegrees() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__DEGREES:
    		setDegrees(
    		(rover.rclmt.rcl.NumberValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
