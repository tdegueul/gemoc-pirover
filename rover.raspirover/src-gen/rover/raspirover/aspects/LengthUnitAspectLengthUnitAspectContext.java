package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitAspectLengthUnitAspectContext {
  public final static LengthUnitAspectLengthUnitAspectContext INSTANCE = new LengthUnitAspectLengthUnitAspectContext();
  
  public static LengthUnitAspectLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.LengthUnit, rover.raspirover.aspects.LengthUnitAspectLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitAspectLengthUnitAspectProperties> getMap() {
    return map;
  }
}
