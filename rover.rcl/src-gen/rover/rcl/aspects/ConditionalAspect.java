package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.ConditionalAspectConditionalAspectProperties;
import rover.rcl.aspects.RoverExpressionAspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Conditional;

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
    boolean _eval = RoverExpressionAspect.eval(_self.getExpr());
    if (_eval) {
      StatementAspect.eval(_self.getCondTrue());
    } else {
      StatementAspect.eval(_self.getCondFalse());
    }
  }
}
