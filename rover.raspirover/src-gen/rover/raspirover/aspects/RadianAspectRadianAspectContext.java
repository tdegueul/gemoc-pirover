package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Radian;
import rover.raspirover.aspects.RadianAspectRadianAspectProperties;

@SuppressWarnings("all")
public class RadianAspectRadianAspectContext {
  public final static RadianAspectRadianAspectContext INSTANCE = new RadianAspectRadianAspectContext();
  
  public static RadianAspectRadianAspectProperties getSelf(final Radian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.RadianAspectRadianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Radian, RadianAspectRadianAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Radian, rover.raspirover.aspects.RadianAspectRadianAspectProperties>();
  
  public Map<Radian, RadianAspectRadianAspectProperties> getMap() {
    return map;
  }
}
