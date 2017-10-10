package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.TurnActionAspectTurnActionAspectProperties;
import rover.raspirover.raspirover.TurnAction;

@Aspect(className = TurnAction.class)
@SuppressWarnings("all")
public class TurnActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final TurnAction _self) {
    final rover.raspirover.aspects.TurnActionAspectTurnActionAspectProperties _self_ = rover.raspirover.aspects.TurnActionAspectTurnActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.TurnAction){
    					rover.raspirover.aspects.TurnActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.TurnAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final TurnActionAspectTurnActionAspectProperties _self_, final TurnAction _self) {
    InputOutput.<String>println("<turn>");
  }
}
