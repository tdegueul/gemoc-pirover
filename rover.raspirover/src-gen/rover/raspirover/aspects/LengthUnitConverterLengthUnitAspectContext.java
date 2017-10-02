package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.LengthUnit;
import rover.raspirover.aspects.LengthUnitConverterLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitConverterLengthUnitAspectContext {
  public final static LengthUnitConverterLengthUnitAspectContext INSTANCE = new LengthUnitConverterLengthUnitAspectContext();
  
  public static LengthUnitConverterLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.LengthUnitConverterLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.LengthUnit, rover.raspirover.aspects.LengthUnitConverterLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> getMap() {
    return map;
  }
}
