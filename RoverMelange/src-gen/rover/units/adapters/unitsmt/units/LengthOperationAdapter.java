package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.LengthOperation;

@SuppressWarnings("all")
public class LengthOperationAdapter extends EObjectAdapter<LengthOperation> implements rover.unitsmt.units.LengthOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public LengthOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getLengthOperation();
  }
}
