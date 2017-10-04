package rover;

import java.util.Map;
import rcl.Action;
import rover.ActionToPinGlueActionAspectProperties;

@SuppressWarnings("all")
public class ActionToPinGlueActionAspectContext {
  public final static ActionToPinGlueActionAspectContext INSTANCE = new ActionToPinGlueActionAspectContext();
  
  public static ActionToPinGlueActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.ActionToPinGlueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionToPinGlueActionAspectProperties> map = new java.util.WeakHashMap<rcl.Action, rover.ActionToPinGlueActionAspectProperties>();
  
  public Map<Action, ActionToPinGlueActionAspectProperties> getMap() {
    return map;
  }
}
