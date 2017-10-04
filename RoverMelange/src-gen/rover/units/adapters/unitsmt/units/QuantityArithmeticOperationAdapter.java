package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.QuantityArithmeticOperation;

@SuppressWarnings("all")
public class QuantityArithmeticOperationAdapter extends EObjectAdapter<QuantityArithmeticOperation> implements rover.unitsmt.units.QuantityArithmeticOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public QuantityArithmeticOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getQuantityArithmeticOperation();
  }
}
