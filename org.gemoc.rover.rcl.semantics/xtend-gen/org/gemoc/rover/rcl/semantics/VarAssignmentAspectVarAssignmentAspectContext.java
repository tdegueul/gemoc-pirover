package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectProperties;
import rcl.VarAssignment;

@SuppressWarnings("all")
public class VarAssignmentAspectVarAssignmentAspectContext {
  public final static VarAssignmentAspectVarAssignmentAspectContext INSTANCE = new VarAssignmentAspectVarAssignmentAspectContext();
  
  public static VarAssignmentAspectVarAssignmentAspectProperties getSelf(final VarAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> map = new java.util.WeakHashMap<rcl.VarAssignment, org.gemoc.rover.rcl.semantics.VarAssignmentAspectVarAssignmentAspectProperties>();
  
  public Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> getMap() {
    return map;
  }
}
