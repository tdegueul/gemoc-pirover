package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectProperties;
import rcl.SendAction;

@Aspect(className = SendAction.class)
@SuppressWarnings("all")
public class SendActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final SendAction _self) {
    final org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.SendAction){
    					org.gemoc.rover.rcl.semantics.SendActionAspect._privk3_eval(_self_, (rcl.SendAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final SendActionAspectSendActionAspectProperties _self_, final SendAction _self) {
    String _message = _self.getMessage();
    String _plus = ("<send (" + _message);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
