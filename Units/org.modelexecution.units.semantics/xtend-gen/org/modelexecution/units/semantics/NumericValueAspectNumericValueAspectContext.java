package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.NumericValue;
import org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectProperties;

@SuppressWarnings("all")
public class NumericValueAspectNumericValueAspectContext {
  public final static NumericValueAspectNumericValueAspectContext INSTANCE = new NumericValueAspectNumericValueAspectContext();
  
  public static NumericValueAspectNumericValueAspectProperties getSelf(final NumericValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NumericValue, NumericValueAspectNumericValueAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.NumericValue, org.modelexecution.units.semantics.NumericValueAspectNumericValueAspectProperties>();
  
  public Map<NumericValue, NumericValueAspectNumericValueAspectProperties> getMap() {
    return map;
  }
}
