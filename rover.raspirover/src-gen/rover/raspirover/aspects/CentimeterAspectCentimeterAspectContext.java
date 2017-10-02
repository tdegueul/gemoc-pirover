package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Centimeter;
import rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties;

@SuppressWarnings("all")
public class CentimeterAspectCentimeterAspectContext {
  public final static CentimeterAspectCentimeterAspectContext INSTANCE = new CentimeterAspectCentimeterAspectContext();
  
  public static CentimeterAspectCentimeterAspectProperties getSelf(final Centimeter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Centimeter, CentimeterAspectCentimeterAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Centimeter, rover.raspirover.aspects.CentimeterAspectCentimeterAspectProperties>();
  
  public Map<Centimeter, CentimeterAspectCentimeterAspectProperties> getMap() {
    return map;
  }
}
