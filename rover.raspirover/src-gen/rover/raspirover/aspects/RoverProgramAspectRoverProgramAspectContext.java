package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.RoverProgramAspectRoverProgramAspectProperties;
import rover.raspirover.raspirover.RoverProgram;

@SuppressWarnings("all")
public class RoverProgramAspectRoverProgramAspectContext {
  public final static RoverProgramAspectRoverProgramAspectContext INSTANCE = new RoverProgramAspectRoverProgramAspectContext();
  
  public static RoverProgramAspectRoverProgramAspectProperties getSelf(final RoverProgram _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.RoverProgramAspectRoverProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.RoverProgram, rover.raspirover.aspects.RoverProgramAspectRoverProgramAspectProperties>();
  
  public Map<RoverProgram, RoverProgramAspectRoverProgramAspectProperties> getMap() {
    return map;
  }
}
