package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectProperties;
import rover.arduinoml.arduino.Variable;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public abstract class Variable_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Variable _self) {
	final rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectProperties _self_ = rover.arduinoml.aspects.Variable_EvaluableAspectVariableAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.arduinoml.arduino.BooleanVariable) {
		result = rover.arduinoml.aspects.BooleanVariable_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.BooleanVariable) _self);
	} else if (_self instanceof rover.arduinoml.arduino.IntegerVariable) {
		result = rover.arduinoml.aspects.IntegerVariable_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.IntegerVariable) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Variable) {
		result = rover.arduinoml.aspects.Variable_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.Variable) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Object) result;
}
  
  protected static Object _privk3_evaluate(final Variable_EvaluableAspectVariableAspectProperties _self_, final Variable _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
