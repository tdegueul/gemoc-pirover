package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.StringExpression;
import rover.raspirovermt.raspirover.StringOperator;
import rover.raspirovermt.raspirover.StringValue;

@SuppressWarnings("all")
public class StringExpressionAdapter extends EObjectAdapter<StringExpression> implements rover.raspirovermt.raspirover.StringExpression {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public StringExpressionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public StringOperator getOp() {
    return rover.raspirovermt.raspirover.StringOperator.get(adaptee.getOp().getValue());
  }
  
  @Override
  public void setOp(final StringOperator o) {
    adaptee.setOp(rover.raspirover.raspirover.StringOperator.get(o.getValue()));
  }
  
  @Override
  public StringValue getLhs() {
    return (StringValue) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final StringValue o) {
    if (o != null)
    	adaptee.setLhs(((rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public StringValue getRhs() {
    return (StringValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final StringValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.raspirover.adapters.raspirovermt.raspirover.StringValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public boolean eval() {
    return rover.raspirover.aspects.StringExpressionASpect.eval(adaptee);
  }
  
  protected final static StringOperator OP_EDEFAULT = rover.raspirovermt.raspirover.StringOperator.EQ;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getStringExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__LHS:
    		return getLhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__RHS:
    		return getRhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__OP:
    		return getOp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__LHS:
    		return getLhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__RHS:
    		return getRhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__LHS:
    		setLhs(
    		(rover.raspirovermt.raspirover.StringValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__RHS:
    		setRhs(
    		(rover.raspirovermt.raspirover.StringValue)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_EXPRESSION__OP:
    		setOp(
    		(rover.raspirovermt.raspirover.StringOperator)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
