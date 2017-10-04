package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.Quantity;
import rover.unitsmt.units.NumericValue;
import rover.unitsmt.units.Unit;

@SuppressWarnings("all")
public class QuantityAdapter extends EObjectAdapter<Quantity> implements rover.unitsmt.units.Quantity {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public QuantityAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Unit getUnit() {
    return (Unit) adaptersFactory.createAdapter(adaptee.getUnit(), eResource);
  }
  
  @Override
  public void setUnit(final Unit o) {
    if (o != null)
    	adaptee.setUnit(((rover.units.adapters.unitsmt.units.UnitAdapter) o).getAdaptee());
    else adaptee.setUnit(null);
  }
  
  @Override
  public NumericValue getValue() {
    return (NumericValue) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final NumericValue o) {
    if (o != null)
    	adaptee.setValue(((rover.units.adapters.unitsmt.units.NumericValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getQuantity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__UNIT:
    		return getUnit();
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__UNIT:
    		return getUnit() != null;
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__UNIT:
    		setUnit(
    		(rover.unitsmt.units.Unit)
    		 newValue);
    		return;
    	case rover.unitsmt.units.UnitsPackage.QUANTITY__VALUE:
    		setValue(
    		(rover.unitsmt.units.NumericValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
