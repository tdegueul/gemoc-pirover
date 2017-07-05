package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectProperties;
import rcl.RoverExpression;

@Aspect(className = RoverExpression.class)
@SuppressWarnings("all")
public abstract class RoverExpressionAspect {
  @Abstract
  public static boolean eval(final RoverExpression _self) {
    final org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.StringExpression){
    					result = org.gemoc.rover.rcl.semantics.StringExpressionASpect.eval((rcl.StringExpression)_self);
    } else  if (_self instanceof rcl.NumericExpression){
    					result = org.gemoc.rover.rcl.semantics.NumericExpressionASpect.eval((rcl.NumericExpression)_self);
    } else  if (_self instanceof rcl.BooleanExpression){
    					result = org.gemoc.rover.rcl.semantics.BooleanExpressionASpect.eval((rcl.BooleanExpression)_self);
    } else  if (_self instanceof rcl.RoverExpression){
    					result = org.gemoc.rover.rcl.semantics.RoverExpressionAspect._privk3_eval(_self_, (rcl.RoverExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final RoverExpressionAspectRoverExpressionAspectProperties _self_, final RoverExpression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
