package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties;
import rover.raspirover.raspirover.BackwardAction;

@Aspect(className = BackwardAction.class)
@SuppressWarnings("all")
public class BackwardActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardAction _self) {
	final rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties _self_ = rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final BackwardActionAspectBackwardActionAspectProperties _self_, final BackwardAction _self) {
    InputOutput.<String>println("<backward>");
  }
}
