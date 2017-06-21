package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.ActionAspectActionAspectProperties;
import rcl.Action;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<rcl.Action, org.gemoc.rover.rcl.semantics.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
