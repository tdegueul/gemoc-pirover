package rover.units.aspects;

import java.util.Map;
import rover.units.units.Quantity;
import rover.units.aspects.QuantityAspectQuantityAspectProperties;

@SuppressWarnings("all")
public class QuantityAspectQuantityAspectContext {
  public final static QuantityAspectQuantityAspectContext INSTANCE = new QuantityAspectQuantityAspectContext();
  
  public static QuantityAspectQuantityAspectProperties getSelf(final Quantity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.QuantityAspectQuantityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Quantity, QuantityAspectQuantityAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Quantity, rover.units.aspects.QuantityAspectQuantityAspectProperties>();
  
  public Map<Quantity, QuantityAspectQuantityAspectProperties> getMap() {
    return map;
  }
}
