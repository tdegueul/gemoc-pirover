package rover.raspirover.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.raspirover.aspects.RoverExpressionAspect;
import rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectProperties;
import rover.raspirover.aspects.StringValueAspect;
import rover.raspirover.raspirover.StringExpression;
import rover.raspirover.raspirover.StringOperator;

@Aspect(className = StringExpression.class)
@SuppressWarnings("all")
public class StringExpressionASpect extends RoverExpressionAspect {
  @OverrideAspectMethod
  public static boolean eval(final StringExpression _self) {
	final rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectProperties _self_ = rover.raspirover.aspects.StringExpressionASpectStringExpressionAspectContext
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
          String _stringValue = StringValueAspect.getStringValue(_self.getLhs());
          String _stringValue_1 = StringValueAspect.getStringValue(_self.getRhs());
          _switchResult = Objects.equal(_stringValue, _stringValue_1);
          break;
        case NEQ:
          String _stringValue_2 = StringValueAspect.getStringValue(_self.getLhs());
          String _stringValue_3 = StringValueAspect.getStringValue(_self.getRhs());
          _switchResult = (!Objects.equal(_stringValue_2, _stringValue_3));
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
