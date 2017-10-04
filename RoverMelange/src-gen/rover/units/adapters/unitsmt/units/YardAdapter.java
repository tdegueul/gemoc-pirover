package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.Yard;

@SuppressWarnings("all")
public class YardAdapter extends EObjectAdapter<Yard> implements rover.unitsmt.units.Yard {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public YardAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.units.aspects.YardAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.units.aspects.YardAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getYard();
  }
}
