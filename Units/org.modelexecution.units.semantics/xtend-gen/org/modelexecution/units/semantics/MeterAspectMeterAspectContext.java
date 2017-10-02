package org.modelexecution.units.semantics;

import java.util.Map;
import org.modelexecution.units.Meter;
import org.modelexecution.units.semantics.MeterAspectMeterAspectProperties;

@SuppressWarnings("all")
public class MeterAspectMeterAspectContext {
  public final static MeterAspectMeterAspectContext INSTANCE = new MeterAspectMeterAspectContext();
  
  public static MeterAspectMeterAspectProperties getSelf(final Meter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.units.semantics.MeterAspectMeterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Meter, MeterAspectMeterAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.units.Meter, org.modelexecution.units.semantics.MeterAspectMeterAspectProperties>();
  
  public Map<Meter, MeterAspectMeterAspectProperties> getMap() {
    return map;
  }
}
