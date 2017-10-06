package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Unit;
import org.modelexecution.units.semantics.UnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class UnitAspectUnitAspectContext {
  public final static UnitAspectUnitAspectContext INSTANCE = new UnitAspectUnitAspectContext();
  
  public static UnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.UnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, UnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Unit, org.modelexecution.units.semantics.UnitAspectUnitAspectProperties>();
  
  public Map<Unit, UnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
