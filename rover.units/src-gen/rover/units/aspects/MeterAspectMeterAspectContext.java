package rover.units.aspects;

import java.util.Map;
import rover.units.units.Meter;
import rover.units.aspects.MeterAspectMeterAspectProperties;

@SuppressWarnings("all")
public class MeterAspectMeterAspectContext {
  public final static MeterAspectMeterAspectContext INSTANCE = new MeterAspectMeterAspectContext();
  
  public static MeterAspectMeterAspectProperties getSelf(final Meter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.units.aspects.MeterAspectMeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Meter, MeterAspectMeterAspectProperties> map = new java.util.WeakHashMap<rover.units.units.Meter, rover.units.aspects.MeterAspectMeterAspectProperties>();
  
  public Map<Meter, MeterAspectMeterAspectProperties> getMap() {
    return map;
  }
}
