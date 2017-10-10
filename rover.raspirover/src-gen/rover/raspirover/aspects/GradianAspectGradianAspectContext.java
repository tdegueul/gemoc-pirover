package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Gradian;
import rover.raspirover.aspects.GradianAspectGradianAspectProperties;

@SuppressWarnings("all")
public class GradianAspectGradianAspectContext {
  public final static GradianAspectGradianAspectContext INSTANCE = new GradianAspectGradianAspectContext();
  
  public static GradianAspectGradianAspectProperties getSelf(final Gradian _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.GradianAspectGradianAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Gradian, GradianAspectGradianAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Gradian, rover.raspirover.aspects.GradianAspectGradianAspectProperties>();
  
  public Map<Gradian, GradianAspectGradianAspectProperties> getMap() {
    return map;
  }
}
