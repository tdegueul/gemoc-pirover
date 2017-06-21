package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectProperties;
import rcl.BooleanValue;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueAspect {
  public static boolean getBooleanValue(final BooleanValue _self) {
    final org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.ObstacleQuery){
    					result = org.gemoc.rover.rcl.semantics.ObstacleQueryAspect.getBooleanValue((rcl.ObstacleQuery)_self);
    } else  if (_self instanceof rcl.BooleanValue){
    					result = org.gemoc.rover.rcl.semantics.BooleanValueAspect._privk3_getBooleanValue(_self_, (rcl.BooleanValue)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_getBooleanValue(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return _self.isBValue();
  }
}
