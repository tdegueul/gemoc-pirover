package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Inch;

@SuppressWarnings("all")
public class InchAdapter extends EObjectAdapter<Inch> implements rover.raspirovermt.raspirover.Inch {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public InchAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.InchAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.raspirover.aspects.InchAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getInch();
  }
}
