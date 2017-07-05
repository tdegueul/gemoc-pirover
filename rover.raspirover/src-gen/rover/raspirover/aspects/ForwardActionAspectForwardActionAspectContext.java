package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.ForwardActionAspectForwardActionAspectProperties;
import rover.raspirover.raspirover.ForwardAction;

@SuppressWarnings("all")
public class ForwardActionAspectForwardActionAspectContext {
  public final static ForwardActionAspectForwardActionAspectContext INSTANCE = new ForwardActionAspectForwardActionAspectContext();
  
  public static ForwardActionAspectForwardActionAspectProperties getSelf(final ForwardAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ForwardActionAspectForwardActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.ForwardAction, rover.raspirover.aspects.ForwardActionAspectForwardActionAspectProperties>();
  
  public Map<ForwardAction, ForwardActionAspectForwardActionAspectProperties> getMap() {
    return map;
  }
}
