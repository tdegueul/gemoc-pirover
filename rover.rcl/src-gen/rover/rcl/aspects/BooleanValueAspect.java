package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties;
import rover.rcl.rcl.BooleanValue;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueAspect {
  public static boolean getBooleanValue(final BooleanValue _self) {
	final rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties _self_ = rover.rcl.aspects.BooleanValueAspectBooleanValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.rcl.rcl.ObstacleQuery) {
		result = rover.rcl.aspects.ObstacleQueryAspect.getBooleanValue((rover.rcl.rcl.ObstacleQuery) _self);
	} else if (_self instanceof rover.rcl.rcl.VarRef) {
		result = rover.rcl.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_, (rover.rcl.rcl.VarRef) _self);
	} else if (_self instanceof rover.rcl.rcl.BooleanValue) {
		result = rover.rcl.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_,
				(rover.rcl.rcl.BooleanValue) _self);
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
