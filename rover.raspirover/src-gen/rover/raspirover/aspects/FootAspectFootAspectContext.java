package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Foot;
import rover.raspirover.aspects.FootAspectFootAspectProperties;

@SuppressWarnings("all")
public class FootAspectFootAspectContext {
  public final static FootAspectFootAspectContext INSTANCE = new FootAspectFootAspectContext();
  
  public static FootAspectFootAspectProperties getSelf(final Foot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.FootAspectFootAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Foot, FootAspectFootAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Foot, rover.raspirover.aspects.FootAspectFootAspectProperties>();
  
  public Map<Foot, FootAspectFootAspectProperties> getMap() {
    return map;
  }
}
