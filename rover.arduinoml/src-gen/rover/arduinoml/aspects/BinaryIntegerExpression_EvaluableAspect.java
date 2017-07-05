package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.arduino.BinaryIntegerExpression;
import rover.arduinoml.arduino.BinaryIntegerOperatorKind;
import rover.arduinoml.arduino.BooleanExpression;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.IntegerExpression;

@Aspect(className = BinaryIntegerExpression.class)
@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryIntegerExpression _self) {
	final rover.arduinoml.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_ = rover.arduinoml.aspects.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final BinaryIntegerExpression _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties _self_, final BinaryIntegerExpression _self) {
    Integer res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (_left instanceof BooleanExpression) {
      _matched=true;
      Expression _left_1 = _self.getLeft();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_left_1);
      bLeft = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched) {
      if (_left instanceof IntegerExpression) {
        _matched=true;
        Expression _left_1 = _self.getLeft();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_left_1);
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (_right instanceof BooleanExpression) {
      _matched_1=true;
      Expression _right_1 = _self.getRight();
      Object _evaluate = Expression_EvaluableAspect.evaluate(_right_1);
      bRight = (((Boolean) _evaluate)).booleanValue();
    }
    if (!_matched_1) {
      if (_right instanceof IntegerExpression) {
        _matched_1=true;
        Expression _right_1 = _self.getRight();
        Object _evaluate = Expression_EvaluableAspect.evaluate(_right_1);
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    BinaryIntegerOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case DIV:
          res = Integer.valueOf((iLeft / iRight));
          break;
        case MAX:
          int _max = Math.max(iLeft, iRight);
          res = Integer.valueOf(_max);
          break;
        case MIN:
          int _min = Math.min(iLeft, iRight);
          res = Integer.valueOf(_min);
          break;
        case MINUS:
          res = Integer.valueOf((iLeft - iRight));
          break;
        case MUL:
          res = Integer.valueOf((iLeft * iRight));
          break;
        case PLUS:
          res = Integer.valueOf((iLeft + iRight));
          break;
        case POURCENT:
          res = Integer.valueOf((iLeft % iRight));
          break;
        default:
          BinaryIntegerOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryIntegerOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}
