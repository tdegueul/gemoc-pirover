package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.VarRef;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.Unit;

@SuppressWarnings("all")
public class VarRefAdapter extends EObjectAdapter<VarRef> implements rover.raspirovermt.raspirover.VarRef {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public VarRefAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isBValue() {
    return adaptee.isBValue();
  }
  
  @Override
  public void setBValue(final boolean o) {
    adaptee.setBValue(o);
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
  public String getSValue() {
    return adaptee.getSValue();
  }
  
  @Override
  public void setSValue(final String o) {
    adaptee.setSValue(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public RclBlock getEnclosing() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final RclBlock o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  @Override
  public void eval() {
    rover.raspirover.aspects.VarRefAspect.eval(adaptee);
  }
  
  @Override
  public boolean getBooleanValue() {
    return rover.raspirover.aspects.VarRefAspect.getBooleanValue(adaptee);
  }
  
  @Override
  public int getIntValue() {
    return rover.raspirover.aspects.VarRefAspect.getIntValue(adaptee);
  }
  
  @Override
  public String getStringValue() {
    return rover.raspirover.aspects.VarRefAspect.getStringValue(adaptee);
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.NumberValueUnit.print(adaptee);
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
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  protected final static String SVALUE_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getVarRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NVALUE:
    		return new java.lang.Integer(getNValue());
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__UNIT:
    		return getUnit();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__SVALUE:
    		return getSValue();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__UNIT:
    		return getUnit() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__SVALUE:
    		return getSValue() != SVALUE_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__UNIT:
    		setUnit(
    		(rover.raspirovermt.raspirover.Unit)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__SVALUE:
    		setSValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.NumberValue.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__UNIT:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT;
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.StringValue.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__SVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.STRING_VALUE__SVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.Statement.class) {
    	switch (derivedFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__ENCLOSING:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.STATEMENT__ENCLOSING;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.raspirovermt.raspirover.NumberValue.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__NVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__NVALUE;
    		case rover.raspirovermt.raspirover.RaspiroverPackage.NUMBER_VALUE__UNIT:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__UNIT;
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.StringValue.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.STRING_VALUE__SVALUE:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__SVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.raspirovermt.raspirover.Statement.class) {
    	switch (baseFeatureID) {
    		case rover.raspirovermt.raspirover.RaspiroverPackage.STATEMENT__ENCLOSING:
    			return rover.raspirovermt.raspirover.RaspiroverPackage.VAR_REF__ENCLOSING;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
