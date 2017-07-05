package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.Control_EvaluableAspect;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.If_EvaluableAspectIfAspectProperties;
import rover.arduinoml.arduino.BooleanExpression;
import rover.arduinoml.arduino.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final If _self) {
	final rover.arduinoml.aspects.If_EvaluableAspectIfAspectProperties _self_ = rover.arduinoml.aspects.If_EvaluableAspectIfAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Boolean) result;
}
  
  private static Boolean super_evaluate(final If _self) {
    final rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final If_EvaluableAspectIfAspectProperties _self_, final If _self) {
    Boolean resCond = Boolean.valueOf(false);
    BooleanExpression _condition = _self.getCondition();
    if ((_condition instanceof BooleanExpression)) {
      BooleanExpression _condition_1 = _self.getCondition();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_condition_1);
      resCond = ((Boolean) _evaluate);
    }
    return resCond;
  }
}
