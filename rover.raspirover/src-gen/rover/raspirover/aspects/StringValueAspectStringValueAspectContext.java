package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.StringValueAspectStringValueAspectProperties;
import rover.raspirover.raspirover.StringValue;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public final static StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();
  
  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.StringValue, rover.raspirover.aspects.StringValueAspectStringValueAspectProperties>();
  
  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
