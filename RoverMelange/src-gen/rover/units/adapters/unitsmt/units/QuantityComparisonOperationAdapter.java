package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.QuantityComparisonOperation;

@SuppressWarnings("all")
public class QuantityComparisonOperationAdapter extends EObjectAdapter<QuantityComparisonOperation> implements rover.unitsmt.units.QuantityComparisonOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public QuantityComparisonOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getQuantityComparisonOperation();
  }
}
