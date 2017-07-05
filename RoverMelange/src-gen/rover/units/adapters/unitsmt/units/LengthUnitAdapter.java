package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.LengthUnit;

@SuppressWarnings("all")
public class LengthUnitAdapter extends EObjectAdapter<LengthUnit> implements rover.unitsmt.units.LengthUnit {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public LengthUnitAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getLengthUnit();
  }
}
