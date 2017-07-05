package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.VarAssignment;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.RoverValue;

@SuppressWarnings("all")
public class VarAssignmentAdapter extends EObjectAdapter<VarAssignment> implements rover.raspirovermt.raspirover.VarAssignment {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public VarAssignmentAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
  public RoverValue getValue() {
    return (RoverValue) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final RoverValue o) {
    if (o != null)
    	adaptee.setValue(((rover.raspirover.adapters.raspirovermt.raspirover.RoverValueAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void eval() {
    rover.raspirover.aspects.VarAssignmentAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getVarAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.VAR_ASSIGNMENT__VALUE:
    		setValue(
    		(rover.raspirovermt.raspirover.RoverValue)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
