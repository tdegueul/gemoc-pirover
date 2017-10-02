package rover.units.aspects;

import java.util.Map;
import rover.units.units.Centimeter;
import rover.units.aspects.CentimeterAspectCentimeterAspectProperties;

@SuppressWarnings("all")
public class CentimeterAspectCentimeterAspectContext {
  public final static CentimeterAspectCentimeterAspectContext INSTANCE = new CentimeterAspectCentimeterAspectContext();
  
  public static CentimeterAspectCentimeterAspectProperties getSelf(final Centimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.CentimeterAspectCentimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Centimeter, CentimeterAspectCentimeterAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Centimeter, rover.units.aspects.CentimeterAspectCentimeterAspectProperties>();
  
  public Map<Centimeter, CentimeterAspectCentimeterAspectProperties> getMap() {
    return map;
  }
}
