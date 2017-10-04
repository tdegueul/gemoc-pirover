package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Gradian;

@SuppressWarnings("all")
public class GradianAdapter extends EObjectAdapter<Gradian> implements rover.raspirovermt.raspirover.Gradian {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public GradianAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.LengthUnitAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.raspirover.aspects.LengthUnitAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getGradian();
  }
}