package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties;

@SuppressWarnings("all")
public class OverriddenNumberInterpreterNumberValueAspectContext {
  public final static OverriddenNumberInterpreterNumberValueAspectContext INSTANCE = new OverriddenNumberInterpreterNumberValueAspectContext();
  
  public static OverriddenNumberInterpreterNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, OverriddenNumberInterpreterNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumberValue, rover.raspirover.aspects.OverriddenNumberInterpreterNumberValueAspectProperties>();
  
  public Map<NumberValue, OverriddenNumberInterpreterNumberValueAspectProperties> getMap() {
    return map;
  }
}
