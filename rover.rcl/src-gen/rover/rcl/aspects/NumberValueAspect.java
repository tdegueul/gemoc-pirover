package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties;
import rover.rcl.rcl.NumberValue;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueAspect {
  public static int getIntValue(final NumberValue _self) {
	final rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.rcl.aspects.NumberValueAspectNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.rcl.rcl.VarRef) {
		result = rover.rcl.aspects.VarRefAspect.getIntValue((rover.rcl.rcl.VarRef) _self);
	} else if (_self instanceof rover.rcl.rcl.TemperatureQuery) {
		result = rover.rcl.aspects.TemperatureQueryAspect.getIntValue((rover.rcl.rcl.TemperatureQuery) _self);
	} else if (_self instanceof rover.rcl.rcl.HumidityQuery) {
		result = rover.rcl.aspects.HumidityQueryAspect.getIntValue((rover.rcl.rcl.HumidityQuery) _self);
	} else if (_self instanceof rover.rcl.rcl.NumberValue) {
		result = rover.rcl.aspects.NumberValueAspect._privk3_getIntValue(_self_, (rover.rcl.rcl.NumberValue) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (int) result;
}
  
  public static String print(final NumberValue _self) {
	final rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.rcl.aspects.NumberValueAspectNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static int _privk3_getIntValue(final NumberValueAspectNumberValueAspectProperties _self_, final NumberValue _self) {
    return _self.getNValue();
  }
  
  protected static String _privk3_print(final NumberValueAspectNumberValueAspectProperties _self_, final NumberValue _self) {
    return Integer.valueOf(_self.getNValue()).toString();
  }
}
