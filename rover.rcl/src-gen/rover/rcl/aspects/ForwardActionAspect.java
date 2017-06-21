package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.ForwardActionAspectForwardActionAspectProperties;
import rover.rcl.rcl.ForwardAction;

@Aspect(className = ForwardAction.class)
@SuppressWarnings("all")
public class ForwardActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final ForwardAction _self) {
	final rover.rcl.aspects.ForwardActionAspectForwardActionAspectProperties _self_ = rover.rcl.aspects.ForwardActionAspectForwardActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final ForwardActionAspectForwardActionAspectProperties _self_, final ForwardAction _self) {
    InputOutput.<String>println("<forward>");
  }
}
