package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Millimeter;

@SuppressWarnings("all")
public class MillimeterAdapter extends EObjectAdapter<Millimeter> implements rover.raspirovermt.raspirover.Millimeter {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public MillimeterAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.MillimeterAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.raspirover.aspects.MillimeterAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getMillimeter();
  }
}
