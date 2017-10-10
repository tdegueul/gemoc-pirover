package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Turn;
import rover.raspirover.aspects.TurnAspectTurnAspectProperties;

@SuppressWarnings("all")
public class TurnAspectTurnAspectContext {
  public final static TurnAspectTurnAspectContext INSTANCE = new TurnAspectTurnAspectContext();
  
  public static TurnAspectTurnAspectProperties getSelf(final Turn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.TurnAspectTurnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turn, TurnAspectTurnAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Turn, rover.raspirover.aspects.TurnAspectTurnAspectProperties>();
  
  public Map<Turn, TurnAspectTurnAspectProperties> getMap() {
    return map;
  }
}
