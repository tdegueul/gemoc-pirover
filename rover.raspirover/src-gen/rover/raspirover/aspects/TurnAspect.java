package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Turn;
import rover.raspirover.aspects.AngleUnitAspect;
import rover.raspirover.aspects.TurnAspectTurnAspectProperties;

@Aspect(className = Turn.class)
@SuppressWarnings("all")
public class TurnAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Turn _self) {
    final rover.raspirover.aspects.TurnAspectTurnAspectProperties _self_ = rover.raspirover.aspects.TurnAspectTurnAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Turn){
    					result = rover.raspirover.aspects.TurnAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Turn)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toRad(final Turn _self, final double value) {
    final rover.raspirover.aspects.TurnAspectTurnAspectProperties _self_ = rover.raspirover.aspects.TurnAspectTurnAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Turn){
    					result = rover.raspirover.aspects.TurnAspect._privk3_toRad(_self_, (rover.raspirover.raspirover.Turn)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.AngleUnit){
    					result = rover.raspirover.aspects.AngleUnitAspect.toRad((rover.raspirover.raspirover.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final TurnAspectTurnAspectProperties _self_, final Turn _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final TurnAspectTurnAspectProperties _self_, final Turn _self, final double value) {
    return ((value * 2) * Math.PI);
  }
}
