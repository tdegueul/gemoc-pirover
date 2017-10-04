package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.QuantityScalarOperation;
import rover.unitsmt.units.NumericValue;
import rover.unitsmt.units.Quantity;

@SuppressWarnings("all")
public class QuantityScalarOperationAdapter extends EObjectAdapter<QuantityScalarOperation> implements rover.unitsmt.units.QuantityScalarOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public QuantityScalarOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Quantity getLhs() {
    return (Quantity) adaptersFactory.createAdapter(adaptee.getLhs(), eResource);
  }
  
  @Override
  public void setLhs(final Quantity o) {
    if (o != null)
    	adaptee.setLhs(((rover.units.adapters.unitsmt.units.QuantityAdapter) o).getAdaptee());
    else adaptee.setLhs(null);
  }
  
  @Override
  public NumericValue getRhs() {
    return (NumericValue) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final NumericValue o) {
    if (o != null)
    	adaptee.setRhs(((rover.units.adapters.unitsmt.units.NumericValueAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getQuantityScalarOperation();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__LHS:
    		return getLhs();
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__LHS:
    		return getLhs() != null;
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__LHS:
    		setLhs(
    		(rover.unitsmt.units.Quantity)
    		 newValue);
    		return;
    	case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__RHS:
    		setRhs(
    		(rover.unitsmt.units.NumericValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
