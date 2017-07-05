package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties;
import rover.rcl.rcl.NumberValue;

@SuppressWarnings("all")
public class NumberValueAspectNumberValueAspectContext {
  public final static NumberValueAspectNumberValueAspectContext INSTANCE = new NumberValueAspectNumberValueAspectContext();
  
  public static NumberValueAspectNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberValueAspectNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.NumberValue, rover.rcl.aspects.NumberValueAspectNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberValueAspectNumberValueAspectProperties> getMap() {
    return map;
  }
}
