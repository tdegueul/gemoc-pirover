package rover.units.aspects;

import java.util.Map;
import rover.units.units.AngleUnit;
import rover.units.aspects.AngleUnitAspectAngleUnitAspectProperties;

@SuppressWarnings("all")
public class AngleUnitAspectAngleUnitAspectContext {
  public final static AngleUnitAspectAngleUnitAspectContext INSTANCE = new AngleUnitAspectAngleUnitAspectContext();
  
  public static AngleUnitAspectAngleUnitAspectProperties getSelf(final AngleUnit _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.AngleUnitAspectAngleUnitAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> map = new java.util.WeakHashMap<rover.units.units.AngleUnit, rover.units.aspects.AngleUnitAspectAngleUnitAspectProperties>();
  
  public Map<AngleUnit, AngleUnitAspectAngleUnitAspectProperties> getMap() {
    return map;
  }
}
