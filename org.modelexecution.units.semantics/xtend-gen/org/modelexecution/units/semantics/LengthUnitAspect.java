package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties;

@Aspect(className = Unit.class)
@SuppressWarnings("all")
public abstract class LengthUnitAspect {
  @Abstract
  public static String print(final Unit _self) {
    final org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties _self_ = org.modelexecution.units.semantics.LengthUnitAspectUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect.print((org.modelexecution.units.Inch)_self);
    } else  if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect.print((org.modelexecution.units.Foot)_self);
    } else  if (_self instanceof org.modelexecution.units.Millimeter){
    					result = org.modelexecution.units.semantics.MillimeterAspect.print((org.modelexecution.units.Millimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect.print((org.modelexecution.units.Yard)_self);
    } else  if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect.print((org.modelexecution.units.Centimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect.print((org.modelexecution.units.Meter)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect._privk3_print(_self_, (org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @Abstract
  public static double toCentimeters(final Unit _self, final double value) {
    final org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties _self_ = org.modelexecution.units.semantics.LengthUnitAspectUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect.toCentimeters((org.modelexecution.units.Inch)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect.toCentimeters((org.modelexecution.units.Foot)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Millimeter){
    					result = org.modelexecution.units.semantics.MillimeterAspect.toCentimeters((org.modelexecution.units.Millimeter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect.toCentimeters((org.modelexecution.units.Yard)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect.toCentimeters((org.modelexecution.units.Centimeter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect.toCentimeters((org.modelexecution.units.Meter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect._privk3_toCentimeters(_self_, (org.modelexecution.units.Unit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_print(final LengthUnitAspectUnitAspectProperties _self_, final Unit _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static double _privk3_toCentimeters(final LengthUnitAspectUnitAspectProperties _self_, final Unit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
