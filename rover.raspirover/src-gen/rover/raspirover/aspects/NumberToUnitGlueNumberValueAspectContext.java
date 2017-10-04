package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.aspects.NumberToUnitGlueNumberValueAspectProperties;

@SuppressWarnings("all")
public class NumberToUnitGlueNumberValueAspectContext {
  public final static NumberToUnitGlueNumberValueAspectContext INSTANCE = new NumberToUnitGlueNumberValueAspectContext();
  
  public static NumberToUnitGlueNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.NumberToUnitGlueNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.NumberValue, rover.raspirover.aspects.NumberToUnitGlueNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberToUnitGlueNumberValueAspectProperties> getMap() {
    return map;
  }
}
