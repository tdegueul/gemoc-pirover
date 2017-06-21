package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.ForwardMinAction;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class ForwardMinActionAdapter extends EObjectAdapter<ForwardMinAction> implements rover.rclmt.rcl.ForwardMinAction {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public ForwardMinActionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getDuration() {
    return adaptee.getDuration();
  }
  
  @Override
  public void setDuration(final int o) {
    adaptee.setDuration(o);
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
    rover.rcl.aspects.ForwardMinActionAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static int DURATION_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getForwardMinAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DURATION:
    		return new java.lang.Integer(getDuration());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DURATION:
    		return getDuration() != DURATION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.FORWARD_MIN_ACTION__DURATION:
    		setDuration(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
