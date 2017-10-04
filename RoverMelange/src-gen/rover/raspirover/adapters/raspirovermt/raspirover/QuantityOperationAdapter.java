package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.QuantityOperation;

@SuppressWarnings("all")
public class QuantityOperationAdapter extends EObjectAdapter<QuantityOperation> implements rover.raspirovermt.raspirover.QuantityOperation {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public QuantityOperationAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getQuantityOperation();
  }
}
