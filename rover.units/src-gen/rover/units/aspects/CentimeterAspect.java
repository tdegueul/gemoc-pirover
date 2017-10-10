package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Centimeter;
import rover.units.aspects.CentimeterAspectCentimeterAspectProperties;
import rover.units.aspects.LengthUnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Centimeter _self) {
	final rover.units.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.units.aspects.CentimeterAspectCentimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCm(final Centimeter _self, final double value) {
	final rover.units.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.units.aspects.CentimeterAspectCentimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCm(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self) {
    return "cm";
  }
  
  protected static double _privk3_toCm(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self, final double value) {
    return value;
  }
}
