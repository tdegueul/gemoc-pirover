package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.raspirover.Meter;
import rover.raspirover.aspects.MeterAspectMeterAspectProperties;

@SuppressWarnings("all")
public class MeterAspectMeterAspectContext {
  public final static MeterAspectMeterAspectContext INSTANCE = new MeterAspectMeterAspectContext();
  
  public static MeterAspectMeterAspectProperties getSelf(final Meter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.MeterAspectMeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Meter, MeterAspectMeterAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Meter, rover.raspirover.aspects.MeterAspectMeterAspectProperties>();
  
  public Map<Meter, MeterAspectMeterAspectProperties> getMap() {
    return map;
  }
}
