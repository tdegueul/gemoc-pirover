package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectProperties;
import rover.rcl.aspects.NumberValueAspect;
import rover.rcl.rcl.HumidityQuery;

@Aspect(className = HumidityQuery.class)
@SuppressWarnings("all")
public class HumidityQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final HumidityQuery _self) {
	final rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectProperties _self_ = rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  private static int super_getIntValue(final HumidityQuery _self) {
    final rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.rcl.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final HumidityQueryAspectHumidityQueryAspectProperties _self_, final HumidityQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    return _current.nextInt(65, 95);
  }
}
