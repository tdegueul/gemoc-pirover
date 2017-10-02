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
  public static String print(final Meter _self) {
    final org.modelexecution.units.semantics.MeterAspectMeterAspectProperties _self_ = org.modelexecution.units.semantics.MeterAspectMeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect._privk3_print(_self_, (org.modelexecution.units.Meter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.print((org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCentimeters(final Meter _self, final double value) {
    final org.modelexecution.units.semantics.MeterAspectMeterAspectProperties _self_ = org.modelexecution.units.semantics.MeterAspectMeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect._privk3_toCentimeters(_self_, (org.modelexecution.units.Meter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect.toCentimeters((org.modelexecution.units.Unit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_print(final MeterAspectMeterAspectProperties _self_, final Meter _self) {
    return "m";
  }
  
  protected static double _privk3_toCentimeters(final MeterAspectMeterAspectProperties _self_, final Meter _self, final double value) {
    return (value * 100);
  }
}
