package rover;

import java.util.Map;
import rcl.BackwardMinAction;
import rover.BackwardMinActionWithPinBackwardMinActionAspectProperties;

@SuppressWarnings("all")
public class BackwardMinActionWithPinBackwardMinActionAspectContext {
  public final static BackwardMinActionWithPinBackwardMinActionAspectContext INSTANCE = new BackwardMinActionWithPinBackwardMinActionAspectContext();
  
  public static BackwardMinActionWithPinBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.BackwardMinActionWithPinBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, BackwardMinActionWithPinBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rcl.BackwardMinAction, rover.BackwardMinActionWithPinBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, BackwardMinActionWithPinBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
