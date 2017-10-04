package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.LengthDistinct;
import rover.unitsmt.units.Quantity;

@SuppressWarnings("all")
public class LengthDistinctAdapter extends EObjectAdapter<LengthDistinct> implements rover.unitsmt.units.LengthDistinct {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public LengthDistinctAdapter() {
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
  public Quantity getRhs() {
    return (Quantity) adaptersFactory.createAdapter(adaptee.getRhs(), eResource);
  }
  
  @Override
  public void setRhs(final Quantity o) {
    if (o != null)
    	adaptee.setRhs(((rover.units.adapters.unitsmt.units.QuantityAdapter) o).getAdaptee());
    else adaptee.setRhs(null);
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getLengthDistinct();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__LHS:
    		return getLhs();
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__LHS:
    		return getLhs() != null;
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__LHS:
    		setLhs(
    		(rover.unitsmt.units.Quantity)
    		 newValue);
    		return;
    	case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__RHS:
    		setRhs(
    		(rover.unitsmt.units.Quantity)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.unitsmt.units.QuantityHomogenousOperation.class) {
    	switch (derivedFeatureID) {
    		case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__LHS:
    			return rover.unitsmt.units.UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS;
    		case rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__RHS:
    			return rover.unitsmt.units.UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.unitsmt.units.QuantityHomogenousOperation.class) {
    	switch (baseFeatureID) {
    		case rover.unitsmt.units.UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__LHS:
    			return rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__LHS;
    		case rover.unitsmt.units.UnitsPackage.QUANTITY_HOMOGENOUS_OPERATION__RHS:
    			return rover.unitsmt.units.UnitsPackage.LENGTH_DISTINCT__RHS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
