package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectProperties;
import rover.rcl.rcl.TurnDegAction;

@SuppressWarnings("all")
public class TurnDegActionAspectTurnDegActionAspectContext {
  public final static TurnDegActionAspectTurnDegActionAspectContext INSTANCE = new TurnDegActionAspectTurnDegActionAspectContext();
  
  public static TurnDegActionAspectTurnDegActionAspectProperties getSelf(final TurnDegAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.TurnDegAction, rover.rcl.aspects.TurnDegActionAspectTurnDegActionAspectProperties>();
  
  public Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> getMap() {
    return map;
  }
}
