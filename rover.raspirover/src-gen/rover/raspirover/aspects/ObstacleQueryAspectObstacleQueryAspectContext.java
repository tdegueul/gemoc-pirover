package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectProperties;
import rover.raspirover.raspirover.ObstacleQuery;

@SuppressWarnings("all")
public class ObstacleQueryAspectObstacleQueryAspectContext {
  public final static ObstacleQueryAspectObstacleQueryAspectContext INSTANCE = new ObstacleQueryAspectObstacleQueryAspectContext();
  
  public static ObstacleQueryAspectObstacleQueryAspectProperties getSelf(final ObstacleQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.ObstacleQuery, rover.raspirover.aspects.ObstacleQueryAspectObstacleQueryAspectProperties>();
  
  public Map<ObstacleQuery, ObstacleQueryAspectObstacleQueryAspectProperties> getMap() {
    return map;
  }
}
