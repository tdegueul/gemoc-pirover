package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.StopActionAspectStopActionAspectProperties;
import rover.raspirover.raspirover.StopAction;

@Aspect(className = StopAction.class)
@SuppressWarnings("all")
public class StopActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final StopAction _self) {
	final rover.raspirover.aspects.StopActionAspectStopActionAspectProperties _self_ = rover.raspirover.aspects.StopActionAspectStopActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final StopActionAspectStopActionAspectProperties _self_, final StopAction _self) {
    InputOutput.<String>println("<stop>");
  }
}
