package rover.units.aspects;

import java.util.Map;
import rover.units.units.Angle;
import rover.units.aspects.AngleAspectAngleAspectProperties;

@SuppressWarnings("all")
public class AngleAspectAngleAspectContext {
  public final static AngleAspectAngleAspectContext INSTANCE = new AngleAspectAngleAspectContext();
  
  public static AngleAspectAngleAspectProperties getSelf(final Angle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.AngleAspectAngleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Angle, AngleAspectAngleAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Angle, rover.units.aspects.AngleAspectAngleAspectProperties>();
  
  public Map<Angle, AngleAspectAngleAspectProperties> getMap() {
    return map;
  }
}
