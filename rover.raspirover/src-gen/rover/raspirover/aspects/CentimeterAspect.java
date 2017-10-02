package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties;
import rover.raspirover.aspects.UnitAspect;

@Aspect(className = Centimeter.class)
@SuppressWarnings("all")
public class CentimeterAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Centimeter _self) {
	final rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties _self_ = rover.raspirover.aspects.CentimeterAspectCentimeterAspectContext
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
