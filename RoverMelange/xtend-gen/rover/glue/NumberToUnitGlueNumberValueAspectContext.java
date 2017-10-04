package rover.glue;

import java.util.Map;
import rcl.NumberValue;
import rover.glue.NumberToUnitGlueNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberToUnitGlueNumberValueAspectContext {
  public final static NumberToUnitGlueNumberValueAspectContext INSTANCE = new NumberToUnitGlueNumberValueAspectContext();
  
  public static NumberToUnitGlueNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.NumberToUnitGlueNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, rover.glue.NumberToUnitGlueNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> getMap() {
    return map;
  }
}
