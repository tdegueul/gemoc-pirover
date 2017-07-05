package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties;
import rover.raspirover.raspirover.Project;

@SuppressWarnings("all")
public class Project_ExecutableAspectProjectAspectContext {
  public final static Project_ExecutableAspectProjectAspectContext INSTANCE = new Project_ExecutableAspectProjectAspectContext();
  
  public static Project_ExecutableAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, Project_ExecutableAspectProjectAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Project, rover.raspirover.aspects.Project_ExecutableAspectProjectAspectProperties>();
  
  public Map<Project, Project_ExecutableAspectProjectAspectProperties> getMap() {
    return map;
  }
}
