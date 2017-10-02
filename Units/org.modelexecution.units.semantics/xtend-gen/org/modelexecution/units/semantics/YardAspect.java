package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Yard;
import org.modelexecution.units.semantics.LengthUnitAspect;
import org.modelexecution.units.semantics.YardAspectYardAspectProperties;

@Aspect(className = Yard.class)
@SuppressWarnings("all")
public class YardAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Yard _self) {
    final org.modelexecution.units.semantics.YardAspectYardAspectProperties _self_ = org.modelexecution.units.semantics.YardAspectYardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect._privk3_print(_self_, (org.modelexecution.units.Yard)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCentimeters(final Yard _self, final double value) {
    final org.modelexecution.units.semantics.YardAspectYardAspectProperties _self_ = org.modelexecution.units.semantics.YardAspectYardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect._privk3_toCentimeters(_self_, (org.modelexecution.units.Yard)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCentimeters((org.modelexecution.units.Unit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_print(final YardAspectYardAspectProperties _self_, final Yard _self) {
    return "yd";
  }
  
  protected static double _privk3_toCentimeters(final YardAspectYardAspectProperties _self_, final Yard _self, final double value) {
    return (value * 91.44);
  }
}
