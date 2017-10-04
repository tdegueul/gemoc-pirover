package rover.glue;

import java.util.Map;
import rcl.NumberValue;
import rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties;

@SuppressWarnings("all")
public class OverriddenNumberInterpreterNumberValueAspectContext {
  public final static OverriddenNumberInterpreterNumberValueAspectContext INSTANCE = new OverriddenNumberInterpreterNumberValueAspectContext();
  
  public static OverriddenNumberInterpreterNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, OverriddenNumberInterpreterNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, rover.glue.OverriddenNumberInterpreterNumberValueAspectProperties>();
  
  public Map<NumberValue, OverriddenNumberInterpreterNumberValueAspectProperties> getMap() {
    return map;
  }
}
