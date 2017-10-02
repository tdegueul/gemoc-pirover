package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectProperties;
import rcl.BackwardAction;

@Aspect(className = BackwardAction.class)
@SuppressWarnings("all")
public class BackwardActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardAction _self) {
    final org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.BackwardAction){
    					org.gemoc.rover.rcl.semantics.BackwardActionAspect._privk3_eval(_self_, (rcl.BackwardAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final BackwardActionAspectBackwardActionAspectProperties _self_, final BackwardAction _self) {
    InputOutput.<String>println("<backward>");
  }
}
