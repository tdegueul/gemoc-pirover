package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Length;
import org.modelexecution.units.semantics.LengthAspectLengthAspectProperties;

@SuppressWarnings("all")
public class LengthAspectLengthAspectContext {
  public final static LengthAspectLengthAspectContext INSTANCE = new LengthAspectLengthAspectContext();
  
  public static LengthAspectLengthAspectProperties getSelf(final Length _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.LengthAspectLengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Length, LengthAspectLengthAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Length, org.modelexecution.units.semantics.LengthAspectLengthAspectProperties>();
  
  public Map<Length, LengthAspectLengthAspectProperties> getMap() {
    return map;
  }
}
