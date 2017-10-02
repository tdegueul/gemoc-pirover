package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Yard;
import rover.units.aspects.UnitAspect;
import rover.units.aspects.YardAspectYardAspectProperties;

@Aspect(className = Yard.class)
@SuppressWarnings("all")
public class YardAspect extends UnitAspect {
  @OverrideAspectMethod
  public static String print(final Yard _self) {
	final rover.units.aspects.YardAspectYardAspectProperties _self_ = rover.units.aspects.YardAspectYardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_print(final YardAspectYardAspectProperties _self_, final Yard _self) {
    return "yd";
  }
}
