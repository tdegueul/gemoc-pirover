package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.TemperatureQuery;
import rover.raspirovermt.raspirover.Unit;

@SuppressWarnings("all")
public class TemperatureQueryAdapter extends EObjectAdapter<TemperatureQuery> implements rover.raspirovermt.raspirover.TemperatureQuery {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public TemperatureQueryAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getNValue() {
    return adaptee.getNValue();
  }
  
  @Override
  public void setNValue(final int o) {
    adaptee.setNValue(o);
  }
  
  @Override
  public int getIntValue() {
    return rover.raspirover.aspects.TemperatureQueryAspect.getIntValue(adaptee);
  }
  
  @Override
  public Unit getUnit() {
    return (Unit) adaptersFactory.createAdapter(rover.raspirover.aspects.NumberToUnitGlue.unit(adaptee), eResource);
  }
  
  @Override
  public void setUnit(final Unit unit) {
    rover.raspirover.aspects.NumberToUnitGlue.unit(adaptee, (rover.raspirover.raspirover.Unit)((EObjectAdapter)unit).getAdaptee()
    );
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.OverriddenNumberInterpreter.print(adaptee);
  }
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getTemperatureQuery();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__NVALUE:
    		return new java.lang.Integer(getNValue());
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__UNIT:
    		return getUnit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__UNIT:
    		return getUnit() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__UNIT:
    		setUnit(
    		(rover.raspirovermt.raspirover.Unit)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.RoverValue.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.NumberValue.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__NVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__UNIT:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.RoverValue.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.NumberValue.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__NVALUE;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.TEMPERATURE_QUERY__UNIT;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
