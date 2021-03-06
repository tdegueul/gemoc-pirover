package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.concurrent.ThreadLocalRandom;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rover.raspirover.raspirover.TemperatureQuery;

@Aspect(className = TemperatureQuery.class)
@SuppressWarnings("all")
public class TemperatureQueryAspect extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final TemperatureQuery _self) {
    final rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties _self_ = rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.TemperatureQuery){
    					result = rover.raspirover.aspects.TemperatureQueryAspect._privk3_getIntValue(_self_, (rover.raspirover.raspirover.TemperatureQuery)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.NumberValue){
    					result = rover.raspirover.aspects.NumberValueAspect.getIntValue((rover.raspirover.raspirover.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  private static int super_getIntValue(final TemperatureQuery _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final TemperatureQueryAspectTemperatureQueryAspectProperties _self_, final TemperatureQuery _self) {
    return ThreadLocalRandom.current().nextInt(12, 24);
  }
}
