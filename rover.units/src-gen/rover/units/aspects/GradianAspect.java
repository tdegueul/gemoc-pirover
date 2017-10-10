package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Gradian;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.GradianAspectGradianAspectProperties;

@Aspect(className = Gradian.class)
@SuppressWarnings("all")
public class GradianAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Gradian _self) {
	final rover.units.aspects.GradianAspectGradianAspectProperties _self_ = rover.units.aspects.GradianAspectGradianAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toRad(final Gradian _self, final double value) {
	final rover.units.aspects.GradianAspectGradianAspectProperties _self_ = rover.units.aspects.GradianAspectGradianAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toRad(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final GradianAspectGradianAspectProperties _self_, final Gradian _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final GradianAspectGradianAspectProperties _self_, final Gradian _self, final double value) {
    return ((value * Math.PI) / 200);
  }
}
