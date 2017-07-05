package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties;
import rover.arduinoml.arduino.ModuleInstruction;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleInstruction _self) {
	final rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = rover.arduinoml.aspects.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.ModuleAssignment) {
		rover.arduinoml.aspects.ModuleAssignment_ExecutableAspect
				.execute((rover.arduinoml.arduino.ModuleAssignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.ModuleInstruction) {
		rover.arduinoml.aspects.ModuleInstruction_ExecutableAspect._privk3_execute(_self_,
				(rover.arduinoml.arduino.ModuleInstruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static void super_execute(final ModuleInstruction _self) {
    final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}
