package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rcl.TemperatureQuery;

@Aspect(className = TemperatureQuery.class)
@SuppressWarnings("all")
public class TemperatureQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final TemperatureQuery _self) {
    final org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectProperties _self_ = org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.TemperatureQuery){
    					result = org.gemoc.rover.rcl.semantics.TemperatureQueryAspect._privk3_getIntValue(_self_, (rcl.TemperatureQuery)_self);
    } else  if (_self instanceof rcl.NumberValue){
    					result = org.gemoc.rover.rcl.semantics.NumberValueAspect.getIntValue((rcl.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_getIntValue(final TemperatureQuery _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final TemperatureQueryAspectTemperatureQueryAspectProperties _self_, final TemperatureQuery _self) {
    ThreadLocalRandom _current = ThreadLocalRandom.current();
    return _current.nextInt(12, 24);
  }
}
