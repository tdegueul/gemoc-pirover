package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Degree;

@SuppressWarnings("all")
public class DegreeAdapter extends EObjectAdapter<Degree> implements rover.raspirovermt.raspirover.Degree {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public DegreeAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.UnitAspect.print(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getDegree();
  }
}
