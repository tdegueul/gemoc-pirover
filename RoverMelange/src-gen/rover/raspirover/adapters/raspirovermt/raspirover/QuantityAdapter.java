package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Quantity;
import rover.raspirovermt.raspirover.NumericValue;
import rover.raspirovermt.raspirover.Unit;

@SuppressWarnings("all")
public class QuantityAdapter extends EObjectAdapter<Quantity> implements rover.raspirovermt.raspirover.Quantity {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public QuantityAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Unit getUnit() {
    return (Unit) adaptersFactory.createAdapter(adaptee.getUnit(), eResource);
  }
  
  @Override
  public void setUnit(final Unit o) {
    if (o != null)
    	adaptee.setUnit(((rover.raspirover.adapters.raspirovermt.raspirover.UnitAdapter) o).getAdaptee());
    else adaptee.setUnit(null);
  }
  
  @Override
  public NumericValue getValue() {
    return (NumericValue) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final NumericValue o) {
    if (o != null)
    	adaptee.setValue(((rover.raspirover.adapters.raspirovermt.raspirover.NumericValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getQuantity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__UNIT:
    		return getUnit();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__UNIT:
    		return getUnit() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__UNIT:
    		setUnit(
    		(rover.raspirovermt.raspirover.Unit)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.QUANTITY__VALUE:
    		setValue(
    		(rover.raspirovermt.raspirover.NumericValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
