package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.If_ExecutableAspectIfAspectProperties;
import rover.arduinoml.arduino.If;

@SuppressWarnings("all")
public class If_ExecutableAspectIfAspectContext {
  public final static If_ExecutableAspectIfAspectContext INSTANCE = new If_ExecutableAspectIfAspectContext();
  
  public static If_ExecutableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.If_ExecutableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, If_ExecutableAspectIfAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.If, rover.arduinoml.aspects.If_ExecutableAspectIfAspectProperties>();
  
  public Map<If, If_ExecutableAspectIfAspectProperties> getMap() {
    return map;
  }
}
