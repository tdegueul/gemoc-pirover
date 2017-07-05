package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.Statement;

@SuppressWarnings("all")
public class RclBlockAdapter extends EObjectAdapter<RclBlock> implements rover.raspirovermt.raspirover.RclBlock {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public RclBlockAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public rover.raspirovermt.raspirover.RclBlock getEnclosing() {
    return (rover.raspirovermt.raspirover.RclBlock) adaptersFactory.createAdapter(adaptee.getEnclosing(), eResource);
  }
  
  @Override
  public void setEnclosing(final rover.raspirovermt.raspirover.RclBlock o) {
    if (o != null)
    	adaptee.setEnclosing(((rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) o).getAdaptee());
    else adaptee.setEnclosing(null);
  }
  
  private EList<Statement> stmts_;
  
  @Override
  public EList<Statement> getStmts() {
    if (stmts_ == null)
    	stmts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStmts(), adaptersFactory, eResource);
    return stmts_;
  }
  
  @Override
  public void eval() {
    rover.raspirover.aspects.RclBlockAspect.eval(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.StatementAspect.getProgram(adaptee), eResource);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getRclBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__ENCLOSING:
    		return getEnclosing();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__STMTS:
    		return getStmts();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__ENCLOSING:
    		return getEnclosing() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__STMTS:
    		return getStmts() != null && !getStmts().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__ENCLOSING:
    		setEnclosing(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RCL_BLOCK__STMTS:
    		getStmts().clear();
    		getStmts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
