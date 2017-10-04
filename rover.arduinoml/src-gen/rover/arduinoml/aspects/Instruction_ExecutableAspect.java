package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties;
import rover.arduinoml.aspects.Instruction_UtilitesAspect;
import rover.arduinoml.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
	final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.ModuleAssignment) {
		rover.arduinoml.aspects.ModuleAssignment_ExecutableAspect
				.execute((rover.arduinoml.arduino.ModuleAssignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.VariableAssignment) {
		rover.arduinoml.aspects.VariableAssignment_ExecutableAspect
				.execute((rover.arduinoml.arduino.VariableAssignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Assignment) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(rover.arduinoml.arduino.Assignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.While) {
		rover.arduinoml.aspects.While_ExecutableAspect.execute((rover.arduinoml.arduino.While) _self);
	} else if (_self instanceof rover.arduinoml.arduino.VariableDeclaration) {
		rover.arduinoml.aspects.VariableDeclaration_ExecutableAspect
				.execute((rover.arduinoml.arduino.VariableDeclaration) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Repeat) {
		rover.arduinoml.aspects.Repeat_ExecutableAspect.execute((rover.arduinoml.arduino.Repeat) _self);
	} else if (_self instanceof rover.arduinoml.arduino.If) {
		rover.arduinoml.aspects.Control_ExecutableAspect.execute((rover.arduinoml.arduino.If) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Control) {
		rover.arduinoml.aspects.Control_ExecutableAspect.execute((rover.arduinoml.arduino.Control) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Delay) {
		rover.arduinoml.aspects.Delay_ExecutableAspect.execute((rover.arduinoml.arduino.Delay) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Utilities) {
		rover.arduinoml.aspects.Utilities_ExecutableAspect.execute((rover.arduinoml.arduino.Utilities) _self);
	} else if (_self instanceof rover.arduinoml.arduino.ModuleInstruction) {
		rover.arduinoml.aspects.ModuleInstruction_ExecutableAspect
				.execute((rover.arduinoml.arduino.ModuleInstruction) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Instruction) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_,
				(rover.arduinoml.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static void finalize(final Instruction _self) {
	final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.ModuleAssignment) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.ModuleAssignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.VariableAssignment) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.VariableAssignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Assignment) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.Assignment) _self);
	} else if (_self instanceof rover.arduinoml.arduino.While) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.While) _self);
	} else if (_self instanceof rover.arduinoml.arduino.VariableDeclaration) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.VariableDeclaration) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Repeat) {
		rover.arduinoml.aspects.Repeat_EvaluableAspect.finalize((rover.arduinoml.arduino.Repeat) _self);
	} else if (_self instanceof rover.arduinoml.arduino.If) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.If) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Control) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.Control) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Delay) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.Delay) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Utilities) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.Utilities) _self);
	} else if (_self instanceof rover.arduinoml.arduino.ModuleInstruction) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.ModuleInstruction) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Instruction) {
		rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_finalize(_self_,
				(rover.arduinoml.arduino.Instruction) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
