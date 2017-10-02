package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.NumberValueAspect;
import rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectProperties;
import rover.rcl.aspects.RoverExpressionAspect;
import rover.rcl.rcl.NumericExpression;
import rover.rcl.rcl.NumericOperator;

@Aspect(className = NumericExpression.class)
@SuppressWarnings("all")
public class NumericExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final NumericExpression _self) {
	final rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectProperties _self_ = rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_eval(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_eval(final NumericExpressionASpectNumericExpressionAspectProperties _self_, final NumericExpression _self) {
    boolean _switchResult = false;
    NumericOperator _op = _self.getOp();
    if (_op != null) {
      switch (_op) {
        case LT:
          int _intValue = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_1 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue < _intValue_1);
          break;
        case EQ:
          int _intValue_2 = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_3 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue_2 == _intValue_3);
          break;
        case NEQ:
          int _intValue_4 = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_5 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue_4 != _intValue_5);
          break;
        case GT:
          int _intValue_6 = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_7 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue_6 > _intValue_7);
          break;
        case LEQ:
          int _intValue_8 = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_9 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue_8 <= _intValue_9);
          break;
        case GEQ:
          int _intValue_10 = NumberValueAspect.getIntValue(_self.getLhs());
          int _intValue_11 = NumberValueAspect.getIntValue(_self.getRhs());
          _switchResult = (_intValue_10 >= _intValue_11);
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
