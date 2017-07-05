package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectProperties;
import rover.arduinoml.arduino.Repeat;

@SuppressWarnings("all")
public class Repeat_ExecutableAspectRepeatAspectContext {
  public final static Repeat_ExecutableAspectRepeatAspectContext INSTANCE = new Repeat_ExecutableAspectRepeatAspectContext();
  
  public static Repeat_ExecutableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Repeat, rover.arduinoml.aspects.Repeat_ExecutableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_ExecutableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
