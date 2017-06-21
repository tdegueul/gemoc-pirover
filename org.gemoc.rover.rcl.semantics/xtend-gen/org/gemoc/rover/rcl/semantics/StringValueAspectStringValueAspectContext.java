package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties;
import rcl.StringValue;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public final static StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();
  
  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<rcl.StringValue, org.gemoc.rover.rcl.semantics.StringValueAspectStringValueAspectProperties>();
  
  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
