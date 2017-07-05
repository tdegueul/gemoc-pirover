package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties;
import rover.arduinoml.arduino.Expression;

@SuppressWarnings("all")
public class Expression_EvaluableAspectExpressionAspectContext {
  public final static Expression_EvaluableAspectExpressionAspectContext INSTANCE = new Expression_EvaluableAspectExpressionAspectContext();
  
  public static Expression_EvaluableAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Expression, rover.arduinoml.aspects.Expression_EvaluableAspectExpressionAspectProperties>();
  
  public Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
