package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.RoverProgram;
import rover.rclmt.rcl.Param;
import rover.rclmt.rcl.RclBlock;
import rover.rclmt.rcl.RoverValue;

@SuppressWarnings("all")
public class RoverProgramAdapter extends EObjectAdapter<RoverProgram> implements rover.rclmt.rcl.RoverProgram {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public RoverProgramAdapter() {
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
    	adaptee.setBlock(((rover.rcl.adapters.rclmt.rcl.RclBlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void bindVar(final String n, final RoverValue v) {
    rover.rcl.aspects.RoverProgramAspect.bindVar(adaptee, n
    , (rover.rcl.rcl.RoverValue)((EObjectAdapter)v).getAdaptee()
    );
  }
  
  @Override
  public RoverValue getVar(final String n) {
    return (RoverValue) adaptersFactory.createAdapter(rover.rcl.aspects.RoverProgramAspect.getVar(adaptee, n
    ), eResource);
  }
  
  @Override
  public void run() {
    rover.rcl.aspects.RoverProgramAspect.run(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getRoverProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__NAME:
    		return getName();
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__PARAMS:
    		return getParams();
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__PARAMS:
    		return getParams() != null && !getParams().isEmpty();
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__PARAMS:
    		getParams().clear();
    		getParams().addAll((Collection) newValue);
    		return;
    	case rover.rclmt.rcl.RclPackage.ROVER_PROGRAM__BLOCK:
    		setBlock(
    		(rover.rclmt.rcl.RclBlock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
