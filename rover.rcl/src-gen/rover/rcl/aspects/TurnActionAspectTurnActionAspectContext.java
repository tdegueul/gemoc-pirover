package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.TurnActionAspectTurnActionAspectProperties;
import rover.rcl.rcl.TurnAction;

@SuppressWarnings("all")
public class TurnActionAspectTurnActionAspectContext {
  public final static TurnActionAspectTurnActionAspectContext INSTANCE = new TurnActionAspectTurnActionAspectContext();
  
  public static TurnActionAspectTurnActionAspectProperties getSelf(final TurnAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.TurnActionAspectTurnActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnAction, TurnActionAspectTurnActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.TurnAction, rover.rcl.aspects.TurnActionAspectTurnActionAspectProperties>();
  
  public Map<TurnAction, TurnActionAspectTurnActionAspectProperties> getMap() {
    return map;
  }
}
