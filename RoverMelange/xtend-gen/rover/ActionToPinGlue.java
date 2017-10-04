package rover;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.sequential.model.arduino.Pin;
import rcl.Action;
import rover.ActionToPinGlueActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionToPinGlue extends ActionAspect {
  public static Pin associatedPin(final Action _self) {
    final rover.ActionToPinGlueActionAspectProperties _self_ = rover.ActionToPinGlueActionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_associatedPin(_self_, _self);;
    return (org.gemoc.sequential.model.arduino.Pin)result;
  }
  
  public static void associatedPin(final Action _self, final Pin associatedPin) {
    final rover.ActionToPinGlueActionAspectProperties _self_ = rover.ActionToPinGlueActionAspectContext.getSelf(_self);
    _privk3_associatedPin(_self_, _self,associatedPin);;
  }
  
  protected static Pin _privk3_associatedPin(final ActionToPinGlueActionAspectProperties _self_, final Action _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getAssociatedPin") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.sequential.model.arduino.Pin) ret;
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
  
  protected static void _privk3_associatedPin(final ActionToPinGlueActionAspectProperties _self_, final Action _self, final Pin associatedPin) {
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
