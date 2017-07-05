package rover.rcl.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.rcl.aspects.RoverExpressionAspect;
import rover.rcl.aspects.StringExpressionASpectStringExpressionAspectProperties;
import rover.rcl.aspects.StringValueAspect;
import rover.rcl.rcl.StringExpression;
import rover.rcl.rcl.StringOperator;
import rover.rcl.rcl.StringValue;

@Aspect(className = StringExpression.class)
@SuppressWarnings("all")
public class StringExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final StringExpression _self) {
	final rover.rcl.aspects.StringExpressionASpectStringExpressionAspectProperties _self_ = rover.rcl.aspects.StringExpressionASpectStringExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_eval(_self_, _self);
	;
	return (boolean) result;
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
