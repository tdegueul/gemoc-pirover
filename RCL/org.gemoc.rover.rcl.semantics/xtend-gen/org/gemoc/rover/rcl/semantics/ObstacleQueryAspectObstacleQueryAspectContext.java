package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectProperties;
import rcl.ObstacleQuery;

@SuppressWarnings("all")
public class ObstacleQueryAspectObstacleQueryAspectContext {
  public final static ObstacleQueryAspectObstacleQueryAspectContext INSTANCE = new ObstacleQueryAspectObstacleQueryAspectContext();
  
  public static ObstacleQueryAspectObstacleQueryAspectProperties getSelf(final ObstacleQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> map = new java.util.WeakHashMap<rcl.ObstacleQuery, org.gemoc.rover.rcl.semantics.ObstacleQueryAspectObstacleQueryAspectProperties>();
  
  public Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> getMap() {
    return map;
  }
}
