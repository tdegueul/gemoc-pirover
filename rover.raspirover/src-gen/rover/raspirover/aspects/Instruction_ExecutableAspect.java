package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.Instruction_ExecutableAspectInstructionAspectProperties;
import rover.raspirover.aspects.Instruction_UtilitesAspect;
import rover.raspirover.raspirover.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
	final rover.raspirover.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.raspirover.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  public static void finalize(final Instruction _self) {
	final rover.raspirover.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.raspirover.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	_privk3_finalize(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
