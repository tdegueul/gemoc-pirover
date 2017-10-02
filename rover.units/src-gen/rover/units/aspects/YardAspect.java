package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Yard;
import rover.units.aspects.LengthUnitAspect;
import rover.units.aspects.YardAspectYardAspectProperties;

@Aspect(className = Yard.class)
@SuppressWarnings("all")
public class YardAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Yard _self) {
	final rover.units.aspects.YardAspectYardAspectProperties _self_ = rover.units.aspects.YardAspectYardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCentimeters(final Yard _self, final double value) {
	final rover.units.aspects.YardAspectYardAspectProperties _self_ = rover.units.aspects.YardAspectYardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCentimeters(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_print(final YardAspectYardAspectProperties _self_, final Yard _self) {
    return "yd";
  }
  
  protected static double _privk3_toCentimeters(final YardAspectYardAspectProperties _self_, final Yard _self, final double value) {
    return (value * 91.44);
  }
}
