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
    final rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties _self_ = rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.BackwardAction){
    					rover.raspirover.aspects.BackwardActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.BackwardAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final BackwardActionAspectBackwardActionAspectProperties _self_, final BackwardAction _self) {
    InputOutput.<String>println("<backward>");
  }
}
