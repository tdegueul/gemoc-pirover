package rover;

import java.util.Map;
import rcl.Action;
import rover.ActionToPinActionAspectProperties;

@SuppressWarnings("all")
public class ActionToPinActionAspectContext {
  public final static ActionToPinActionAspectContext INSTANCE = new ActionToPinActionAspectContext();
  
  public static ActionToPinActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.ActionToPinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionToPinActionAspectProperties> map = new java.util.WeakHashMap<rcl.Action, rover.ActionToPinActionAspectProperties>();
  
  public Map<Action, ActionToPinActionAspectProperties> getMap() {
    return map;
  }
}
