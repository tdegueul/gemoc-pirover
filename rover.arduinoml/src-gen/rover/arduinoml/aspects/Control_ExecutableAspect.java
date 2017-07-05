package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
	final rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_ExecutableAspectControlAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.If) {
		rover.arduinoml.aspects.If_ExecutableAspect.execute((rover.arduinoml.arduino.If) _self);
	} else if (_self instanceof rover.arduinoml.arduino.While) {
		rover.arduinoml.aspects.While_ExecutableAspect.execute((rover.arduinoml.arduino.While) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Repeat) {
		rover.arduinoml.aspects.Repeat_ExecutableAspect.execute((rover.arduinoml.arduino.Repeat) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Control) {
		rover.arduinoml.aspects.Control_ExecutableAspect._privk3_execute(_self_,
				(rover.arduinoml.arduino.Control) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static void super_execute(final Control _self) {
    final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}
