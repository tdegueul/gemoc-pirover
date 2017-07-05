package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.NumericExpressionASpectNumericExpressionAspectProperties;
import rover.raspirover.raspirover.NumericExpression;

@SuppressWarnings("all")
public class NumericExpressionASpectNumericExpressionAspectContext {
  public final static NumericExpressionASpectNumericExpressionAspectContext INSTANCE = new NumericExpressionASpectNumericExpressionAspectContext();
  
  public static NumericExpressionASpectNumericExpressionAspectProperties getSelf(final NumericExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.NumericExpressionASpectNumericExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumericExpression, rover.raspirover.aspects.NumericExpressionASpectNumericExpressionAspectProperties>();
  
  public Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> getMap() {
    return map;
  }
}
