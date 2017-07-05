package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectProperties;
import rover.arduinoml.arduino.Delay;

@SuppressWarnings("all")
public class Delay_ExecutableAspectDelayAspectContext {
  public final static Delay_ExecutableAspectDelayAspectContext INSTANCE = new Delay_ExecutableAspectDelayAspectContext();
  
  public static Delay_ExecutableAspectDelayAspectProperties getSelf(final Delay _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Delay, Delay_ExecutableAspectDelayAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Delay, rover.arduinoml.aspects.Delay_ExecutableAspectDelayAspectProperties>();
  
  public Map<Delay, Delay_ExecutableAspectDelayAspectProperties> getMap() {
    return map;
  }
}
