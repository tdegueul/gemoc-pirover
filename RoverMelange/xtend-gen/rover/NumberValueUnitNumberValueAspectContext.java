package rover;

import java.util.Map;
import rcl.NumberValue;
import rover.NumberValueUnitNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberValueUnitNumberValueAspectContext {
  public final static NumberValueUnitNumberValueAspectContext INSTANCE = new NumberValueUnitNumberValueAspectContext();
  
  public static NumberValueUnitNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.NumberValueUnitNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberValueUnitNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, rover.NumberValueUnitNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberValueUnitNumberValueAspectProperties> getMap() {
    return map;
  }
}
