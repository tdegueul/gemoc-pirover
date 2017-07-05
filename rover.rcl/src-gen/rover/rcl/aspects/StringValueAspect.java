package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.rcl.aspects.StringValueAspectStringValueAspectProperties;
import rover.rcl.rcl.StringValue;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect {
  public static String getStringValue(final StringValue _self) {
	final rover.rcl.aspects.StringValueAspectStringValueAspectProperties _self_ = rover.rcl.aspects.StringValueAspectStringValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.rcl.rcl.VarRef) {
		result = rover.rcl.aspects.StringValueAspect._privk3_getStringValue(_self_, (rover.rcl.rcl.VarRef) _self);
	} else if (_self instanceof rover.rcl.rcl.MessageQuery) {
		result = rover.rcl.aspects.MessageQueryAspect.getStringValue((rover.rcl.rcl.MessageQuery) _self);
	} else if (_self instanceof rover.rcl.rcl.StringValue) {
		result = rover.rcl.aspects.StringValueAspect._privk3_getStringValue(_self_, (rover.rcl.rcl.StringValue) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_getStringValue(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getSValue();
  }
}
