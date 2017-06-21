package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectProperties;
import rcl.BackwardAction;

@SuppressWarnings("all")
public class BackwardActionAspectBackwardActionAspectContext {
  public final static BackwardActionAspectBackwardActionAspectContext INSTANCE = new BackwardActionAspectBackwardActionAspectContext();
  
  public static BackwardActionAspectBackwardActionAspectProperties getSelf(final BackwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> map = new java.util.WeakHashMap<rcl.BackwardAction, org.gemoc.rover.rcl.semantics.BackwardActionAspectBackwardActionAspectProperties>();
  
  public Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> getMap() {
    return map;
  }
}
