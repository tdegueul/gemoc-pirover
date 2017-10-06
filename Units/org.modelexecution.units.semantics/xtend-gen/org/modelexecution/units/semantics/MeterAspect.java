package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.units.Meter;
import org.modelexecution.units.semantics.LengthUnitAspect;
import org.modelexecution.units.semantics.MeterAspectMeterAspectProperties;

@Aspect(className = Meter.class)
@SuppressWarnings("all")
public class MeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Meter _self) {
    final org.modelexecution.units.semantics.MeterAspectMeterAspectProperties _self_ = org.modelexecution.units.semantics.MeterAspectMeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect._privk3_getSymbol(_self_, (org.modelexecution.units.Meter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect.getSymbol((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Meter _self, final double value) {
    final org.modelexecution.units.semantics.MeterAspectMeterAspectProperties _self_ = org.modelexecution.units.semantics.MeterAspectMeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect._privk3_toCm(_self_, (org.modelexecution.units.Meter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.LengthUnit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCm((org.modelexecution.units.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final MeterAspectMeterAspectProperties _self_, final Meter _self) {
    return "m";
  }
  
  protected static double _privk3_toCm(final MeterAspectMeterAspectProperties _self_, final Meter _self, final double value) {
    return (value * 100);
  }
}
