package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.LengthUnit;

@SuppressWarnings("all")
public class LengthUnitAdapter extends EObjectAdapter<LengthUnit> implements rover.raspirovermt.raspirover.LengthUnit {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public LengthUnitAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int asCentimeters() {
    return rover.raspirover.aspects.LengthUnitConverter.asCentimeters(adaptee);
  }
  
  @Override
  public String print() {
    return rover.raspirover.aspects.UnitAspect.print(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getLengthUnit();
  }
}
