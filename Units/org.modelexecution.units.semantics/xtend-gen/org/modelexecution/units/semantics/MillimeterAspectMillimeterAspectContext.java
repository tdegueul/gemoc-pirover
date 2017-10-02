package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Millimeter;
import org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectProperties;

@SuppressWarnings("all")
public class MillimeterAspectMillimeterAspectContext {
  public final static MillimeterAspectMillimeterAspectContext INSTANCE = new MillimeterAspectMillimeterAspectContext();
  
  public static MillimeterAspectMillimeterAspectProperties getSelf(final Millimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Millimeter, MillimeterAspectMillimeterAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Millimeter, org.modelexecution.units.semantics.MillimeterAspectMillimeterAspectProperties>();
  
  public Map<Millimeter, MillimeterAspectMillimeterAspectProperties> getMap() {
    return map;
  }
}
