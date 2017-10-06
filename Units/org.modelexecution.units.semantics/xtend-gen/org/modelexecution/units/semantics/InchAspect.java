package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Inch;
import org.modelexecution.units.semantics.InchAspectInchAspectProperties;
import org.modelexecution.units.semantics.LengthUnitAspect;

@Aspect(className = Inch.class)
@SuppressWarnings("all")
public class InchAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Inch _self) {
    final org.modelexecution.units.semantics.InchAspectInchAspectProperties _self_ = org.modelexecution.units.semantics.InchAspectInchAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect._privk3_getSymbol(_self_, (org.modelexecution.units.Inch)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.getSymbol((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Inch _self, final double value) {
    final org.modelexecution.units.semantics.InchAspectInchAspectProperties _self_ = org.modelexecution.units.semantics.InchAspectInchAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect._privk3_toCm(_self_, (org.modelexecution.units.Inch)_self,value);
    } else  if (_self instanceof org.modelexecution.units.LengthUnit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCm((org.modelexecution.units.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final InchAspectInchAspectProperties _self_, final Inch _self) {
    return "in";
  }
  
  protected static double _privk3_toCm(final InchAspectInchAspectProperties _self_, final Inch _self, final double value) {
    return (value * 2.54);
  }
}
