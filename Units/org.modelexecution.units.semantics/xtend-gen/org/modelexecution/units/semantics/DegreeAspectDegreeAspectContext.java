package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Degree;
import org.modelexecution.units.semantics.DegreeAspectDegreeAspectProperties;

@SuppressWarnings("all")
public class DegreeAspectDegreeAspectContext {
  public final static DegreeAspectDegreeAspectContext INSTANCE = new DegreeAspectDegreeAspectContext();
  
  public static DegreeAspectDegreeAspectProperties getSelf(final Degree _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.DegreeAspectDegreeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Degree, DegreeAspectDegreeAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Degree, org.modelexecution.units.semantics.DegreeAspectDegreeAspectProperties>();
  
  public Map<Degree, DegreeAspectDegreeAspectProperties> getMap() {
    return map;
  }
}
