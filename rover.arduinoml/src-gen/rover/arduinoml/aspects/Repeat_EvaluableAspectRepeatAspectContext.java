package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.Repeat_EvaluableAspectRepeatAspectProperties;
import rover.arduinoml.arduino.Repeat;

@SuppressWarnings("all")
public class Repeat_EvaluableAspectRepeatAspectContext {
  public final static Repeat_EvaluableAspectRepeatAspectContext INSTANCE = new Repeat_EvaluableAspectRepeatAspectContext();
  
  public static Repeat_EvaluableAspectRepeatAspectProperties getSelf(final Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.Repeat_EvaluableAspectRepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.Repeat, rover.arduinoml.aspects.Repeat_EvaluableAspectRepeatAspectProperties>();
  
  public Map<Repeat, Repeat_EvaluableAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
