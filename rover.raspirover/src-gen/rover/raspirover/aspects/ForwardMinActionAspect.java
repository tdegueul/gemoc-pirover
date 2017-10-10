package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import rover.raspirover.aspects.ActionAspect;
import rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectProperties;
import rover.raspirover.raspirover.ForwardMinAction;
import rover.raspirover.raspirover.NumberValue;

@Aspect(className = ForwardMinAction.class)
@SuppressWarnings("all")
public class ForwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final ForwardMinAction _self) {
    final rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectProperties _self_ = rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.ForwardMinAction){
    					rover.raspirover.aspects.ForwardMinActionAspect._privk3_eval(_self_, (rover.raspirover.raspirover.ForwardMinAction)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final ForwardMinActionAspectForwardMinActionAspectProperties _self_, final ForwardMinAction _self) {
    NumberValue _distance = _self.getDistance();
    String _plus = ("<forward (" + _distance);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
