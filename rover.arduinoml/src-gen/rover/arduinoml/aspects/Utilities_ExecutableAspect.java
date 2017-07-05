package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties;
import rover.arduinoml.arduino.Utilities;

@Aspect(className = Utilities.class)
@SuppressWarnings("all")
public class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Utilities _self) {
	final rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectContext
			.getSelf(_self);
	if (_self instanceof rover.arduinoml.arduino.Delay) {
		rover.arduinoml.aspects.Delay_ExecutableAspect.execute((rover.arduinoml.arduino.Delay) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Utilities) {
		rover.arduinoml.aspects.Utilities_ExecutableAspect._privk3_execute(_self_,
				(rover.arduinoml.arduino.Utilities) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static void super_execute(final Utilities _self) {
    final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Utilities_ExecutableAspectUtilitiesAspectProperties _self_, final Utilities _self) {
  }
}
