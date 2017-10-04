package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.BackwardMinAction;
import rover.raspirover.aspects.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties;

@SuppressWarnings("all")
public class OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext {
  public final static OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext INSTANCE = new OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext();
  
  public static OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.BackwardMinAction, rover.raspirover.aspects.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
