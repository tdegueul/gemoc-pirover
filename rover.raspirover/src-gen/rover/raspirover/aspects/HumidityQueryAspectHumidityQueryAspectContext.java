package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectProperties;
import rover.raspirover.raspirover.HumidityQuery;

@SuppressWarnings("all")
public class HumidityQueryAspectHumidityQueryAspectContext {
  public final static HumidityQueryAspectHumidityQueryAspectContext INSTANCE = new HumidityQueryAspectHumidityQueryAspectContext();
  
  public static HumidityQueryAspectHumidityQueryAspectProperties getSelf(final HumidityQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.HumidityQuery, rover.raspirover.aspects.HumidityQueryAspectHumidityQueryAspectProperties>();
  
  public Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> getMap() {
    return map;
  }
}
