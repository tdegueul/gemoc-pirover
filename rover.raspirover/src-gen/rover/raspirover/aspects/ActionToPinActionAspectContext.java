package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Action;
import rover.raspirover.aspects.ActionToPinActionAspectProperties;

@SuppressWarnings("all")
public class ActionToPinActionAspectContext {
  public final static ActionToPinActionAspectContext INSTANCE = new ActionToPinActionAspectContext();
  
  public static ActionToPinActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ActionToPinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionToPinActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Action, rover.raspirover.aspects.ActionToPinActionAspectProperties>();
  
  public Map<Action, ActionToPinActionAspectProperties> getMap() {
    return map;
  }
}
