package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties;
import rover.arduinoml.aspects.Variable_EvaluableAspect;
import rover.arduinoml.arduino.BooleanVariable;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspect extends Variable_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanVariable _self) {
	final rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  public static Boolean value(final BooleanVariable _self) {
	final rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Boolean) result;
}
  
  public static void value(final BooleanVariable _self, final Boolean value) {
	final rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = rover.arduinoml.aspects.BooleanVariable_EvaluableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static Object _privk3_evaluate(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    return BooleanVariable_EvaluableAspect.value(_self);
  }
  
  protected static Boolean _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Boolean value) {
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
