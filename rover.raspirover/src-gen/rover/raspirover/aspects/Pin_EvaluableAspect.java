package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.Pin_EvaluableAspectPinAspectProperties;
import rover.raspirover.raspirover.Pin;

@Aspect(className = Pin.class)
@SuppressWarnings("all")
public class Pin_EvaluableAspect {
  public final static Integer LOW = Integer.valueOf(0);
  
  public final static Integer HIGH = Integer.valueOf(1023);
  
  public static int level(final Pin _self) {
	final rover.raspirover.aspects.Pin_EvaluableAspectPinAspectProperties _self_ = rover.raspirover.aspects.Pin_EvaluableAspectPinAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_level(_self_, _self);
	;
	return (int) result;
}
  
  public static void level(final Pin _self, final int level) {
	final rover.raspirover.aspects.Pin_EvaluableAspectPinAspectProperties _self_ = rover.raspirover.aspects.Pin_EvaluableAspectPinAspectContext
			.getSelf(_self);
	_privk3_level(_self_, _self, level);
	;
}
  
  protected static int _privk3_level(final Pin_EvaluableAspectPinAspectProperties _self_, final Pin _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLevel") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.level;
  }
  
  protected static void _privk3_level(final Pin_EvaluableAspectPinAspectProperties _self_, final Pin _self, final int level) {
    _self_.level = level; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLevel")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, level);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
