package org.modelexecution.units.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.units.AngleUnit;
import org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectProperties;
import org.modelexecution.units.semantics.UnitAspect;

@Aspect(className = AngleUnit.class)
@SuppressWarnings("all")
public abstract class AngleUnitAspect extends UnitAspect {
  @Abstract
  public static double toRad(final AngleUnit _self, final double value) {
    final org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectProperties _self_ = org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.units.Radian){
    					result = org.modelexecution.units.semantics.RadianAspect.toRad((org.modelexecution.units.Radian)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Degree){
    					result = org.modelexecution.units.semantics.DegreeAspect.toRad((org.modelexecution.units.Degree)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Turn){
    					result = org.modelexecution.units.semantics.TurnAspect.toRad((org.modelexecution.units.Turn)_self,value);
    } else  if (_self instanceof org.modelexecution.units.Gradian){
    					result = org.modelexecution.units.semantics.GradianAspect.toRad((org.modelexecution.units.Gradian)_self,value);
    } else  if (_self instanceof org.modelexecution.units.AngleUnit){
    					result = org.modelexecution.units.semantics.AngleUnitAspect._privk3_toRad(_self_, (org.modelexecution.units.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_toRad(final AngleUnitAspectAngleUnitAspectProperties _self_, final AngleUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
