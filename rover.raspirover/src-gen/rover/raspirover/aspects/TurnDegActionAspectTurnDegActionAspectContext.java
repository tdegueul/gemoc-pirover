package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.TurnDegActionAspectTurnDegActionAspectProperties;
import rover.raspirover.raspirover.TurnDegAction;

@SuppressWarnings("all")
public class TurnDegActionAspectTurnDegActionAspectContext {
  public final static TurnDegActionAspectTurnDegActionAspectContext INSTANCE = new TurnDegActionAspectTurnDegActionAspectContext();
  
  public static TurnDegActionAspectTurnDegActionAspectProperties getSelf(final TurnDegAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.TurnDegActionAspectTurnDegActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.TurnDegAction, rover.raspirover.aspects.TurnDegActionAspectTurnDegActionAspectProperties>();
  
  public Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> getMap() {
    return map;
  }
}
