package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.RclBlockAspectRclBlockAspectProperties;
import rover.raspirover.raspirover.RclBlock;

@SuppressWarnings("all")
public class RclBlockAspectRclBlockAspectContext {
  public final static RclBlockAspectRclBlockAspectContext INSTANCE = new RclBlockAspectRclBlockAspectContext();
  
  public static RclBlockAspectRclBlockAspectProperties getSelf(final RclBlock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.RclBlockAspectRclBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RclBlock, RclBlockAspectRclBlockAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.RclBlock, rover.raspirover.aspects.RclBlockAspectRclBlockAspectProperties>();
  
  public Map<RclBlock, RclBlockAspectRclBlockAspectProperties> getMap() {
    return map;
  }
}
