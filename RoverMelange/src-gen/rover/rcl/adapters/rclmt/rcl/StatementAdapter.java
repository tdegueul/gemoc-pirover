package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.Statement;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class StatementAdapter extends EObjectAdapter<Statement> implements rover.rclmt.rcl.Statement {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public StatementAdapter() {
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
    rover.rcl.aspects.StatementAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STATEMENT__ENCLOSING:
    		return getEnclosing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STATEMENT__ENCLOSING:
    		return getEnclosing() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STATEMENT__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
