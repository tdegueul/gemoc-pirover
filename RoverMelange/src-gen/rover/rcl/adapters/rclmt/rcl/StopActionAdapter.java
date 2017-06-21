package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.StopAction;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class StopActionAdapter extends EObjectAdapter<StopAction> implements rover.rclmt.rcl.StopAction {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public StopActionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Block getEnclosing() {
    return (Block) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final Block o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.rcl.adapters.rclmt.rcl.BlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.StopActionAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getStopAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STOP_ACTION__ENCLOSING:
    		return getEnclosing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STOP_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STOP_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
