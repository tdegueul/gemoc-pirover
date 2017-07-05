package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.raspirover.NumberValue;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
	final rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final BackwardMinActionAspectBackwardMinActionAspectProperties _self_, final BackwardMinAction _self) {
    NumberValue _distance = _self.getDistance();
    String _plus = ("<backward (" + _distance);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
