package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectProperties;
import rover.rcl.rcl.RoverExpression;

@Aspect(className = RoverExpression.class)
@SuppressWarnings("all")
public abstract class RoverExpressionAspect {
  @Abstract
  public static boolean eval(final RoverExpression _self) {
	final rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectProperties _self_ = rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.rcl.rcl.BooleanExpression) {
		result = rover.rcl.aspects.BooleanExpressionASpect.eval((rover.rcl.rcl.BooleanExpression) _self);
	} else if (_self instanceof rover.rcl.rcl.StringExpression) {
		result = rover.rcl.aspects.StringExpressionASpect.eval((rover.rcl.rcl.StringExpression) _self);
	} else if (_self instanceof rover.rcl.rcl.NumericExpression) {
		result = rover.rcl.aspects.NumericExpressionASpect.eval((rover.rcl.rcl.NumericExpression) _self);
	} else if (_self instanceof rover.rcl.rcl.RoverExpression) {
		result = rover.rcl.aspects.RoverExpressionAspect._privk3_eval(_self_, (rover.rcl.rcl.RoverExpression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_eval(final RoverExpressionAspectRoverExpressionAspectProperties _self_, final RoverExpression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
