package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Gradian;
import org.modelexecution.units.semantics.AngleUnitAspect;
import org.modelexecution.units.semantics.GradianAspectGradianAspectProperties;

@Aspect(className = Gradian.class)
@SuppressWarnings("all")
public class GradianAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Gradian _self) {
    final org.modelexecution.units.semantics.GradianAspectGradianAspectProperties _self_ = org.modelexecution.units.semantics.GradianAspectGradianAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Gradian){
    					result = org.modelexecution.units.semantics.GradianAspect._privk3_getSymbol(_self_, (org.modelexecution.units.Gradian)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.getSymbol((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toRad(final Gradian _self, final double value) {
    final org.modelexecution.units.semantics.GradianAspectGradianAspectProperties _self_ = org.modelexecution.units.semantics.GradianAspectGradianAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Gradian){
    					result = org.modelexecution.units.semantics.GradianAspect._privk3_toRad(_self_, (org.modelexecution.units.Gradian)_self,value);
    } else  if (_self instanceof org.modelexecution.units.AngleUnit){
    					result = org.modelexecution.units.semantics.AngleUnitAspect.toRad((org.modelexecution.units.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final GradianAspectGradianAspectProperties _self_, final Gradian _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final GradianAspectGradianAspectProperties _self_, final Gradian _self, final double value) {
    return ((value * Math.PI) / 200);
  }
}
