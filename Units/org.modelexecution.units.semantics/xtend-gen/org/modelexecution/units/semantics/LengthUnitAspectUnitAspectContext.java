package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectUnitAspectContext {
  public final static LengthUnitAspectUnitAspectContext INSTANCE = new LengthUnitAspectUnitAspectContext();
  
  public static LengthUnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, LengthUnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Unit, org.modelexecution.units.semantics.LengthUnitAspectUnitAspectProperties>();
  
  public Map<Unit, LengthUnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
