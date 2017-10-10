package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties;
import rover.raspirover.raspirover.NumberValue;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueAspect {
  public static int getIntValue(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.HumidityQuery){
    					result = rover.raspirover.aspects.HumidityQueryAspect.getIntValue((rover.raspirover.raspirover.HumidityQuery)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.TemperatureQuery){
    					result = rover.raspirover.aspects.TemperatureQueryAspect.getIntValue((rover.raspirover.raspirover.TemperatureQuery)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.VarRef){
    					result = rover.raspirover.aspects.VarRefAspect.getIntValue((rover.raspirover.raspirover.VarRef)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.NumberValue){
    					result = rover.raspirover.aspects.NumberValueAspect._privk3_getIntValue(_self_, (rover.raspirover.raspirover.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  public static String print(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_print(_self_, _self);;
    return (java.lang.String)result;
  }
  
  protected static int _privk3_getIntValue(final NumberValueAspectNumberValueAspectProperties _self_, final NumberValue _self) {
    return _self.getNValue();
  }
  
  protected static String _privk3_print(final NumberValueAspectNumberValueAspectProperties _self_, final NumberValue _self) {
    return Integer.valueOf(_self.getNValue()).toString();
  }
}
