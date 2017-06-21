package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectProperties;
import rcl.TemperatureQuery;

@SuppressWarnings("all")
public class TemperatureQueryAspectTemperatureQueryAspectContext {
  public final static TemperatureQueryAspectTemperatureQueryAspectContext INSTANCE = new TemperatureQueryAspectTemperatureQueryAspectContext();
  
  public static TemperatureQueryAspectTemperatureQueryAspectProperties getSelf(final TemperatureQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> map = new java.util.WeakHashMap<rcl.TemperatureQuery, org.gemoc.rover.rcl.semantics.TemperatureQueryAspectTemperatureQueryAspectProperties>();
  
  public Map<TemperatureQuery, TemperatureQueryAspectTemperatureQueryAspectProperties> getMap() {
    return map;
  }
}
