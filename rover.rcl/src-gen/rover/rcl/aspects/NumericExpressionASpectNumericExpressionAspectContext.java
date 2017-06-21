package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectProperties;
import rover.rcl.rcl.NumericExpression;

@SuppressWarnings("all")
public class NumericExpressionASpectNumericExpressionAspectContext {
  public final static NumericExpressionASpectNumericExpressionAspectContext INSTANCE = new NumericExpressionASpectNumericExpressionAspectContext();
  
  public static NumericExpressionASpectNumericExpressionAspectProperties getSelf(final NumericExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.NumericExpression, rover.rcl.aspects.NumericExpressionASpectNumericExpressionAspectProperties>();
  
  public Map<NumericExpression, NumericExpressionASpectNumericExpressionAspectProperties> getMap() {
    return map;
  }
}
