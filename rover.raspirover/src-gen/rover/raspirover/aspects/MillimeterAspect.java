package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Millimeter;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties;

@Aspect(className = Millimeter.class)
@SuppressWarnings("all")
public class MillimeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Millimeter _self) {
    final rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.raspirover.aspects.MillimeterAspectMillimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Millimeter){
    					result = rover.raspirover.aspects.MillimeterAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Millimeter)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Millimeter _self, final double value) {
    final rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.raspirover.aspects.MillimeterAspectMillimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Millimeter){
    					result = rover.raspirover.aspects.MillimeterAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.Millimeter)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect.toCm((rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final MillimeterAspectMillimeterAspectProperties _self_, final Millimeter _self) {
    return "mm";
  }
  
  protected static double _privk3_toCm(final MillimeterAspectMillimeterAspectProperties _self_, final Millimeter _self, final double value) {
    return (value * 0.1);
  }
}
