package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectProperties;
import rcl.TurnDegAction;

@SuppressWarnings("all")
public class TurnDegActionAspectTurnDegActionAspectContext {
  public final static TurnDegActionAspectTurnDegActionAspectContext INSTANCE = new TurnDegActionAspectTurnDegActionAspectContext();
  
  public static TurnDegActionAspectTurnDegActionAspectProperties getSelf(final TurnDegAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> map = new java.util.WeakHashMap<rcl.TurnDegAction, org.gemoc.rover.rcl.semantics.TurnDegActionAspectTurnDegActionAspectProperties>();
  
  public Map<TurnDegAction, TurnDegActionAspectTurnDegActionAspectProperties> getMap() {
    return map;
  }
}
