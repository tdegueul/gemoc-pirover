package rover.arduinoml.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import rover.arduinoml.aspects.Block_ExecutableAspect;
import rover.arduinoml.aspects.Control_ExecutableAspect;
import rover.arduinoml.aspects.If_EvaluableAspect;
import rover.arduinoml.aspects.If_ExecutableAspectIfAspectProperties;
import rover.arduinoml.arduino.Block;
import rover.arduinoml.arduino.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class If_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final If _self) {
	final rover.arduinoml.aspects.If_ExecutableAspectIfAspectProperties _self_ = rover.arduinoml.aspects.If_ExecutableAspectIfAspectContext
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
		manager.executeStep(_self, command, "If", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void super_execute(final If _self) {
    final rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final If_ExecutableAspectIfAspectProperties _self_, final If _self) {
    Boolean _evaluate = If_EvaluableAspect.evaluate(_self);
    if ((_evaluate).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    } else {
      Block _elseBlock = _self.getElseBlock();
      boolean _notEquals = (!Objects.equal(_elseBlock, null));
      if (_notEquals) {
        Block_ExecutableAspect.execute(_self.getElseBlock());
      }
    }
  }
}
