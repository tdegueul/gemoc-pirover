package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectProperties;
import rcl.NumberValue;
import rcl.TurnDegAction;

@Aspect(className = TurnDegAction.class)
@SuppressWarnings("all")
public class TurnDegActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final TurnDegAction _self) {
    final org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.TurnDegAction){
    					org.gemoc.rover.rcl.semantics.TurnDegActionAspect._privk3_eval(_self_, (rcl.TurnDegAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final TurnDegActionAspectTurnDegActionAspectProperties _self_, final TurnDegAction _self) {
    NumberValue _degrees = _self.getDegrees();
    String _plus = ("<turn (" + _degrees);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
