package rover.glue;

import java.util.Map;
import org.gemoc.sequential.model.arduino.Project;
import rover.glue.OverriddenProjectInterpreterProjectAspectProperties;

@SuppressWarnings("all")
public class OverriddenProjectInterpreterProjectAspectContext {
  public final static OverriddenProjectInterpreterProjectAspectContext INSTANCE = new OverriddenProjectInterpreterProjectAspectContext();
  
  public static OverriddenProjectInterpreterProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.OverriddenProjectInterpreterProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, OverriddenProjectInterpreterProjectAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sequential.model.arduino.Project, rover.glue.OverriddenProjectInterpreterProjectAspectProperties>();
  
  public Map<Project, OverriddenProjectInterpreterProjectAspectProperties> getMap() {
    return map;
  }
}
