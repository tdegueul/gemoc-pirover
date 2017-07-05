package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.QuantityOperation;

@SuppressWarnings("all")
public class QuantityOperationAdapter extends EObjectAdapter<QuantityOperation> implements rover.unitsmt.units.QuantityOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public QuantityOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getQuantityOperation();
  }
}
