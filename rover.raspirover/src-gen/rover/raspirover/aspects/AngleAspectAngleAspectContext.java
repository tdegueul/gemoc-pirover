package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Angle;
import rover.raspirover.aspects.AngleAspectAngleAspectProperties;

@SuppressWarnings("all")
public class AngleAspectAngleAspectContext {
  public final static AngleAspectAngleAspectContext INSTANCE = new AngleAspectAngleAspectContext();
  
  public static AngleAspectAngleAspectProperties getSelf(final Angle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.AngleAspectAngleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Angle, AngleAspectAngleAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Angle, rover.raspirover.aspects.AngleAspectAngleAspectProperties>();
  
  public Map<Angle, AngleAspectAngleAspectProperties> getMap() {
    return map;
  }
}
