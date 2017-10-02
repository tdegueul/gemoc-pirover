package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Millimeter;
import rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties;

@SuppressWarnings("all")
public class MillimeterAspectMillimeterAspectContext {
  public final static MillimeterAspectMillimeterAspectContext INSTANCE = new MillimeterAspectMillimeterAspectContext();
  
  public static MillimeterAspectMillimeterAspectProperties getSelf(final Millimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Millimeter, MillimeterAspectMillimeterAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Millimeter, rover.raspirover.aspects.MillimeterAspectMillimeterAspectProperties>();
  
  public Map<Millimeter, MillimeterAspectMillimeterAspectProperties> getMap() {
    return map;
  }
}
