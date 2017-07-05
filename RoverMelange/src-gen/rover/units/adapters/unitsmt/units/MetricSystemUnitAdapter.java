package rover.units.adapters.unitsmt.units;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.units.adapters.unitsmt.UnitsMTAdaptersFactory;
import rover.units.units.MetricSystemUnit;

@SuppressWarnings("all")
public class MetricSystemUnitAdapter extends EObjectAdapter<MetricSystemUnit> implements rover.unitsmt.units.MetricSystemUnit {
  private UnitsMTAdaptersFactory adaptersFactory;
  
  public MetricSystemUnitAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
    adaptersFactory = rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.unitsmt.units.UnitsPackage.eINSTANCE.getMetricSystemUnit();
  }
}
