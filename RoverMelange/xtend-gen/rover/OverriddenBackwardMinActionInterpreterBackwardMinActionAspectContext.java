package rover;

import java.util.Map;
import rcl.BackwardMinAction;
import rover.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties;

@SuppressWarnings("all")
public class OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext {
  public final static OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext INSTANCE = new OverriddenBackwardMinActionInterpreterBackwardMinActionAspectContext();
  
  public static OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties getSelf(final BackwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BackwardMinAction, OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties> map = new java.util.WeakHashMap<rcl.BackwardMinAction, rover.OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties>();
  
  public Map<BackwardMinAction, OverriddenBackwardMinActionInterpreterBackwardMinActionAspectProperties> getMap() {
    return map;
  }
}
