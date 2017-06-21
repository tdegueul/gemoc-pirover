package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.rcl.aspects.BooleanValueAspect;
import rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectProperties;
import rover.rcl.rcl.ObstacleQuery;

@Aspect(className = ObstacleQuery.class)
@SuppressWarnings("all")
public class ObstacleQueryAspect extends BooleanValueAspect {
  @OverrideAspectMethod
  public static boolean getBooleanValue(final ObstacleQuery _self) {
	final rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectProperties _self_ = rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getBooleanValue(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_getBooleanValue(final ObstacleQuery _self) {
    final rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties _self_ = rover.rcl.aspects.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    return  rover.rcl.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_, _self);
  }
  
  protected static boolean _privk3_getBooleanValue(final ObstacleQueryAspectObstacleQueryAspectProperties _self_, final ObstacleQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    int _nextInt = _current.nextInt(0, 2);
    return (_nextInt == 0);
  }
}
