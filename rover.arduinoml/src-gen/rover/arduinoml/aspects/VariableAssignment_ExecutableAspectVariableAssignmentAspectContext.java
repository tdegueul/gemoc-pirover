package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties;
import rover.arduinoml.arduino.VariableAssignment;

@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspectVariableAssignmentAspectContext {
  public final static VariableAssignment_ExecutableAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignment_ExecutableAspectVariableAssignmentAspectContext();
  
  public static VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.VariableAssignment, rover.arduinoml.aspects.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties>();
  
  public Map<VariableAssignment, VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
