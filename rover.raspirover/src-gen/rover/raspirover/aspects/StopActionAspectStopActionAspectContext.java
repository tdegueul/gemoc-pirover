package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.StopActionAspectStopActionAspectProperties;
import rover.raspirover.raspirover.StopAction;

@SuppressWarnings("all")
public class StopActionAspectStopActionAspectContext {
  public final static StopActionAspectStopActionAspectContext INSTANCE = new StopActionAspectStopActionAspectContext();
  
  public static StopActionAspectStopActionAspectProperties getSelf(final StopAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.StopActionAspectStopActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StopAction, StopActionAspectStopActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.StopAction, rover.raspirover.aspects.StopActionAspectStopActionAspectProperties>();
  
  public Map<StopAction, StopActionAspectStopActionAspectProperties> getMap() {
    return map;
  }
}
