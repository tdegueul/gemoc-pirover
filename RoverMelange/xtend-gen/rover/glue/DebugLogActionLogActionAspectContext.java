package rover.glue;

import java.util.Map;
import rcl.LogAction;
import rover.glue.DebugLogActionLogActionAspectProperties;

@SuppressWarnings("all")
public class DebugLogActionLogActionAspectContext {
  public final static DebugLogActionLogActionAspectContext INSTANCE = new DebugLogActionLogActionAspectContext();
  
  public static DebugLogActionLogActionAspectProperties getSelf(final LogAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.DebugLogActionLogActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogAction, DebugLogActionLogActionAspectProperties> map = new java.util.WeakHashMap<rcl.LogAction, rover.glue.DebugLogActionLogActionAspectProperties>();
  
  public Map<LogAction, DebugLogActionLogActionAspectProperties> getMap() {
    return map;
  }
}
