package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.AngleUnit;
import rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectProperties;

@SuppressWarnings("all")
public class AngleUnitAspectAngleUnitAspectContext {
  public final static AngleUnitAspectAngleUnitAspectContext INSTANCE = new AngleUnitAspectAngleUnitAspectContext();
  
  public static AngleUnitAspectAngleUnitAspectProperties getSelf(final AngleUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.AngleUnit, rover.raspirover.aspects.AngleUnitAspectAngleUnitAspectProperties>();
  
  public Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> getMap() {
    return map;
  }
}
