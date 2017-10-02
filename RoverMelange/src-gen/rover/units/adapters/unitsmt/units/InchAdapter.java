package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.Inch;

@SuppressWarnings("all")
public class InchAdapter extends EObjectAdapter<Inch> implements rover.unitsmt.units.Inch {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public InchAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String print() {
    return rover.units.aspects.InchAspect.print(adaptee);
  }
  
  @Override
  public int asCentimeters() {
    return rover.units.aspects.LengthUnitConverter.asCentimeters(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getInch();
  }
}
