package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Project;
import rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectProperties;

@SuppressWarnings("all")
public class OverriddenProjectInterpreterProjectAspectContext {
  public final static OverriddenProjectInterpreterProjectAspectContext INSTANCE = new OverriddenProjectInterpreterProjectAspectContext();
  
  public static OverriddenProjectInterpreterProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, OverriddenProjectInterpreterProjectAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Project, rover.raspirover.aspects.OverriddenProjectInterpreterProjectAspectProperties>();
  
  public Map<Project, OverriddenProjectInterpreterProjectAspectProperties> getMap() {
    return map;
  }
}
