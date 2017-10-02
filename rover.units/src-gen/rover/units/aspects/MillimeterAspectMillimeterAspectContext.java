package rover.units.aspects;

import java.util.Map;
import rover.units.units.Millimeter;
import rover.units.aspects.MillimeterAspectMillimeterAspectProperties;

@SuppressWarnings("all")
public class MillimeterAspectMillimeterAspectContext {
  public final static MillimeterAspectMillimeterAspectContext INSTANCE = new MillimeterAspectMillimeterAspectContext();
  
  public static MillimeterAspectMillimeterAspectProperties getSelf(final Millimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.MillimeterAspectMillimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Millimeter, MillimeterAspectMillimeterAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Millimeter, rover.units.aspects.MillimeterAspectMillimeterAspectProperties>();
  
  public Map<Millimeter, MillimeterAspectMillimeterAspectProperties> getMap() {
    return map;
  }
}
