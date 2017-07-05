package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectProperties;
import rover.raspirover.raspirover.MessageQuery;

@SuppressWarnings("all")
public class MessageQueryAspectMessageQueryAspectContext {
  public final static MessageQueryAspectMessageQueryAspectContext INSTANCE = new MessageQueryAspectMessageQueryAspectContext();
  
  public static MessageQueryAspectMessageQueryAspectProperties getSelf(final MessageQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.MessageQuery, rover.raspirover.aspects.MessageQueryAspectMessageQueryAspectProperties>();
  
  public Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> getMap() {
    return map;
  }
}
