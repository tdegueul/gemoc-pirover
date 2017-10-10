package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberToQuantityGlueNumberValueAspectContext {
  public final static NumberToQuantityGlueNumberValueAspectContext INSTANCE = new NumberToQuantityGlueNumberValueAspectContext();
  
  public static NumberToQuantityGlueNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberToQuantityGlueNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumberValue, rover.raspirover.aspects.NumberToQuantityGlueNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberToQuantityGlueNumberValueAspectProperties> getMap() {
    return map;
  }
}
