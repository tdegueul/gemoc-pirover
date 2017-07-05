package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rover.rcl.rcl.TemperatureQuery;

@SuppressWarnings("all")
public class TemperatureQueryAspectTemperatureQueryAspectContext {
  public final static TemperatureQueryAspectTemperatureQueryAspectContext INSTANCE = new TemperatureQueryAspectTemperatureQueryAspectContext();
  
  public static TemperatureQueryAspectTemperatureQueryAspectProperties getSelf(final TemperatureQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.TemperatureQuery, rover.rcl.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties>();
  
  public Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> getMap() {
    return map;
  }
}
