package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectProperties;
import rcl.HumidityQuery;

@SuppressWarnings("all")
public class HumidityQueryAspectHumidityQueryAspectContext {
  public final static HumidityQueryAspectHumidityQueryAspectContext INSTANCE = new HumidityQueryAspectHumidityQueryAspectContext();
  
  public static HumidityQueryAspectHumidityQueryAspectProperties getSelf(final HumidityQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> map = new java.util.WeakHashMap<rcl.HumidityQuery, org.gemoc.rover.rcl.semantics.HumidityQueryAspectHumidityQueryAspectProperties>();
  
  public Map<HumidityQuery, HumidityQueryAspectHumidityQueryAspectProperties> getMap() {
    return map;
  }
}
