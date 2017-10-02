package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Inch;
import rover.raspirover.aspects.InchAspectInchAspectProperties;

@SuppressWarnings("all")
public class InchAspectInchAspectContext {
  public final static InchAspectInchAspectContext INSTANCE = new InchAspectInchAspectContext();
  
  public static InchAspectInchAspectProperties getSelf(final Inch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.InchAspectInchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Inch, InchAspectInchAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Inch, rover.raspirover.aspects.InchAspectInchAspectProperties>();
  
  public Map<Inch, InchAspectInchAspectProperties> getMap() {
    return map;
  }
}
