package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.Unit;
import rover.units.aspects.LengthUnitAspectUnitAspectProperties;

@Aspect(className = Unit.class)
@SuppressWarnings("all")
public abstract class LengthUnitAspect {
  @Abstract
  public static String print(final Unit _self) {
	final rover.units.aspects.LengthUnitAspectUnitAspectProperties _self_ = rover.units.aspects.LengthUnitAspectUnitAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Inch) {
		result = rover.units.aspects.InchAspect.print((rover.units.units.Inch) _self);
	} else if (_self instanceof rover.units.units.Foot) {
		result = rover.units.aspects.FootAspect.print((rover.units.units.Foot) _self);
	} else if (_self instanceof rover.units.units.Degree) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.Degree) _self);
	} else if (_self instanceof rover.units.units.Centimeter) {
		result = rover.units.aspects.CentimeterAspect.print((rover.units.units.Centimeter) _self);
	} else if (_self instanceof rover.units.units.Yard) {
		result = rover.units.aspects.YardAspect.print((rover.units.units.Yard) _self);
	} else if (_self instanceof rover.units.units.Meter) {
		result = rover.units.aspects.MeterAspect.print((rover.units.units.Meter) _self);
	} else if (_self instanceof rover.units.units.Millimeter) {
		result = rover.units.aspects.MillimeterAspect.print((rover.units.units.Millimeter) _self);
	} else if (_self instanceof rover.units.units.LengthUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.LengthUnit) _self);
	} else if (_self instanceof rover.units.units.Gradian) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.Gradian) _self);
	} else if (_self instanceof rover.units.units.Turn) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.Turn) _self);
	} else if (_self instanceof rover.units.units.MetricSystemUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.MetricSystemUnit) _self);
	} else if (_self instanceof rover.units.units.Radian) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.Radian) _self);
	} else if (_self instanceof rover.units.units.AngleUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.AngleUnit) _self);
	} else if (_self instanceof rover.units.units.ImperialSystemUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_,
				(rover.units.units.ImperialSystemUnit) _self);
	} else if (_self instanceof rover.units.units.Unit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_print(_self_, (rover.units.units.Unit) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.String) result;
}
  
  @Abstract
  public static double toCentimeters(final Unit _self, final double value) {
	final rover.units.aspects.LengthUnitAspectUnitAspectProperties _self_ = rover.units.aspects.LengthUnitAspectUnitAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Inch) {
		result = rover.units.aspects.InchAspect.toCentimeters((rover.units.units.Inch) _self, value);
	} else if (_self instanceof rover.units.units.Foot) {
		result = rover.units.aspects.FootAspect.toCentimeters((rover.units.units.Foot) _self, value);
	} else if (_self instanceof rover.units.units.Degree) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.Degree) _self,
				value);
	} else if (_self instanceof rover.units.units.Centimeter) {
		result = rover.units.aspects.CentimeterAspect.toCentimeters((rover.units.units.Centimeter) _self, value);
	} else if (_self instanceof rover.units.units.Yard) {
		result = rover.units.aspects.YardAspect.toCentimeters((rover.units.units.Yard) _self, value);
	} else if (_self instanceof rover.units.units.Meter) {
		result = rover.units.aspects.MeterAspect.toCentimeters((rover.units.units.Meter) _self, value);
	} else if (_self instanceof rover.units.units.Millimeter) {
		result = rover.units.aspects.MillimeterAspect.toCentimeters((rover.units.units.Millimeter) _self, value);
	} else if (_self instanceof rover.units.units.LengthUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_,
				(rover.units.units.LengthUnit) _self, value);
	} else if (_self instanceof rover.units.units.Gradian) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.Gradian) _self,
				value);
	} else if (_self instanceof rover.units.units.Turn) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.Turn) _self,
				value);
	} else if (_self instanceof rover.units.units.MetricSystemUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_,
				(rover.units.units.MetricSystemUnit) _self, value);
	} else if (_self instanceof rover.units.units.Radian) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.Radian) _self,
				value);
	} else if (_self instanceof rover.units.units.AngleUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.AngleUnit) _self,
				value);
	} else if (_self instanceof rover.units.units.ImperialSystemUnit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_,
				(rover.units.units.ImperialSystemUnit) _self, value);
	} else if (_self instanceof rover.units.units.Unit) {
		result = rover.units.aspects.LengthUnitAspect._privk3_toCentimeters(_self_, (rover.units.units.Unit) _self,
				value);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (double) result;
}
  
  protected static String _privk3_print(final LengthUnitAspectUnitAspectProperties _self_, final Unit _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static double _privk3_toCentimeters(final LengthUnitAspectUnitAspectProperties _self_, final Unit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
