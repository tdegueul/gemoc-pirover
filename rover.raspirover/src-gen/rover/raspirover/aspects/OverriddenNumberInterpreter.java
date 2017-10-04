package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.LengthUnitAspect;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberToUnitGlue;
import rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class OverriddenNumberInterpreter extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final NumberValue _self) {
	final rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties _self_ = rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  @OverrideAspectMethod
  public static String print(final NumberValue _self) {
	final rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties _self_ = rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  private static int super_getIntValue(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final OverriddenNumberInterpreterNumberValueAspectProperties _self_, final NumberValue _self) {
    int _xifexpression = (int) 0;
    Unit _unit = NumberToUnitGlue.unit(_self);
    boolean _tripleNotEquals = (_unit != null);
    if (_tripleNotEquals) {
      long _round = Math.round(LengthUnitAspect.toCentimeters(NumberToUnitGlue.unit(_self), _self.getNValue()));
      _xifexpression = ((int) _round);
    } else {
      _xifexpression = OverriddenNumberInterpreter.super_getIntValue(_self);
    }
    return _xifexpression;
  }
  
  private static String super_print(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final OverriddenNumberInterpreterNumberValueAspectProperties _self_, final NumberValue _self) {
    String _super_print = OverriddenNumberInterpreter.super_print(_self);
    String _print = LengthUnitAspect.print(NumberToUnitGlue.unit(_self));
    return (_super_print + _print);
  }
}
