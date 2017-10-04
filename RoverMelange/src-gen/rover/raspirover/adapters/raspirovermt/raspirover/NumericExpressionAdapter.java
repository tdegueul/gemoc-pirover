package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.NumericExpression;
import rover.raspirovermt.raspirover.NumberValue;
import rover.raspirovermt.raspirover.NumericOperator;

@SuppressWarnings("all")
public class NumericExpressionAdapter extends EObjectAdapter<NumericExpression> implements rover.raspirovermt.raspirover.NumericExpression {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public NumericExpressionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public NumericOperator getOp() {
    return rover.raspirovermt.raspirover.NumericOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final NumericOperator o) {
    adaptee.setOp(rover.raspirover.raspirover.NumericOperator.get(o.getValue()));
  }
  
  @Override
  public NumberValue getLhs() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final NumberValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public NumberValue getRhs() {
    return (NumberValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final NumberValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.raspirover.adapters.raspirovermt.raspirover.NumberValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.raspirover.aspects.NumericExpressionASpect.eval(adaptee);
  }
  
  protected final static NumericOperator OP_EDEFAULT = rover.raspirovermt.raspirover.NumericOperator.LT;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getNumericExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__LHS:
    		return getLhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__RHS:
    		return getRhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__LHS:
    		setLhs(
    		(rover.raspirovermt.raspirover.NumberValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__RHS:
    		setRhs(
    		(rover.raspirovermt.raspirover.NumberValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMERIC_EXPRESSION__OP:
    		setOp(
    		(rover.raspirovermt.raspirover.NumericOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
