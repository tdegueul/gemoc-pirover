package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.Instruction_UtilitesAspect;
import rover.arduinoml.aspects.Pin_EvaluableAspect;
import rover.arduinoml.arduino.BooleanModuleGet;
import rover.arduinoml.arduino.Instruction;
import rover.arduinoml.arduino.Module;
import rover.arduinoml.arduino.Pin;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
	final rover.arduinoml.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = rover.arduinoml.aspects.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final BooleanModuleGet _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    Instruction _instruction = Expression_EvaluableAspect.getInstruction(_self);
    Module _module = _self.getModule();
    final Pin pin = Instruction_UtilitesAspect.getPin(_instruction, _module);
    int _level = Pin_EvaluableAspect.level(pin);
    boolean _equals = (_level == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}
