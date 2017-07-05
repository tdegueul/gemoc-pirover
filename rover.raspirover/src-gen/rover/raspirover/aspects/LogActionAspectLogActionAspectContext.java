package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.LogActionAspectLogActionAspectProperties;
import rover.raspirover.raspirover.LogAction;

@SuppressWarnings("all")
public class LogActionAspectLogActionAspectContext {
  public final static LogActionAspectLogActionAspectContext INSTANCE = new LogActionAspectLogActionAspectContext();
  
  public static LogActionAspectLogActionAspectProperties getSelf(final LogAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.LogActionAspectLogActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogAction, LogActionAspectLogActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.LogAction, rover.raspirover.aspects.LogActionAspectLogActionAspectProperties>();
  
  public Map<LogAction, LogActionAspectLogActionAspectProperties> getMap() {
    return map;
  }
}
