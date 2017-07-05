package rover.rcl.aspects;

import java.util.Map;
import rover.rcl.aspects.SendActionAspectSendActionAspectProperties;
import rover.rcl.rcl.SendAction;

@SuppressWarnings("all")
public class SendActionAspectSendActionAspectContext {
  public final static SendActionAspectSendActionAspectContext INSTANCE = new SendActionAspectSendActionAspectContext();
  
  public static SendActionAspectSendActionAspectProperties getSelf(final SendAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.rcl.aspects.SendActionAspectSendActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SendAction, SendActionAspectSendActionAspectProperties> map = new java.util.WeakHashMap<rover.rcl.rcl.SendAction, rover.rcl.aspects.SendActionAspectSendActionAspectProperties>();
  
  public Map<SendAction, SendActionAspectSendActionAspectProperties> getMap() {
    return map;
  }
}
