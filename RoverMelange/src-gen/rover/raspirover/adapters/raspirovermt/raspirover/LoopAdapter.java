package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Loop;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverExpression;
import rover.raspirovermt.raspirover.RoverProgram;

@SuppressWarnings("all")
public class LoopAdapter extends EObjectAdapter<Loop> implements rover.raspirovermt.raspirover.Loop {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public LoopAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
  public RoverExpression getExpr() {
    return (RoverExpression) adaptersFactory.createAdapter(adaptee.getExpr(), eResource);
  }
  
  @Override
  public void setExpr(final RoverExpression o) {
    if (o != null)
    	adaptee.setExpr(((rover.raspirover.adapters.raspirovermt.raspirover.RoverExpressionAdapter) o).getAdaptee());
    else adaptee.setExpr(null);
  }
  
  @Override
  public RclBlock getBlock() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final RclBlock o) {
    if (o != null)
    	adaptee.setBlock(((rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void eval() {
    rover.raspirover.aspects.LoopAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getLoop();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__EXPR:
    		return getExpr();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__EXPR:
    		return getExpr() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__EXPR:
    		setExpr(
    		(rover.raspirovermt.raspirover.RoverExpression)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LOOP__BLOCK:
    		setBlock(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
