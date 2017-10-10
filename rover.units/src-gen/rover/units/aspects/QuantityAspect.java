package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.units.units.AngleUnit;
import rover.units.units.LengthUnit;
import rover.units.units.Quantity;
import rover.units.units.Unit;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.LengthUnitAspect;
import rover.units.aspects.QuantityAspectQuantityAspectProperties;

@Aspect(className = Quantity.class)
@SuppressWarnings("all")
public abstract class QuantityAspect {
  @Abstract
  public static String print(final Quantity _self) {
	final rover.units.aspects.QuantityAspectQuantityAspectProperties _self_ = rover.units.aspects.QuantityAspectQuantityAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.units.units.Angle) {
		result = rover.units.aspects.AngleAspect.print((rover.units.units.Angle) _self);
	} else if (_self instanceof rover.units.units.Length) {
		result = rover.units.aspects.LengthAspect.print((rover.units.units.Length) _self);
	} else if (_self instanceof rover.units.units.Quantity) {
		result = rover.units.aspects.QuantityAspect._privk3_print(_self_, (rover.units.units.Quantity) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.String) result;
}
  
  public static double getNormalized(final Quantity _self) {
	final rover.units.aspects.QuantityAspectQuantityAspectProperties _self_ = rover.units.aspects.QuantityAspectQuantityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getNormalized(_self_, _self);
	;
	return (double) result;
}
  
  protected static String _privk3_print(final QuantityAspectQuantityAspectProperties _self_, final Quantity _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static double _privk3_getNormalized(final QuantityAspectQuantityAspectProperties _self_, final Quantity _self) {
    double _switchResult = (double) 0;
    Unit _unit = _self.getUnit();
    boolean _matched = false;
    if (_unit instanceof AngleUnit) {
      _matched=true;
      Unit _unit_1 = _self.getUnit();
      _switchResult = AngleUnitAspect.toRad(((AngleUnit) _unit_1), _self.getValue());
    }
    if (!_matched) {
      if (_unit instanceof LengthUnit) {
        _matched=true;
        Unit _unit_1 = _self.getUnit();
        _switchResult = LengthUnitAspect.toCm(((LengthUnit) _unit_1), _self.getValue());
      }
    }
    if (!_matched) {
      _switchResult = 0;
    }
    return _switchResult;
  }
}
