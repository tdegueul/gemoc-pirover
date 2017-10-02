package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties;
import org.gemoc.rover.rcl.semantics.NumberValueAspect;
import rcl.BackwardMinAction;

@Aspect(className = BackwardMinAction.class)
@SuppressWarnings("all")
public class BackwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final BackwardMinAction _self) {
    final org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.BackwardMinAction){
    					org.gemoc.rover.rcl.semantics.BackwardMinActionAspect._privk3_eval(_self_, (rcl.BackwardMinAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final BackwardMinActionAspectBackwardMinActionAspectProperties _self_, final BackwardMinAction _self) {
    String _print = NumberValueAspect.print(_self.getDistance());
    String _plus = ("<backward (" + _print);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
