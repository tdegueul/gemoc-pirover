package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.melange.annotation.Containment;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.UnitAspect;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueUnit extends NumberValueAspect {
  @OverrideAspectMethod
  public static int getIntValue(final NumberValue _self) {
	final rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueUnitNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntValue(_self_, _self);
	;
	return (int) result;
}
  
  @OverrideAspectMethod
  public static String print(final NumberValue _self) {
	final rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueUnitNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  @Containment
  public static Unit unit(final NumberValue _self) {
	final rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueUnitNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_unit(_self_, _self);
	;
	return (rover.raspirover.raspirover.Unit) result;
}
  
  @Containment
  public static void unit(final NumberValue _self, final Unit unit) {
	final rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueUnitNumberValueAspectContext
			.getSelf(_self);
	_privk3_unit(_self_, _self, unit);
	;
}
  
  private static int super_getIntValue(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_getIntValue(_self_, _self);
  }
  
  protected static int _privk3_getIntValue(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    return NumberValueUnit.super_getIntValue(_self);
  }
  
  private static String super_print(final NumberValue _self) {
    final rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberValueAspectNumberValueAspectContext.getSelf(_self);
    return  rover.raspirover.aspects.NumberValueAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    String _super_print = NumberValueUnit.super_print(_self);
    String _print = UnitAspect.print(NumberValueUnit.unit(_self));
    return (_super_print + _print);
  }
  
  protected static Unit _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnit") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rover.raspirover.raspirover.Unit) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unit;
  }
  
  protected static void _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self, final Unit unit) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnit")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unit);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.unit = unit;
    }
  }
}
