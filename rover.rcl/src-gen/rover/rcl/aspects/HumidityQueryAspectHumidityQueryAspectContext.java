package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectProperties;
import rover.rcl.rcl.HumidityQuery;

@SuppressWarnings("all")
public class HumidityQueryAspectHumidityQueryAspectContext {
  public final static HumidityQueryAspectHumidityQueryAspectContext INSTANCE = new HumidityQueryAspectHumidityQueryAspectContext();
  
  public static HumidityQueryAspectHumidityQueryAspectProperties getSelf(final HumidityQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.HumidityQuery, rover.rcl.aspects.HumidityQueryAspectHumidityQueryAspectProperties>();
  
  public Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> getMap() {
    return map;
  }
}
