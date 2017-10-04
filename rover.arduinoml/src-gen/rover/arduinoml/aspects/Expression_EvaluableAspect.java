package rover.arduinoml.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.Instruction;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  protected static Instruction getInstruction(final Expression _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getInstruction(_self_, _self);;
    return (rover.arduinoml.arduino.Instruction)result;
  }
  
  @Abstract
  public static Object evaluate(final Expression _self) {
	final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof rover.arduinoml.arduino.IntegerVariableRef) {
		result = rover.arduinoml.aspects.VariableRef_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.IntegerVariableRef) _self);
	} else if (_self instanceof rover.arduinoml.arduino.UnaryIntegerExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.UnaryIntegerExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BinaryIntegerExpression) {
		result = rover.arduinoml.aspects.BinaryIntegerExpression_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.BinaryIntegerExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.IntegerConstant) {
		result = rover.arduinoml.aspects.IntegerConstant_ExecutableAspect
				.evaluate((rover.arduinoml.arduino.IntegerConstant) _self);
	} else if (_self instanceof rover.arduinoml.arduino.IntegerModuleGet) {
		result = rover.arduinoml.aspects.IntegerModuleGet_ExecutableAspect
				.evaluate((rover.arduinoml.arduino.IntegerModuleGet) _self);
	} else if (_self instanceof rover.arduinoml.arduino.IntegerExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.IntegerExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BooleanVariableRef) {
		result = rover.arduinoml.aspects.VariableRef_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.BooleanVariableRef) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BinaryBooleanExpression) {
		result = rover.arduinoml.aspects.BinaryBooleanExpression_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.BinaryBooleanExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.UnaryBooleanExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.UnaryBooleanExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.UnaryExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.UnaryExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BinaryExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.BinaryExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BooleanConstant) {
		result = rover.arduinoml.aspects.BooleanConstant_ExecutableAspect
				.evaluate((rover.arduinoml.arduino.BooleanConstant) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BooleanModuleGet) {
		result = rover.arduinoml.aspects.BooleanModuleGet_ExecutableAspect
				.evaluate((rover.arduinoml.arduino.BooleanModuleGet) _self);
	} else if (_self instanceof rover.arduinoml.arduino.BooleanExpression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.BooleanExpression) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Constant) {
		result = rover.arduinoml.aspects.Constant_EvaluableAspect.evaluate((rover.arduinoml.arduino.Constant) _self);
	} else if (_self instanceof rover.arduinoml.arduino.VariableRef) {
		result = rover.arduinoml.aspects.VariableRef_EvaluableAspect
				.evaluate((rover.arduinoml.arduino.VariableRef) _self);
	} else if (_self instanceof rover.arduinoml.arduino.ModuleGet) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.ModuleGet) _self);
	} else if (_self instanceof rover.arduinoml.arduino.Expression) {
		result = rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_,
				(rover.arduinoml.arduino.Expression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Object) result;
}
  
  protected static Instruction _privk3_getInstruction(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    Instruction instruction = null;
    EObject current = _self.eContainer();
    while ((!Objects.equal(current, null))) {
      {
        if ((current instanceof Instruction)) {
          instruction = ((Instruction) current);
          return instruction;
        }
        current = current.eContainer();
      }
    }
    return instruction;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
