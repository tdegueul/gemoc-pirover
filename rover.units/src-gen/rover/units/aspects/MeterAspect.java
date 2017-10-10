package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.units.units.Meter;
import rover.units.aspects.LengthUnitAspect;
import rover.units.aspects.MeterAspectMeterAspectProperties;

@Aspect(className = Meter.class)
@SuppressWarnings("all")
public class MeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String getSymbol(final Meter _self) {
	final rover.units.aspects.MeterAspectMeterAspectProperties _self_ = rover.units.aspects.MeterAspectMeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getSymbol(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCm(final Meter _self, final double value) {
	final rover.units.aspects.MeterAspectMeterAspectProperties _self_ = rover.units.aspects.MeterAspectMeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCm(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_getSymbol(final MeterAspectMeterAspectProperties _self_, final Meter _self) {
    return "m";
  }
  
  protected static double _privk3_toCm(final MeterAspectMeterAspectProperties _self_, final Meter _self, final double value) {
    return (value * 100);
  }
}
