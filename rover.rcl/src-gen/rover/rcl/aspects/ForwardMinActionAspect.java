package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectProperties;
import rover.rcl.rcl.ForwardMinAction;
import rover.rcl.rcl.NumberValue;

@Aspect(className = ForwardMinAction.class)
@SuppressWarnings("all")
public class ForwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final ForwardMinAction _self) {
	final rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectProperties _self_ = rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final ForwardMinActionAspectForwardMinActionAspectProperties _self_, final ForwardMinAction _self) {
    NumberValue _distance = _self.getDistance();
    String _plus = ("<forward (" + _distance);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
