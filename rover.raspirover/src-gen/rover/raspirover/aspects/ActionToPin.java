package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.raspirover.Pin;
import rover.raspirover.raspirover.Action;
import rover.raspirover.aspects.ActionToPinActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionToPin extends ActionAspect {
  public static Pin associatedPin(final Action _self) {
	final rover.raspirover.aspects.ActionToPinActionAspectProperties _self_ = rover.raspirover.aspects.ActionToPinActionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_associatedPin(_self_, _self);
	;
	return (rover.raspirover.raspirover.Pin) result;
}
  
  public static void associatedPin(final Action _self, final Pin associatedPin) {
	final rover.raspirover.aspects.ActionToPinActionAspectProperties _self_ = rover.raspirover.aspects.ActionToPinActionAspectContext
			.getSelf(_self);
	_privk3_associatedPin(_self_, _self, associatedPin);
	;
}
  
  protected static Pin _privk3_associatedPin(final ActionToPinActionAspectProperties _self_, final Action _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getAssociatedPin") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (rover.raspirover.raspirover.Pin) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.associatedPin;
  }
  
  protected static void _privk3_associatedPin(final ActionToPinActionAspectProperties _self_, final Action _self, final Pin associatedPin) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setAssociatedPin")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, associatedPin);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.associatedPin = associatedPin;
    }
  }
}
