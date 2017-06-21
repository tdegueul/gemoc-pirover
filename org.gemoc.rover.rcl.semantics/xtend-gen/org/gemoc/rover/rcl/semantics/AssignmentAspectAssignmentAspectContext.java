package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectProperties;
import rcl.Assignment;

@SuppressWarnings("all")
public class AssignmentAspectAssignmentAspectContext {
  public final static AssignmentAspectAssignmentAspectContext INSTANCE = new AssignmentAspectAssignmentAspectContext();
  
  public static AssignmentAspectAssignmentAspectProperties getSelf(final Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Assignment, AssignmentAspectAssignmentAspectProperties> map = new java.util.WeakHashMap<rcl.Assignment, org.gemoc.rover.rcl.semantics.AssignmentAspectAssignmentAspectProperties>();
  
  public Map<Assignment, AssignmentAspectAssignmentAspectProperties> getMap() {
    return map;
  }
}
