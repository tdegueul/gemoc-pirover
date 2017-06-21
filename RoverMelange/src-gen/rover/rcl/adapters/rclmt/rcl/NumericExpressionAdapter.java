package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.NumericExpression;
import rover.rclmt.rcl.NumberValue;
import rover.rclmt.rcl.NumericOperator;

@SuppressWarnings("all")
public class NumericExpressionAdapter extends EObjectAdapter<NumericExpression> implements rover.rclmt.rcl.NumericExpression {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public NumericExpressionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public NumericOperator getOp() {
    return rover.rclmt.rcl.NumericOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final NumericOperator o) {
    adaptee.setOp(rover.rcl.rcl.NumericOperator.get(o.getValue()));
  }
  
  @Override
  public NumberValue getLhs() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final NumberValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public NumberValue getRhs() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final NumberValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.rcl.adapters.rclmt.rcl.NumberValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.rcl.aspects.NumericExpressionASpect.eval(adaptee);
  }
  
  protected final static NumericOperator OP_EDEFAULT = rover.rclmt.rcl.NumericOperator.LT;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getNumericExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__LHS:
    		return getLhs();
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__RHS:
    		return getRhs();
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__LHS:
    		setLhs(
    		(rover.rclmt.rcl.NumberValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__RHS:
    		setRhs(
    		(rover.rclmt.rcl.NumberValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.NUMERIC_EXPRESSION__OP:
    		setOp(
    		(rover.rclmt.rcl.NumericOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
