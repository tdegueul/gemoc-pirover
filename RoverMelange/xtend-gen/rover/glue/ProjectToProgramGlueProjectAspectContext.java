package rover.glue;

import java.util.Map;
import org.gemoc.sequential.model.arduino.Project;
import rover.glue.ProjectToProgramGlueProjectAspectProperties;

@SuppressWarnings("all")
public class ProjectToProgramGlueProjectAspectContext {
  public final static ProjectToProgramGlueProjectAspectContext INSTANCE = new ProjectToProgramGlueProjectAspectContext();
  
  public static ProjectToProgramGlueProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.glue.ProjectToProgramGlueProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, ProjectToProgramGlueProjectAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sequential.model.arduino.Project, rover.glue.ProjectToProgramGlueProjectAspectProperties>();
  
  public Map<Project, ProjectToProgramGlueProjectAspectProperties> getMap() {
    return map;
  }
}
