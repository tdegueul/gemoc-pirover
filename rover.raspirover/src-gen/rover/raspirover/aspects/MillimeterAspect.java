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
  public static String print(final Millimeter _self) {
	final rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.raspirover.aspects.MillimeterAspectMillimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCentimeters(final Millimeter _self, final double value) {
	final rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.raspirover.aspects.MillimeterAspectMillimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCentimeters(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_print(final MillimeterAspectMillimeterAspectProperties _self_, final Millimeter _self) {
    return "mm";
  }
  
  protected static double _privk3_toCentimeters(final MillimeterAspectMillimeterAspectProperties _self_, final Millimeter _self, final double value) {
    return (value * 0.1);
  }
}
