package rover.glue;

import java.util.Map;
import rcl.NumberValue;
import rover.glue.NumberToQuantityGlueNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberToQuantityGlueNumberValueAspectContext {
  public final static NumberToQuantityGlueNumberValueAspectContext INSTANCE = new NumberToQuantityGlueNumberValueAspectContext();
  
  public static NumberToQuantityGlueNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.NumberToQuantityGlueNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberToQuantityGlueNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, rover.glue.NumberToQuantityGlueNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberToQuantityGlueNumberValueAspectProperties> getMap() {
    return map;
  }
}
