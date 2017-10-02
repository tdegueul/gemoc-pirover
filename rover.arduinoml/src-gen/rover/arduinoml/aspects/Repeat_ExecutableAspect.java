package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import rover.arduinoml.aspects.Block_ExecutableAspect;
import rover.arduinoml.aspects.Control_EvaluableAspect;
import rover.arduinoml.aspects.Control_ExecutableAspect;
import rover.arduinoml.aspects.Instruction_ExecutableAspect;
import rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectProperties;
import rover.arduinoml.arduino.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Repeat _self) {
	final rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectProperties _self_ = rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectContext
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
		manager.executeStep(_self, command, "Repeat", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final Repeat _self) {
    final rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Repeat_ExecutableAspectRepeatAspectProperties _self_, final Repeat _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    }
    Instruction_ExecutableAspect.finalize(_self);
  }
}
