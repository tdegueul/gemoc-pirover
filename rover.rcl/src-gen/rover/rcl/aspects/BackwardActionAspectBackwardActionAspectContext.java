package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.BackwardActionAspectBackwardActionAspectProperties;
import rover.rcl.rcl.BackwardAction;

@SuppressWarnings("all")
public class BackwardActionAspectBackwardActionAspectContext {
  public final static BackwardActionAspectBackwardActionAspectContext INSTANCE = new BackwardActionAspectBackwardActionAspectContext();
  
  public static BackwardActionAspectBackwardActionAspectProperties getSelf(final BackwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.BackwardActionAspectBackwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.BackwardAction, rover.rcl.aspects.BackwardActionAspectBackwardActionAspectProperties>();
  
  public Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> getMap() {
    return map;
  }
}
