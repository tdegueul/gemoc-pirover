package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Inch;
import rover.units.aspects.InchAspectInchAspectProperties;
import rover.units.aspects.LengthUnitAspect;

@Aspect(className = Inch.class)
@SuppressWarnings("all")
public class InchAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Inch _self) {
	final rover.units.aspects.InchAspectInchAspectProperties _self_ = rover.units.aspects.InchAspectInchAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCm(final Inch _self, final double value) {
	final rover.units.aspects.InchAspectInchAspectProperties _self_ = rover.units.aspects.InchAspectInchAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCm(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final InchAspectInchAspectProperties _self_, final Inch _self) {
    return "in";
  }
  
  protected static double _privk3_toCm(final InchAspectInchAspectProperties _self_, final Inch _self, final double value) {
    return (value * 2.54);
  }
}
