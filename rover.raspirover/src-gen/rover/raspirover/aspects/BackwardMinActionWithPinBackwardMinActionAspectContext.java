package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectProperties;

@SuppressWarnings("all")
public class BackwardMinActionWithPinBackwardMinActionAspectContext {
  public final static BackwardMinActionWithPinBackwardMinActionAspectContext INSTANCE = new BackwardMinActionWithPinBackwardMinActionAspectContext();
  
  public static BackwardMinActionWithPinBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, BackwardMinActionWithPinBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.BackwardMinAction, rover.raspirover.aspects.BackwardMinActionWithPinBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, BackwardMinActionWithPinBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
