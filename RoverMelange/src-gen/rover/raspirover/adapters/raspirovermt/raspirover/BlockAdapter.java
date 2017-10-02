package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Block;
import rover.raspirovermt.raspirover.Instruction;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements rover.raspirovermt.raspirover.Block {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  private EList<Instruction> instructions_;
  
  @Override
  public EList<Instruction> getInstructions() {
    if (instructions_ == null)
    	instructions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInstructions(), adaptersFactory, eResource);
    return instructions_;
  }
  
  @Override
  public void execute() {
    rover.raspirover.aspects.Block_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BLOCK__INSTRUCTIONS:
    		return getInstructions() != null && !getInstructions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.BLOCK__INSTRUCTIONS:
    		getInstructions().clear();
    		getInstructions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
