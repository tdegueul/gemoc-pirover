package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties;

@Aspect(className = NumberValue.class)
@SuppressWarnings("all")
public class NumberToQuantityGlue extends NumberValueAspect {
  @Containment
  public static Quantity quantity(final NumberValue _self) {
	final rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_quantity(_self_, _self);
	;
	return (rover.raspirover.raspirover.Quantity) result;
}
  
  @Containment
  public static void quantity(final NumberValue _self, final Quantity quantity) {
	final rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties _self_ = rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectContext
			.getSelf(_self);
	_privk3_quantity(_self_, _self, quantity);
	;
}
  
  protected static Quantity _privk3_quantity(final NumberToQuantityGlueNumberValueAspectProperties _self_, final NumberValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getQuantity") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rover.raspirover.raspirover.Quantity) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.quantity;
  }
  
  protected static void _privk3_quantity(final NumberToQuantityGlueNumberValueAspectProperties _self_, final NumberValue _self, final Quantity quantity) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setQuantity")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, quantity);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.quantity = quantity;
    }
  }
}
