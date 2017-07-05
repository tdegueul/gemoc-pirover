package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.LoopAspectLoopAspectProperties;
import rover.rcl.aspects.RoverExpressionAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Loop;
import rover.rcl.rcl.RclBlock;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self) {
	final rover.rcl.aspects.LoopAspectLoopAspectProperties _self_ = rover.rcl.aspects.LoopAspectLoopAspectContext
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
