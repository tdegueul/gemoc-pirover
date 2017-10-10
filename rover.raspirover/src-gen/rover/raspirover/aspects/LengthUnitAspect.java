package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectProperties;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = LengthUnit.class)
@SuppressWarnings("all")
public abstract class LengthUnitAspect extends UnitAspect {
  @Abstract
  public static double toCm(final LengthUnit _self, final double value) {
    final rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectProperties _self_ = rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Inch){
    					result = rover.raspirover.aspects.InchAspect.toCm((rover.raspirover.raspirover.Inch)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Centimeter){
    					result = rover.raspirover.aspects.CentimeterAspect.toCm((rover.raspirover.raspirover.Centimeter)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Millimeter){
    					result = rover.raspirover.aspects.MillimeterAspect.toCm((rover.raspirover.raspirover.Millimeter)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Foot){
    					result = rover.raspirover.aspects.FootAspect.toCm((rover.raspirover.raspirover.Foot)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Meter){
    					result = rover.raspirover.aspects.MeterAspect.toCm((rover.raspirover.raspirover.Meter)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.Yard){
    					result = rover.raspirover.aspects.YardAspect.toCm((rover.raspirover.raspirover.Yard)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static double _privk3_toCm(final LengthUnitAspectLengthUnitAspectProperties _self_, final LengthUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
