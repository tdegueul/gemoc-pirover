package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectProperties;
import rcl.ForwardMinAction;

@SuppressWarnings("all")
public class ForwardMinActionAspectForwardMinActionAspectContext {
  public final static ForwardMinActionAspectForwardMinActionAspectContext INSTANCE = new ForwardMinActionAspectForwardMinActionAspectContext();
  
  public static ForwardMinActionAspectForwardMinActionAspectProperties getSelf(final ForwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> map = new java.util.WeakHashMap<rcl.ForwardMinAction, org.gemoc.rover.rcl.semantics.ForwardMinActionAspectForwardMinActionAspectProperties>();
  
  public Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> getMap() {
    return map;
  }
}
