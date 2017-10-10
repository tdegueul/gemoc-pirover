package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Degree;
import rover.raspirover.aspects.AngleUnitAspect;
import rover.raspirover.aspects.DegreeAspectDegreeAspectProperties;

@Aspect(className = Degree.class)
@SuppressWarnings("all")
public class DegreeAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Degree _self) {
    final rover.raspirover.aspects.DegreeAspectDegreeAspectProperties _self_ = rover.raspirover.aspects.DegreeAspectDegreeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Degree){
    					result = rover.raspirover.aspects.DegreeAspect._privk3_getSymbol(_self_, (rover.raspirover.raspirover.Degree)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Unit){
    					result = rover.raspirover.aspects.UnitAspect.getSymbol((rover.raspirover.raspirover.Unit)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  @OverrideAspectMethod
  public static double toRad(final Degree _self, final double value) {
    final rover.raspirover.aspects.DegreeAspectDegreeAspectProperties _self_ = rover.raspirover.aspects.DegreeAspectDegreeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rover.raspirover.raspirover.Degree){
    					result = rover.raspirover.aspects.DegreeAspect._privk3_toRad(_self_, (rover.raspirover.raspirover.Degree)_self,value);
    } else  if (_self instanceof rover.raspirover.raspirover.AngleUnit){
    					result = rover.raspirover.aspects.AngleUnitAspect.toRad((rover.raspirover.raspirover.AngleUnit)_self,value);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (double)result;
  }
  
  protected static String _privk3_getSymbol(final DegreeAspectDegreeAspectProperties _self_, final Degree _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final DegreeAspectDegreeAspectProperties _self_, final Degree _self, final double value) {
    return ((value * Math.PI) / 180);
  }
}
