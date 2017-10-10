package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.LoopAspectLoopAspectProperties;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.Loop;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self) {
    final rover.raspirover.aspects.LoopAspectLoopAspectProperties _self_ = rover.raspirover.aspects.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof rover.raspirover.raspirover.Loop){
    					rover.raspirover.aspects.LoopAspect._privk3_eval(_self_, (rover.raspirover.raspirover.Loop)_self);
    } else  if (_self instanceof rover.raspirover.raspirover.Statement){
    					rover.raspirover.aspects.StatementAspect.eval((rover.raspirover.raspirover.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self) {
    while (RoverExpressionAspect.eval(_self.getExpr())) {
      StatementAspect.eval(_self.getBlock());
    }
  }
}
