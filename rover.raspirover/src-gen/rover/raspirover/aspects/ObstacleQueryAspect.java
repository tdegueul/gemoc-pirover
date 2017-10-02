package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.raspirover.aspects.BooleanValueAspect;
import rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectProperties;
import rover.raspirover.raspirover.ObstacleQuery;

@Aspect(className = ObstacleQuery.class)
@SuppressWarnings("all")
public class ObstacleQueryAspect extends BooleanValueAspect {
  @OverrideAspectMethod
  public static boolean getBooleanValue(final ObstacleQuery _self) {
	final rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectProperties _self_ = rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getBooleanValue(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_getBooleanValue(final ObstacleQuery _self) {
    final rover.raspirover.aspects.BooleanValueAspectBooleanValueAspectProperties _self_ = rover.raspirover.aspects.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.BooleanValueAspect._privk3_getBooleanValue(_self_, _self);
  }
  
  protected static boolean _privk3_getBooleanValue(final ObstacleQueryAspectObstacleQueryAspectProperties _self_, final ObstacleQuery _self) {
    int _nextInt = ThreadLocalRandom.current().nextInt(0, 2);
    return (_nextInt == 0);
  }
}
