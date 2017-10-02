package rover.units.aspects;

import java.util.Map;
import rover.units.units.Unit;
import rover.units.aspects.UnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class UnitAspectUnitAspectContext {
  public final static UnitAspectUnitAspectContext INSTANCE = new UnitAspectUnitAspectContext();
  
  public static UnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.UnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, UnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Unit, rover.units.aspects.UnitAspectUnitAspectProperties>();
  
  public Map<Unit, UnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
