package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.MetricSystemUnit;

@SuppressWarnings("all")
public class MetricSystemUnitAdapter extends EObjectAdapter<MetricSystemUnit> implements rover.raspirovermt.raspirover.MetricSystemUnit {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public MetricSystemUnitAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getMetricSystemUnit();
  }
}
