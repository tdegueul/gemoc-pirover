package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties;
import rcl.NumberValue;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueAspect {
  public static int getIntValue(final NumberValue _self) {
    final org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.VarRef){
    					result = org.gemoc.rover.rcl.semantics.VarRefAspect.getIntValue((rcl.VarRef)_self);
    } else  if (_self instanceof rcl.HumidityQuery){
    					result = org.gemoc.rover.rcl.semantics.HumidityQueryAspect.getIntValue((rcl.HumidityQuery)_self);
    } else  if (_self instanceof rcl.TemperatureQuery){
    					result = org.gemoc.rover.rcl.semantics.TemperatureQueryAspect.getIntValue((rcl.TemperatureQuery)_self);
    } else  if (_self instanceof rcl.NumberValue){
    					result = org.gemoc.rover.rcl.semantics.NumberValueAspect._privk3_getIntValue(_self_, (rcl.NumberValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (int)result;
  }
  
  protected static int _privk3_getIntValue(final NumberValueAspectNumberValueAspectProperties _self_, final NumberValue _self) {
    return _self.getNValue();
  }
}
