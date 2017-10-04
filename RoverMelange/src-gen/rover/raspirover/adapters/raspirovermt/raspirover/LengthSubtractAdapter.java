package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.LengthSubtract;
import rover.raspirovermt.raspirover.Quantity;

@SuppressWarnings("all")
public class LengthSubtractAdapter extends EObjectAdapter<LengthSubtract> implements rover.raspirovermt.raspirover.LengthSubtract {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public LengthSubtractAdapter() {
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
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getLengthSubtract();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__LHS:
    		return getLhs();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__LHS:
    		return getLhs() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__LHS:
    		setLhs(
    		(rover.raspirovermt.raspirover.Quantity)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__RHS:
    		setRhs(
    		(rover.raspirovermt.raspirover.Quantity)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.QuantityHomogenousOperation.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__LHS:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__RHS:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.QuantityHomogenousOperation.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__LHS;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.LENGTH_SUBTRACT__RHS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
