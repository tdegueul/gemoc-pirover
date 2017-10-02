package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectProperties;
import rcl.TurnAction;

@SuppressWarnings("all")
public class TurnActionAspectTurnActionAspectContext {
  public final static TurnActionAspectTurnActionAspectContext INSTANCE = new TurnActionAspectTurnActionAspectContext();
  
  public static TurnActionAspectTurnActionAspectProperties getSelf(final TurnAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TurnAction, TurnActionAspectTurnActionAspectProperties> map = new java.util.WeakHashMap<rcl.TurnAction, org.gemoc.rover.rcl.semantics.TurnActionAspectTurnActionAspectProperties>();
  
  public Map<TurnAction, TurnActionAspectTurnActionAspectProperties> getMap() {
    return map;
  }
}
