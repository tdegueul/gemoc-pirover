package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_EvaluableAspect extends Instruction_ExecutableAspect {
  public static Boolean evaluate(final Control _self) {
	final rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_EvaluableAspectControlAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.arduinoml.arduino.While) {
		result = rover.arduinoml.aspects.While_EvaluableAspect.evaluate((rover.arduinoml.arduino.While) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Repeat) {
		result = rover.arduinoml.aspects.Repeat_EvaluableAspect.evaluate((rover.arduinoml.arduino.Repeat) _self);
	} else if (_self instanceof rover.arduinoml.arduino.If) {
		result = rover.arduinoml.aspects.If_EvaluableAspect.evaluate((rover.arduinoml.arduino.If) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Control) {
		result = rover.arduinoml.aspects.Control_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.Control) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Boolean) result;
}
  
  protected static Boolean _privk3_evaluate(final Control_EvaluableAspectControlAspectProperties _self_, final Control _self) {
    return null;
  }
}
