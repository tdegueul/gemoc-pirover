package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberValueUnit extends NumberValueAspect {
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
  
  protected static Unit _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnit") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rover.raspirover.raspirover.Unit) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unit;
  }
  
  protected static void _privk3_unit(final NumberValueUnitNumberValueAspectProperties _self_, final NumberValue _self, final Unit unit) {
    _self_.unit = unit; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnit")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unit);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
