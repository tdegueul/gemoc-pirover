package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties;
import rcl.VarRef;

@SuppressWarnings("all")
public class VarRefAspectVarRefAspectContext {
  public final static VarRefAspectVarRefAspectContext INSTANCE = new VarRefAspectVarRefAspectContext();
  
  public static VarRefAspectVarRefAspectProperties getSelf(final VarRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarRef, VarRefAspectVarRefAspectProperties> map = new java.util.WeakHashMap<rcl.VarRef, org.gemoc.rover.rcl.semantics.VarRefAspectVarRefAspectProperties>();
  
  public Map<VarRef, VarRefAspectVarRefAspectProperties> getMap() {
    return map;
  }
}
