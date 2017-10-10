package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Degree;
import rover.raspirover.aspects.DegreeAspectDegreeAspectProperties;

@SuppressWarnings("all")
public class DegreeAspectDegreeAspectContext {
  public final static DegreeAspectDegreeAspectContext INSTANCE = new DegreeAspectDegreeAspectContext();
  
  public static DegreeAspectDegreeAspectProperties getSelf(final Degree _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.DegreeAspectDegreeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Degree, DegreeAspectDegreeAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Degree, rover.raspirover.aspects.DegreeAspectDegreeAspectProperties>();
  
  public Map<Degree, DegreeAspectDegreeAspectProperties> getMap() {
    return map;
  }
}
