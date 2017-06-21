package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectProperties;
import rover.rcl.rcl.RoverExpression;

@SuppressWarnings("all")
public class RoverExpressionAspectRoverExpressionAspectContext {
  public final static RoverExpressionAspectRoverExpressionAspectContext INSTANCE = new RoverExpressionAspectRoverExpressionAspectContext();
  
  public static RoverExpressionAspectRoverExpressionAspectProperties getSelf(final RoverExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.RoverExpression, rover.rcl.aspects.RoverExpressionAspectRoverExpressionAspectProperties>();
  
  public Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> getMap() {
    return map;
  }
}
