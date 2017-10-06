package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Angle;
import org.modelexecution.units.semantics.AngleAspectAngleAspectProperties;

@SuppressWarnings("all")
public class AngleAspectAngleAspectContext {
  public final static AngleAspectAngleAspectContext INSTANCE = new AngleAspectAngleAspectContext();
  
  public static AngleAspectAngleAspectProperties getSelf(final Angle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.AngleAspectAngleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Angle, AngleAspectAngleAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Angle, org.modelexecution.units.semantics.AngleAspectAngleAspectProperties>();
  
  public Map<Angle, AngleAspectAngleAspectProperties> getMap() {
    return map;
  }
}
