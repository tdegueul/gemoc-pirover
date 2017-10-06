package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.AngleUnit;
import org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectProperties;

@SuppressWarnings("all")
public class AngleUnitAspectAngleUnitAspectContext {
  public final static AngleUnitAspectAngleUnitAspectContext INSTANCE = new AngleUnitAspectAngleUnitAspectContext();
  
  public static AngleUnitAspectAngleUnitAspectProperties getSelf(final AngleUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.AngleUnit, org.modelexecution.units.semantics.AngleUnitAspectAngleUnitAspectProperties>();
  
  public Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> getMap() {
    return map;
  }
}
