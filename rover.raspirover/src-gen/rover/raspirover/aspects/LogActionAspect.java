package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.LogActionAspectLogActionAspectProperties;
import rover.raspirover.raspirover.LogAction;

@Aspect(className = LogAction.class)
@SuppressWarnings("all")
public class LogActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final LogAction _self) {
    final rover.raspirover.aspects.LogActionAspectLogActionAspectProperties _self_ = rover.raspirover.aspects.LogActionAspectLogActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.LogAction){
    					rover.raspirover.aspects.LogActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.LogAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LogActionAspectLogActionAspectProperties _self_, final LogAction _self) {
    String _message = _self.getMessage();
    String _plus = ("<log (" + _message);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
