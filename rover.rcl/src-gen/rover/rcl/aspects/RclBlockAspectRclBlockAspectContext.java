package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.RclBlockAspectRclBlockAspectProperties;
import rover.rcl.rcl.RclBlock;

@SuppressWarnings("all")
public class RclBlockAspectRclBlockAspectContext {
  public final static RclBlockAspectRclBlockAspectContext INSTANCE = new RclBlockAspectRclBlockAspectContext();
  
  public static RclBlockAspectRclBlockAspectProperties getSelf(final RclBlock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.RclBlockAspectRclBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RclBlock, RclBlockAspectRclBlockAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.RclBlock, rover.rcl.aspects.RclBlockAspectRclBlockAspectProperties>();
  
  public Map<RclBlock, RclBlockAspectRclBlockAspectProperties> getMap() {
    return map;
  }
}
