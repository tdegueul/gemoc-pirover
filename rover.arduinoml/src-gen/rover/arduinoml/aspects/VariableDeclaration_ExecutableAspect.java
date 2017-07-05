package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import rover.arduinoml.aspects.BooleanVariable_EvaluableAspect;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.aspects.IntegerVariable_EvaluableAspect;
import rover.arduinoml.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties;
import rover.arduinoml.arduino.BooleanVariable;
import rover.arduinoml.arduino.IntegerVariable;
import rover.arduinoml.arduino.Variable;
import rover.arduinoml.arduino.VariableDeclaration;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
	final rover.arduinoml.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = rover.arduinoml.aspects.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext
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
		manager.executeStep(_self, command, "VariableDeclaration", "execute");
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
  
  private static void super_execute(final VariableDeclaration _self) {
    final rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectProperties _self_ = rover.arduinoml.aspects.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    Variable _variable = _self.getVariable();
    boolean _matched = false;
    if (_variable instanceof IntegerVariable) {
      _matched=true;
      Variable _variable_1 = _self.getVariable();
      Variable _variable_2 = _self.getVariable();
      int _initialValue = ((IntegerVariable) _variable_2).getInitialValue();
      IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_1), Integer.valueOf(_initialValue));
    }
    if (!_matched) {
      if (_variable instanceof BooleanVariable) {
        _matched=true;
        Variable _variable_1 = _self.getVariable();
        Variable _variable_2 = _self.getVariable();
        boolean _isInitialValue = ((BooleanVariable) _variable_2).isInitialValue();
        BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_1), Boolean.valueOf(_isInitialValue));
      }
    }
  }
}
