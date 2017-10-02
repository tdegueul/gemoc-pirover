package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.LengthUnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectUnitAspectContext {
  public final static LengthUnitAspectUnitAspectContext INSTANCE = new LengthUnitAspectUnitAspectContext();
  
  public static LengthUnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.LengthUnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, LengthUnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Unit, rover.raspirover.aspects.LengthUnitAspectUnitAspectProperties>();
  
  public Map<Unit, LengthUnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
