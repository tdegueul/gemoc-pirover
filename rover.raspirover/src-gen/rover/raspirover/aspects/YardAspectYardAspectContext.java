package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Yard;
import rover.raspirover.aspects.YardAspectYardAspectProperties;

@SuppressWarnings("all")
public class YardAspectYardAspectContext {
  public final static YardAspectYardAspectContext INSTANCE = new YardAspectYardAspectContext();
  
  public static YardAspectYardAspectProperties getSelf(final Yard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.YardAspectYardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Yard, YardAspectYardAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Yard, rover.raspirover.aspects.YardAspectYardAspectProperties>();
  
  public Map<Yard, YardAspectYardAspectProperties> getMap() {
    return map;
  }
}
