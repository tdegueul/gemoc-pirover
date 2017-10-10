package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Length;
import rover.raspirover.aspects.LengthAspectLengthAspectProperties;

@SuppressWarnings("all")
public class LengthAspectLengthAspectContext {
  public final static LengthAspectLengthAspectContext INSTANCE = new LengthAspectLengthAspectContext();
  
  public static LengthAspectLengthAspectProperties getSelf(final Length _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.LengthAspectLengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Length, LengthAspectLengthAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Length, rover.raspirover.aspects.LengthAspectLengthAspectProperties>();
  
  public Map<Length, LengthAspectLengthAspectProperties> getMap() {
    return map;
  }
}
