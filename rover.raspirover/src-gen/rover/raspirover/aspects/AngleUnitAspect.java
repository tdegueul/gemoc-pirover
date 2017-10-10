package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.raspirover.AngleUnit;
import rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectProperties;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = AngleUnit.class)
@SuppressWarnings("all")
public abstract class AngleUnitAspect extends UnitAspect {
  @Abstract
  public static double toRad(final AngleUnit _self, final double value) {
    final rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectProperties _self_ = rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Turn){
    					result = rover.raspirover.aspects.TurnAspect.toRad((rover.raspirover.raspirover.Turn)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Radian){
    					result = rover.raspirover.aspects.RadianAspect.toRad((rover.raspirover.raspirover.Radian)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Degree){
    					result = rover.raspirover.aspects.DegreeAspect.toRad((rover.raspirover.raspirover.Degree)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Gradian){
    					result = rover.raspirover.aspects.GradianAspect.toRad((rover.raspirover.raspirover.Gradian)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.AngleUnit){
    					result = rover.raspirover.aspects.AngleUnitAspect._privk3_toRad(_self_, (rover.raspirover.raspirover.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_toRad(final AngleUnitAspectAngleUnitAspectProperties _self_, final AngleUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
