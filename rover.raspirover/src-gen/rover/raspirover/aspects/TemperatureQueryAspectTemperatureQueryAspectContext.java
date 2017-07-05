package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rover.raspirover.raspirover.TemperatureQuery;

@SuppressWarnings("all")
public class TemperatureQueryAspectTemperatureQueryAspectContext {
  public final static TemperatureQueryAspectTemperatureQueryAspectContext INSTANCE = new TemperatureQueryAspectTemperatureQueryAspectContext();
  
  public static TemperatureQueryAspectTemperatureQueryAspectProperties getSelf(final TemperatureQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.TemperatureQuery, rover.raspirover.aspects.TemperatureQueryAspectTemperatureQueryAspectProperties>();
  
  public Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> getMap() {
    return map;
  }
}
