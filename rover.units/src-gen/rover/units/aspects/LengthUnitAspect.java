package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.LengthUnit;
import rover.units.aspects.LengthUnitAspectLengthUnitAspectProperties;
import rover.units.aspects.UnitAspect;

@Aspect(className = LengthUnit.class)
@SuppressWarnings("all")
public abstract class LengthUnitAspect extends UnitAspect {
  @Abstract
  public static double toCm(final LengthUnit _self, final double value) {
	final rover.units.aspects.LengthUnitAspectLengthUnitAspectProperties _self_ = rover.units.aspects.LengthUnitAspectLengthUnitAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Millimeter) {
		result = rover.units.aspects.MillimeterAspect.toCm((rover.units.units.Millimeter) _self, value);
	} else if (_self instanceof rover.units.units.Yard) {
		result = rover.units.aspects.YardAspect.toCm((rover.units.units.Yard) _self, value);
	} else if (_self instanceof rover.units.units.Foot) {
		result = rover.units.aspects.FootAspect.toCm((rover.units.units.Foot) _self, value);
	} else if (_self instanceof rover.units.units.Centimeter) {
		result = rover.units.aspects.CentimeterAspect.toCm((rover.units.units.Centimeter) _self, value);
	} else if (_self instanceof rover.units.units.Meter) {
		result = rover.units.aspects.MeterAspect.toCm((rover.units.units.Meter) _self, value);
	} else if (_self instanceof rover.units.units.Inch) {
		result = rover.units.aspects.InchAspect.toCm((rover.units.units.Inch) _self, value);
	} else if (_self instanceof rover.units.units.LengthUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCm(_self_, (rover.units.units.LengthUnit) _self, value);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (double) result;
}
  
  protected static double _privk3_toCm(final LengthUnitAspectLengthUnitAspectProperties _self_, final LengthUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
