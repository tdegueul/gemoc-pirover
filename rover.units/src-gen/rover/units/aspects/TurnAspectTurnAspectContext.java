package rover.units.aspects;

import java.util.Map;
import rover.units.units.Turn;
import rover.units.aspects.TurnAspectTurnAspectProperties;

@SuppressWarnings("all")
public class TurnAspectTurnAspectContext {
  public final static TurnAspectTurnAspectContext INSTANCE = new TurnAspectTurnAspectContext();
  
  public static TurnAspectTurnAspectProperties getSelf(final Turn _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.TurnAspectTurnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turn, TurnAspectTurnAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Turn, rover.units.aspects.TurnAspectTurnAspectProperties>();
  
  public Map<Turn, TurnAspectTurnAspectProperties> getMap() {
    return map;
  }
}
