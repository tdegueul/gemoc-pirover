package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.LengthScalarDivide;
import rover.unitsmt.units.NumericValue;
import rover.unitsmt.units.Quantity;

@SuppressWarnings("all")
public class LengthScalarDivideAdapter extends EObjectAdapter<LengthScalarDivide> implements rover.unitsmt.units.LengthScalarDivide {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public LengthScalarDivideAdapter() {
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
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getLengthScalarDivide();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__LHS:
    		return getLhs();
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__RHS:
    		return getRhs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__LHS:
    		return getLhs() != null;
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__RHS:
    		return getRhs() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__LHS:
    		setLhs(
    		(rover.unitsmt.units.Quantity)
    		 newValue);
    		return;
    	case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__RHS:
    		setRhs(
    		(rover.unitsmt.units.NumericValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.unitsmt.units.QuantityScalarOperation.class) {
    	switch (derivedFeatureID) {
    		case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__LHS:
    			return rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__LHS;
    		case rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__RHS:
    			return rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__RHS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.unitsmt.units.QuantityScalarOperation.class) {
    	switch (baseFeatureID) {
    		case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__LHS:
    			return rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__LHS;
    		case rover.unitsmt.units.UnitsPackage.QUANTITY_SCALAR_OPERATION__RHS:
    			return rover.unitsmt.units.UnitsPackage.LENGTH_SCALAR_DIVIDE__RHS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
