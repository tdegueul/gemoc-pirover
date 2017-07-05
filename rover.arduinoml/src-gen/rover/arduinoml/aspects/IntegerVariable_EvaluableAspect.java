package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties;
import rover.arduinoml.aspects.Variable_EvaluableAspect;
import rover.arduinoml.arduino.IntegerVariable;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspect extends Variable_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerVariable _self) {
	final rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  public static Integer value(final IntegerVariable _self) {
	final rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Integer) result;
}
  
  public static void value(final IntegerVariable _self, final Integer value) {
	final rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = rover.arduinoml.aspects.IntegerVariable_EvaluableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static Object _privk3_evaluate(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    return IntegerVariable_EvaluableAspect.value(_self);
  }
  
  protected static Integer _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Integer value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
