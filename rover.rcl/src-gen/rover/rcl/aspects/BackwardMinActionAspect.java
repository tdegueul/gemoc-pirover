package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.rcl.aspects.ActionAspect;
import rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rover.rcl.aspects.NumberValueAspect;
import rover.rcl.rcl.BackwardMinAction;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
	final rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final BackwardMinActionAspectBackwardMinActionAspectProperties _self_, final BackwardMinAction _self) {
    String _print = NumberValueAspect.print(_self.getDistance());
    String _plus = ("<backward (" + _print);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
