package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectProperties;
import rcl.StopAction;

@Aspect(className = StopAction.class)
@SuppressWarnings("all")
public class StopActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final StopAction _self) {
    final org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.StopAction){
    					org.gemoc.rover.rcl.semantics.StopActionAspect._privk3_eval(_self_, (rcl.StopAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final StopActionAspectStopActionAspectProperties _self_, final StopAction _self) {
    InputOutput.<String>println("<stop>");
  }
}
