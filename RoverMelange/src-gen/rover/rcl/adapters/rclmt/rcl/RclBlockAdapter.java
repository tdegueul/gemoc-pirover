package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.RclBlock;
import rover.rclmt.rcl.RoverProgram;
import rover.rclmt.rcl.Statement;

@SuppressWarnings("all")
public class RclBlockAdapter extends EObjectAdapter<RclBlock> implements rover.rclmt.rcl.RclBlock {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public RclBlockAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public rover.rclmt.rcl.RclBlock getEnclosing() {
    return (rover.rclmt.rcl.RclBlock) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final rover.rclmt.rcl.RclBlock o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  private EList<Statement> stmts_;
  
  @Override
  public EList<Statement> getStmts() {
    if (stmts_ == null)
    	stmts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStmts(), adaptersFactory, eResource);
    return stmts_;
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.RclBlockAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getRclBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__STMTS:
    		return getStmts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__STMTS:
    		return getStmts() != null && !getStmts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.RCL_BLOCK__STMTS:
    		getStmts().clear();
    		getStmts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
