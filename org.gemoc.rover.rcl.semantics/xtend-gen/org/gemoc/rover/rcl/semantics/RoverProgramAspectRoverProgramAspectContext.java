package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties;
import rcl.RoverProgram;

@SuppressWarnings("all")
public class RoverProgramAspectRoverProgramAspectContext {
  public final static RoverProgramAspectRoverProgramAspectContext INSTANCE = new RoverProgramAspectRoverProgramAspectContext();
  
  public static RoverProgramAspectRoverProgramAspectProperties getSelf(final RoverProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> map = new java.util.WeakHashMap<rcl.RoverProgram, org.gemoc.rover.rcl.semantics.RoverProgramAspectRoverProgramAspectProperties>();
  
  public Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> getMap() {
    return map;
  }
}
