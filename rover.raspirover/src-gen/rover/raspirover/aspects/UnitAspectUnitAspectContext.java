package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Unit;
import rover.raspirover.aspects.UnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class UnitAspectUnitAspectContext {
  public final static UnitAspectUnitAspectContext INSTANCE = new UnitAspectUnitAspectContext();
  
  public static UnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.UnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, UnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Unit, rover.raspirover.aspects.UnitAspectUnitAspectProperties>();
  
  public Map<Unit, UnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
