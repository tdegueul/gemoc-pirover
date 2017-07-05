package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectProperties;
import rover.arduinoml.aspects.Utilities_ExecutableAspect;
import rover.arduinoml.arduino.Delay;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Delay _self) {
	final rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectProperties _self_ = rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectContext
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
		manager.executeStep(_self, command, "Delay", "execute");
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
  
  private static void super_execute(final Delay _self) {
    final rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
    try {
      int _value = _self.getValue();
      Thread.sleep(_value);
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
