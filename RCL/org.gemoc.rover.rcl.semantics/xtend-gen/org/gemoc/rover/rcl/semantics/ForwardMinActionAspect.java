package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.rover.rcl.semantics.ActionAspect;
import org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectProperties;
import rcl.ForwardMinAction;
import rcl.NumberValue;

@Aspect(className = ForwardMinAction.class)
@SuppressWarnings("all")
public class ForwardMinActionAspect extends ActionAspect {
  @OverrideAspectMethod
  public static void eval(final ForwardMinAction _self) {
    final org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectContext.getSelf(_self);
     if (_self instanceof rcl.ForwardMinAction){
    					org.gemoc.rover.rcl.semantics.ForwardMinActionAspect._privk3_eval(_self_, (rcl.ForwardMinAction)_self);
    } else  if (_self instanceof rcl.Statement){
    					org.gemoc.rover.rcl.semantics.StatementAspect.eval((rcl.Statement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_eval(final ForwardMinActionAspectForwardMinActionAspectProperties _self_, final ForwardMinAction _self) {
    NumberValue _distance = _self.getDistance();
    String _plus = ("<forward (" + _distance);
    String _plus_1 = (_plus + ")>");
    InputOutput.<String>println(_plus_1);
  }
}
