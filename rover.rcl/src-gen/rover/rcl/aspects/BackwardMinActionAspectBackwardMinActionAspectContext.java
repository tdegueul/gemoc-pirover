package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rover.rcl.rcl.BackwardMinAction;

@SuppressWarnings("all")
public class BackwardMinActionAspectBackwardMinActionAspectContext {
  public final static BackwardMinActionAspectBackwardMinActionAspectContext INSTANCE = new BackwardMinActionAspectBackwardMinActionAspectContext();
  
  public static BackwardMinActionAspectBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.BackwardMinAction, rover.rcl.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
