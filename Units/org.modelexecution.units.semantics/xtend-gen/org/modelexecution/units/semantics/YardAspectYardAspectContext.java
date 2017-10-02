package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Yard;
import org.modelexecution.units.semantics.YardAspectYardAspectProperties;

@SuppressWarnings("all")
public class YardAspectYardAspectContext {
  public final static YardAspectYardAspectContext INSTANCE = new YardAspectYardAspectContext();
  
  public static YardAspectYardAspectProperties getSelf(final Yard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.YardAspectYardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Yard, YardAspectYardAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Yard, org.modelexecution.units.semantics.YardAspectYardAspectProperties>();
  
  public Map<Yard, YardAspectYardAspectProperties> getMap() {
    return map;
  }
}
