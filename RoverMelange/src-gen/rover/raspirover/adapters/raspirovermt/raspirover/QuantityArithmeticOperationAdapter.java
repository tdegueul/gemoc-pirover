package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.QuantityArithmeticOperation;

@SuppressWarnings("all")
public class QuantityArithmeticOperationAdapter extends EObjectAdapter<QuantityArithmeticOperation> implements rover.raspirovermt.raspirover.QuantityArithmeticOperation {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public QuantityArithmeticOperationAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getQuantityArithmeticOperation();
  }
}
