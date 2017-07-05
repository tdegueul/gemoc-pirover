package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.ForwardMinAction;
import rover.rclmt.rcl.NumberValue;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class ForwardMinActionAdapter extends EObjectAdapter<ForwardMinAction> implements rover.rclmt.rcl.ForwardMinAction {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public ForwardMinActionAdapter() {
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
  public NumberValue getDistance() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getDistance(), eResource);
  }
  
  @Override
  public void setDistance(final NumberValue o) {
    if (o != null)
    	adaptee.setDistance(((rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) o).getAdaptee());
    else adaptee.setDistance(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.ForwardMinActionAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getForwardMinAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DISTANCE:
    		return getDistance();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DISTANCE:
    		return getDistance() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DISTANCE:
    		setDistance(
    		(rover.rclmt.rcl.NumberValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
