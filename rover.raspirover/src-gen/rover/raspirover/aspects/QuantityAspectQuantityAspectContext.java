package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Quantity;
import rover.raspirover.aspects.QuantityAspectQuantityAspectProperties;

@SuppressWarnings("all")
public class QuantityAspectQuantityAspectContext {
  public final static QuantityAspectQuantityAspectContext INSTANCE = new QuantityAspectQuantityAspectContext();
  
  public static QuantityAspectQuantityAspectProperties getSelf(final Quantity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.QuantityAspectQuantityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Quantity, QuantityAspectQuantityAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Quantity, rover.raspirover.aspects.QuantityAspectQuantityAspectProperties>();
  
  public Map<Quantity, QuantityAspectQuantityAspectProperties> getMap() {
    return map;
  }
}
