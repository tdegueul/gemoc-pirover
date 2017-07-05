package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectProperties;
import rcl.RclBlock;

@SuppressWarnings("all")
public class RclBlockAspectRclBlockAspectContext {
  public final static RclBlockAspectRclBlockAspectContext INSTANCE = new RclBlockAspectRclBlockAspectContext();
  
  public static RclBlockAspectRclBlockAspectProperties getSelf(final RclBlock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RclBlock, RclBlockAspectRclBlockAspectProperties> map = new java.util.WeakHashMap<rcl.RclBlock, org.gemoc.rover.rcl.semantics.RclBlockAspectRclBlockAspectProperties>();
  
  public Map<RclBlock, RclBlockAspectRclBlockAspectProperties> getMap() {
    return map;
  }
}
