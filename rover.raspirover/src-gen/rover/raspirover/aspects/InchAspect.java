package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.aspects.InchAspectInchAspectProperties;
import rover.raspirover.aspects.LengthUnitAspect;

@Aspect(className = Inch.class)
@SuppressWarnings("all")
public class InchAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Inch _self) {
    final rover.raspirover.aspects.InchAspectInchAspectProperties _self_ = rover.raspirover.aspects.InchAspectInchAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Inch){
    					result = rover.raspirover.aspects.InchAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Inch)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Inch _self, final double value) {
    final rover.raspirover.aspects.InchAspectInchAspectProperties _self_ = rover.raspirover.aspects.InchAspectInchAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Inch){
    					result = rover.raspirover.aspects.InchAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.Inch)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect.toCm((rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final InchAspectInchAspectProperties _self_, final Inch _self) {
    return "in";
  }
  
  protected static double _privk3_toCm(final InchAspectInchAspectProperties _self_, final Inch _self, final double value) {
    return (value * 2.54);
  }
}
