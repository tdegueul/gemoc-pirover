package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.ForwardActionAspectForwardActionAspectProperties;
import rover.rcl.rcl.ForwardAction;

@SuppressWarnings("all")
public class ForwardActionAspectForwardActionAspectContext {
  public final static ForwardActionAspectForwardActionAspectContext INSTANCE = new ForwardActionAspectForwardActionAspectContext();
  
  public static ForwardActionAspectForwardActionAspectProperties getSelf(final ForwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.ForwardActionAspectForwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.ForwardAction, rover.rcl.aspects.ForwardActionAspectForwardActionAspectProperties>();
  
  public Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> getMap() {
    return map;
  }
}
