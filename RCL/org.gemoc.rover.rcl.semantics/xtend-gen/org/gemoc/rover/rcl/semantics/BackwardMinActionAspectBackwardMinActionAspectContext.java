package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rcl.BackwardMinAction;

@SuppressWarnings("all")
public class BackwardMinActionAspectBackwardMinActionAspectContext {
  public final static BackwardMinActionAspectBackwardMinActionAspectContext INSTANCE = new BackwardMinActionAspectBackwardMinActionAspectContext();
  
  public static BackwardMinActionAspectBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rcl.BackwardMinAction, org.gemoc.rover.rcl.semantics.BackwardMinActionAspectBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
