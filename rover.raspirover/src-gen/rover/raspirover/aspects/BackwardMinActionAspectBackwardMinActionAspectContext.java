package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties;
import rover.raspirover.raspirover.BackwardMinAction;

@SuppressWarnings("all")
public class BackwardMinActionAspectBackwardMinActionAspectContext {
  public final static BackwardMinActionAspectBackwardMinActionAspectContext INSTANCE = new BackwardMinActionAspectBackwardMinActionAspectContext();
  
  public static BackwardMinActionAspectBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.BackwardMinAction, rover.raspirover.aspects.BackwardMinActionAspectBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, BackwardMinActionAspectBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
