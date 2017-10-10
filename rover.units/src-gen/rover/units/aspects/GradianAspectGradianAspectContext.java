package rover.units.aspects;

import java.util.Map;
import rover.units.units.Gradian;
import rover.units.aspects.GradianAspectGradianAspectProperties;

@SuppressWarnings("all")
public class GradianAspectGradianAspectContext {
  public final static GradianAspectGradianAspectContext INSTANCE = new GradianAspectGradianAspectContext();
  
  public static GradianAspectGradianAspectProperties getSelf(final Gradian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.GradianAspectGradianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Gradian, GradianAspectGradianAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Gradian, rover.units.aspects.GradianAspectGradianAspectProperties>();
  
  public Map<Gradian, GradianAspectGradianAspectProperties> getMap() {
    return map;
  }
}
