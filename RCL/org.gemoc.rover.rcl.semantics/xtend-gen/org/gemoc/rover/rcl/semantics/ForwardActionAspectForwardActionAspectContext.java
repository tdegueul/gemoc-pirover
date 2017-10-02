package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectProperties;
import rcl.ForwardAction;

@SuppressWarnings("all")
public class ForwardActionAspectForwardActionAspectContext {
  public final static ForwardActionAspectForwardActionAspectContext INSTANCE = new ForwardActionAspectForwardActionAspectContext();
  
  public static ForwardActionAspectForwardActionAspectProperties getSelf(final ForwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> map = new java.util.WeakHashMap<rcl.ForwardAction, org.gemoc.rover.rcl.semantics.ForwardActionAspectForwardActionAspectProperties>();
  
  public Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> getMap() {
    return map;
  }
}
