package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.SendActionAspectSendActionAspectProperties;
import rover.raspirover.raspirover.SendAction;

@Aspect(className = SendAction.class)
@SuppressWarnings("all")
public class SendActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final SendAction _self) {
	final rover.raspirover.aspects.SendActionAspectSendActionAspectProperties _self_ = rover.raspirover.aspects.SendActionAspectSendActionAspectContext
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
