package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Centimeter;
import org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties;

@SuppressWarnings("all")
public class CentimeterAspectCentimeterAspectContext {
  public final static CentimeterAspectCentimeterAspectContext INSTANCE = new CentimeterAspectCentimeterAspectContext();
  
  public static CentimeterAspectCentimeterAspectProperties getSelf(final Centimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Centimeter, CentimeterAspectCentimeterAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Centimeter, org.modelexecution.units.semantics.CentimeterAspectCentimeterAspectProperties>();
  
  public Map<Centimeter, CentimeterAspectCentimeterAspectProperties> getMap() {
    return map;
  }
}
