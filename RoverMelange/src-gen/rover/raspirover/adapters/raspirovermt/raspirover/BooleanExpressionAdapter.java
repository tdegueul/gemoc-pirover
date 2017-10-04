package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.BooleanExpression;
import rover.raspirovermt.raspirover.BooleanOperator;
import rover.raspirovermt.raspirover.BooleanValue;

@SuppressWarnings("all")
public class BooleanExpressionAdapter extends EObjectAdapter<BooleanExpression> implements rover.raspirovermt.raspirover.BooleanExpression {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public BooleanExpressionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanOperator getOp() {
    return rover.raspirovermt.raspirover.BooleanOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final BooleanOperator o) {
    adaptee.setOp(rover.raspirover.raspirover.BooleanOperator.get(o.getValue()));
  }
  
  @Override
  public BooleanValue getLhs() {
    return (BooleanValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final BooleanValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public BooleanValue getRhs() {
    return (BooleanValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final BooleanValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.raspirover.adapters.raspirovermt.raspirover.BooleanValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.raspirover.aspects.BooleanExpressionASpect.eval(adaptee);
  }
  
  protected final static BooleanOperator OP_EDEFAULT = rover.raspirovermt.raspirover.BooleanOperator.EQ;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getBooleanExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__LHS:
    		return getLhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__RHS:
    		return getRhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__LHS:
    		setLhs(
    		(rover.raspirovermt.raspirover.BooleanValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__RHS:
    		setRhs(
    		(rover.raspirovermt.raspirover.BooleanValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BOOLEAN_EXPRESSION__OP:
    		setOp(
    		(rover.raspirovermt.raspirover.BooleanOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
