package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.LoopAspectLoopAspectProperties;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.Loop;
import rover.raspirover.raspirover.RclBlock;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self) {
	final rover.raspirover.aspects.LoopAspectLoopAspectProperties _self_ = rover.raspirover.aspects.LoopAspectLoopAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self) {
    while (RoverExpressionAspect.eval(_self.getExpr())) {
      RclBlock _block = _self.getBlock();
      StatementAspect.eval(_block);
    }
  }
}
