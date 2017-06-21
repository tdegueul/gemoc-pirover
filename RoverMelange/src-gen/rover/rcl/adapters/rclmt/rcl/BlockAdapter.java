package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.Block;
import rover.rclmt.rcl.RoverProgram;
import rover.rclmt.rcl.Statement;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements rover.rclmt.rcl.Block {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public rover.rclmt.rcl.Block getEnclosing() {
    return (rover.rclmt.rcl.Block) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final rover.rclmt.rcl.Block o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.rcl.adapters.rclmt.rcl.BlockAdapter) o).getAdaptee());
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
    rover.rcl.aspects.BlockAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BLOCK__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.BLOCK__STMTS:
    		return getStmts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BLOCK__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.BLOCK__STMTS:
    		return getStmts() != null && !getStmts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BLOCK__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.BLOCK__STMTS:
    		getStmts().clear();
    		getStmts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
