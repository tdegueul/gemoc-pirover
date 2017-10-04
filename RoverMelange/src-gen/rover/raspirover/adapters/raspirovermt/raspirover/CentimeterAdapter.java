package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Centimeter;

@SuppressWarnings("all")
public class CentimeterAdapter extends EObjectAdapter<Centimeter> implements rover.raspirovermt.raspirover.Centimeter {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public CentimeterAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.CentimeterAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.raspirover.aspects.CentimeterAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getCentimeter();
  }
}
