package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties;
import rover.raspirover.aspects.LengthUnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Centimeter _self) {
    final rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.raspirover.aspects.CentimeterAspectCentimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Centimeter){
    					result = rover.raspirover.aspects.CentimeterAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Centimeter)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toCm(final Centimeter _self, final double value) {
    final rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.raspirover.aspects.CentimeterAspectCentimeterAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Centimeter){
    					result = rover.raspirover.aspects.CentimeterAspect._privk3_toCm(_self_, (rover.raspirover.raspirover.Centimeter)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.LengthUnit){
    					result = rover.raspirover.aspects.LengthUnitAspect.toCm((rover.raspirover.raspirover.LengthUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self) {
    return "cm";
  }
  
  protected static double _privk3_toCm(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self, final double value) {
    return value;
  }
}
