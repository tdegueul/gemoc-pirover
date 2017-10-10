package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Yard;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.aspects.YardAspectYardAspectProperties;

@Aspect(className = Yard.class)
@SuppressWarnings("all")
public class YardAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Yard _self) {
    final rover.raspirover.aspects.YardAspectYardAspectProperties _self_ = rover.raspirover.aspects.YardAspectYardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Yard){
    					result = rover.raspirover.aspects.YardAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Yard)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Yard _self, final double value) {
    final rover.raspirover.aspects.YardAspectYardAspectProperties _self_ = rover.raspirover.aspects.YardAspectYardAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Yard){
    					result = rover.raspirover.aspects.YardAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.Yard)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect.toCm((rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final YardAspectYardAspectProperties _self_, final Yard _self) {
    return "yd";
  }
  
  protected static double _privk3_toCm(final YardAspectYardAspectProperties _self_, final Yard _self, final double value) {
    return (value * 91.44);
  }
}
