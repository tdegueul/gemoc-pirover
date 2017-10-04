package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectProperties;
import rover.raspirover.raspirover.RoverExpression;

@Aspect(className = RoverExpression.class)
@SuppressWarnings("all")
public abstract class RoverExpressionAspect {
  @Abstract
  public static boolean eval(final RoverExpression _self) {
	final rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectProperties _self_ = rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.raspirover.raspirover.BooleanExpression) {
		result = rover.raspirover.aspects.BooleanExpressionASpect
				.eval((rover.raspirover.raspirover.BooleanExpression) _self);
	} else if (_self instanceof rover.raspirover.raspirover.NumericExpression) {
		result = rover.raspirover.aspects.NumericExpressionASpect
				.eval((rover.raspirover.raspirover.NumericExpression) _self);
	} else if (_self instanceof rover.raspirover.raspirover.StringExpression) {
		result = rover.raspirover.aspects.StringExpressionASpect
				.eval((rover.raspirover.raspirover.StringExpression) _self);
	} else if (_self instanceof rover.raspirover.raspirover.RoverExpression) {
		result = rover.raspirover.aspects.RoverExpressionAspect._privk3_eval(_self_,
				(rover.raspirover.raspirover.RoverExpression) _self);
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
