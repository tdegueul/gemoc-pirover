package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.Conditional;
import rover.raspirover.raspirover.RclBlock;
import rover.raspirover.raspirover.RoverExpression;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self) {
	final rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties _self_ = rover.raspirover.aspects.ConditionalAspectConditionalAspectContext
			.getSelf(_self);
	_privk3_eval(_self_, _self);
	;
}
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self) {
    RoverExpression _expr = _self.getExpr();
    boolean _eval = RoverExpressionAspect.eval(_expr);
    if (_eval) {
      RclBlock _condTrue = _self.getCondTrue();
      StatementAspect.eval(_condTrue);
    } else {
      RclBlock _condFalse = _self.getCondFalse();
      StatementAspect.eval(_condFalse);
    }
  }
}
