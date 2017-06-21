package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.VarRefAspectVarRefAspectProperties;
import rover.rcl.rcl.VarRef;

@SuppressWarnings("all")
public class VarRefAspectVarRefAspectContext {
  public final static VarRefAspectVarRefAspectContext INSTANCE = new VarRefAspectVarRefAspectContext();
  
  public static VarRefAspectVarRefAspectProperties getSelf(final VarRef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.VarRefAspectVarRefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarRef, VarRefAspectVarRefAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.VarRef, rover.rcl.aspects.VarRefAspectVarRefAspectProperties>();
  
  public Map<VarRef, VarRefAspectVarRefAspectProperties> getMap() {
    return map;
  }
}
