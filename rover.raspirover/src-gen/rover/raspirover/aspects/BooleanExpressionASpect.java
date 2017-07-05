package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties;
import rover.raspirover.aspects.BooleanValueAspect;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.raspirover.BooleanExpression;
import rover.raspirover.raspirover.BooleanOperator;
import rover.raspirover.raspirover.BooleanValue;

@Aspect(className = BooleanExpression.class)
@SuppressWarnings("all")
public class BooleanExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final BooleanExpression _self) {
	final rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties _self_ = rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_eval(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_eval(final BooleanExpressionASpectBooleanExpressionAspectProperties _self_, final BooleanExpression _self) {
    boolean _switchResult = false;
    BooleanOperator _op = _self.getOp();
    if (_op != null) {
      switch (_op) {
        case EQ:
          BooleanValue _lhs = _self.getLhs();
          boolean _booleanValue = BooleanValueAspect.getBooleanValue(_lhs);
          BooleanValue _rhs = _self.getRhs();
          boolean _booleanValue_1 = BooleanValueAspect.getBooleanValue(_rhs);
          _switchResult = (_booleanValue == _booleanValue_1);
          break;
        case NEQ:
          BooleanValue _lhs_1 = _self.getLhs();
          boolean _booleanValue_2 = BooleanValueAspect.getBooleanValue(_lhs_1);
          BooleanValue _rhs_1 = _self.getRhs();
          boolean _booleanValue_3 = BooleanValueAspect.getBooleanValue(_rhs_1);
          _switchResult = (_booleanValue_2 != _booleanValue_3);
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
