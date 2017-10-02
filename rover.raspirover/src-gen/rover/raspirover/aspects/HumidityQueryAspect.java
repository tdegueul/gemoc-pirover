package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectProperties;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.HumidityQuery;

@Aspect(className = HumidityQuery.class)
@SuppressWarnings("all")
public class HumidityQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final HumidityQuery _self) {
	final rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectProperties _self_ = rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  private static int super_getIntValue(final HumidityQuery _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final HumidityQueryAspectHumidityQueryAspectProperties _self_, final HumidityQuery _self) {
    return ThreadLocalRandom.current().nextInt(65, 95);
  }
}
