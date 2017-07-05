package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import rover.arduinoml.aspects.Block_ExecutableAspectBlockAspectProperties;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.arduino.Block;
import rover.arduinoml.arduino.Instruction;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class Block_ExecutableAspect {
  public static void execute(final Block _self) {
	final rover.arduinoml.aspects.Block_ExecutableAspectBlockAspectProperties _self_ = rover.arduinoml.aspects.Block_ExecutableAspectBlockAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final Block_ExecutableAspectBlockAspectProperties _self_, final Block _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction i : _instructions) {
      Instruction_ExecutableAspect.execute(i);
    }
  }
}
