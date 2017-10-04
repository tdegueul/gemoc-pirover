package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.StringExpression;
import rover.rclmt.rcl.StringOperator;
import rover.rclmt.rcl.StringValue;

@SuppressWarnings("all")
public class StringExpressionAdapter extends EObjectAdapter<StringExpression> implements rover.rclmt.rcl.StringExpression {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public StringExpressionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public StringOperator getOp() {
    return rover.rclmt.rcl.StringOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final StringOperator o) {
    adaptee.setOp(rover.rcl.rcl.StringOperator.get(o.getValue()));
  }
  
  @Override
  public StringValue getLhs() {
    return (StringValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final StringValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.rcl.adapters.rclmt.rcl.StringValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public StringValue getRhs() {
    return (StringValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final StringValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.rcl.adapters.rclmt.rcl.StringValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.rcl.aspects.StringExpressionASpect.eval(adaptee);
  }
  
  protected final static StringOperator OP_EDEFAULT = rover.rclmt.rcl.StringOperator.EQ;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getStringExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__LHS:
    		return getLhs();
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__RHS:
    		return getRhs();
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__LHS:
    		setLhs(
    		(rover.rclmt.rcl.StringValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__RHS:
    		setRhs(
    		(rover.rclmt.rcl.StringValue)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.STRING_EXPRESSION__OP:
    		setOp(
    		(rover.rclmt.rcl.StringOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
