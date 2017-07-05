package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties;
import rover.rcl.rcl.RoverProgram;

@SuppressWarnings("all")
public class RoverProgramAspectRoverProgramAspectContext {
  public final static RoverProgramAspectRoverProgramAspectContext INSTANCE = new RoverProgramAspectRoverProgramAspectContext();
  
  public static RoverProgramAspectRoverProgramAspectProperties getSelf(final RoverProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.RoverProgram, rover.rcl.aspects.RoverProgramAspectRoverProgramAspectProperties>();
  
  public Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> getMap() {
    return map;
  }
}
