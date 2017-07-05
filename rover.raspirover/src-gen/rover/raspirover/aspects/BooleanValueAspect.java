package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.BooleanValueAspectBooleanValueAspectProperties;
import rover.raspirover.raspirover.BooleanValue;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueAspect {
  public static boolean getBooleanValue(final BooleanValue _self) {
	final rover.raspirover.aspects.BooleanValueAspectBooleanValueAspectProperties _self_ = rover.raspirover.aspects.BooleanValueAspectBooleanValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.raspirover.raspirover.ObstacleQuery) {
		result = rover.raspirover.aspects.ObstacleQueryAspect
				.getBooleanValue((rover.raspirover.raspirover.ObstacleQuery) _self);
	} else if (_self instanceof rover.raspirover.raspirover.VarRef) {
		result = rover.raspirover.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_,
				(rover.raspirover.raspirover.VarRef) _self);
	} else if (_self instanceof rover.raspirover.raspirover.BooleanValue) {
		result = rover.raspirover.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_,
				(rover.raspirover.raspirover.BooleanValue) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_getBooleanValue(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return _self.isBValue();
  }
}
