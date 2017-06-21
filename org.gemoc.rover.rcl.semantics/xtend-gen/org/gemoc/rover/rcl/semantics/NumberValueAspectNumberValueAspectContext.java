package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties;
import rcl.NumberValue;

@SuppressWarnings("all")
public class NumberValueAspectNumberValueAspectContext {
  public final static NumberValueAspectNumberValueAspectContext INSTANCE = new NumberValueAspectNumberValueAspectContext();
  
  public static NumberValueAspectNumberValueAspectProperties getSelf(final NumberValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumberValue, NumberValueAspectNumberValueAspectProperties> map = new java.util.WeakHashMap<rcl.NumberValue, org.gemoc.rover.rcl.semantics.NumberValueAspectNumberValueAspectProperties>();
  
  public Map<NumberValue, NumberValueAspectNumberValueAspectProperties> getMap() {
    return map;
  }
}
