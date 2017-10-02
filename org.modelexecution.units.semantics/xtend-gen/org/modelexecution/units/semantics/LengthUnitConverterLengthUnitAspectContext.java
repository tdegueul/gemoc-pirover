package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.LengthUnit;
import org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitConverterLengthUnitAspectContext {
  public final static LengthUnitConverterLengthUnitAspectContext INSTANCE = new LengthUnitConverterLengthUnitAspectContext();
  
  public static LengthUnitConverterLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.LengthUnit, org.modelexecution.units.semantics.LengthUnitConverterLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> getMap() {
    return map;
  }
}
