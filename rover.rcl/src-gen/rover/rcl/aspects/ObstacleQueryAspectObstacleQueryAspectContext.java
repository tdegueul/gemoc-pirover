package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectProperties;
import rover.rcl.rcl.ObstacleQuery;

@SuppressWarnings("all")
public class ObstacleQueryAspectObstacleQueryAspectContext {
  public final static ObstacleQueryAspectObstacleQueryAspectContext INSTANCE = new ObstacleQueryAspectObstacleQueryAspectContext();
  
  public static ObstacleQueryAspectObstacleQueryAspectProperties getSelf(final ObstacleQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.ObstacleQuery, rover.rcl.aspects.ObstacleQueryAspectObstacleQueryAspectProperties>();
  
  public Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> getMap() {
    return map;
  }
}
