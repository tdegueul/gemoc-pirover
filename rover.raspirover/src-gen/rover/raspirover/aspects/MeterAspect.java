package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.raspirover.Meter;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.aspects.MeterAspectMeterAspectProperties;

@Aspect(className = Meter.class)
@SuppressWarnings("all")
public class MeterAspect extends LengthUnitAspect {
  @OverrideAspectMethod
  public static String print(final Meter _self) {
	final rover.raspirover.aspects.MeterAspectMeterAspectProperties _self_ = rover.raspirover.aspects.MeterAspectMeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @OverrideAspectMethod
  public static double toCentimeters(final Meter _self, final double value) {
	final rover.raspirover.aspects.MeterAspectMeterAspectProperties _self_ = rover.raspirover.aspects.MeterAspectMeterAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCentimeters(_self_, _self, value);
	;
	return (double) result;
}
  
  protected static String _privk3_print(final MeterAspectMeterAspectProperties _self_, final Meter _self) {
    return "m";
  }
  
  protected static double _privk3_toCentimeters(final MeterAspectMeterAspectProperties _self_, final Meter _self, final double value) {
    return (value * 100);
  }
}
