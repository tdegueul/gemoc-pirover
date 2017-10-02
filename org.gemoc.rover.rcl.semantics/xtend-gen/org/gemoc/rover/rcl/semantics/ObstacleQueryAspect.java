package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import org.gemoc.rover.rcl.semantics.BooleanValueAspect;
import org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectProperties;
import rcl.ObstacleQuery;

@Aspect(className = ObstacleQuery.class)
@SuppressWarnings("all")
public class ObstacleQueryAspect extends BooleanValueAspect {
  @OverrideAspectMethod
  public static boolean getBooleanValue(final ObstacleQuery _self) {
    final org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectProperties _self_ = org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.ObstacleQuery){
    					result = org.gemoc.rover.rcl.semantics.ObstacleQueryAspect._privk3_getBooleanValue(_self_, (rcl.ObstacleQuery)_self);
    } else  if (_self instanceof rcl.BooleanValue){
    					result = org.gemoc.rover.rcl.semantics.BooleanValueAspect.getBooleanValue((rcl.BooleanValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static boolean super_getBooleanValue(final ObstacleQuery _self) {
    final org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.BooleanValueAspect._privk3_getBooleanValue(_self_, _self);
  }
  
  protected static boolean _privk3_getBooleanValue(final ObstacleQueryAspectObstacleQueryAspectProperties _self_, final ObstacleQuery _self) {
    int _nextInt = ThreadLocalRandom.current().nextInt(0, 2);
    return (_nextInt == 0);
  }
}
