package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.While_ExecutableAspectWhileAspectProperties;
import rover.arduinoml.arduino.While;

@SuppressWarnings("all")
public class While_ExecutableAspectWhileAspectContext {
  public final static While_ExecutableAspectWhileAspectContext INSTANCE = new While_ExecutableAspectWhileAspectContext();
  
  public static While_ExecutableAspectWhileAspectProperties getSelf(final While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.While_ExecutableAspectWhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<While, While_ExecutableAspectWhileAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.While, rover.arduinoml.aspects.While_ExecutableAspectWhileAspectProperties>();
  
  public Map<While, While_ExecutableAspectWhileAspectProperties> getMap() {
    return map;
  }
}
