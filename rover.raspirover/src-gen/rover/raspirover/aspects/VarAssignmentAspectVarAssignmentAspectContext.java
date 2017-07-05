package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectProperties;
import rover.raspirover.raspirover.VarAssignment;

@SuppressWarnings("all")
public class VarAssignmentAspectVarAssignmentAspectContext {
  public final static VarAssignmentAspectVarAssignmentAspectContext INSTANCE = new VarAssignmentAspectVarAssignmentAspectContext();
  
  public static VarAssignmentAspectVarAssignmentAspectProperties getSelf(final VarAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.VarAssignment, rover.raspirover.aspects.VarAssignmentAspectVarAssignmentAspectProperties>();
  
  public Map<VarAssignment, VarAssignmentAspectVarAssignmentAspectProperties> getMap() {
    return map;
  }
}
