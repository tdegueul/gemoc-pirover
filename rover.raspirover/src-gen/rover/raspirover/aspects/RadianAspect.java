package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Radian;
import rover.raspirover.aspects.AngleUnitAspect;
import rover.raspirover.aspects.RadianAspectRadianAspectProperties;

@Aspect(className = Radian.class)
@SuppressWarnings("all")
public class RadianAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Radian _self) {
    final rover.raspirover.aspects.RadianAspectRadianAspectProperties _self_ = rover.raspirover.aspects.RadianAspectRadianAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Radian){
    					result = rover.raspirover.aspects.RadianAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Radian)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toRad(final Radian _self, final double value) {
    final rover.raspirover.aspects.RadianAspectRadianAspectProperties _self_ = rover.raspirover.aspects.RadianAspectRadianAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Radian){
    					result = rover.raspirover.aspects.RadianAspect._privk3_toRad(_self_, (rover.raspirover.raspirover.Radian)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.AngleUnit){
    					result = rover.raspirover.aspects.AngleUnitAspect.toRad((rover.raspirover.raspirover.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final RadianAspectRadianAspectProperties _self_, final Radian _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final RadianAspectRadianAspectProperties _self_, final Radian _self, final double value) {
    return value;
  }
}
