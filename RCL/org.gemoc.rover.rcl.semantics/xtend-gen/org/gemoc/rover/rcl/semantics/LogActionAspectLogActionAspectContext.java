package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties;
import rcl.LogAction;

@SuppressWarnings("all")
public class LogActionAspectLogActionAspectContext {
  public final static LogActionAspectLogActionAspectContext INSTANCE = new LogActionAspectLogActionAspectContext();
  
  public static LogActionAspectLogActionAspectProperties getSelf(final LogAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogAction, LogActionAspectLogActionAspectProperties> map = new java.util.WeakHashMap<rcl.LogAction, org.gemoc.rover.rcl.semantics.LogActionAspectLogActionAspectProperties>();
  
  public Map<LogAction, LogActionAspectLogActionAspectProperties> getMap() {
    return map;
  }
}
