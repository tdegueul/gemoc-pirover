package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Project;
import rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties;

@SuppressWarnings("all")
public class ProjectToProgramGlueProjectAspectContext {
  public final static ProjectToProgramGlueProjectAspectContext INSTANCE = new ProjectToProgramGlueProjectAspectContext();
  
  public static ProjectToProgramGlueProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, ProjectToProgramGlueProjectAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Project, rover.raspirover.aspects.ProjectToProgramGlueProjectAspectProperties>();
  
  public Map<Project, ProjectToProgramGlueProjectAspectProperties> getMap() {
    return map;
  }
}
