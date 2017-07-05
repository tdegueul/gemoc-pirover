package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.LoopAspectLoopAspectProperties;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Loop;
import rcl.RclBlock;

@Aspect(className = Loop.class)
@SuppressWarnings("all")
public class LoopAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void eval(final Loop _self) {
    final org.gemoc.rover.rcl.semantics.LoopAspectLoopAspectProperties _self_ = org.gemoc.rover.rcl.semantics.LoopAspectLoopAspectContext.getSelf(_self);
     if (_self instanceof rcl.Loop){
    					org.gemoc.rover.rcl.semantics.LoopAspect._privk3_eval(_self_, (rcl.Loop)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LoopAspectLoopAspectProperties _self_, final Loop _self) {
    while (RoverExpressionAspect.eval(_self.getExpr())) {
      RclBlock _block = _self.getBlock();
      StatementAspect.eval(_block);
    }
  }
}
