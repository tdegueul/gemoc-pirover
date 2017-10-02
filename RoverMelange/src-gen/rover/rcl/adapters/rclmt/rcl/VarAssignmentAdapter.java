package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.VarAssignment;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverProgram;
import rover.rclmt.rcl.RoverValue;

@SuppressWarnings("all")
public class VarAssignmentAdapter extends EObjectAdapter<VarAssignment> implements rover.rclmt.rcl.VarAssignment {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public VarAssignmentAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
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
  public RoverValue getValue() {
    return (RoverValue) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final RoverValue o) {
    if (o != null)
    	adaptee.setValue(((rover.rcl.adapters.rclmt.rcl.RoverValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void eval() {
    rover.rcl.aspects.VarAssignmentAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.rcl.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getVarAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__ENCLOSING:
    		return getEnclosing();
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__NAME:
    		return getName();
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__ENCLOSING:
    		setEnclosing(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.VAR_ASSIGNMENT__VALUE:
    		setValue(
    		(rover.rclmt.rcl.RoverValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
