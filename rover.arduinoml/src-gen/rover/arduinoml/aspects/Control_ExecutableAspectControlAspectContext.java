package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties;
import rover.arduinoml.arduino.Control;

@SuppressWarnings("all")
public class Control_ExecutableAspectControlAspectContext {
  public final static Control_ExecutableAspectControlAspectContext INSTANCE = new Control_ExecutableAspectControlAspectContext();
  
  public static Control_ExecutableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_ExecutableAspectControlAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Control, rover.arduinoml.aspects.Control_ExecutableAspectControlAspectProperties>();
  
  public Map<Control, Control_ExecutableAspectControlAspectProperties> getMap() {
    return map;
  }
}
