package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Gradian;
import org.modelexecution.units.semantics.GradianAspectGradianAspectProperties;

@SuppressWarnings("all")
public class GradianAspectGradianAspectContext {
  public final static GradianAspectGradianAspectContext INSTANCE = new GradianAspectGradianAspectContext();
  
  public static GradianAspectGradianAspectProperties getSelf(final Gradian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.GradianAspectGradianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Gradian, GradianAspectGradianAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Gradian, org.modelexecution.units.semantics.GradianAspectGradianAspectProperties>();
  
  public Map<Gradian, GradianAspectGradianAspectProperties> getMap() {
    return map;
  }
}
