package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectProperties;
import rover.raspirover.raspirover.ForwardMinAction;

@SuppressWarnings("all")
public class ForwardMinActionAspectForwardMinActionAspectContext {
  public final static ForwardMinActionAspectForwardMinActionAspectContext INSTANCE = new ForwardMinActionAspectForwardMinActionAspectContext();
  
  public static ForwardMinActionAspectForwardMinActionAspectProperties getSelf(final ForwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.ForwardMinAction, rover.raspirover.aspects.ForwardMinActionAspectForwardMinActionAspectProperties>();
  
  public Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> getMap() {
    return map;
  }
}
