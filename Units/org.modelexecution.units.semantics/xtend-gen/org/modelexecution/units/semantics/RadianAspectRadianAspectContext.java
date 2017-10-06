package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Radian;
import org.modelexecution.units.semantics.RadianAspectRadianAspectProperties;

@SuppressWarnings("all")
public class RadianAspectRadianAspectContext {
  public final static RadianAspectRadianAspectContext INSTANCE = new RadianAspectRadianAspectContext();
  
  public static RadianAspectRadianAspectProperties getSelf(final Radian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.RadianAspectRadianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Radian, RadianAspectRadianAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Radian, org.modelexecution.units.semantics.RadianAspectRadianAspectProperties>();
  
  public Map<Radian, RadianAspectRadianAspectProperties> getMap() {
    return map;
  }
}
