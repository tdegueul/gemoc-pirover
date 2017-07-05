package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties;
import rover.raspirover.raspirover.Conditional;

@SuppressWarnings("all")
public class ConditionalAspectConditionalAspectContext {
  public final static ConditionalAspectConditionalAspectContext INSTANCE = new ConditionalAspectConditionalAspectContext();
  
  public static ConditionalAspectConditionalAspectProperties getSelf(final Conditional _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Conditional, ConditionalAspectConditionalAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.Conditional, rover.raspirover.aspects.ConditionalAspectConditionalAspectProperties>();
  
  public Map<Conditional, ConditionalAspectConditionalAspectProperties> getMap() {
    return map;
  }
}
