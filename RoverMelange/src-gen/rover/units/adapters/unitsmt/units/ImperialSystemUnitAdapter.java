package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.ImperialSystemUnit;

@SuppressWarnings("all")
public class ImperialSystemUnitAdapter extends EObjectAdapter<ImperialSystemUnit> implements rover.unitsmt.units.ImperialSystemUnit {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public ImperialSystemUnitAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.units.aspects.LengthUnitAspect.print(adaptee);
  }
  
  @Override
  public double toCentimeters(final double value) {
    return rover.units.aspects.LengthUnitAspect.toCentimeters(adaptee, value
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getImperialSystemUnit();
  }
}
