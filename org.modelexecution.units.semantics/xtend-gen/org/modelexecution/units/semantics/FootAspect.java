package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Foot;
import org.modelexecution.units.semantics.FootAspectFootAspectProperties;
import org.modelexecution.units.semantics.LengthUnitAspect;

@Aspect(className = Foot.class)
@SuppressWarnings("all")
public class FootAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Foot _self) {
    final org.modelexecution.units.semantics.FootAspectFootAspectProperties _self_ = org.modelexecution.units.semantics.FootAspectFootAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect._privk3_print(_self_, (org.modelexecution.units.Foot)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCentimeters(final Foot _self, final double value) {
    final org.modelexecution.units.semantics.FootAspectFootAspectProperties _self_ = org.modelexecution.units.semantics.FootAspectFootAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect._privk3_toCentimeters(_self_, (org.modelexecution.units.Foot)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCentimeters((org.modelexecution.units.Unit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_print(final FootAspectFootAspectProperties _self_, final Foot _self) {
    return "ft";
  }
  
  protected static double _privk3_toCentimeters(final FootAspectFootAspectProperties _self_, final Foot _self, final double value) {
    return (value * 30.48);
  }
}
