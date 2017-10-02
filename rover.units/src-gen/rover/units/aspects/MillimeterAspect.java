package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Millimeter;
import rover.units.aspects.LengthUnitAspect;
import rover.units.aspects.MillimeterAspectMillimeterAspectProperties;

@Aspect(className = Millimeter.class)
@SuppressWarnings("all")
public class MillimeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Millimeter _self) {
	final rover.units.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.units.aspects.MillimeterAspectMillimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCentimeters(final Millimeter _self, final double value) {
	final rover.units.aspects.MillimeterAspectMillimeterAspectProperties _self_ = rover.units.aspects.MillimeterAspectMillimeterAspectContext
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
