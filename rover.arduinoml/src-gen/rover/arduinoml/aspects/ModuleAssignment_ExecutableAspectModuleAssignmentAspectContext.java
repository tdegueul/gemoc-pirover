package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties;
import rover.arduinoml.arduino.ModuleAssignment;

@SuppressWarnings("all")
public class ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext {
  public final static ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext INSTANCE = new ModuleAssignment_ExecutableAspectModuleAssignmentAspectContext();
  
  public static ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties getSelf(final ModuleAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.ModuleAssignment, rover.arduinoml.aspects.ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties>();
  
  public Map<ModuleAssignment, ModuleAssignment_ExecutableAspectModuleAssignmentAspectProperties> getMap() {
    return map;
  }
}
