package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.LogActionAspectLogActionAspectProperties;
import rover.rcl.rcl.LogAction;

@SuppressWarnings("all")
public class LogActionAspectLogActionAspectContext {
  public final static LogActionAspectLogActionAspectContext INSTANCE = new LogActionAspectLogActionAspectContext();
  
  public static LogActionAspectLogActionAspectProperties getSelf(final LogAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.LogActionAspectLogActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogAction, LogActionAspectLogActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.LogAction, rover.rcl.aspects.LogActionAspectLogActionAspectProperties>();
  
  public Map<LogAction, LogActionAspectLogActionAspectProperties> getMap() {
    return map;
  }
}
