package rover.units.aspects;

import java.util.Map;
import rover.units.units.Unit;
import rover.units.aspects.LengthUnitAspectUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectUnitAspectContext {
  public final static LengthUnitAspectUnitAspectContext INSTANCE = new LengthUnitAspectUnitAspectContext();
  
  public static LengthUnitAspectUnitAspectProperties getSelf(final Unit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.LengthUnitAspectUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Unit, LengthUnitAspectUnitAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Unit, rover.units.aspects.LengthUnitAspectUnitAspectProperties>();
  
  public Map<Unit, LengthUnitAspectUnitAspectProperties> getMap() {
    return map;
  }
}
