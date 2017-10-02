package rover.units.aspects;

import java.util.Map;
import rover.units.units.LengthUnit;
import rover.units.aspects.LengthUnitConverterLengthUnitAspectProperties;

@SuppressWarnings("all")
public class LengthUnitConverterLengthUnitAspectContext {
  public final static LengthUnitConverterLengthUnitAspectContext INSTANCE = new LengthUnitConverterLengthUnitAspectContext();
  
  public static LengthUnitConverterLengthUnitAspectProperties getSelf(final LengthUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.LengthUnitConverterLengthUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> map = new java.util.WeakHashMap<rover.units.units.LengthUnit, rover.units.aspects.LengthUnitConverterLengthUnitAspectProperties>();
  
  public Map<LengthUnit, LengthUnitConverterLengthUnitAspectProperties> getMap() {
    return map;
  }
}
