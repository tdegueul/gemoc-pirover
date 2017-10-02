package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Inch;
import org.modelexecution.units.semantics.InchAspectInchAspectProperties;

@SuppressWarnings("all")
public class InchAspectInchAspectContext {
  public final static InchAspectInchAspectContext INSTANCE = new InchAspectInchAspectContext();
  
  public static InchAspectInchAspectProperties getSelf(final Inch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.InchAspectInchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Inch, InchAspectInchAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Inch, org.modelexecution.units.semantics.InchAspectInchAspectProperties>();
  
  public Map<Inch, InchAspectInchAspectProperties> getMap() {
    return map;
  }
}
