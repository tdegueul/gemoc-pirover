package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.ConditionalAspectConditionalAspectProperties;
import rover.rcl.aspects.RoverExpressionAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Conditional;
import rover.rcl.rcl.RclBlock;
import rover.rcl.rcl.RoverExpression;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self) {
	final rover.rcl.aspects.ConditionalAspectConditionalAspectProperties _self_ = rover.rcl.aspects.ConditionalAspectConditionalAspectContext
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
