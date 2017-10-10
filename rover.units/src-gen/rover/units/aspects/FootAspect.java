package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Foot;
import rover.units.aspects.FootAspectFootAspectProperties;
import rover.units.aspects.LengthUnitAspect;

@Aspect(className = Foot.class)
@SuppressWarnings("all")
public class FootAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Foot _self) {
	final rover.units.aspects.FootAspectFootAspectProperties _self_ = rover.units.aspects.FootAspectFootAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCm(final Foot _self, final double value) {
	final rover.units.aspects.FootAspectFootAspectProperties _self_ = rover.units.aspects.FootAspectFootAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCm(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final FootAspectFootAspectProperties _self_, final Foot _self) {
    return "ft";
  }
  
  protected static double _privk3_toCm(final FootAspectFootAspectProperties _self_, final Foot _self, final double value) {
    return (value * 30.48);
  }
}
