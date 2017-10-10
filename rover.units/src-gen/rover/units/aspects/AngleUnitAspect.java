package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.AngleUnit;
import rover.units.aspects.AngleUnitAspectAngleUnitAspectProperties;
import rover.units.aspects.UnitAspect;

@Aspect(className = AngleUnit.class)
@SuppressWarnings("all")
public abstract class AngleUnitAspect extends UnitAspect {
  @Abstract
  public static double toRad(final AngleUnit _self, final double value) {
	final rover.units.aspects.AngleUnitAspectAngleUnitAspectProperties _self_ = rover.units.aspects.AngleUnitAspectAngleUnitAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Radian) {
		result = rover.units.aspects.RadianAspect.toRad((rover.units.units.Radian) _self, value);
	} else if (_self instanceof rover.units.units.Degree) {
		result = rover.units.aspects.DegreeAspect.toRad((rover.units.units.Degree) _self, value);
	} else if (_self instanceof rover.units.units.Turn) {
		result = rover.units.aspects.TurnAspect.toRad((rover.units.units.Turn) _self, value);
	} else if (_self instanceof rover.units.units.Gradian) {
		result = rover.units.aspects.GradianAspect.toRad((rover.units.units.Gradian) _self, value);
	} else if (_self instanceof rover.units.units.AngleUnit) {
		result = rover.units.aspects.AngleUnitAspect._privk3_toRad(_self_, (rover.units.units.AngleUnit) _self, value);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (double) result;
}
  
  protected static double _privk3_toRad(final AngleUnitAspectAngleUnitAspectProperties _self_, final AngleUnit _self, final double value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
