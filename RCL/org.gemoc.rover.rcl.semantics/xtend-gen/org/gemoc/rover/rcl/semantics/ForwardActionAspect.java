package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectProperties;
import rcl.ForwardAction;

@Aspect(className = ForwardAction.class)
@SuppressWarnings("all")
public class ForwardActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final ForwardAction _self) {
    final org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.ForwardAction){
    					org.gemoc.rover.rcl.semantics.ForwardActionAspect._privk3_eval(_self_, (rcl.ForwardAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final ForwardActionAspectForwardActionAspectProperties _self_, final ForwardAction _self) {
    InputOutput.<String>println("<forward>");
  }
}
