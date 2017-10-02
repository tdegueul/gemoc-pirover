package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Foot;
import org.modelexecution.units.semantics.FootAspectFootAspectProperties;

@SuppressWarnings("all")
public class FootAspectFootAspectContext {
  public final static FootAspectFootAspectContext INSTANCE = new FootAspectFootAspectContext();
  
  public static FootAspectFootAspectProperties getSelf(final Foot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.FootAspectFootAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Foot, FootAspectFootAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Foot, org.modelexecution.units.semantics.FootAspectFootAspectProperties>();
  
  public Map<Foot, FootAspectFootAspectProperties> getMap() {
    return map;
  }
}
