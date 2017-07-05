package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.QuantityHomogenousOperation;
import rover.raspirovermt.raspirover.Quantity;

@SuppressWarnings("all")
public class QuantityHomogenousOperationAdapter extends EObjectAdapter<QuantityHomogenousOperation> implements rover.raspirovermt.raspirover.QuantityHomogenousOperation {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public QuantityHomogenousOperationAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Quantity getLhs() {
    return (Quantity) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final Quantity o) {
    if (o != null)
    	adaptee.setLhs(((rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public Quantity getRhs() {
    return (Quantity) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final Quantity o) {
    if (o != null)
    	adaptee.setRhs(((rover.raspirover.adapters.raspirovermt.raspirover.QuantityAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getQuantityHomogenousOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
    		return getLhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
    		return getLhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
    		setLhs(
    		(rover.raspirovermt.raspirover.Quantity)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
    		setRhs(
    		(rover.raspirovermt.raspirover.Quantity)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
