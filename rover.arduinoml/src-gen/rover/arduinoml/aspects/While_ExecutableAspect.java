package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.Block_ExecutableAspect;
import rover.arduinoml.aspects.Control_EvaluableAspect;
import rover.arduinoml.aspects.Control_ExecutableAspect;
import rover.arduinoml.aspects.While_ExecutableAspectWhileAspectProperties;
import rover.arduinoml.arduino.Block;
import rover.arduinoml.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_ExecutableAspect extends Control_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final While _self) {
	final rover.arduinoml.aspects.While_ExecutableAspectWhileAspectProperties _self_ = rover.arduinoml.aspects.While_ExecutableAspectWhileAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final While _self) {
    final rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties _self_ = rover.arduinoml.aspects.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     rover.arduinoml.aspects.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final While_ExecutableAspectWhileAspectProperties _self_, final While _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block _block = _self.getBlock();
      Block_ExecutableAspect.execute(_block);
    }
  }
}
