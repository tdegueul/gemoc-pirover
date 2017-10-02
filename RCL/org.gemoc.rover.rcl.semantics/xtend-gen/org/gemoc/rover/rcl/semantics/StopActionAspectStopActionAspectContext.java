package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectProperties;
import rcl.StopAction;

@SuppressWarnings("all")
public class StopActionAspectStopActionAspectContext {
  public final static StopActionAspectStopActionAspectContext INSTANCE = new StopActionAspectStopActionAspectContext();
  
  public static StopActionAspectStopActionAspectProperties getSelf(final StopAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StopAction, StopActionAspectStopActionAspectProperties> map = new java.util.WeakHashMap<rcl.StopAction, org.gemoc.rover.rcl.semantics.StopActionAspectStopActionAspectProperties>();
  
  public Map<StopAction, StopActionAspectStopActionAspectProperties> getMap() {
    return map;
  }
}
