package rover.units.aspects;

import java.util.Map;
import rover.units.units.Yard;
import rover.units.aspects.YardAspectYardAspectProperties;

@SuppressWarnings("all")
public class YardAspectYardAspectContext {
  public final static YardAspectYardAspectContext INSTANCE = new YardAspectYardAspectContext();
  
  public static YardAspectYardAspectProperties getSelf(final Yard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.YardAspectYardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Yard, YardAspectYardAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Yard, rover.units.aspects.YardAspectYardAspectProperties>();
  
  public Map<Yard, YardAspectYardAspectProperties> getMap() {
    return map;
  }
}
