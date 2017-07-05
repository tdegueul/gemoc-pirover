package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties;
import rover.raspirover.raspirover.NumberValue;

@SuppressWarnings("all")
public class NumberValueAspectNumberValueAspectContext {
  public final static NumberValueAspectNumberValueAspectContext INSTANCE = new NumberValueAspectNumberValueAspectContext();
  
  public static NumberValueAspectNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberValueAspectNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumberValue, rover.raspirover.aspects.NumberValueAspectNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberValueAspectNumberValueAspectProperties> getMap() {
    return map;
  }
}
