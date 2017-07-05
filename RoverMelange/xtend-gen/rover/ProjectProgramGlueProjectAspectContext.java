package rover;

import java.util.Map;
import org.gemoc.sequential.model.arduino.Project;
import rover.ProjectProgramGlueProjectAspectProperties;

@SuppressWarnings("all")
public class ProjectProgramGlueProjectAspectContext {
  public final static ProjectProgramGlueProjectAspectContext INSTANCE = new ProjectProgramGlueProjectAspectContext();
  
  public static ProjectProgramGlueProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.ProjectProgramGlueProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, ProjectProgramGlueProjectAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sequential.model.arduino.Project, rover.ProjectProgramGlueProjectAspectProperties>();
  
  public Map<Project, ProjectProgramGlueProjectAspectProperties> getMap() {
    return map;
  }
}
