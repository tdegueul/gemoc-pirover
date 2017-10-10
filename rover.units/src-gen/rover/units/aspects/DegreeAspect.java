package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Degree;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.DegreeAspectDegreeAspectProperties;

@Aspect(className = Degree.class)
@SuppressWarnings("all")
public class DegreeAspect extends AngleUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Degree _self) {
	final rover.units.aspects.DegreeAspectDegreeAspectProperties _self_ = rover.units.aspects.DegreeAspectDegreeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toRad(final Degree _self, final double value) {
	final rover.units.aspects.DegreeAspectDegreeAspectProperties _self_ = rover.units.aspects.DegreeAspectDegreeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toRad(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final DegreeAspectDegreeAspectProperties _self_, final Degree _self) {
    return "rad";
  }
  
  protected static double _privk3_toRad(final DegreeAspectDegreeAspectProperties _self_, final Degree _self, final double value) {
    return ((value * Math.PI) / 180);
  }
}
