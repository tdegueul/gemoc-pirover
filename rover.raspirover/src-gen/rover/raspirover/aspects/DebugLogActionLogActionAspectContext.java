package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.LogAction;
import rover.raspirover.aspects.DebugLogActionLogActionAspectProperties;

@SuppressWarnings("all")
public class DebugLogActionLogActionAspectContext {
  public final static DebugLogActionLogActionAspectContext INSTANCE = new DebugLogActionLogActionAspectContext();
  
  public static DebugLogActionLogActionAspectProperties getSelf(final LogAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.DebugLogActionLogActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogAction, DebugLogActionLogActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.LogAction, rover.raspirover.aspects.DebugLogActionLogActionAspectProperties>();
  
  public Map<LogAction, DebugLogActionLogActionAspectProperties> getMap() {
    return map;
  }
}
