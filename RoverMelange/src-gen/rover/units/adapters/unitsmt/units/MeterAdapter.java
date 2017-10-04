package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.Meter;

@SuppressWarnings("all")
public class MeterAdapter extends EObjectAdapter<Meter> implements rover.unitsmt.units.Meter {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public MeterAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.units.aspects.MeterAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.units.aspects.MeterAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getMeter();
  }
}
