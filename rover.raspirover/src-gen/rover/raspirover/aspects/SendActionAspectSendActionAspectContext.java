package rover.raspirover.aspects;

import java.util.Map;
import rover.raspirover.aspects.SendActionAspectSendActionAspectProperties;
import rover.raspirover.raspirover.SendAction;

@SuppressWarnings("all")
public class SendActionAspectSendActionAspectContext {
  public final static SendActionAspectSendActionAspectContext INSTANCE = new SendActionAspectSendActionAspectContext();
  
  public static SendActionAspectSendActionAspectProperties getSelf(final SendAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.raspirover.aspects.SendActionAspectSendActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SendAction, SendActionAspectSendActionAspectProperties> map = new java.util.WeakHashMap<rover.raspirover.raspirover.SendAction, rover.raspirover.aspects.SendActionAspectSendActionAspectProperties>();
  
  public Map<SendAction, SendActionAspectSendActionAspectProperties> getMap() {
    return map;
  }
}
