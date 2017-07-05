package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.LogActionAspectLogActionAspectProperties;
import rover.rcl.rcl.LogAction;

@Aspect(className = LogAction.class)
@SuppressWarnings("all")
public class LogActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final LogAction _self) {
	final rover.rcl.aspects.LogActionAspectLogActionAspectProperties _self_ = rover.rcl.aspects.LogActionAspectLogActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final LogActionAspectLogActionAspectProperties _self_, final LogAction _self) {
    String _message = _self.getMessage();
    String _plus = ("<log (" + _message);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
