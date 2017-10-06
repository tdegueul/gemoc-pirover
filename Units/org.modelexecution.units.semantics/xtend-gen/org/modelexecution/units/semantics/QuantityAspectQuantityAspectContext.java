package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Quantity;
import org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties;

@SuppressWarnings("all")
public class QuantityAspectQuantityAspectContext {
  public final static QuantityAspectQuantityAspectContext INSTANCE = new QuantityAspectQuantityAspectContext();
  
  public static QuantityAspectQuantityAspectProperties getSelf(final Quantity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Quantity, QuantityAspectQuantityAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Quantity, org.modelexecution.units.semantics.QuantityAspectQuantityAspectProperties>();
  
  public Map<Quantity, QuantityAspectQuantityAspectProperties> getMap() {
    return map;
  }
}
