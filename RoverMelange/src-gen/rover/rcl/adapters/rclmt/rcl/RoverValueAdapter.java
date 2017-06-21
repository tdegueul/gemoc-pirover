package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.RoverValue;

@SuppressWarnings("all")
public class RoverValueAdapter extends EObjectAdapter<RoverValue> implements rover.rclmt.rcl.RoverValue {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public RoverValueAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getRoverValue();
  }
}
