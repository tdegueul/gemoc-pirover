package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.AssignmentAspectAssignmentAspectProperties;
import rover.rcl.rcl.Assignment;

@SuppressWarnings("all")
public class AssignmentAspectAssignmentAspectContext {
  public final static AssignmentAspectAssignmentAspectContext INSTANCE = new AssignmentAspectAssignmentAspectContext();
  
  public static AssignmentAspectAssignmentAspectProperties getSelf(final Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.AssignmentAspectAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignment, AssignmentAspectAssignmentAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.Assignment, rover.rcl.aspects.AssignmentAspectAssignmentAspectProperties>();
  
  public Map<Assignment, AssignmentAspectAssignmentAspectProperties> getMap() {
    return map;
  }
}
