package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.RoverExpression;

@SuppressWarnings("all")
public class RoverExpressionAdapter extends EObjectAdapter<RoverExpression> implements rover.raspirovermt.raspirover.RoverExpression {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public RoverExpressionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean eval() {
    return rover.raspirover.aspects.RoverExpressionAspect.eval(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getRoverExpression();
  }
}
