package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties;
import rover.rcl.rcl.BooleanExpression;

@SuppressWarnings("all")
public class BooleanExpressionASpectBooleanExpressionAspectContext {
  public final static BooleanExpressionASpectBooleanExpressionAspectContext INSTANCE = new BooleanExpressionASpectBooleanExpressionAspectContext();
  
  public static BooleanExpressionASpectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.BooleanExpression, rover.rcl.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
