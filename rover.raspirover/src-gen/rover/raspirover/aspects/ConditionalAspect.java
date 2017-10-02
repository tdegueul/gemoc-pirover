package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.Conditional;

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
    boolean _eval = RoverExpressionAspect.eval(_self.getExpr());
    if (_eval) {
      StatementAspect.eval(_self.getCondTrue());
    } else {
      StatementAspect.eval(_self.getCondFalse());
    }
  }
}
