package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.Param;
import rover.raspirovermt.raspirover.RclBlock;
import rover.raspirovermt.raspirover.RoverValue;

@SuppressWarnings("all")
public class RoverProgramAdapter extends EObjectAdapter<RoverProgram> implements rover.raspirovermt.raspirover.RoverProgram {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public RoverProgramAdapter() {
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
  
  private EList<Param> params_;
  
  @Override
  public EList<Param> getParams() {
    if (params_ == null)
    	params_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParams(), adaptersFactory, eResource);
    return params_;
  }
  
  @Override
  public RclBlock getBlock() {
    return (RclBlock) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final RclBlock o) {
    if (o != null)
    	adaptee.setBlock(((rover.raspirover.adapters.raspirovermt.raspirover.RclBlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void bindVar(final String n, final RoverValue v) {
    rover.raspirover.aspects.RoverProgramAspect.bindVar(adaptee, n
    , (rover.raspirover.raspirover.RoverValue)((EObjectAdapter)v).getAdaptee()
    );
  }
  
  @Override
  public RoverValue getVar(final String n) {
    return (RoverValue) adaptersFactory.createAdapter(rover.raspirover.aspects.RoverProgramAspect.getVar(adaptee, n
    ), eResource);
  }
  
  @Override
  public void run() {
    rover.raspirover.aspects.RoverProgramAspect.run(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getRoverProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__PARAMS:
    		return getParams();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__PARAMS:
    		return getParams() != null && !getParams().isEmpty();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__PARAMS:
    		getParams().clear();
    		getParams().addAll((Collection) newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.ROVER_PROGRAM__BLOCK:
    		setBlock(
    		(rover.raspirovermt.raspirover.RclBlock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
