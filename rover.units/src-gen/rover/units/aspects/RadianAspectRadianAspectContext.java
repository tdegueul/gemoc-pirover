package rover.units.aspects;

import java.util.Map;
import rover.units.units.Radian;
import rover.units.aspects.RadianAspectRadianAspectProperties;

@SuppressWarnings("all")
public class RadianAspectRadianAspectContext {
  public final static RadianAspectRadianAspectContext INSTANCE = new RadianAspectRadianAspectContext();
  
  public static RadianAspectRadianAspectProperties getSelf(final Radian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.RadianAspectRadianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Radian, RadianAspectRadianAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Radian, rover.units.aspects.RadianAspectRadianAspectProperties>();
  
  public Map<Radian, RadianAspectRadianAspectProperties> getMap() {
    return map;
  }
}
