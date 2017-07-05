package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectProperties;
import rover.rcl.rcl.ForwardMinAction;

@SuppressWarnings("all")
public class ForwardMinActionAspectForwardMinActionAspectContext {
  public final static ForwardMinActionAspectForwardMinActionAspectContext INSTANCE = new ForwardMinActionAspectForwardMinActionAspectContext();
  
  public static ForwardMinActionAspectForwardMinActionAspectProperties getSelf(final ForwardMinAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.ForwardMinAction, rover.rcl.aspects.ForwardMinActionAspectForwardMinActionAspectProperties>();
  
  public Map<ForwardMinAction, ForwardMinActionAspectForwardMinActionAspectProperties> getMap() {
    return map;
  }
}
