package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.AngleOperation;

@SuppressWarnings("all")
public class AngleOperationAdapter extends EObjectAdapter<AngleOperation> implements rover.unitsmt.units.AngleOperation {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public AngleOperationAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getAngleOperation();
  }
}
