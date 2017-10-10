package rover.units.aspects;

import java.util.Map;
import rover.units.units.Length;
import rover.units.aspects.LengthAspectLengthAspectProperties;

@SuppressWarnings("all")
public class LengthAspectLengthAspectContext {
  public final static LengthAspectLengthAspectContext INSTANCE = new LengthAspectLengthAspectContext();
  
  public static LengthAspectLengthAspectProperties getSelf(final Length _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.LengthAspectLengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Length, LengthAspectLengthAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Length, rover.units.aspects.LengthAspectLengthAspectProperties>();
  
  public Map<Length, LengthAspectLengthAspectProperties> getMap() {
    return map;
  }
}
