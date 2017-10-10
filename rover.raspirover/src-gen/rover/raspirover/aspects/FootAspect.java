package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.aspects.FootAspectFootAspectProperties;
import rover.raspirover.aspects.LengthUnitAspect;

@Aspect(className = Foot.class)
@SuppressWarnings("all")
public class FootAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Foot _self) {
    final rover.raspirover.aspects.FootAspectFootAspectProperties _self_ = rover.raspirover.aspects.FootAspectFootAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Foot){
    					result = rover.raspirover.aspects.FootAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Foot)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Foot _self, final double value) {
    final rover.raspirover.aspects.FootAspectFootAspectProperties _self_ = rover.raspirover.aspects.FootAspectFootAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Foot){
    					result = rover.raspirover.aspects.FootAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.Foot)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect.toCm((rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final FootAspectFootAspectProperties _self_, final Foot _self) {
    return "ft";
  }
  
  protected static double _privk3_toCm(final FootAspectFootAspectProperties _self_, final Foot _self, final double value) {
    return (value * 30.48);
  }
}
