package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties;
import rover.arduinoml.arduino.Control;

@SuppressWarnings("all")
public class Control_EvaluableAspectControlAspectContext {
  public final static Control_EvaluableAspectControlAspectContext INSTANCE = new Control_EvaluableAspectControlAspectContext();
  
  public static Control_EvaluableAspectControlAspectProperties getSelf(final Control _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Control, Control_EvaluableAspectControlAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Control, rover.arduinoml.aspects.Control_EvaluableAspectControlAspectProperties>();
  
  public Map<Control, Control_EvaluableAspectControlAspectProperties> getMap() {
    return map;
  }
}
