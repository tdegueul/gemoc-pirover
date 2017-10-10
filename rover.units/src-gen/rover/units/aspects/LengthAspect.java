package rover.units.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import rover.units.units.Length;
import rover.units.units.LengthUnit;
import rover.units.units.Unit;
import rover.units.aspects.LengthAspectLengthAspectProperties;
import rover.units.aspects.LengthUnitAspect;
import rover.units.aspects.QuantityAspect;
import rover.units.aspects.UnitAspect;

@Aspect(className = Length.class)
@SuppressWarnings("all")
public class LengthAspect extends QuantityAspect {
  public static double toCm(final Length _self) {
	final rover.units.aspects.LengthAspectLengthAspectProperties _self_ = rover.units.aspects.LengthAspectLengthAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_toCm(_self_, _self);
	;
	return (double) result;
}
  
  public static String print(final Length _self) {
	final rover.units.aspects.LengthAspectLengthAspectProperties _self_ = rover.units.aspects.LengthAspectLengthAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static double _privk3_toCm(final LengthAspectLengthAspectProperties _self_, final Length _self) {
    Unit _unit = _self.getUnit();
    return LengthUnitAspect.toCm(((LengthUnit) _unit), _self.getValue());
  }
  
  protected static String _privk3_print(final LengthAspectLengthAspectProperties _self_, final Length _self) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = _self.getValue();
    _builder.append(_value);
    String _symbol = UnitAspect.getSymbol(_self.getUnit());
    _builder.append(_symbol);
    _builder.append(" [");
    double _cm = LengthAspect.toCm(_self);
    _builder.append(_cm);
    _builder.append("cm]");
    return _builder.toString();
  }
}
