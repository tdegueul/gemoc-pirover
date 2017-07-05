package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.VarRef;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverProgram;

@SuppressWarnings("all")
public class VarRefAdapter extends EObjectAdapter<VarRef> implements rover.rclmt.rcl.VarRef {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public VarRefAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
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
    	adaptee.setEnclosing(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.VarRefAspect.eval(adaptee);
  }
  
  @Override
  public boolean getBooleanValue() {
    return rover.rcl.aspects.VarRefAspect.getBooleanValue(adaptee);
  }
  
  @Override
  public int getIntValue() {
    return rover.rcl.aspects.VarRefAspect.getIntValue(adaptee);
  }
  
  @Override
  public String getStringValue() {
    return rover.rcl.aspects.VarRefAspect.getStringValue(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static boolean BVALUE_EDEFAULT = false;
  
  protected final static int NVALUE_EDEFAULT = 0;
  
  protected final static String SVALUE_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getVarRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_REF__BVALUE:
    		return isBValue() ? Boolean.TRUE : Boolean.FALSE;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NVALUE:
    		return new java.lang.Integer(getNValue());
    	case rover.rclmt.rcl.RclPackage.VAR_REF__SVALUE:
    		return getSValue();
    	case rover.rclmt.rcl.RclPackage.VAR_REF__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_REF__BVALUE:
    		return isBValue() != BVALUE_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NVALUE:
    		return getNValue() != NVALUE_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__SVALUE:
    		return getSValue() != SVALUE_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_REF__BVALUE:
    		setBValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NVALUE:
    		setNValue(((java.lang.Integer) newValue).intValue());
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__SVALUE:
    		setSValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_REF__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.rclmt.rcl.NumberValue.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.VAR_REF__NVALUE:
    			return rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.StringValue.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.VAR_REF__SVALUE:
    			return rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.Statement.class) {
    	switch (derivedFeatureID) {
    		case rover.rclmt.rcl.RclPackage.VAR_REF__ENCLOSING:
    			return rover.rclmt.rcl.RclPackage.STATEMENT__ENCLOSING;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == rover.rclmt.rcl.NumberValue.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.NUMBER_VALUE__NVALUE:
    			return rover.rclmt.rcl.RclPackage.VAR_REF__NVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.StringValue.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.STRING_VALUE__SVALUE:
    			return rover.rclmt.rcl.RclPackage.VAR_REF__SVALUE;
    		default: return -1;
    	}
    }
    if (baseClass == rover.rclmt.rcl.Statement.class) {
    	switch (baseFeatureID) {
    		case rover.rclmt.rcl.RclPackage.STATEMENT__ENCLOSING:
    			return rover.rclmt.rcl.RclPackage.VAR_REF__ENCLOSING;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
