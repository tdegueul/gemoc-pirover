package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties;
import rover.arduinoml.arduino.Utilities;

@SuppressWarnings("all")
public class Utilities_ExecutableAspectUtilitiesAspectContext {
  public final static Utilities_ExecutableAspectUtilitiesAspectContext INSTANCE = new Utilities_ExecutableAspectUtilitiesAspectContext();
  
  public static Utilities_ExecutableAspectUtilitiesAspectProperties getSelf(final Utilities _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Utilities, rover.arduinoml.aspects.Utilities_ExecutableAspectUtilitiesAspectProperties>();
  
  public Map<Utilities, Utilities_ExecutableAspectUtilitiesAspectProperties> getMap() {
    return map;
  }
}
