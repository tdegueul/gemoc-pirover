package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.Unit;
import rover.units.aspects.UnitAspectUnitAspectProperties;

@Aspect(className = Unit.class)
@SuppressWarnings("all")
public abstract class UnitAspect {
  @Abstract
  public static String getSymbol(final Unit _self) {
	final rover.units.aspects.UnitAspectUnitAspectProperties _self_ = rover.units.aspects.UnitAspectUnitAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Millimeter) {
		result = rover.units.aspects.MillimeterAspect.getSymbol((rover.units.units.Millimeter) _self);
	} else if (_self instanceof rover.units.units.Foot) {
		result = rover.units.aspects.FootAspect.getSymbol((rover.units.units.Foot) _self);
	} else if (_self instanceof rover.units.units.Centimeter) {
		result = rover.units.aspects.CentimeterAspect.getSymbol((rover.units.units.Centimeter) _self);
	} else if (_self instanceof rover.units.units.Meter) {
		result = rover.units.aspects.MeterAspect.getSymbol((rover.units.units.Meter) _self);
	} else if (_self instanceof rover.units.units.Yard) {
		result = rover.units.aspects.YardAspect.getSymbol((rover.units.units.Yard) _self);
	} else if (_self instanceof rover.units.units.Inch) {
		result = rover.units.aspects.InchAspect.getSymbol((rover.units.units.Inch) _self);
	} else if (_self instanceof rover.units.units.LengthUnit) {
		result = rover.units.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.units.units.LengthUnit) _self);
	} else if (_self instanceof rover.units.units.ImperialSystemUnit) {
		result = rover.units.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.units.units.ImperialSystemUnit) _self);
	} else if (_self instanceof rover.units.units.Turn) {
		result = rover.units.aspects.TurnAspect.getSymbol((rover.units.units.Turn) _self);
	} else if (_self instanceof rover.units.units.MetricSystemUnit) {
		result = rover.units.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.units.units.MetricSystemUnit) _self);
	} else if (_self instanceof rover.units.units.Radian) {
		result = rover.units.aspects.RadianAspect.getSymbol((rover.units.units.Radian) _self);
	} else if (_self instanceof rover.units.units.Degree) {
		result = rover.units.aspects.DegreeAspect.getSymbol((rover.units.units.Degree) _self);
	} else if (_self instanceof rover.units.units.Gradian) {
		result = rover.units.aspects.GradianAspect.getSymbol((rover.units.units.Gradian) _self);
	} else if (_self instanceof rover.units.units.AngleUnit) {
		result = rover.units.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.units.units.AngleUnit) _self);
	} else if (_self instanceof rover.units.units.Unit) {
		result = rover.units.aspects.UnitAspect._privk3_getSymbol(_self_, (rover.units.units.Unit) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_getSymbol(final UnitAspectUnitAspectProperties _self_, final Unit _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
