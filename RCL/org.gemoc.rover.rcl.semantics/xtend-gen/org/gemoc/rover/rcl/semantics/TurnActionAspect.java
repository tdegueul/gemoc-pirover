package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectProperties;
import rcl.TurnAction;

@Aspect(className = TurnAction.class)
@SuppressWarnings("all")
public class TurnActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final TurnAction _self) {
    final org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.TurnAction){
    					org.gemoc.rover.rcl.semantics.TurnActionAspect._privk3_eval(_self_, (rcl.TurnAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final TurnActionAspectTurnActionAspectProperties _self_, final TurnAction _self) {
    InputOutput.<String>println("<turn>");
  }
}
