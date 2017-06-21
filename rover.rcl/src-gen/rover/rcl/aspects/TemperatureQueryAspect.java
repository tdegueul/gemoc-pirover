package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.rcl.aspects.NumberValueAspect;
import rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rover.rcl.rcl.TemperatureQuery;

@Aspect(className = TemperatureQuery.class)
@SuppressWarnings("all")
public class TemperatureQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final TemperatureQuery _self) {
	final rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties _self_ = rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  private static int super_getIntValue(final TemperatureQuery _self) {
    final rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.rcl.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final TemperatureQueryAspectTemperatureQueryAspectProperties _self_, final TemperatureQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    return _current.nextInt(12, 24);
  }
}
