package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.BooleanExpression;
import rover.rclmt.rcl.BooleanOperator;
import rover.rclmt.rcl.BooleanValue;

@SuppressWarnings("all")
public class BooleanExpressionAdapter extends EObjectAdapter<BooleanExpression> implements rover.rclmt.rcl.BooleanExpression {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public BooleanExpressionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanOperator getOp() {
    return rover.rclmt.rcl.BooleanOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final BooleanOperator o) {
    adaptee.setOp(rover.rcl.rcl.BooleanOperator.get(o.getValue()));
  }
  
  @Override
  public BooleanValue getLhs() {
    return (BooleanValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final BooleanValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public BooleanValue getRhs() {
    return (BooleanValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final BooleanValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.rcl.adapters.rclmt.rcl.BooleanValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.rcl.aspects.BooleanExpressionASpect.eval(adaptee);
  }
  
  protected final static BooleanOperator OP_EDEFAULT = rover.rclmt.rcl.BooleanOperator.EQ;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__LHS:
    		return getLhs();
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__RHS:
    		return getRhs();
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__LHS:
    		setLhs(
    		(rover.rclmt.rcl.BooleanValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__RHS:
    		setRhs(
    		(rover.rclmt.rcl.BooleanValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.BOOLEAN_EXPRESSION__OP:
    		setOp(
    		(rover.rclmt.rcl.BooleanOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
