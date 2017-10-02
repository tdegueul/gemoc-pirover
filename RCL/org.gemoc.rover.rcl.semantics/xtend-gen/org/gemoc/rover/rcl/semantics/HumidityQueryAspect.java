package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectProperties;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import rcl.HumidityQuery;

@Aspect(className = HumidityQuery.class)
@SuppressWarnings("all")
public class HumidityQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final HumidityQuery _self) {
    final org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectProperties _self_ = org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.HumidityQuery){
    					result = org.gemoc.rover.rcl.semantics.HumidityQueryAspect._privk3_getIntValue(_self_, (rcl.HumidityQuery)_self);
    } else  if (_self instanceof rcl.NumberValue){
    					result = org.gemoc.rover.rcl.semantics.NumberValueAspect.getIntValue((rcl.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_getIntValue(final HumidityQuery _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final HumidityQueryAspectHumidityQueryAspectProperties _self_, final HumidityQuery _self) {
    return ThreadLocalRandom.current().nextInt(65, 95);
  }
}
