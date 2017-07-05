package rover.arduinoml.aspects;

import java.util.Map;
import rover.arduinoml.aspects.If_EvaluableAspectIfAspectProperties;
import rover.arduinoml.arduino.If;

@SuppressWarnings("all")
public class If_EvaluableAspectIfAspectContext {
  public final static If_EvaluableAspectIfAspectContext INSTANCE = new If_EvaluableAspectIfAspectContext();
  
  public static If_EvaluableAspectIfAspectProperties getSelf(final If _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new rover.arduinoml.aspects.If_EvaluableAspectIfAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<If, If_EvaluableAspectIfAspectProperties> map = new java.util.WeakHashMap<rover.arduinoml.arduino.If, rover.arduinoml.aspects.If_EvaluableAspectIfAspectProperties>();
  
  public Map<If, If_EvaluableAspectIfAspectProperties> getMap() {
    return map;
  }
}
