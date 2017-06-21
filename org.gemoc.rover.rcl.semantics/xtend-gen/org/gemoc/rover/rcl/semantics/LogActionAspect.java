package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties;
import rcl.LogAction;

@Aspect(className = LogAction.class)
@SuppressWarnings("all")
public class LogActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final LogAction _self) {
    final org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.LogAction){
    					org.gemoc.rover.rcl.semantics.LogActionAspect._privk3_eval(_self_, (rcl.LogAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final LogActionAspectLogActionAspectProperties _self_, final LogAction _self) {
    String _message = _self.getMessage();
    String _plus = ("<log (" + _message);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
