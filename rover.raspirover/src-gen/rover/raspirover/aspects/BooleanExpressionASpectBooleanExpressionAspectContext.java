package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties;
import rover.raspirover.raspirover.BooleanExpression;

@SuppressWarnings("all")
public class BooleanExpressionASpectBooleanExpressionAspectContext {
  public final static BooleanExpressionASpectBooleanExpressionAspectContext INSTANCE = new BooleanExpressionASpectBooleanExpressionAspectContext();
  
  public static BooleanExpressionASpectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.BooleanExpression, rover.raspirover.aspects.BooleanExpressionASpectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpressionASpectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
