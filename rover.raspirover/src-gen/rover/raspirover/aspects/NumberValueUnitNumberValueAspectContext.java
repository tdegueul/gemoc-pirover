package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberValueUnitNumberValueAspectContext {
  public final static NumberValueUnitNumberValueAspectContext INSTANCE = new NumberValueUnitNumberValueAspectContext();
  
  public static NumberValueUnitNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberValueUnitNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumberValue, rover.raspirover.aspects.NumberValueUnitNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberValueUnitNumberValueAspectProperties> getMap() {
    return map;
  }
}
