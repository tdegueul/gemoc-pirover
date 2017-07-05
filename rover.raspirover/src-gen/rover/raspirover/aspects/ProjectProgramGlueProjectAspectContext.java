package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Project;
import rover.raspirover.aspects.ProjectProgramGlueProjectAspectProperties;

@SuppressWarnings("all")
public class ProjectProgramGlueProjectAspectContext {
  public final static ProjectProgramGlueProjectAspectContext INSTANCE = new ProjectProgramGlueProjectAspectContext();
  
  public static ProjectProgramGlueProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ProjectProgramGlueProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, ProjectProgramGlueProjectAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Project, rover.raspirover.aspects.ProjectProgramGlueProjectAspectProperties>();
  
  public Map<Project, ProjectProgramGlueProjectAspectProperties> getMap() {
    return map;
  }
}
