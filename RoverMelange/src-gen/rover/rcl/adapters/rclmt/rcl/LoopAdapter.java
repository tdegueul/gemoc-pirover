package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.Loop;
import rover.rclmt.rcl.Block;
import rover.rclmt.rcl.RoverExpression;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class LoopAdapter extends EObjectAdapter<Loop> implements rover.rclmt.rcl.Loop {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public LoopAdapter() {
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
  public RoverExpression getExpr() {
    return (RoverExpression) adaptersFactory.createAdapter(adaptee.getExpr(), eResource);
  }
  
  @Override
  public void setExpr(final RoverExpression o) {
    if (o != null)
    	adaptee.setExpr(((rover.rcl.adapters.rclmt.rcl.RoverExpressionAdapter) o).getAdaptee());
    else adaptee.setExpr(null);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((rover.rcl.adapters.rclmt.rcl.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.LoopAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getLoop();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.LOOP__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.LOOP__EXPR:
    		return getExpr();
    	case rover.rclmt.rcl.RclPackage.LOOP__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.LOOP__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.LOOP__EXPR:
    		return getExpr() != null;
    	case rover.rclmt.rcl.RclPackage.LOOP__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.LOOP__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.LOOP__EXPR:
    		setExpr(
    		(rover.rclmt.rcl.RoverExpression)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.LOOP__BLOCK:
    		setBlock(
    		(rover.rclmt.rcl.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
