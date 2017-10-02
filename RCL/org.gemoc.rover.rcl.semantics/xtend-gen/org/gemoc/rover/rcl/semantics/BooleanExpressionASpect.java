package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectProperties;
import org.gemoc.rover.rcl.semantics.BooleanValueAspect;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspect;
import rcl.BooleanExpression;
import rcl.BooleanOperator;

@Aspect(className = BooleanExpression.class)
@SuppressWarnings("all")
public class BooleanExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final BooleanExpression _self) {
    final org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.BooleanExpressionASpectBooleanExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.BooleanExpression){
    					result = org.gemoc.rover.rcl.semantics.BooleanExpressionASpect._privk3_eval(_self_, (rcl.BooleanExpression)_self);
    } else  if (_self instanceof rcl.RoverExpression){
    					result = org.gemoc.rover.rcl.semantics.RoverExpressionAspect.eval((rcl.RoverExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final BooleanExpressionASpectBooleanExpressionAspectProperties _self_, final BooleanExpression _self) {
    boolean _switchResult = false;
    BooleanOperator _op = _self.getOp();
    if (_op != null) {
      switch (_op) {
        case EQ:
          boolean _booleanValue = BooleanValueAspect.getBooleanValue(_self.getLhs());
          boolean _booleanValue_1 = BooleanValueAspect.getBooleanValue(_self.getRhs());
          _switchResult = (_booleanValue == _booleanValue_1);
          break;
        case NEQ:
          boolean _booleanValue_2 = BooleanValueAspect.getBooleanValue(_self.getLhs());
          boolean _booleanValue_3 = BooleanValueAspect.getBooleanValue(_self.getRhs());
          _switchResult = (_booleanValue_2 != _booleanValue_3);
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
