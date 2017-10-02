package rover.arduinoml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import rover.arduinoml.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties;
import rover.arduinoml.aspects.Expression_EvaluableAspect;
import rover.arduinoml.arduino.BinaryBooleanExpression;
import rover.arduinoml.arduino.BinaryBooleanOperatorKind;
import rover.arduinoml.arduino.BooleanExpression;
import rover.arduinoml.arduino.Expression;
import rover.arduinoml.arduino.IntegerExpression;

@Aspect(className = BinaryBooleanExpression.class)
@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryBooleanExpression _self) {
	final rover.arduinoml.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_ = rover.arduinoml.aspects.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  private static Object super_evaluate(final BinaryBooleanExpression _self) {
    final rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  rover.arduinoml.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties _self_, final BinaryBooleanExpression _self) {
    boolean leftIsBoolean = false;
    boolean rightIsBoolean = false;
    Boolean res = null;
    boolean bLeft = false;
    int iLeft = 0;
    Expression _left = _self.getLeft();
    boolean _matched = false;
    if (_left instanceof BooleanExpression) {
      _matched=true;
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getLeft());
      bLeft = (((Boolean) _evaluate)).booleanValue();
      leftIsBoolean = true;
    }
    if (!_matched) {
      if (_left instanceof IntegerExpression) {
        _matched=true;
        Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getLeft());
        iLeft = (((Integer) _evaluate)).intValue();
      }
    }
    boolean bRight = false;
    int iRight = 0;
    Expression _right = _self.getRight();
    boolean _matched_1 = false;
    if (_right instanceof BooleanExpression) {
      _matched_1=true;
      Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getRight());
      bRight = (((Boolean) _evaluate)).booleanValue();
      rightIsBoolean = true;
    }
    if (!_matched_1) {
      if (_right instanceof IntegerExpression) {
        _matched_1=true;
        Object _evaluate = Expression_EvaluableAspect.evaluate(_self.getRight());
        iRight = (((Integer) _evaluate)).intValue();
      }
    }
    if ((leftIsBoolean != rightIsBoolean)) {
      throw new IllegalArgumentException("left operand type does not match right operand type.");
    }
    BinaryBooleanOperatorKind _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case AND:
          if (bLeft) {
            res = Boolean.valueOf(bRight);
          } else {
            res = Boolean.FALSE;
          }
          break;
        case OR:
          if (bLeft) {
            res = Boolean.TRUE;
          } else {
            res = Boolean.valueOf(bRight);
          }
          break;
        case DIFFERENT:
          boolean _equals = Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight));
          boolean _not = (!_equals);
          res = Boolean.valueOf(_not);
          break;
        case EQUAL:
          if (leftIsBoolean) {
            res = Boolean.valueOf(Boolean.valueOf(bLeft).equals(Boolean.valueOf(bRight)));
          } else {
            res = Boolean.valueOf(Integer.valueOf(iLeft).equals(Integer.valueOf(iRight)));
          }
          break;
        case INF:
          res = Boolean.valueOf((iLeft < iRight));
          break;
        case INF_OR_EQUAL:
          res = Boolean.valueOf((iLeft <= iRight));
          break;
        case SUP:
          res = Boolean.valueOf((iLeft > iRight));
          break;
        case SUP_OR_EQUAL:
          res = Boolean.valueOf((iLeft >= iRight));
          break;
        default:
          BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
          String _plus = ("Operator " + _operator_1);
          String _plus_1 = (_plus + " not simulated yet.");
          throw new IllegalStateException(_plus_1);
      }
    } else {
      BinaryBooleanOperatorKind _operator_1 = _self.getOperator();
      String _plus = ("Operator " + _operator_1);
      String _plus_1 = (_plus + " not simulated yet.");
      throw new IllegalStateException(_plus_1);
    }
    return res;
  }
}
