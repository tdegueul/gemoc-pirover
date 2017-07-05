package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.MessageQueryAspectMessageQueryAspectProperties;
import rover.rcl.rcl.MessageQuery;

@SuppressWarnings("all")
public class MessageQueryAspectMessageQueryAspectContext {
  public final static MessageQueryAspectMessageQueryAspectContext INSTANCE = new MessageQueryAspectMessageQueryAspectContext();
  
  public static MessageQueryAspectMessageQueryAspectProperties getSelf(final MessageQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.MessageQueryAspectMessageQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.MessageQuery, rover.rcl.aspects.MessageQueryAspectMessageQueryAspectProperties>();
  
  public Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> getMap() {
    return map;
  }
}
