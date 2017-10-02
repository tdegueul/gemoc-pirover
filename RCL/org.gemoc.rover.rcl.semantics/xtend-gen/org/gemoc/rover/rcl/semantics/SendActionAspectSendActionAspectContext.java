package org.gemoc.rover.rcl.semantics;

import java.util.Map;
import org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectProperties;
import rcl.SendAction;

@SuppressWarnings("all")
public class SendActionAspectSendActionAspectContext {
  public final static SendActionAspectSendActionAspectContext INSTANCE = new SendActionAspectSendActionAspectContext();
  
  public static SendActionAspectSendActionAspectProperties getSelf(final SendAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SendAction, SendActionAspectSendActionAspectProperties> map = new java.util.WeakHashMap<rcl.SendAction, org.gemoc.rover.rcl.semantics.SendActionAspectSendActionAspectProperties>();
  
  public Map<SendAction, SendActionAspectSendActionAspectProperties> getMap() {
    return map;
  }
}
