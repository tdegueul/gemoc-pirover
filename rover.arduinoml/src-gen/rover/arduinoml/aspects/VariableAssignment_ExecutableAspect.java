package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import rover.arduinoml.aspects.BooleanVariable_EvaluableAspect;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.aspects.IntegerVariable_EvaluableAspect;
import rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;
import rover.arduinoml.arduino.BooleanVariable;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.IntegerVariable;
import rover.arduinoml.arduino.Variable;
import rover.arduinoml.arduino.VariableAssignment;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
	final rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "VariableAssignment", "execute");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final VariableAssignment _self) {
    final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
    Expression _operand = _self.getOperand();
    final Object value = Expression_EvaluableAspect.evaluate(_operand);
    if ((variable instanceof IntegerVariable)) {
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}
