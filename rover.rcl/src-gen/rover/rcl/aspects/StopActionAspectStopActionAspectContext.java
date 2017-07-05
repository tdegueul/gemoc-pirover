package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.StopActionAspectStopActionAspectProperties;
import rover.rcl.rcl.StopAction;

@SuppressWarnings("all")
public class StopActionAspectStopActionAspectContext {
  public final static StopActionAspectStopActionAspectContext INSTANCE = new StopActionAspectStopActionAspectContext();
  
  public static StopActionAspectStopActionAspectProperties getSelf(final StopAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.StopActionAspectStopActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StopAction, StopActionAspectStopActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.StopAction, rover.rcl.aspects.StopActionAspectStopActionAspectProperties>();
  
  public Map<StopAction, StopActionAspectStopActionAspectProperties> getMap() {
    return map;
  }
}
