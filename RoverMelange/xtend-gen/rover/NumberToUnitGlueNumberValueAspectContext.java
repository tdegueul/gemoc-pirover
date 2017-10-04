package rover;

import java.util.Map;
import rcl.NumberValue;
import rover.NumberToUnitGlueNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberToUnitGlueNumberValueAspectContext {
  public final static NumberToUnitGlueNumberValueAspectContext INSTANCE = new NumberToUnitGlueNumberValueAspectContext();
  
  public static NumberToUnitGlueNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.NumberToUnitGlueNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, rover.NumberToUnitGlueNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> getMap() {
    return map;
  }
}
