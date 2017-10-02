package rover.units.aspects;

import java.util.Map;
import rover.units.units.Inch;
import rover.units.aspects.InchAspectInchAspectProperties;

@SuppressWarnings("all")
public class InchAspectInchAspectContext {
  public final static InchAspectInchAspectContext INSTANCE = new InchAspectInchAspectContext();
  
  public static InchAspectInchAspectProperties getSelf(final Inch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.InchAspectInchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Inch, InchAspectInchAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Inch, rover.units.aspects.InchAspectInchAspectProperties>();
  
  public Map<Inch, InchAspectInchAspectProperties> getMap() {
    return map;
  }
}
