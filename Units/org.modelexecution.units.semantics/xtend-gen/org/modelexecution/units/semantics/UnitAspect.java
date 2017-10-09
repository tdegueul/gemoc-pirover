package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.UnitAspectUnitAspectProperties;

@Aspect(className = Unit.class)
@SuppressWarnings("all")
public abstract class UnitAspect {
  @Abstract
  public static String getSymbol(final Unit _self) {
    final org.modelexecution.units.semantics.UnitAspectUnitAspectProperties _self_ = org.modelexecution.units.semantics.UnitAspectUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Centimeter){
    					result = org.modelexecution.units.semantics.CentimeterAspect.getSymbol((org.modelexecution.units.Centimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Degree){
    					result = org.modelexecution.units.semantics.DegreeAspect.getSymbol((org.modelexecution.units.Degree)_self);
    } else  if (_self instanceof org.modelexecution.units.Yard){
    					result = org.modelexecution.units.semantics.YardAspect.getSymbol((org.modelexecution.units.Yard)_self);
    } else  if (_self instanceof org.modelexecution.units.Millimeter){
    					result = org.modelexecution.units.semantics.MillimeterAspect.getSymbol((org.modelexecution.units.Millimeter)_self);
    } else  if (_self instanceof org.modelexecution.units.Turn){
    					result = org.modelexecution.units.semantics.TurnAspect.getSymbol((org.modelexecution.units.Turn)_self);
    } else  if (_self instanceof org.modelexecution.units.Gradian){
    					result = org.modelexecution.units.semantics.GradianAspect.getSymbol((org.modelexecution.units.Gradian)_self);
    } else  if (_self instanceof org.modelexecution.units.Meter){
    					result = org.modelexecution.units.semantics.MeterAspect.getSymbol((org.modelexecution.units.Meter)_self);
    } else  if (_self instanceof org.modelexecution.units.Inch){
    					result = org.modelexecution.units.semantics.InchAspect.getSymbol((org.modelexecution.units.Inch)_self);
    } else  if (_self instanceof org.modelexecution.units.Foot){
    					result = org.modelexecution.units.semantics.FootAspect.getSymbol((org.modelexecution.units.Foot)_self);
    } else  if (_self instanceof org.modelexecution.units.Radian){
    					result = org.modelexecution.units.semantics.RadianAspect.getSymbol((org.modelexecution.units.Radian)_self);
    } else  if (_self instanceof org.modelexecution.units.Unit){
    					result = org.modelexecution.units.semantics.UnitAspect._privk3_getSymbol(_self_, (org.modelexecution.units.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getSymbol(final UnitAspectUnitAspectProperties _self_, final Unit _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
