package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.Millimeter;

@SuppressWarnings("all")
public class MillimeterAdapter extends EObjectAdapter<Millimeter> implements rover.unitsmt.units.Millimeter {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public MillimeterAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.units.aspects.MillimeterAspect.print(adaptee);
  }
  
  @Override
  public int asCentimeters() {
    return rover.units.aspects.LengthUnitConverter.asCentimeters(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getMillimeter();
  }
}
