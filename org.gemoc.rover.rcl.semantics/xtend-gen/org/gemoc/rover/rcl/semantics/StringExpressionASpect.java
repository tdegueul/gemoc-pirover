package org.gemoc.rover.rcl.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspect;
import org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectProperties;
import org.gemoc.rover.rcl.semantics.StringValueAspect;
import rcl.StringExpression;
import rcl.StringOperator;
import rcl.StringValue;

@Aspect(className = StringExpression.class)
@SuppressWarnings("all")
public class StringExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final StringExpression _self) {
    final org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectProperties _self_ = org.gemoc.rover.rcl.semantics.StringExpressionASpectStringExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof rcl.StringExpression){
    					result = org.gemoc.rover.rcl.semantics.StringExpressionASpect._privk3_eval(_self_, (rcl.StringExpression)_self);
    } else  if (_self instanceof rcl.RoverExpression){
    					result = org.gemoc.rover.rcl.semantics.RoverExpressionAspect.eval((rcl.RoverExpression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final StringExpressionASpectStringExpressionAspectProperties _self_, final StringExpression _self) {
    boolean _switchResult = false;
    StringOperator _op = _self.getOp();
    if (_op != null) {
      switch (_op) {
        case EQ:
          StringValue _lhs = _self.getLhs();
          String _stringValue = StringValueAspect.getStringValue(_lhs);
          StringValue _rhs = _self.getRhs();
          String _stringValue_1 = StringValueAspect.getStringValue(_rhs);
          _switchResult = Objects.equal(_stringValue, _stringValue_1);
          break;
        case NEQ:
          StringValue _lhs_1 = _self.getLhs();
          String _stringValue_2 = StringValueAspect.getStringValue(_lhs_1);
          StringValue _rhs_1 = _self.getRhs();
          String _stringValue_3 = StringValueAspect.getStringValue(_rhs_1);
          _switchResult = (!Objects.equal(_stringValue_2, _stringValue_3));
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
