package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectProperties;
import rover.rcl.rcl.VarAssignment;

@SuppressWarnings("all")
public class VarAssignmentAspectVarAssignmentAspectContext {
  public final static VarAssignmentAspectVarAssignmentAspectContext INSTANCE = new VarAssignmentAspectVarAssignmentAspectContext();
  
  public static VarAssignmentAspectVarAssignmentAspectProperties getSelf(final VarAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.VarAssignment, rover.rcl.aspects.VarAssignmentAspectVarAssignmentAspectProperties>();
  
  public Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> getMap() {
    return map;
  }
}
