package rover.units.aspects;

import java.util.Map;
import rover.units.units.Degree;
import rover.units.aspects.DegreeAspectDegreeAspectProperties;

@SuppressWarnings("all")
public class DegreeAspectDegreeAspectContext {
  public final static DegreeAspectDegreeAspectContext INSTANCE = new DegreeAspectDegreeAspectContext();
  
  public static DegreeAspectDegreeAspectProperties getSelf(final Degree _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.DegreeAspectDegreeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Degree, DegreeAspectDegreeAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Degree, rover.units.aspects.DegreeAspectDegreeAspectProperties>();
  
  public Map<Degree, DegreeAspectDegreeAspectProperties> getMap() {
    return map;
  }
}
