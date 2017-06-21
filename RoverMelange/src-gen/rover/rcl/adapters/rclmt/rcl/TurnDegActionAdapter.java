package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.TurnDegAction;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class TurnDegActionAdapter extends EObjectAdapter<TurnDegAction> implements rover.rclmt.rcl.TurnDegAction {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public TurnDegActionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getDegrees() {
    return adaptee.getDegrees();
  }
  
  @Override
  public void setDegrees(final int o) {
    adaptee.setDegrees(o);
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
    rover.rcl.aspects.TurnDegActionAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static int DEGREES_EDEFAULT = 0;
  
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
    		return new java.lang.Integer(getDegrees());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__DEGREES:
    		return getDegrees() != DEGREES_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.TURN_DEG_ACTION__DEGREES:
    		setDegrees(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
