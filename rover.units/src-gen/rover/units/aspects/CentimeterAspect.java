package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Centimeter;
import rover.units.aspects.CentimeterAspectCentimeterAspectProperties;
import rover.units.aspects.UnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Centimeter _self) {
	final rover.units.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.units.aspects.CentimeterAspectCentimeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_print(final CentimeterAspectCentimeterAspectProperties _self_, final Centimeter _self) {
    return "cm";
  }
}
