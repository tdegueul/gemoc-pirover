package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.SendActionAspectSendActionAspectProperties;
import rover.rcl.rcl.SendAction;

@Aspect(className = SendAction.class)
@SuppressWarnings("all")
public class SendActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final SendAction _self) {
	final rover.rcl.aspects.SendActionAspectSendActionAspectProperties _self_ = rover.rcl.aspects.SendActionAspectSendActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final SendActionAspectSendActionAspectProperties _self_, final SendAction _self) {
    String _message = _self.getMessage();
    String _plus = ("<send (" + _message);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
