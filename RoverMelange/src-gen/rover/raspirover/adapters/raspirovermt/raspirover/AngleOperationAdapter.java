package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.AngleOperation;

@SuppressWarnings("all")
public class AngleOperationAdapter extends EObjectAdapter<AngleOperation> implements rover.raspirovermt.raspirover.AngleOperation {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public AngleOperationAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getAngleOperation();
  }
}
