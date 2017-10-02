package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Yard;

@SuppressWarnings("all")
public class YardAdapter extends EObjectAdapter<Yard> implements rover.raspirovermt.raspirover.Yard {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public YardAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.YardAspect.print(adaptee);
  }
  
  @Override
  public int asCentimeters() {
    return rover.raspirover.aspects.LengthUnitConverter.asCentimeters(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getYard();
  }
}
