package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectProperties;
import rover.raspirover.raspirover.RoverExpression;

@SuppressWarnings("all")
public class RoverExpressionAspectRoverExpressionAspectContext {
  public final static RoverExpressionAspectRoverExpressionAspectContext INSTANCE = new RoverExpressionAspectRoverExpressionAspectContext();
  
  public static RoverExpressionAspectRoverExpressionAspectProperties getSelf(final RoverExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.RoverExpression, rover.raspirover.aspects.RoverExpressionAspectRoverExpressionAspectProperties>();
  
  public Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> getMap() {
    return map;
  }
}
