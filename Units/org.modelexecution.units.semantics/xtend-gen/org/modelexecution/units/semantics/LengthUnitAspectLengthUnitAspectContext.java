package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectLengthUnitAspectContext {
  public final static LengthUnitAspectLengthUnitAspectContext INSTANCE = new LengthUnitAspectLengthUnitAspectContext();
  
  public static LengthUnitAspectLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.LengthUnit, org.modelexecution.units.semantics.LengthUnitAspectLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> getMap() {
    return map;
  }
}
