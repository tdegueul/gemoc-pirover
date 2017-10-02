package rover.units.aspects;

import java.util.Map;
import rover.units.units.Foot;
import rover.units.aspects.FootAspectFootAspectProperties;

@SuppressWarnings("all")
public class FootAspectFootAspectContext {
  public final static FootAspectFootAspectContext INSTANCE = new FootAspectFootAspectContext();
  
  public static FootAspectFootAspectProperties getSelf(final Foot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.FootAspectFootAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Foot, FootAspectFootAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Foot, rover.units.aspects.FootAspectFootAspectProperties>();
  
  public Map<Foot, FootAspectFootAspectProperties> getMap() {
    return map;
  }
}
