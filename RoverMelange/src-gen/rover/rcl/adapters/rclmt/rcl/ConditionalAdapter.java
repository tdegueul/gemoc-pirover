package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.Conditional;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverExpression;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class ConditionalAdapter extends EObjectAdapter<Conditional> implements rover.rclmt.rcl.Conditional {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public ConditionalAdapter() {
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
  public RclBlock getCondTrue() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getCondTrue(), eResource);
  }
  
  @Override
  public void setCondTrue(final RclBlock o) {
    if (o != null)
    	adaptee.setCondTrue(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setCondTrue(null);
  }
  
  @Override
  public RclBlock getCondFalse() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getCondFalse(), eResource);
  }
  
  @Override
  public void setCondFalse(final RclBlock o) {
    if (o != null)
    	adaptee.setCondFalse(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setCondFalse(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.ConditionalAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getConditional();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__EXPR:
    		return getExpr();
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_TRUE:
    		return getCondTrue();
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_FALSE:
    		return getCondFalse();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__EXPR:
    		return getExpr() != null;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_TRUE:
    		return getCondTrue() != null;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_FALSE:
    		return getCondFalse() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__EXPR:
    		setExpr(
    		(rover.rclmt.rcl.RoverExpression)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_TRUE:
    		setCondTrue(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.CONDITIONAL__COND_FALSE:
    		setCondFalse(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
