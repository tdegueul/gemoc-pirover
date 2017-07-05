package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.TurnActionAspectTurnActionAspectProperties;
import rover.raspirover.raspirover.TurnAction;

@SuppressWarnings("all")
public class TurnActionAspectTurnActionAspectContext {
  public final static TurnActionAspectTurnActionAspectContext INSTANCE = new TurnActionAspectTurnActionAspectContext();
  
  public static TurnActionAspectTurnActionAspectProperties getSelf(final TurnAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.TurnActionAspectTurnActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnAction, TurnActionAspectTurnActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.TurnAction, rover.raspirover.aspects.TurnActionAspectTurnActionAspectProperties>();
  
  public Map<TurnAction, TurnActionAspectTurnActionAspectProperties> getMap() {
    return map;
  }
}
