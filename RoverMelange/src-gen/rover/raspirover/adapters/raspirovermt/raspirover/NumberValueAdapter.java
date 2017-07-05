package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirovermt.raspirover.Unit;

@SuppressWarnings("all")
public class NumberValueAdapter extends EObjectAdapter<NumberValue> implements rover.raspirovermt.raspirover.NumberValue {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public NumberValueAdapter() {
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
  public Unit getUnit() {
    return (Unit) adaptersFactory.createAdapter(rover.raspirover.aspects.NumberValueUnit.unit(adaptee), eResource);
  }
  
  @Override
  public void setUnit(final Unit unit) {
    rover.raspirover.aspects.NumberValueUnit.unit(adaptee, (rover.raspirover.raspirover.Unit)((EObjectAdapter)unit).getAdaptee()
    );
  }
  
  @Override
  public int getIntValue() {
    return rover.raspirover.aspects.NumberValueAspect.getIntValue(adaptee);
  }
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getNumberValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE:
    		return new java.lang.Integer(getNValue());
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT:
    		return getUnit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT:
    		return getUnit() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT:
    		setUnit(
    		(rover.raspirovermt.raspirover.Unit)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
