package rover.rcl.adapters.rclmt.rcl;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.rcl.adapters.rclmt.RCLMTAdaptersFactory;
import rover.rcl.rcl.RoverExpression;

@SuppressWarnings("all")
public class RoverExpressionAdapter extends EObjectAdapter<RoverExpression> implements rover.rclmt.rcl.RoverExpression {
  private RCLMTAdaptersFactory adaptersFactory;
  
  public RoverExpressionAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean eval() {
    return rover.rcl.aspects.RoverExpressionAspect.eval(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.rclmt.rcl.RclPackage.eINSTANCE.getRoverExpression();
  }
}
