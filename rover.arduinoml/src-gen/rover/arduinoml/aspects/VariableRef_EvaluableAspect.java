package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.aspects.BooleanVariable_EvaluableAspect;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.IntegerVariable_EvaluableAspect;
import rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties;
import rover.arduinoml.arduino.BooleanVariable;
import rover.arduinoml.arduino.BooleanVariableRef;
import rover.arduinoml.arduino.IntegerVariable;
import rover.arduinoml.arduino.IntegerVariableRef;
import rover.arduinoml.arduino.VariableRef;

@Aspect(className = VariableRef.class)
@SuppressWarnings("all")
public class VariableRef_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final VariableRef _self) {
	final rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectProperties _self_ = rover.arduinoml.aspects.VariableRef_EvaluableAspectVariableRefAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final VariableRef _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final VariableRef_EvaluableAspectVariableRefAspectProperties _self_, final VariableRef _self) {
    boolean _matched = false;
    if (_self instanceof BooleanVariableRef) {
      _matched=true;
      BooleanVariable _variable = ((BooleanVariableRef) _self).getVariable();
      return BooleanVariable_EvaluableAspect.evaluate(_variable);
    }
    if (!_matched) {
      if (_self instanceof IntegerVariableRef) {
        _matched=true;
        IntegerVariable _variable = ((IntegerVariableRef) _self).getVariable();
        return IntegerVariable_EvaluableAspect.evaluate(_variable);
      }
    }
    EClass _eClass = _self.eClass();
    String _name = _eClass.getName();
    String _plus = ("type not expected: " + _name);
    throw new ClassCastException(_plus);
  }
}
