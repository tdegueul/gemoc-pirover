package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.StopActionAspectStopActionAspectProperties;
import rover.raspirover.raspirover.StopAction;

@Aspect(className = StopAction.class)
@SuppressWarnings("all")
public class StopActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final StopAction _self) {
    final rover.raspirover.aspects.StopActionAspectStopActionAspectProperties _self_ = rover.raspirover.aspects.StopActionAspectStopActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.StopAction){
    					rover.raspirover.aspects.StopActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.StopAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final StopActionAspectStopActionAspectProperties _self_, final StopAction _self) {
    InputOutput.<String>println("<stop>");
  }
}
