package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties;
import rover.raspirover.raspirover.BackwardAction;

@SuppressWarnings("all")
public class BackwardActionAspectBackwardActionAspectContext {
  public final static BackwardActionAspectBackwardActionAspectContext INSTANCE = new BackwardActionAspectBackwardActionAspectContext();
  
  public static BackwardActionAspectBackwardActionAspectProperties getSelf(final BackwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.BackwardAction, rover.raspirover.aspects.BackwardActionAspectBackwardActionAspectProperties>();
  
  public Map<BackwardAction, BackwardActionAspectBackwardActionAspectProperties> getMap() {
    return map;
  }
}
