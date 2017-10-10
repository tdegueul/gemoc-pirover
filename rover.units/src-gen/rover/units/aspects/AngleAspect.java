package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import rover.units.units.Angle;
import rover.units.units.AngleUnit;
import rover.units.units.Unit;
import rover.units.aspects.AngleAspectAngleAspectProperties;
import rover.units.aspects.AngleUnitAspect;
import rover.units.aspects.QuantityAspect;
import rover.units.aspects.UnitAspect;

@Aspect(className = Angle.class)
@SuppressWarnings("all")
public class AngleAspect extends QuantityAspect {
  public static double toRad(final Angle _self) {
	final rover.units.aspects.AngleAspectAngleAspectProperties _self_ = rover.units.aspects.AngleAspectAngleAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toRad(_self_, _self);
	;
	return (double) result;
}
  
  @OverrideAspectMethod
  public static String print(final Angle _self) {
	final rover.units.aspects.AngleAspectAngleAspectProperties _self_ = rover.units.aspects.AngleAspectAngleAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static double _privk3_toRad(final AngleAspectAngleAspectProperties _self_, final Angle _self) {
    Unit _unit = _self.getUnit();
    return AngleUnitAspect.toRad(((AngleUnit) _unit), _self.getValue());
  }
  
  protected static String _privk3_print(final AngleAspectAngleAspectProperties _self_, final Angle _self) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = _self.getValue();
    _builder.append(_value);
    String _symbol = UnitAspect.getSymbol(_self.getUnit());
    _builder.append(_symbol);
    _builder.append(" [");
    double _rad = AngleAspect.toRad(_self);
    _builder.append(_rad);
    _builder.append("rad]");
    return _builder.toString();
  }
}
