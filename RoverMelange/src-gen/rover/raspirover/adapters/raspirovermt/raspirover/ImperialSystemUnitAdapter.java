package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.ImperialSystemUnit;

@SuppressWarnings("all")
public class ImperialSystemUnitAdapter extends EObjectAdapter<ImperialSystemUnit> implements rover.raspirovermt.raspirover.ImperialSystemUnit {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public ImperialSystemUnitAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getImperialSystemUnit();
  }
}
