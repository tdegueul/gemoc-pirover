package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectProperties;
import rcl.MessageQuery;

@SuppressWarnings("all")
public class MessageQueryAspectMessageQueryAspectContext {
  public final static MessageQueryAspectMessageQueryAspectContext INSTANCE = new MessageQueryAspectMessageQueryAspectContext();
  
  public static MessageQueryAspectMessageQueryAspectProperties getSelf(final MessageQuery _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> map = new java.util.WeakHashMap<rcl.MessageQuery, org.gemoc.rover.rcl.semantics.MessageQueryAspectMessageQueryAspectProperties>();
  
  public Map<MessageQuery, MessageQueryAspectMessageQueryAspectProperties> getMap() {
    return map;
  }
}
