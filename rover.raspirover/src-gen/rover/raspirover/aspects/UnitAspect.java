package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.UnitAspectUnitAspectProperties;

@Aspect(className = Unit.class)
@SuppressWarnings("all")
public abstract class UnitAspect {
  @Abstract
  public static String getSymbol(final Unit _self) {
    final rover.raspirover.aspects.UnitAspectUnitAspectProperties _self_ = rover.raspirover.aspects.UnitAspectUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Inch){
    					result = rover.raspirover.aspects.InchAspect.getSymbol((rover.raspirover.raspirover.Inch)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Degree){
    					result = rover.raspirover.aspects.DegreeAspect.getSymbol((rover.raspirover.raspirover.Degree)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Gradian){
    					result = rover.raspirover.aspects.GradianAspect.getSymbol((rover.raspirover.raspirover.Gradian)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Centimeter){
    					result = rover.raspirover.aspects.CentimeterAspect.getSymbol((rover.raspirover.raspirover.Centimeter)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Turn){
    					result = rover.raspirover.aspects.TurnAspect.getSymbol((rover.raspirover.raspirover.Turn)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Millimeter){
    					result = rover.raspirover.aspects.MillimeterAspect.getSymbol((rover.raspirover.raspirover.Millimeter)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Foot){
    					result = rover.raspirover.aspects.FootAspect.getSymbol((rover.raspirover.raspirover.Foot)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Radian){
    					result = rover.raspirover.aspects.RadianAspect.getSymbol((rover.raspirover.raspirover.Radian)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Meter){
    					result = rover.raspirover.aspects.MeterAspect.getSymbol((rover.raspirover.raspirover.Meter)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Yard){
    					result = rover.raspirover.aspects.YardAspect.getSymbol((rover.raspirover.raspirover.Yard)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getSymbol(final UnitAspectUnitAspectProperties _self_, final Unit _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
