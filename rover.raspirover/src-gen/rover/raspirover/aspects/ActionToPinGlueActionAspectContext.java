package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Action;
import rover.raspirover.aspects.ActionToPinGlueActionAspectProperties;

@SuppressWarnings("all")
public class ActionToPinGlueActionAspectContext {
  public final static ActionToPinGlueActionAspectContext INSTANCE = new ActionToPinGlueActionAspectContext();
  
  public static ActionToPinGlueActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ActionToPinGlueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionToPinGlueActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Action, rover.raspirover.aspects.ActionToPinGlueActionAspectProperties>();
  
  public Map<Action, ActionToPinGlueActionAspectProperties> getMap() {
    return map;
  }
}
