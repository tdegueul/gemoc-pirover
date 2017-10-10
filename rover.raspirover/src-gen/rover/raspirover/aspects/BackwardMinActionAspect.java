package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rover.raspirover.aspects.NumberValueAspect;
import rover.raspirover.raspirover.BackwardMinAction;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
    final rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.BackwardMinAction){
    					rover.raspirover.aspects.BackwardMinActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.BackwardMinAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final BackwardMinActionAspectBackwardMinActionAspectProperties _self_, final BackwardMinAction _self) {
    String _print = NumberValueAspect.print(_self.getDistance());
    String _plus = ("<backward (" + _print);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
