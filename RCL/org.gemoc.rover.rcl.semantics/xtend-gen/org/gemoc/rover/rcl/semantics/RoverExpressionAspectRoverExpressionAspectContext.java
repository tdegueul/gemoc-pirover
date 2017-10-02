package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectProperties;
import rcl.RoverExpression;

@SuppressWarnings("all")
public class RoverExpressionAspectRoverExpressionAspectContext {
  public final static RoverExpressionAspectRoverExpressionAspectContext INSTANCE = new RoverExpressionAspectRoverExpressionAspectContext();
  
  public static RoverExpressionAspectRoverExpressionAspectProperties getSelf(final RoverExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> map = new java.util.WeakHashMap<rcl.RoverExpression, org.gemoc.rover.rcl.semantics.RoverExpressionAspectRoverExpressionAspectProperties>();
  
  public Map<RoverExpression, RoverExpressionAspectRoverExpressionAspectProperties> getMap() {
    return map;
  }
}
