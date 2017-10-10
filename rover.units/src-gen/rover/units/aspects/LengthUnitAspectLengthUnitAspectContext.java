package rover.units.aspects;

import java.util.Map;
import rover.units.units.LengthUnit;
import rover.units.aspects.LengthUnitAspectLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectLengthUnitAspectContext {
  public final static LengthUnitAspectLengthUnitAspectContext INSTANCE = new LengthUnitAspectLengthUnitAspectContext();
  
  public static LengthUnitAspectLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.LengthUnitAspectLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> map = new java.util.WeakHashMap<rover.units.units.LengthUnit, rover.units.aspects.LengthUnitAspectLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> getMap() {
    return map;
  }
}
