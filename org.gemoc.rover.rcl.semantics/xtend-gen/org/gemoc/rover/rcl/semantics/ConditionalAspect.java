package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.ConditionalAspectConditionalAspectProperties;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Block;
import rcl.Conditional;
import rcl.RoverExpression;

@Aspect(className = Conditional.class)
@SuppressWarnings("all")
public class ConditionalAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Conditional _self) {
    final org.gemoc.rover.rcl.semantics.ConditionalAspectConditionalAspectProperties _self_ = org.gemoc.rover.rcl.semantics.ConditionalAspectConditionalAspectContext.getSelf(_self);
     if (_self instanceof rcl.Conditional){
    					org.gemoc.rover.rcl.semantics.ConditionalAspect._privk3_eval(_self_, (rcl.Conditional)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final ConditionalAspectConditionalAspectProperties _self_, final Conditional _self) {
    RoverExpression _expr = _self.getExpr();
    boolean _eval = RoverExpressionAspect.eval(_expr);
    if (_eval) {
      Block _condTrue = _self.getCondTrue();
      StatementAspect.eval(_condTrue);
    } else {
      Block _condFalse = _self.getCondFalse();
      StatementAspect.eval(_condFalse);
    }
  }
}
