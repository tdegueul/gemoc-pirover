package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Instruction;

@SuppressWarnings("all")
public class InstructionAdapter extends EObjectAdapter<Instruction> implements rover.raspirovermt.raspirover.Instruction {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public InstructionAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void execute() {
    rover.raspirover.aspects.Instruction_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public void finalize() {
    rover.raspirover.aspects.Instruction_ExecutableAspect.finalize(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getInstruction();
  }
}
