package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectProperties;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = LengthUnit.class)
@SuppressWarnings("all")
public abstract class LengthUnitAspect extends UnitAspect {
  @Abstract
  public static double toCm(final LengthUnit _self, final double value) {
    final org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectProperties _self_ = org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect.toCm((org.modelexecution.units.Inch)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect.toCm((org.modelexecution.units.Centimeter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Millimeter){
    					result = org.modelexecution.units.semantics.MillimeterAspect.toCm((org.modelexecution.units.Millimeter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect.toCm((org.modelexecution.units.Foot)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect.toCm((org.modelexecution.units.Meter)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect.toCm((org.modelexecution.units.Yard)_self,value);
    } else  if (_self instanceof org.modelexecution.units.LengthUnit){
    					result = org.modelexecution.units.semantics.LengthUnitAspect._privk3_toCm(_self_, (org.modelexecution.units.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_toCm(final LengthUnitAspectLengthUnitAspectProperties _self_, final LengthUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
