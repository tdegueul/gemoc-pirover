package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectProperties;
import rover.arduinoml.arduino.Project;

@SuppressWarnings("all")
public class Project_ExecutableAspectProjectAspectContext {
  public final static Project_ExecutableAspectProjectAspectContext INSTANCE = new Project_ExecutableAspectProjectAspectContext();
  
  public static Project_ExecutableAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, Project_ExecutableAspectProjectAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Project, rover.arduinoml.aspects.Project_ExecutableAspectProjectAspectProperties>();
  
  public Map<Project, Project_ExecutableAspectProjectAspectProperties> getMap() {
    return map;
  }
}
