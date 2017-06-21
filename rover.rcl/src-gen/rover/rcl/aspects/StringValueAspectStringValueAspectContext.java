package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.StringValueAspectStringValueAspectProperties;
import rover.rcl.rcl.StringValue;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public final static StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();
  
  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.StringValue, rover.rcl.aspects.StringValueAspectStringValueAspectProperties>();
  
  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
