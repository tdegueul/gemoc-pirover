package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.BackwardActionAspectBackwardActionAspectProperties;
import rover.rcl.rcl.BackwardAction;

@Aspect(className = BackwardAction.class)
@SuppressWarnings("all")
public class BackwardActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardAction _self) {
	final rover.rcl.aspects.BackwardActionAspectBackwardActionAspectProperties _self_ = rover.rcl.aspects.BackwardActionAspectBackwardActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final BackwardActionAspectBackwardActionAspectProperties _self_, final BackwardAction _self) {
    InputOutput.<String>println("<backward>");
  }
}
