package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Yard;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.aspects.YardAspectYardAspectProperties;

@Aspect(className = Yard.class)
@SuppressWarnings("all")
public class YardAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Yard _self) {
	final rover.raspirover.aspects.YardAspectYardAspectProperties _self_ = rover.raspirover.aspects.YardAspectYardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCentimeters(final Yard _self, final double value) {
	final rover.raspirover.aspects.YardAspectYardAspectProperties _self_ = rover.raspirover.aspects.YardAspectYardAspectContext
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
