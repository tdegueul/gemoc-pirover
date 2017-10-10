package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Radian;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.RadianAspectRadianAspectProperties;

@Aspect(className = Radian.class)
@SuppressWarnings("all")
public class RadianAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Radian _self) {
	final rover.units.aspects.RadianAspectRadianAspectProperties _self_ = rover.units.aspects.RadianAspectRadianAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toRad(final Radian _self, final double value) {
	final rover.units.aspects.RadianAspectRadianAspectProperties _self_ = rover.units.aspects.RadianAspectRadianAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toRad(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final RadianAspectRadianAspectProperties _self_, final Radian _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final RadianAspectRadianAspectProperties _self_, final Radian _self, final double value) {
    return value;
  }
}
