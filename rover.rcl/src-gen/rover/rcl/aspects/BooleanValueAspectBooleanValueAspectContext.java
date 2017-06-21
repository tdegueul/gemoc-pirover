package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties;
import rover.rcl.rcl.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAspectBooleanValueAspectContext {
  public final static BooleanValueAspectBooleanValueAspectContext INSTANCE = new BooleanValueAspectBooleanValueAspectContext();
  
  public static BooleanValueAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.BooleanValue, rover.rcl.aspects.BooleanValueAspectBooleanValueAspectProperties>();
  
  public Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
